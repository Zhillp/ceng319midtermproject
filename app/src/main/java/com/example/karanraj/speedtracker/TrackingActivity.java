package com.example.karanraj.speedtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class TrackingActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mtoggle;
    NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);


        mdrawerlayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        mtoggle = new ActionBarDrawerToggle(this, mdrawerlayout, R.string.Open, R.string.Close);

        mdrawerlayout.addDrawerListener(mtoggle);
        mtoggle.syncState();

//TODO get the 3 bar action bar for navdrawer
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView) findViewById(R.id.nav_view);

        nv.setNavigationItemSelectedListener(this);
    }

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Tracking:
                        Intent tracking = new Intent(TrackingActivity.this, TrackingActivity.class);
                        startActivity(tracking);
                        break;

                    case R.id.logs:
                        Intent logs = new Intent(TrackingActivity.this, LogsActivity.class);
                        startActivity(logs);
                        break;

                    case R.id.Aboutus:
                        Intent aboutus = new Intent(TrackingActivity.this, AboutusActivity.class);
                        startActivity(aboutus);
                        break;

                    case R.id.Settings:
                        Intent settings = new Intent(TrackingActivity.this, SettingsActivity.class);
                        startActivity(settings);
                        break;
                    case R.id.Sign_Out:
                        finish();
                        System.exit(0);
                }
                return true;
            }

            //TODO get the action bar to work with a tap
            @Override
            public boolean onOptionsItemSelected(MenuItem item) {
                if (mtoggle.onOptionsItemSelected(item)) {
                    return true;
                }
                return super.onOptionsItemSelected(item);
            }
        }
