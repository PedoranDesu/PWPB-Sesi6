package com.test.pwpbsesi6.Latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.test.pwpbsesi6.R;

public class Latihan1_Intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1__intent);
        TextView t = findViewById(R.id.txt_lat1_data);
        Bundle bundleLat1 = getIntent().getExtras();

        String s = bundleLat1.getString("kodenama");
        t.setText(s);
    }
}
