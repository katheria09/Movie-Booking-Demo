package shekhar.com.moviebooking;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class SeatsActivity extends AppCompatActivity {

    private String movie,hall,show,language,rating;
    private TextView back,name,date,location;
    private TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14;
    private TextView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    private TextView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;
    private TextView d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14;
    private TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14;
    private TextView f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
    private TextView g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14;;
    private TextView h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14;
    private TextView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14;
    private TextView seats_selected;
    private ArrayList<String> seats= new ArrayList<String>();
    private LinearLayout layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seats);

        back = findViewById(R.id.back);
        name = findViewById(R.id.name);
        date = findViewById(R.id.date);
        location = findViewById(R.id.hall);
        seats_selected = findViewById(R.id.seats_selected);
        layout = findViewById(R.id.layout);



        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);
        a7 = findViewById(R.id.a7);
        a8 = findViewById(R.id.a8);
        a9 = findViewById(R.id.a9);
        a10 = findViewById(R.id.a10);
        a11 = findViewById(R.id.a11);
        a12 = findViewById(R.id.a12);
        a13 = findViewById(R.id.a13);
        a14 = findViewById(R.id.a14);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c9 = findViewById(R.id.c9);
        c10 = findViewById(R.id.c10);
        c11 = findViewById(R.id.c11);
        c12 = findViewById(R.id.c12);
        c13 = findViewById(R.id.c13);
        c14 = findViewById(R.id.c14);

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);
        d9 = findViewById(R.id.d9);
        d10 = findViewById(R.id.d10);
        d11 = findViewById(R.id.d11);
        d12 = findViewById(R.id.d12);
        d13 = findViewById(R.id.d13);
        d14 = findViewById(R.id.d14);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        e6 = findViewById(R.id.e6);
        e7 = findViewById(R.id.e7);
        e8 = findViewById(R.id.e8);
        e9 = findViewById(R.id.e9);
        e10 = findViewById(R.id.e10);
        e11 = findViewById(R.id.e11);
        e12 = findViewById(R.id.e12);
        e13 = findViewById(R.id.e13);
        e14 = findViewById(R.id.e14);

        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);
        f6 = findViewById(R.id.f6);
        f7 = findViewById(R.id.f7);
        f8 = findViewById(R.id.f8);
        f9 = findViewById(R.id.f9);
        f10 = findViewById(R.id.f10);
        f11 = findViewById(R.id.f11);
        f12 = findViewById(R.id.f12);
        f13 = findViewById(R.id.f13);
        f14 = findViewById(R.id.f14);

        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);
        g6 = findViewById(R.id.g6);
        g7 = findViewById(R.id.g7);
        g8 = findViewById(R.id.g8);
        g9 = findViewById(R.id.g9);
        g10 = findViewById(R.id.g10);
        g11 = findViewById(R.id.g11);
        g12 = findViewById(R.id.g12);
        g13 = findViewById(R.id.g13);
        g14 = findViewById(R.id.g14);

        h1 = findViewById(R.id.h1);
        h2 = findViewById(R.id.h2);
        h3 = findViewById(R.id.h3);
        h4 = findViewById(R.id.h4);
        h5 = findViewById(R.id.h5);
        h6 = findViewById(R.id.h6);
        h7 = findViewById(R.id.h7);
        h8 = findViewById(R.id.h8);
        h9 = findViewById(R.id.h9);
        h10 = findViewById(R.id.h10);
        h11 = findViewById(R.id.h11);
        h12 = findViewById(R.id.h12);
        h13 = findViewById(R.id.h13);
        h14 = findViewById(R.id.h14);

        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);
        i10 = findViewById(R.id.i10);
        i11 = findViewById(R.id.i11);
        i12 = findViewById(R.id.i12);
        i13 = findViewById(R.id.i13);
        i14 = findViewById(R.id.i14);


        Bundle extras =  this.getIntent().getExtras();

        movie = extras.getString("movie");
        hall = extras.getString("hall");
        show = extras.getString("show");
        language = extras.getString("language");
        rating = extras.getString("rating");

        name.setText(movie +rating+" | "+language);
        date.setText(show);
        location.setText(hall);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final Drawable img = this.getResources().getDrawable( R.drawable.border_fill );
        final Drawable img2 = this.getResources().getDrawable( R.drawable.border );
        //holder.date.setBackground(img);



        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (seats.contains("A1"))
                {
                    seats.remove("A1");
                    a1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A1");
                    a1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A2"))
                {
                    seats.remove("A2");
                    a2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A2");
                    a2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A3"))
                {
                    seats.remove("A3");
                    a3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A3");
                    a3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A4"))
                {
                    seats.remove("A4");
                    a4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A4");
                    a4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A5"))
                {
                    seats.remove("A5");
                    a5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A5");
                    a5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A6"))
                {
                    seats.remove("A6");
                    a6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A6");
                    a6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A7"))
                {
                    seats.remove("A7");
                    a7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A7");
                    a7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A8"))
                {
                    seats.remove("A8");
                    a8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A8");
                    a8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A9"))
                {
                    seats.remove("A9");
                    a9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A9");
                    a9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A10"))
                {
                    seats.remove("A10");
                    a10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A10");
                    a10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A11"))
                {
                    seats.remove("A11");
                    a11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A11");
                    a11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A12"))
                {
                    seats.remove("A12");
                    a12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A12");
                    a12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A13"))
                {
                    seats.remove("A13");
                    a13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A13");
                    a13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("A14"))
                {
                    seats.remove("A14");
                    a14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("A14");
                    a14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B1"))
                {
                    seats.remove("B1");
                    b1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B1");
                    b1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B2"))
                {
                    seats.remove("B2");
                    b2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B2");
                    b2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B3"))
                {
                    seats.remove("B3");
                    b3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B3");
                    b3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B4"))
                {
                    seats.remove("B4");
                    b4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B4");
                    b4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B5"))
                {
                    seats.remove("B5");
                    b5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B5");
                    b5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B6"))
                {
                    seats.remove("B6");
                    b6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B6");
                    b6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B7"))
                {
                    seats.remove("B7");
                    b7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B7");
                    b7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B8"))
                {
                    seats.remove("B8");
                    b8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B8");
                    b8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B9"))
                {
                    seats.remove("B9");
                    b9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B9");
                    b9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B10"))
                {
                    seats.remove("B10");
                    b10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B10");
                    b10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B11"))
                {
                    seats.remove("B11");
                    b11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B11");
                    b11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B12"))
                {
                    seats.remove("B12");
                    b12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B12");
                    b12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B13"))
                {
                    seats.remove("B13");
                    b13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B13");
                    b13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B14"))
                {
                    seats.remove("B14");
                    b14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B14");
                    b14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C1"))
                {
                    seats.remove("C1");
                    c1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C1");
                    c1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C2"))
                {
                    seats.remove("C2");
                    c2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C2");
                    c2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C3"))
                {
                    seats.remove("C3");
                    c3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C3");
                    c3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C4"))
                {
                    seats.remove("C4");
                    c4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C4");
                    c4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C5"))
                {
                    seats.remove("C5");
                    c5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C5");
                    c5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C6"))
                {
                    seats.remove("C6");
                    c6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C6");
                    c6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C7"))
                {
                    seats.remove("C7");
                    c7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C7");
                    c7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C8"))
                {
                    seats.remove("C8");
                    c8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C8");
                    c8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C9"))
                {
                    seats.remove("C9");
                    c9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C9");
                    c9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C10"))
                {
                    seats.remove("C10");
                    c10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C10");
                    c10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C11"))
                {
                    seats.remove("C11");
                    c11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C11");
                    c11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C12"))
                {
                    seats.remove("C12");
                    c12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C12");
                    c12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C13"))
                {
                    seats.remove("C13");
                    c13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C13");
                    c13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("C14"))
                {
                    seats.remove("C14");
                    c14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("C14");
                    c14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D1"))
                {
                    seats.remove("D1");
                    d1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D1");
                    d1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B2"))
                {
                    seats.remove("B2");
                    d2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B2");
                    d2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D3"))
                {
                    seats.remove("D3");
                    d3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D3");
                    d3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("B4"))
                {
                    seats.remove("B4");
                    d4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("B4");
                    d4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D5"))
                {
                    seats.remove("D5");
                    d5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D5");
                    d5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D6"))
                {
                    seats.remove("D6");
                    d6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D6");
                    d6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D7"))
                {
                    seats.remove("D7");
                    d7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D7");
                    d7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D8"))
                {
                    seats.remove("D8");
                    d8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D8");
                    d8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D9"))
                {
                    seats.remove("D9");
                    d9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D9");
                    d9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D10"))
                {
                    seats.remove("D10");
                    d10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D10");
                    d10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D11"))
                {
                    seats.remove("D11");
                    d11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D11");
                    d11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D12"))
                {
                    seats.remove("D12");
                    d12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D12");
                    d12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D13"))
                {
                    seats.remove("D13");
                    d13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D13");
                    d13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("D14"))
                {
                    seats.remove("D14");
                    d14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("D14");
                    d14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E1"))
                {
                    seats.remove("E1");
                    e1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E1");
                    e1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E2"))
                {
                    seats.remove("E2");
                    e2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E2");
                    e2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E3"))
                {
                    seats.remove("E3");
                    e3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E3");
                    e3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E4"))
                {
                    seats.remove("E4");
                    e4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E4");
                    e4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E5"))
                {
                    seats.remove("E5");
                    e5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E5");
                    e5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E6"))
                {
                    seats.remove("E6");
                    e6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E6");
                    e6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E7"))
                {
                    seats.remove("E7");
                    e7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E7");
                    e7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E8"))
                {
                    seats.remove("E8");
                    e8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E8");
                    e8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E9"))
                {
                    seats.remove("E9");
                    e9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E9");
                    e9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E10"))
                {
                    seats.remove("E10");
                    e10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E10");
                    e10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E11"))
                {
                    seats.remove("E11");
                    e11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E11");
                    e11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E12"))
                {
                    seats.remove("E12");
                    e12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E12");
                    e12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E13"))
                {
                    seats.remove("E13");
                    e13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E13");
                    e13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        e14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("E14"))
                {
                    seats.remove("E14");
                    e14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("E14");
                    e14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F1"))
                {
                    seats.remove("F1");
                    f1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F1");
                    f1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F2"))
                {
                    seats.remove("F2");
                    f2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F2");
                    f2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F3"))
                {
                    seats.remove("F3");
                    f3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F3");
                    f3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F4"))
                {
                    seats.remove("F4");
                    f4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F4");
                    f4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F5"))
                {
                    seats.remove("F5");
                    f5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F5");
                    f5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F6"))
                {
                    seats.remove("F6");
                    f6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F6");
                    f6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F7"))
                {
                    seats.remove("F7");
                    f7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F7");
                    f7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F8"))
                {
                    seats.remove("F8");
                    f8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F8");
                    f8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F9"))
                {
                    seats.remove("F9");
                    f9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F9");
                    f9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F10"))
                {
                    seats.remove("F10");
                    f10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F10");
                    f10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F11"))
                {
                    seats.remove("F11");
                    f11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F11");
                    f11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F12"))
                {
                    seats.remove("F12");
                    f12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F12");
                    f12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F13"))
                {
                    seats.remove("F13");
                    f13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F13");
                    f13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        f14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("F14"))
                {
                    seats.remove("F14");
                    f14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("F14");
                    f14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });

        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G1"))
                {
                    seats.remove("G1");
                    g1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G1");
                    g1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G2"))
                {
                    seats.remove("G2");
                    g2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G2");
                    g2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G3"))
                {
                    seats.remove("G3");
                    g3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G3");
                    g3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G4"))
                {
                    seats.remove("G4");
                    g4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G4");
                    g4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G5"))
                {
                    seats.remove("G5");
                    g5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G5");
                    g5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G6"))
                {
                    seats.remove("G6");
                    g6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G6");
                    g6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G7"))
                {
                    seats.remove("G7");
                    g7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G7");
                    g7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G8"))
                {
                    seats.remove("G8");
                    g8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G8");
                    g8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G9"))
                {
                    seats.remove("G9");
                    g9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G9");
                    g9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G10"))
                {
                    seats.remove("G10");
                    g10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G10");
                    g10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G11"))
                {
                    seats.remove("G11");
                    g11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G11");
                    g11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G12"))
                {
                    seats.remove("G12");
                    g12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G12");
                    g12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G13"))
                {
                    seats.remove("G13");
                    g13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G13");
                    g13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        g14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("G14"))
                {
                    seats.remove("G14");
                    g14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("G14");
                    g14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H1"))
                {
                    seats.remove("H1");
                    h1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H1");
                    h1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H2"))
                {
                    seats.remove("H2");
                    h2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H2");
                    h2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H3"))
                {
                    seats.remove("H3");
                    h3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H3");
                    h3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H4"))
                {
                    seats.remove("H4");
                    h4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H4");
                    h4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H5"))
                {
                    seats.remove("H5");
                    h5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H5");
                    h5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H6"))
                {
                    seats.remove("H6");
                    h6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H6");
                    h6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H7"))
                {
                    seats.remove("H7");
                    h7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H7");
                    h7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H8"))
                {
                    seats.remove("H8");
                    h8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H8");
                    h8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H9"))
                {
                    seats.remove("H9");
                    h9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H9");
                    h9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H10"))
                {
                    seats.remove("H10");
                    h10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H10");
                    h10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H11"))
                {
                    seats.remove("H11");
                    h11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H11");
                    h11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H12"))
                {
                    seats.remove("H12");
                    h12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H12");
                    h12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H13"))
                {
                    seats.remove("H13");
                    h13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H13");
                    h13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        h14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("H14"))
                {
                    seats.remove("H14");
                    h14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("H14");
                    h14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I1"))
                {
                    seats.remove("I1");
                    i1.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I1");
                    i1.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I2"))
                {
                    seats.remove("I2");
                    i2.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I2");
                    i2.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I3"))
                {
                    seats.remove("I3");
                    i3.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I3");
                    i3.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I4"))
                {
                    seats.remove("I4");
                    i4.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I4");
                    i4.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I5"))
                {
                    seats.remove("I5");
                    i5.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I5");
                    i5.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I6"))
                {
                    seats.remove("I6");
                    i6.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I6");
                    i6.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I7"))
                {
                    seats.remove("I7");
                    i7.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I7");
                    i7.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I8"))
                {
                    seats.remove("I8");
                    i8.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I8");
                    i8.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I9"))
                {
                    seats.remove("I9");
                    i9.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I9");
                    i9.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I10"))
                {
                    seats.remove("I10");
                    i10.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I10");
                    i10.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I11"))
                {
                    seats.remove("I11");
                    i11.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I11");
                    i11.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I12"))
                {
                    seats.remove("I12");
                    i12.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I12");
                    i12.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I13"))
                {
                    seats.remove("I13");
                    i13.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I13");
                    i13.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seats.contains("I14"))
                {
                    seats.remove("I14");
                    i14.setBackground(img2);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                else
                {
                    seats.add("I14");
                    i14.setBackground(img);
                    seats_selected.setText("Book "+String.valueOf(seats.size())+" "+"Ticket ");
                }
                getinfo();
            }
        });

        seats_selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seat_list = Arrays.toString(seats.toArray()).replace("[", "").replace("]", "");


                Intent intent = new Intent(SeatsActivity.this,SummaryActivity.class);
                intent.putExtra("movie",movie);
                intent.putExtra("hall",hall);
                intent.putExtra("show",show);
                intent.putExtra("seat_list",seat_list);
                intent.putExtra("language",language);
                intent.putExtra("rating",rating);
                intent.putExtra("seat_count",String.valueOf(seats.size()));

                startActivity(intent);
            }
        });



    }

    private void getinfo() {

        if (seats.isEmpty())
        {
            seats_selected.setVisibility(View.INVISIBLE);
            layout.setVisibility(View.VISIBLE);
        }
        else
        {
            seats_selected.setVisibility(View.VISIBLE);
            layout.setVisibility(View.INVISIBLE);
        }

    }
}
