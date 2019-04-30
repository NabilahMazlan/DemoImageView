package com.example.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img2, img3, img4, img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the UIs from activity_main.xml
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        img5 = findViewById(R.id.imageView5);

        //Getting the images from drawables and set it into respective Imageview
        
        img2.setImageResource(R.drawable.day2);
        img3.setImageResource(R.drawable.day3);
        img4.setImageResource(R.drawable.day4);
        img5.setImageResource(R.drawable.day5);

    }
}
