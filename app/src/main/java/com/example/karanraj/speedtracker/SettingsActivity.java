package com.example.karanraj.speedtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }
}
