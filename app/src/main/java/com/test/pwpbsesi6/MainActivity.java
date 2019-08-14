package com.test.pwpbsesi6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.test.pwpbsesi6.Latihan1.Latihan1_Base;
import com.test.pwpbsesi6.Latihan2.Latihan2_Base;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn_lat1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Latihan1_Base.class);
                startActivity(pindah);
            }
        });

        Button btn2 = findViewById(R.id.btn_lat2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Latihan2_Base.class);
                startActivity(pindah);
            }
        });
    }
}
