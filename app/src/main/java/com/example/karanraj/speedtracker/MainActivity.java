package com.example.karanraj.speedtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private android.widget.EditText Password;
    private AppCompatCheckBox Checkbox;
    TextView Link;
    Button Login;
    TextView ForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Checkbox = (AppCompatCheckBox) findViewById(R.id.checkbox1);
        Password = (EditText) findViewById(R.id.input_password);
        Link = (TextView) findViewById(R.id.link_signup);
        Login = (Button) findViewById(R.id.btn_login);
        ForgotPassword = (TextView) findViewById(R.id.forgotpassword);

        Checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (!isChecked) {
                    // show password
                    Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
    }

    public void onClick(View v) {

        if (v.getId() == R.id.link_signup) {
            Intent intent = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.forgotpassword) {
            Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_login) {
            Intent intent = new Intent(MainActivity.this, TrackingActivity.class);
            startActivity(intent);
        }

    }

    //TODO Create a menu and allow it to open in the HomeActivity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    //TODO When the Quit option is clicked close the application
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.quit) {
            finish();
            System.exit(0);
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
