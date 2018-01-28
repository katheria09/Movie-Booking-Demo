package shekhar.com.moviebooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import shekhar.com.moviebooking.Adapter.MoviesAdapter;
import shekhar.com.moviebooking.Model.Movie;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MoviesAdapter(movieList);

        recyclerView.setHasFixedSize(true);

        // vertical RecyclerView
        // keep movie_list_row.xml width to `match_parent`
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        // horizontal RecyclerView
        // keep movie_list_row.xml width to `wrap_content`
        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(mLayoutManager);

        // adding inbuilt divider line
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        // adding custom divider line with padding 16dp
        // recyclerView.addItemDecoration(new MyDividerItemDecoration(this, LinearLayoutManager.HORIZONTAL, 16));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(mAdapter);

        // row click listener
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Movie movie = movieList.get(position);
                Intent intent = new Intent(MainActivity.this,BookingActivity.class);
                intent.putExtra("movie",movie.getTitle());
                intent.putExtra("language",movie.getGenre());
                intent.putExtra("rating",movie.getYear());
             //   Toast.makeText(getApplicationContext(), movie.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareMovieData();
    }

    /**
     * Prepares sample data to provide data set to adapter
     */
    private void prepareMovieData() {
        Movie movie = new Movie("Padmaavat", "Hindi", "(U/A)");
        movieList.add(movie);

        movie = new Movie("Amazon Obhijaan", "Hindi", "(U/A)");
        movieList.add(movie);

        movie = new Movie("Mukkabaaz", "Hindi", "(U/A)");
        movieList.add(movie);

        movie = new Movie("12 STRONG", "English", "(A)");
        movieList.add(movie);

        movie = new Movie("Coco", "English", "(U)");
        movieList.add(movie);

        movie = new Movie("Darkest Hour", "English", "(U/A)");
        movieList.add(movie);

        movie = new Movie("Jumanji: Welcome To The Jungle", "English", "(U/A)");
        movieList.add(movie);

        movie = new Movie("Paddington 2", "English", "(U)");
        movieList.add(movie);

        movie = new Movie("The Greatest Showman", "English", "(U/A)");
        movieList.add(movie);

        movie = new Movie("3 Gante 30 Dina 30 Second", "Kannada", "(U/A)");
        movieList.add(movie);

        movie = new Movie("Anjaniputra", "Kannada", "(U/A)");
        movieList.add(movie);

        movie = new Movie("Chamak", "Kannada", "(U/A)");
        movieList.add(movie);



        // notify adapter about data set changes
        // so that it will render the list with new data
        mAdapter.notifyDataSetChanged();
    }

}
