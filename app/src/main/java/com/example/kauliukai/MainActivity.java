package com.example.kauliukai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
      ImageView currentPicture;
      int[] pictures = {R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(view -> onClick(view));
        currentPicture = findViewById(R.id.imageView);
    }

    int getRandomNumber(int min, int max){
        System.out.print("text");
        return (int) (Math.random() * (max - min) + min);
    }

    void onClick(View v){
        currentPicture.setImageResource(pictures[getRandomNumber(0,5)]);
    }


}