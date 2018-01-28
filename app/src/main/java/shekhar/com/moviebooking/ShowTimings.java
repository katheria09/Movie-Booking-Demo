package shekhar.com.moviebooking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import shekhar.com.moviebooking.Adapter.DateAdapter;
import shekhar.com.moviebooking.Adapter.ReviewAdapter;
import shekhar.com.moviebooking.Adapter.ShowAdapter;
import shekhar.com.moviebooking.Model.Date;
import shekhar.com.moviebooking.Model.Review;
import shekhar.com.moviebooking.Model.Shows;
import shekhar.com.moviebooking.R;

/**
 * Created by shekh on 25-Jan-18.
 */

public class ShowTimings extends Fragment {

    private RecyclerView days ,shows;
    private String movie,day,month,year,language,rating;
    private int today,week_day;
    private DateAdapter dateAdapter;
    private ShowAdapter showAdapter;
    private List<Date> dateList = new ArrayList<>();
    private List<Shows> showList = new ArrayList<>();
    private Calendar nowcalendar;



    public ShowTimings() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v;
        v = inflater.inflate(R.layout.fragment_showtimings, container, false);

        days = v.findViewById(R.id.recycler_date);
        shows = v.findViewById(R.id.recycler_show);
        Bundle extras = getActivity().getIntent().getExtras();

        movie = extras.getString("movie");
        language = extras.getString("language");
        rating = extras.getString("rating");

        dateAdapter = new DateAdapter(dateList,getActivity());
        days.setHasFixedSize(true);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 1,LinearLayoutManager.HORIZONTAL,false);
        days.setLayoutManager(glm);
        days.setItemAnimator(new DefaultItemAnimator());
        days.setAdapter(dateAdapter);


        showAdapter = new ShowAdapter(showList,getActivity(),movie,language,rating);
        shows.setHasFixedSize(true);
        GridLayoutManager glm1 = new GridLayoutManager(getActivity(), 1,LinearLayoutManager.VERTICAL,false);
        shows.setLayoutManager(glm1);
        shows.setItemAnimator(new DefaultItemAnimator());
        shows.setAdapter(showAdapter);



        nowcalendar = Calendar.getInstance(TimeZone.getDefault());
        today = nowcalendar.get(Calendar.DATE);
        day= String.valueOf(nowcalendar.get(Calendar.DATE));
        month= String.valueOf(nowcalendar.get(Calendar.MONTH)+1);
        year= String.valueOf(nowcalendar.get(Calendar.YEAR));
        week_day = nowcalendar.get(Calendar.DAY_OF_WEEK);

        setDates();
        setShows();

        return v;
    }

    private void setDates() {
    Date  date = new Date(getDayOfWeek(week_day)+" "+today ,month);
    dateList.add(date);

    date = new Date(getDayOfWeek(week_day+1)+" "+String.valueOf(nowcalendar.get(Calendar.DATE)+1),month);
    dateList.add(date);

    date = new Date(getDayOfWeek(week_day+2)+" "+String.valueOf(nowcalendar.get(Calendar.DATE)+2),month);
    dateList.add(date);

    date = new Date(getDayOfWeek(week_day+3)+" "+String.valueOf(nowcalendar.get(Calendar.DATE)+3),month);
    dateList.add(date);

    date = new Date(getDayOfWeek(week_day+4)+" "+String.valueOf(nowcalendar.get(Calendar.DATE)+4),month);
    dateList.add(date);


    dateAdapter.notifyDataSetChanged();

    }

    private String getDayOfWeek(int value) {
        if (value == 8)
        {value = 1;}
        else if (value == 9)
        {value =2;}
        else if (value == 10)
        {value = 3;}
        else if (value == 11)
        {value = 4 ;}
        String day = "";
        switch (value) {
            case 1:
                day = "Sun";
                break;
            case 2:
                day = "Mon";
                break;
            case 3:
                day = "Tue";
                break;
            case 4:
                day = "Wed";
                break;
            case 5:
                day = "Thu";
                break;
            case 6:
                day = "Fri";
                break;
            case 7:
                day = "Sat";
                break;
        }
        return day;
    }


    private void setShows() {
        Shows  shows = new Shows("INOX lido Mall,Ulsoor");
        showList.add(shows);

        shows = new Shows("Eshwari And Kamakhya Theatres");
        showList.add(shows);

        shows = new Shows("Fun Cinema Sigma Mall Banglore");
        showList.add(shows);

        shows = new Shows("SPI: The Cinema GT World: Magdi Rd, Banglore");
        showList.add(shows);

        shows = new Shows("Innovative Multiplex: Marathahalli");
        showList.add(shows);

        shows = new Shows("INOX Brookefield Mall");
        showList.add(shows);


        showAdapter.notifyDataSetChanged();

    }


}
