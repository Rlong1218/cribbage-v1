package com.rlong1218.cribbage;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        Button novice = findViewById(R.id.novice);
        //TODO set listener to start novice game

        Button intermediate = findViewById(R.id.intermediate);
        //TODO set listener to start intermediate game

        Button advanced = findViewById(R.id.advanced);
        //TODO set listener to star advanced game
    }
}