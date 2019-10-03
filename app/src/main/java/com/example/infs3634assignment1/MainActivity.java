package com.example.infs3634assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
    TimeZone sydney;

    //Japan Time
    private TextView tokyoTime;
    TimeZone tokyo;

    //Auckland Time
    private TextView aucklandTime;
    TimeZone auckland;

    //Dubai Time
    private TextView dubaiTime;
    TimeZone dubai;

    //New York Time
    private TextView newyorkTime;
    TimeZone newyork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Default 24 hour on boot up
        twelveHour();

        //Logic to utilise AM-PM Switch
        changeTime = findViewById(R.id.switchTime);
        changeTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (changeTime.isChecked()) {
                    twentyFourHour();
                } else if (!changeTime.isChecked()) {
                    twelveHour();
;               }
            }
        });

        //The following is the checkbox logic to make views disappear
        CheckBox sydneyCheck;
        sydneyCheck = findViewById(R.id.sydneyCheck);

        sydneyCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                View sydneyView = findViewById(R.id.sydneyView);
                if(isChecked){
                    sydneyView.setVisibility(View.INVISIBLE);
                    sydneyView.setVisibility(View.GONE);
                } else if(!isChecked){
                    sydneyView.setVisibility(View.VISIBLE);
                }
            }
        });

        CheckBox tokyoCheck;
        tokyoCheck = findViewById(R.id.tokyoCheck);

        tokyoCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                View tokyoView = findViewById(R.id.tokyoView);
                if(isChecked){
                    tokyoView.setVisibility(View.INVISIBLE);
                    tokyoView.setVisibility(View.GONE);
                } else if(!isChecked){
                    tokyoView.setVisibility(View.VISIBLE);
                }
            }
        });

        CheckBox aucklandCheck;
        aucklandCheck = findViewById(R.id.aucklandCheck);

        aucklandCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                View aucklandView = findViewById(R.id.aucklandView);
                if(isChecked){
                    aucklandView.setVisibility(View.INVISIBLE);
                    aucklandView.setVisibility(View.GONE);
                } else if(!isChecked){
                    aucklandView.setVisibility(View.VISIBLE);
                }
            }
        });

        CheckBox dubaiCheck;
        dubaiCheck = findViewById(R.id.dubaiCheck);

        dubaiCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                View dubaiView = findViewById(R.id.dubaiView);
                if(isChecked){
                    dubaiView.setVisibility(View.INVISIBLE);
                    dubaiView.setVisibility(View.GONE);
                } else if(!isChecked){
                    dubaiView.setVisibility(View.VISIBLE);
                }
            }
        });

        CheckBox newyorkCheck;
        newyorkCheck = findViewById(R.id.newyorkCheck);

        newyorkCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                View newyorkView = findViewById(R.id.newyorkView);
                if(isChecked){
                    newyorkView.setVisibility(View.INVISIBLE);
                    newyorkView.setVisibility(View.GONE);
                } else if(!isChecked){
                    newyorkView.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    //24 Hour Display Logic
    public void twentyFourHour() {

        //Date format 24 hour
        DateFormat twelveHour = new SimpleDateFormat("HH:mm", Locale.ENGLISH);

        setTimeZone();

        Calendar s = Calendar.getInstance(sydney);
        twelveHour.setTimeZone(sydney);

        String timeS = twelveHour.format(s.getTime());
        sydneyTime = findViewById(R.id.sydneytime);
        sydneyTime.setText(timeS);

        Calendar t = Calendar.getInstance(tokyo);
        twelveHour.setTimeZone(tokyo);

        String timeT = twelveHour.format(t.getTime());
        tokyoTime = findViewById(R.id.tokyotime);
        tokyoTime.setText(timeT);

        Calendar a = Calendar.getInstance(auckland);
        twelveHour.setTimeZone(auckland);

        String timeA = twelveHour.format(a.getTime());
        aucklandTime = findViewById(R.id.aucklandtime);
        aucklandTime.setText(timeA);

        Calendar d = Calendar.getInstance(dubai);
        twelveHour.setTimeZone(dubai);

        String timeD = twelveHour.format(d.getTime());
        dubaiTime = findViewById(R.id.dubaitime);
        dubaiTime.setText(timeD);

        Calendar n = Calendar.getInstance(newyork);
        twelveHour.setTimeZone(newyork);

        String timeN = twelveHour.format(n.getTime());
        newyorkTime = findViewById(R.id.newyorktime);
        newyorkTime.setText(timeN);
    }

    //Display 12 hour display logic
    public void twelveHour() {

        //Date format 12 hour
        DateFormat twelveHour = new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);

        setTimeZone();

        Calendar s = Calendar.getInstance(sydney);
        twelveHour.setTimeZone(sydney);

        String timeS = twelveHour.format(s.getTime());
        sydneyTime = findViewById(R.id.sydneytime);
        sydneyTime.setText(timeS);

        Calendar t = Calendar.getInstance(tokyo);
        twelveHour.setTimeZone(tokyo);

        String timeT = twelveHour.format(t.getTime());
        tokyoTime = findViewById(R.id.tokyotime);
        tokyoTime.setText(timeT);

        Calendar a = Calendar.getInstance(auckland);
        twelveHour.setTimeZone(auckland);

        String timeA = twelveHour.format(a.getTime());
        aucklandTime = findViewById(R.id.aucklandtime);
        aucklandTime.setText(timeA);

        Calendar d = Calendar.getInstance(dubai);
        twelveHour.setTimeZone(dubai);

        String timeD = twelveHour.format(d.getTime());
        dubaiTime = findViewById(R.id.dubaitime);
        dubaiTime.setText(timeD);

        Calendar n = Calendar.getInstance(newyork);
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

    //Reset Timezone values: can be used for updates.
    public void setTimeZone() {
        sydney = TimeZone.getTimeZone("Australia/Sydney");
        tokyo = TimeZone.getTimeZone("Asia/Tokyo");
        auckland = TimeZone.getTimeZone("Pacific/Auckland");
        dubai = TimeZone.getTimeZone("Asia/Dubai");
        newyork = TimeZone.getTimeZone("America/New_York");
    }
}
