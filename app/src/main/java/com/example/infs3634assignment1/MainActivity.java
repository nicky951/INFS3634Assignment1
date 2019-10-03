package com.example.infs3634assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    //Switch to change time between AM to PM
    Switch changeTime;

    //Sydney Time
    private TextView sydneyTime;
    TimeZone sydney = TimeZone.getTimeZone("Australia/Sydney");
    Calendar s = Calendar.getInstance(sydney);

    //Japan Time
    private TextView tokyoTime;
    TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
    Calendar t = Calendar.getInstance(tokyo);

    //Auckland Time
    private TextView aucklandTime;
    TimeZone auckland = TimeZone.getTimeZone("Pacific/Auckland");
    Calendar a = Calendar.getInstance(auckland);

    //Dubai Time
    private TextView dubaiTime;
    TimeZone dubai = TimeZone.getTimeZone("Asia/Dubai");
    Calendar d = Calendar.getInstance(dubai);

    //New York Time
    private TextView newyorkTime;
    TimeZone newyork = TimeZone.getTimeZone("America/New_York");
    Calendar n = Calendar.getInstance(newyork);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Load 24 hour time on boot up
        start();

        //Logic to utilise AM-PM Switch
        changeTime = findViewById(R.id.switchTime);
        changeTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (changeTime.isChecked()) {
                    twentyFourHour();
                } else if (!changeTime.isChecked()) {
                    twelveHour();
                }
            }
        });
    }

    //24 Hour Display Logic
    public void twentyFourHour() {

        DateFormat twelveHour = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        twelveHour.setTimeZone(sydney);

        String timeS = twelveHour.format(s.getTime());
        sydneyTime = findViewById(R.id.sydneytime);
        sydneyTime.setText(timeS);

        twelveHour.setTimeZone(tokyo);

        String timeT = twelveHour.format(t.getTime());
        tokyoTime = findViewById(R.id.tokyotime);
        tokyoTime.setText(timeT);

        twelveHour.setTimeZone(auckland);

        String timeA = twelveHour.format(a.getTime());
        aucklandTime = findViewById(R.id.aucklandtime);
        aucklandTime.setText(timeA);

        twelveHour.setTimeZone(dubai);

        String timeD = twelveHour.format(d.getTime());
        dubaiTime = findViewById(R.id.dubaitime);
        dubaiTime.setText(timeD);

        twelveHour.setTimeZone(newyork);

        String timeN = twelveHour.format(n.getTime());
        newyorkTime = findViewById(R.id.newyorktime);
        newyorkTime.setText(timeN);

    }

    //Display 12 Hour time from 24 Hour logic
    public void twelveHour() {

        DateFormat twelveHour = new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
        twelveHour.setTimeZone(sydney);

        String timeS = twelveHour.format(s.getTime());
        sydneyTime = findViewById(R.id.sydneytime);
        sydneyTime.setText(timeS);

        twelveHour.setTimeZone(tokyo);

        String timeT = twelveHour.format(t.getTime());
        tokyoTime = findViewById(R.id.tokyotime);
        tokyoTime.setText(timeT);

        twelveHour.setTimeZone(auckland);

        String timeA = twelveHour.format(a.getTime());
        aucklandTime = findViewById(R.id.aucklandtime);
        aucklandTime.setText(timeA);

        twelveHour.setTimeZone(dubai);

        String timeD = twelveHour.format(d.getTime());
        dubaiTime = findViewById(R.id.dubaitime);
        dubaiTime.setText(timeD);

        twelveHour.setTimeZone(newyork);

        String timeN = twelveHour.format(n.getTime());
        newyorkTime = findViewById(R.id.newyorktime);
        newyorkTime.setText(timeN);
    }

    //Load data on app start
    public void start(){
        DateFormat twelveHour = new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
        twelveHour.setTimeZone(sydney);

        String timeS = twelveHour.format(s.getTime());
        sydneyTime = findViewById(R.id.sydneytime);
        sydneyTime.setText(timeS);

        twelveHour.setTimeZone(tokyo);

        String timeT = twelveHour.format(t.getTime());
        tokyoTime = findViewById(R.id.tokyotime);
        tokyoTime.setText(timeT);

        twelveHour.setTimeZone(auckland);

        String timeA = twelveHour.format(a.getTime());
        aucklandTime = findViewById(R.id.aucklandtime);
        aucklandTime.setText(timeA);

        twelveHour.setTimeZone(dubai);

        String timeD = twelveHour.format(d.getTime());
        dubaiTime = findViewById(R.id.dubaitime);
        dubaiTime.setText(timeD);

        twelveHour.setTimeZone(newyork);

        String timeN = twelveHour.format(n.getTime());
        newyorkTime = findViewById(R.id.newyorktime);
        newyorkTime.setText(timeN);

    }

    //Refresh app button logic
    public void appRefresh(View v){
        finish();

        //Remove slide transition
        overridePendingTransition(0, 0);
        startActivity(getIntent());
        overridePendingTransition(0, 0);
    }
}
