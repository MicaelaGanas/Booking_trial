package com.example.location_view_booking;

import static com.example.location_view_booking.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView ImageSlider, Details, About, Showmore, Showmore1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        //Image Slider//
        ImageSlider = findViewById(id.Img_slider);
        ImageSlider.setHasFixedSize(true);
        ImageSlider.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //Details//
        Details = findViewById(id.details_booking);
        Details.setHasFixedSize(true);
        Details.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //About//
        About = findViewById(id.about_details);
        About.setHasFixedSize(true);
        About.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //What's Included//
        Showmore = findViewById(id.more_1);
        Showmore.setHasFixedSize(true);
        Showmore.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //What to expect//

        Showmore1 = findViewById(R.id.more_2);
        Showmore1.setHasFixedSize(true);
        Showmore1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}