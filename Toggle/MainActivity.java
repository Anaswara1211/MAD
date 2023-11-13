package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image1,image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1= findViewById(R.id.image1);
        image2= findViewById(R.id.image2);
        image1.setOnClickListener(this::onClick);
        image2.setOnClickListener(this::onClick);

    }

    private void onClick(View view) {
        if(view.getId() == R.id.image2){
            image2.setVisibility(view.GONE);
            image1.setVisibility(view.VISIBLE);
        }else{
            image1.setVisibility(view.GONE);
            image2.setVisibility(view.VISIBLE);
        }
    }
}