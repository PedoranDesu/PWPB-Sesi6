package com.test.pwpbsesi6.Latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.test.pwpbsesi6.R;

public class Latihan2_Move_With_Data extends AppCompatActivity {
    public static String EXTRA_NAME = "extraName";
    public static String EXTRA_AGE = "extraAge";
    public TextView tvReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2__move__with__data);

        tvReceived = findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE,0);
        String t = "Nama : " + name +", Usia : " + age;
        tvReceived.setText(t);
    }
}
