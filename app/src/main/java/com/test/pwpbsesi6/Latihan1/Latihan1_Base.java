package com.test.pwpbsesi6.Latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.test.pwpbsesi6.MainActivity;
import com.test.pwpbsesi6.R;

public class Latihan1_Base extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1__base);

        final EditText nama = findViewById(R.id.edt_type);
        Button btnMove = findViewById(R.id.btn_lat1_pindah);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNama = new Intent(Latihan1_Base.this,Latihan1_Intent.class);
                intentNama.putExtra("kodenama",nama.getText().toString());
                startActivity(intentNama);
            }
        });
    }
}
