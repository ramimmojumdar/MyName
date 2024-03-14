package com.example.mynameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

EditText inputName;
Button btnName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView animationView = findViewById(R.id.animationView);
        TextView textView = findViewById(R.id.textView);

        inputName = findViewById(R.id.inputName);
        btnName = findViewById(R.id.btnName);


        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationView.setVisibility(View.VISIBLE);
                String myString = inputName.getText().toString();
                textView.setText("Congratulations ❤ \n" + myString);

            }
        });


    }
}