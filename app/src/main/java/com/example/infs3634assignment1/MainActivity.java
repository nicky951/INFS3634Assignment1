package com.example.infs3634assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
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
    int hourOfDaysSyd = s.get(Calendar.HOUR_OF_DAY);
    String sydneyTimeString = hourOfDaysSyd + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));

    //Japan Time
    private TextView tokyoTime;
    TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
    Calendar t = Calendar.getInstance(tokyo);
    int hourOfDaysTok = t.get(Calendar.HOUR_OF_DAY);
    String tokyoTimeString = hourOfDaysTok + ":" + String.format(Locale.ENGLISH, "%02d", t.get(Calendar.MINUTE));

    //Auckland Time
    private TextView aucklandTime;
    TimeZone auckland = TimeZone.getTimeZone("Pacific/Auckland");
    Calendar a = Calendar.getInstance(auckland);
    int hourOfDaysAuk = a.get(Calendar.HOUR_OF_DAY);
    String aucklandTimeString = hourOfDaysAuk + ":" + String.format(Locale.ENGLISH, "%02d", a.get(Calendar.MINUTE));

    //Dubai Time
    private TextView dubaiTime;
    TimeZone dubai = TimeZone.getTimeZone("Asia/Dubai");
    Calendar d = Calendar.getInstance(dubai);
    int hourOfDaysDub = d.get(Calendar.HOUR_OF_DAY);
    String dubaiTimeString = hourOfDaysDub + ":" + String.format(Locale.ENGLISH, "%02d", d.get(Calendar.MINUTE));

    //New York Time
    private TextView newyorkTime;
    TimeZone newyork = TimeZone.getTimeZone("America/New_York");
    Calendar n = Calendar.getInstance(newyork);
    int hourOfDaysNew = n.get(Calendar.HOUR_OF_DAY);
    String newyorkTimeString = hourOfDaysNew + ":" + String.format(Locale.ENGLISH, "%02d", n.get(Calendar.MINUTE));

    //Indicate whether AM or PM after change
    boolean amS;
    boolean amT;
    boolean amA;
    boolean amD;
    boolean amN;

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
                    twelveHour();
                } else if (!changeTime.isChecked()) {
                    twentyFourHour();
                }
            }
        });
    }

    //24 Hour Display Logic
    public void twentyFourHour() {
        if (!amS) {
            hourOfDaysSyd = hourOfDaysSyd + 12;
            String sydneyTimeString = hourOfDaysSyd + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            sydneyTime.setText(sydneyTimeString);
        } else {
            String sydneyTimeString = hourOfDaysSyd + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            sydneyTime.setText(sydneyTimeString);
        }

        if (!amT) {
            hourOfDaysTok = hourOfDaysTok + 12;
            String tokyoTimeString = hourOfDaysTok + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            tokyoTime.setText(tokyoTimeString);
        } else {
            String tokyoTimeString = hourOfDaysTok + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            tokyoTime.setText(tokyoTimeString);
        }

        if (!amA) {
            hourOfDaysAuk = hourOfDaysAuk + 12;
            String aucklandTimeString = hourOfDaysAuk + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            aucklandTime.setText(aucklandTimeString);
        } else {
            String aucklandTimeString = hourOfDaysAuk + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            aucklandTime.setText(aucklandTimeString);
        }

        if (!amD) {
            hourOfDaysDub = hourOfDaysDub + 12;
            String dubaiTimeString = hourOfDaysDub + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            dubaiTime.setText(dubaiTimeString);
        } else {
            String dubaiTimeString = hourOfDaysDub + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            dubaiTime.setText(dubaiTimeString);
        }

        if (!amN) {
            hourOfDaysNew = hourOfDaysNew + 12;
            String newyorkTimeString = hourOfDaysNew + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            newyorkTime.setText(newyorkTimeString);
        } else {
            String newyorkTimeString = hourOfDaysNew + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
            newyorkTime.setText(newyorkTimeString);
        }
    }

    //Display 12 Hour time from 24 Hour logic
    public void twelveHour() {
        if (hourOfDaysSyd > 12) {
            amS = false;
            hourOfDaysSyd = hourOfDaysSyd - 12;
            String sydneyTimeString = hourOfDaysSyd + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            sydneyTime.setText(sydneyTimeString);
        } else if(hourOfDaysSyd == 0) {
            amS = true;
            String sydneyTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            sydneyTime.setText(sydneyTimeString);
        } else if(hourOfDaysSyd == 12) {
            amS = true;
            String sydneyTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            sydneyTime.setText(sydneyTimeString);
        } else {
            amS = true;
            String sydneyTimeString = hourOfDaysSyd + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            sydneyTime.setText(sydneyTimeString);
        }

        if (hourOfDaysTok > 12) {
            amT = false;
            hourOfDaysTok = hourOfDaysTok - 12;
            String tokyoTimeString = hourOfDaysTok + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            tokyoTime.setText(tokyoTimeString);
        } else if(hourOfDaysTok == 0) {
            amT = true;
            String tokyoTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            tokyoTime.setText(tokyoTimeString);
        }  else if(hourOfDaysTok == 12) {
            amT = true;
            String tokyoTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            tokyoTime.setText(tokyoTimeString);
        } else {
            amT = true;
            String tokyoTimeString = hourOfDaysTok + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            tokyoTime.setText(tokyoTimeString);
        }

        if (hourOfDaysAuk > 12) {
            amA = false;
            hourOfDaysAuk = hourOfDaysAuk - 12;
            String aucklandTimeString = hourOfDaysAuk + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            aucklandTime.setText(aucklandTimeString);
        } else if(hourOfDaysAuk == 0) {
            amA = true;
            String aucklandTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            aucklandTime.setText(aucklandTimeString);
        }  else if(hourOfDaysAuk == 12) {
            amA = true;
            String aucklandTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            aucklandTime.setText(aucklandTimeString);
        } else {
            amA = true;
            String aucklandTimeString = hourOfDaysAuk + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            aucklandTime.setText(aucklandTimeString);
        }

        if (hourOfDaysDub > 12) {
            amD = false;
            hourOfDaysDub = hourOfDaysDub - 12;
            String dubaiTimeString = hourOfDaysDub + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            dubaiTime.setText(dubaiTimeString);
        } else if(hourOfDaysDub == 0) {
            amD = true;
            String dubaiTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            dubaiTime.setText(dubaiTimeString);
        }  else if(hourOfDaysDub == 12) {
            amD = true;
            String dubTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            dubaiTime.setText(dubTimeString);
        } else {
            amD = true;
            String dubaiTimeString = hourOfDaysDub + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            dubaiTime.setText(dubaiTimeString);
        }

        if (hourOfDaysNew > 12) {
            amN = false;
            hourOfDaysNew = hourOfDaysNew - 12;
            String newyorkTimeString = hourOfDaysNew + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            newyorkTime.setText(newyorkTimeString);
        } else if(hourOfDaysNew == 0) {
            amN = true;
            String newyorkTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            newyorkTime.setText(newyorkTimeString);
        }  else if(hourOfDaysNew == 12) {
            amN = true;
            String newyorkTimeString =  "12:" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " pm";
            newyorkTime.setText(newyorkTimeString);
        } else {
            amN = true;
            String newyorkTimeString = hourOfDaysNew + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + " am";
            newyorkTime.setText(newyorkTimeString);
        }
    }

    //Load daa on app start
    public void start(){
        sydneyTime = findViewById(R.id.sydneytime);
        sydneyTime.setText(sydneyTimeString);

        tokyoTime = findViewById(R.id.tokyotime);
        tokyoTime.setText(tokyoTimeString);

        aucklandTime = findViewById(R.id.aucklandtime);
        aucklandTime.setText(aucklandTimeString);

        dubaiTime = findViewById(R.id.dubaitime);
        dubaiTime.setText(dubaiTimeString);

        newyorkTime = findViewById(R.id.newyorktime);
        newyorkTime.setText(newyorkTimeString);
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
