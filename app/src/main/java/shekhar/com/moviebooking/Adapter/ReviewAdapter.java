package shekhar.com.moviebooking.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import shekhar.com.moviebooking.Model.Movie;
import shekhar.com.moviebooking.Model.Review;
import shekhar.com.moviebooking.R;

/**
 * Created by shekh on 25-Jan-18.
 */

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.MyViewHolder> {

    private List<Review> reviewsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, rating, title,review;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            rating = (TextView) view.findViewById(R.id.rating);
            title = (TextView) view.findViewById(R.id.title);
            review = (TextView) view.findViewById(R.id.review);
        }
    }


    public ReviewAdapter(List<Review> reviewsList) {
        this.reviewsList = reviewsList;
    }

    @Override
    public ReviewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.review_card, parent, false);

        return new ReviewAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ReviewAdapter.MyViewHolder holder, int position) {
        Review review = reviewsList.get(position);
        holder.name.setText(review.getName());
        holder.rating.setText(review.getRating());
        holder.title.setText(review.getTitle());
        holder.review.setText(review.getReview());
    }

    @Override
    public int getItemCount() {
        return reviewsList.size();
    }
}
