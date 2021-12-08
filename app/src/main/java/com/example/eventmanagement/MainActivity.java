package com.example.eventmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        getStarted = findViewById(R.id.getStarted);
    }

    public void routeToLogin(View view) {
        Intent in = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(in);
    }
}