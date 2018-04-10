package com.example.android.calendar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);

       // long selectDate = calendarView.getDate();
        //set a day
       // calendarView.setDate(1463918226920L);

        //set first day in the week will be monday
        calendarView.setFirstDayOfWeek(2);
        calendarView.getWeekDayTextAppearance();
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int DayOfMonth) {
                Toast.makeText(getApplicationContext(), month + "/" + DayOfMonth + "/" + year, Toast.LENGTH_LONG).show();
            }
        });




    }
}
