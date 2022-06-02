package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.change_button);
        TextView text = findViewById(R.id.text);

        button.setOnClickListener(view -> {
            view.setBackgroundColor(Color.RED);

            text.setText("Congratulations! You have successfully changed the text");
            text.setTextColor(Color.BLUE);
        });
    }
}