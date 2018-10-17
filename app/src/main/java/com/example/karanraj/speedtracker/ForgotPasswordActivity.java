package com.example.karanraj.speedtracker;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import java.util.regex.Matcher;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    boolean separateOnClickActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        button = (Button) findViewById(R.id.backToLoginBtn);
        button.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backToLoginBtn:
                if (!separateOnClickActive) {
                    finish();
                    System.exit(0);
                    separateOnClickActive = true;
                }
                break;
        }
    }


}