package shekhar.com.moviebooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SummaryActivity extends AppCompatActivity {
    private TextView back,name ,rating_language,time,seats_selected,seats,ticket_summery,ticket_amount,total,book;
    private String movie,hall,show,language,rating,seat_list,seat_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Bundle extras =  this.getIntent().getExtras();

        movie = extras.getString("movie");
        hall = extras.getString("hall");
        show = extras.getString("show");
        language = extras.getString("language");
        rating = extras.getString("rating");
        seat_list = extras.getString("seat_list");
        seat_count = extras.getString("seat_count");


        back = findViewById(R.id.back);
        name = findViewById(R.id.name);
        rating_language = findViewById(R.id.rating_language);
        time = findViewById(R.id.time);
        seats_selected = findViewById(R.id.seats_selected);
        seats = findViewById(R.id.seats);
        ticket_summery = findViewById(R.id.ticket_summery);
        ticket_amount = findViewById(R.id.ticket_amount);
        total = findViewById(R.id.total);
        book = findViewById(R.id.book);


        name.setText(movie);
        rating_language.setText(rating+" | "+language);
        time.setText("30th Jan ,"+show);
        seats_selected.setText(seat_count+" Seat Selected");
        seats.setText(seat_list);
        ticket_summery.setText("Rs 190 X "+seat_count+" Tickets");
        int seat_no = Integer.parseInt(seat_count);
        int amount = 190 * seat_no;
        ticket_amount.setText("Rs "+String.valueOf(amount));
        total.setText(String.valueOf("Rs "+amount));


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book.setVisibility(View.GONE);
                Toast.makeText(SummaryActivity.this,"Booking Confirmed",Toast.LENGTH_LONG).show();
            }
        });
    }
}
