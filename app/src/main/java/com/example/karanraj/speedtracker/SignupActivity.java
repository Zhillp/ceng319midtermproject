package com.example.karanraj.speedtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    boolean separateOnClickActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button = (Button) findViewById(R.id.backbutton);
        button.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backbutton:
                if (!separateOnClickActive) {
                    finish();
                    System.exit(0);
                    separateOnClickActive = true;
                }
                break;
        }
    }
}
