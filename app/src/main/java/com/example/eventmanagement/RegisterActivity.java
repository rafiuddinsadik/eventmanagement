package com.example.eventmanagement;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    Button backToLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        backToLogin = findViewById(R.id.login_button);
    }
    public void backToLogin(View view) {
        Intent in = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(in);
    }
}