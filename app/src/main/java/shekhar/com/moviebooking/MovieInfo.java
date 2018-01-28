package shekhar.com.moviebooking;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import shekhar.com.moviebooking.Adapter.MoviesAdapter;
import shekhar.com.moviebooking.Adapter.ReviewAdapter;
import shekhar.com.moviebooking.Model.Movie;
import shekhar.com.moviebooking.Model.Review;

/**
 * Created by shekh on 25-Jan-18.
 */

public class MovieInfo extends Fragment {
    private TextView synopsis, more,rating,rating_votes,watching,watching_count,interested;
    private String movie;
    private RecyclerView reviews;
    private ReviewAdapter reviewAdapter;
    private List<Review> reviewList = new ArrayList<>();


    public MovieInfo() {
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
        v = inflater.inflate(R.layout.fragment_movieinfo, container, false);
        synopsis = v.findViewById(R.id.synopsis_text);
        more = v.findViewById(R.id.more);
        rating = v.findViewById(R.id.rating);
        rating_votes = v.findViewById(R.id.rating_votes);
        watching = v.findViewById(R.id.watching);
        watching_count = v.findViewById(R.id.watching_count);
        interested = v.findViewById(R.id.interested);
        reviews = v.findViewById(R.id.reviews);

        Bundle extras = getActivity().getIntent().getExtras();

        movie = extras.getString("movie");
        //Toast.makeText(getActivity(), movie, Toast.LENGTH_SHORT).show();

        reviewAdapter = new ReviewAdapter(reviewList);

        reviews.setHasFixedSize(true);

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 1,LinearLayoutManager.HORIZONTAL,false);
        reviews.setLayoutManager(glm);
        reviews.setItemAnimator(new DefaultItemAnimator());
        reviews.setAdapter(reviewAdapter);

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (synopsis.getMaxLines()==4)
                {
                    synopsis.setMaxLines(25);
                    Drawable img = getActivity().getResources().getDrawable( R.drawable.up );
                    more.setText("Read Less");
                    more.setCompoundDrawablesWithIntrinsicBounds( null, null, img, null);
                }
                else
                {
                    synopsis.setMaxLines(4);
                    Drawable img = getActivity().getResources().getDrawable( R.drawable.down );
                    more.setText("Read More");
                    more.setCompoundDrawablesWithIntrinsicBounds( null, null, img, null);
                }

            }
        });

        interested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Thanks for showing your interest.", Toast.LENGTH_SHORT).show();
                interested.setEnabled(false);
                interested.setClickable(false);
                interested.setTextColor(getResources().getColor(R.color.year));
            }
        });

        if (movie.equals("Padmaavat"))
        {
            synopsis.setText(R.string.padmavat_synopsis);
            rating.setText(" 84%");
            rating_votes.setText("13,339 votes");
            watching.setText(" 10029");

        }
        if (movie.equals("Amazon Obhijaan"))
        {
            synopsis.setText(R.string.Amazon_synopsis);
            rating.setText(" 60%");
            rating_votes.setText("13,773 votes");
            watching.setText(" 551");

        }
        if (movie.equals("Mukkabaaz"))
        {
            synopsis.setText(R.string.Mukkabaaz_synopsis);
            rating.setText(" 82%");
            rating_votes.setText("17,270 votes");
            watching.setText(" 711");

        }
        if (movie.equals("12 STRONG"))
        {
            synopsis.setText(R.string.Strong_synopsis);
            rating.setText(" 79%");
            rating_votes.setText("2,174 votes");
            watching.setText(" 19");


        }
        if (movie.equals("Coco"))
        {
            synopsis.setText(R.string.Coco_synopsis);
            rating.setText(" 89%");
            rating_votes.setText("31,654 votes");
            watching.setText(" 98");
        }
        if (movie.equals("Darkest Hour"))
        {
            synopsis.setText(R.string.Darkest_synopsis);
            rating.setText(" 78%");
            rating_votes.setText("1,373 votes");
            watching.setText(" 74");

        }
        if (movie.equals("Jumanji: Welcome To The Jungle"))
        {
            synopsis.setText(R.string.Jumanji_synopsis);
            rating.setText(" 81%");
            rating_votes.setText("1,06,212 votes");
            watching.setText(" 5365");

        }
        if (movie.equals("Paddington 2"))
        {
            synopsis.setText(R.string.Paddington_synopsis);
            rating.setText(" 87%");
            rating_votes.setText("2,099 votes");
            watching.setText(" 51");

        }
        if (movie.equals("The Greatest Showman"))
        {
            synopsis.setText(R.string.Greatest_synopsis);
            rating.setText(" 83%");
            rating_votes.setText("6,970 votes");
            watching.setText(" 213");

        }
        if (movie.equals("3 Gante 30 Dina 30 Second"))
        {
            synopsis.setText(R.string.Gante_synopsis);
            rating.setText(" 68%");
            rating_votes.setText("2,040 votes");
            watching.setText(" 25");

        }
        if (movie.equals("Anjaniputra"))
        {
            synopsis.setText(R.string.Anjaniputra_synopsis);
            rating.setText(" 74%");
            rating_votes.setText("23,541 votes");
            watching.setText(" 76");

        }
        if (movie.equals("Chamak"))
        {
            synopsis.setText(R.string.Chamak_synopsis);
            rating.setText(" 78%");
            rating_votes.setText("20,885 votes");
            watching.setText(" 82");

        }
        prepareReviewData();
        return v;
    }

    private void prepareReviewData() {
        Review review = new Review("Prince", "100%", "Awesome","Must watch movie.");
        reviewList.add(review);

        review = new Review("Ayush", "83%", "Awesome1","Must watch movie1");
        reviewList.add(review);

        review = new Review("Prince2", "84%", "Awesome2","Must watch movie2");
        reviewList.add(review);

        reviewAdapter.notifyDataSetChanged();

    }


}
