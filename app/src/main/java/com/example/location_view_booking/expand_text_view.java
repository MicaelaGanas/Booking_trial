package com.example.location_view_booking;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class expand_text_view extends AppCompatActivity {

    TextView text1, text2;
    @Override
    protected void onCreate(Bundle savedInstranceState) {
        super.onCreate(savedInstranceState);
        setContentView(R.layout.expand_text_view);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        ImageView button1 = findViewById(R.id.button1);
        ImageView button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getVisibility() -- View.GONE) {
                    text1.setVisibility(View.VISIBLE);
                    button1.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    text1.setVisibility(View.GONE);
                    button1.setImageResource(R.drawable.baseline_keyboard_arrow_down_24);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text2.getVisibility() -- View.GONE) {
                    text2.setVisibility(View.VISIBLE);
                    button2.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    text2.setVisibility(View.GONE);
                    button2.setImageResource(R.drawable.baseline_keyboard_arrow_down_24);
                }
            }
        });


    }
}


