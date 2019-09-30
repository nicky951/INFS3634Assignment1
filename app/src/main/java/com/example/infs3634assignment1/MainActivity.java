package com.example.infs3634assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    //Sydney Time
    private TextView sydneyTime;
    TimeZone sydney = TimeZone.getTimeZone("Australia/Sydney");
    Calendar s = Calendar.getInstance(sydney);
    final int hourOfDaysSyd = s.get(Calendar.HOUR_OF_DAY);
    String sydneyTimeString = hourOfDaysSyd + ":" + String.format(Locale.ENGLISH,"%02d" , s.get(Calendar.MINUTE));

    //Japan Time
    private TextView tokyoTime;
    TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
    Calendar t = Calendar.getInstance(tokyo);
    final int hourOfDaysTok = t.get(Calendar.HOUR_OF_DAY);
    String tokyoTimeString = hourOfDaysTok + ":" + String.format(Locale.ENGLISH,"%02d" , t.get(Calendar.MINUTE));

    //Auckland Time
    private TextView aucklandTime;
    TimeZone auckland = TimeZone.getTimeZone("Pacific/Auckland");
    Calendar a = Calendar.getInstance(auckland);
    final int hourOfDaysAuk = a.get(Calendar.HOUR_OF_DAY);
    String aucklandTimeString = hourOfDaysAuk + ":" + String.format(Locale.ENGLISH,"%02d" , a.get(Calendar.MINUTE));

    //Dubai Time
    private TextView dubaiTime;
    TimeZone dubai = TimeZone.getTimeZone("Asia/Dubai");
    Calendar d = Calendar.getInstance(dubai);
    final int hourOfDaysDub = d.get(Calendar.HOUR_OF_DAY);
    String dubaiTimeString = hourOfDaysDub + ":" + String.format(Locale.ENGLISH,"%02d" , d.get(Calendar.MINUTE));

    //New York Time
    private TextView newyorkTime;
    TimeZone newyork = TimeZone.getTimeZone("America/New_York");
    Calendar n = Calendar.getInstance(newyork);
    final int hourOfDaysNew = n.get(Calendar.HOUR_OF_DAY);
    String newyorkTimeString = hourOfDaysNew + ":" + String.format(Locale.ENGLISH,"%02d" , n.get(Calendar.MINUTE));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}
