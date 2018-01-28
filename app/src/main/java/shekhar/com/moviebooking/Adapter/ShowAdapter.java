package shekhar.com.moviebooking.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import shekhar.com.moviebooking.Model.Date;
import shekhar.com.moviebooking.Model.Shows;
import shekhar.com.moviebooking.R;
import shekhar.com.moviebooking.SeatsActivity;

/**
 * Created by shekh on 27-Jan-18.
 */

public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.MyViewHolder> {

    private List<Shows> showList;
    private Activity activity;
    private String movie,language,rating;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,show1,show2,show3,show4,show5,show6,show7,show8;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            show1 = (TextView) view.findViewById(R.id.show1);
            show2 = (TextView) view.findViewById(R.id.show2);
            show3 = (TextView) view.findViewById(R.id.show3);
            show4 = (TextView) view.findViewById(R.id.show4);
            show5 = (TextView) view.findViewById(R.id.show5);
            show6 = (TextView) view.findViewById(R.id.show6);
            show7 = (TextView) view.findViewById(R.id.show7);
            show8 = (TextView) view.findViewById(R.id.show8);

        }
    }


    public ShowAdapter(List<Shows> showsList,Activity activity, String movie , String language , String rating) {

        this.activity = activity;
        this.movie = movie;
        this.language = language;
        this.rating = rating;
        this.showList = showsList;
    }

    @Override
    public ShowAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.shows_card, parent, false);

        return new ShowAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ShowAdapter.MyViewHolder holder, int position) {
        Shows shows = showList.get(position);
        holder.name.setText(shows.getName());
        final String hall = shows.getName();
        holder.show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClicked(hall,holder.show1.getText().toString());
            }
        });

        holder.show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClicked(hall,holder.show2.getText().toString());
            }
        });
        holder.show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClicked(hall,holder.show3.getText().toString());
            }
        });
        holder.show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClicked(hall,holder.show4.getText().toString());
            }
        });
        holder.show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClicked(hall,holder.show5.getText().toString());
            }
        });
        holder.show6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClicked(hall,holder.show6.getText().toString());
            }
        });
        holder.show7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClicked(hall,holder.show7.getText().toString());
            }
        });
        holder.show8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClicked(hall,holder.show8.getText().toString());
            }
        });
    }



    private void showClicked(String hall,String show) {
        Intent intent = new Intent(activity, SeatsActivity.class);
        intent.putExtra("movie",movie);
        intent.putExtra("hall",hall);
        intent.putExtra("show",show);
        intent.putExtra("language",language);
        intent.putExtra("rating",rating);
        activity.startActivity(intent);

    }

    @Override
    public int getItemCount() {
        return showList.size();
    }
}