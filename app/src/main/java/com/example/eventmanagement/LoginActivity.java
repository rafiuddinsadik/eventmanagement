package com.example.eventmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button registerNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        registerNow = findViewById(R.id.register_now);
    }

    public void routeToRegister(View view) {
        Intent in = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(in);
    }
}