package shekhar.com.moviebooking.Adapter;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import shekhar.com.moviebooking.Model.Date;
import shekhar.com.moviebooking.Model.Movie;
import shekhar.com.moviebooking.R;

/**
 * Created by shekh on 27-Jan-18.
 */

public class DateAdapter extends RecyclerView.Adapter<DateAdapter.MyViewHolder> {

    private List<Date> dateList;
    private Activity activity;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView date;


        public MyViewHolder(View view) {
            super(view);
            date = (TextView) view.findViewById(R.id.date);

        }
    }


    public DateAdapter(List<Date> dateList,Activity activity) {

        this.activity = activity;
        this.dateList = dateList;
    }

    @Override
    public DateAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dates_card, parent, false);

        return new DateAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final DateAdapter.MyViewHolder holder, final int position) {
        Date date = dateList.get(position);
        holder.date.setText(date.getDate());

        final int posi = position;

        if (position==0)
        {
            holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
            Drawable img2 = activity.getResources().getDrawable( R.drawable.border );
            holder.date.setBackground(img2);
        }
        else
        {
            holder.date.setTextColor(activity.getResources().getColor(R.color.white));
            Drawable img = activity.getResources().getDrawable( R.drawable.border_fill );
            holder.date.setBackground(img);
        }


                holder.date.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        holder.date.setTextColor(activity.getResources().getColor(R.color.white));
                        Drawable img = activity.getResources().getDrawable( R.drawable.border_fill );
                        Drawable img2 = activity.getResources().getDrawable( R.drawable.border );
                        holder.date.setBackground(img);

                        switch(posi) {
                            case 1:
                                holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                                holder.date.setBackground(img2);
                                break;
                            case 2:
                                holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                                holder.date.setBackground(img2);
                                break;
                            case 3:
                                holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                                holder.date.setBackground(img2);
                                break;
                            case 4:
                                holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                                holder.date.setBackground(img2);
                                break;
                            case 0:
                                holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                                holder.date.setBackground(img2);
                                break;
                        }

                        /*if (posi==0)
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                            holder.date.setBackground(img2);
                        }

                        else
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.white));
                            img = activity.getResources().getDrawable( R.drawable.border_fill );
                            holder.date.setBackground(img);
                        }

                        if (posi==1)
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                            holder.date.setBackground(img2);
                        }

                        else
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.white));
                            img = activity.getResources().getDrawable( R.drawable.border_fill );
                            holder.date.setBackground(img);
                        }

                        if (posi==2)
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                            holder.date.setBackground(img2);
                        }

                        else
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.white));
                            img = activity.getResources().getDrawable( R.drawable.border_fill );
                            holder.date.setBackground(img);
                        }

                        if (posi==3)
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                            holder.date.setBackground(img2);
                        }

                        else
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.white));
                            img = activity.getResources().getDrawable( R.drawable.border_fill );
                            holder.date.setBackground(img);
                        }


                        if (posi==4)
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                            holder.date.setBackground(img2);
                        }

                        else
                        {
                            holder.date.setTextColor(activity.getResources().getColor(R.color.white));
                            img = activity.getResources().getDrawable( R.drawable.border_fill );
                            holder.date.setBackground(img);
                        }*/

                    }
                });
               /* Toast.makeText(activity, String.valueOf(position), Toast.LENGTH_SHORT).show();
                holder.date.setTextColor(activity.getResources().getColor(R.color.colorPrimary));
                holder.date.setBackgroundColor(activity.getResources().getColor(R.color.white));*/


    }


    @Override
    public int getItemCount() {
        return dateList.size();
    }
}
