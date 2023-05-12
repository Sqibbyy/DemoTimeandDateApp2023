package sg.edu.rp.c346.id21005739.demotimeanddateapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textView2);
        btnReset = findViewById(R.id.button4);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.getCurrentHour().toString();
                tp.getCurrentMinute().toString();
                String stringResponse = tp.getCurrentHour().toString();
                String stringResponses = tp.getCurrentMinute().toString();
                tvDisplay.setText("Time is " + stringResponse + ":" + stringResponses);
            }
        });


        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int month = dp.getMonth() + 1;
                dp.updateDate(2020, 0, 01);

                tvDisplay.setText("Date is " + dp.getDayOfMonth() + "/" + month + "/" + dp.getYear());
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(00);
                tp.setCurrentMinute(00);
                dp.updateDate(2020, 0, 01);
            }
        });

    }
}