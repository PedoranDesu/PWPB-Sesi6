package com.test.pwpbsesi6.Latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.test.pwpbsesi6.R;

public class Latihan2_Move_With_Object extends AppCompatActivity {
    public static String EXTRA_PERSON = "extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2__move__with__object);

        tvObject = findViewById(R.id.tv_object_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String t = "Nama : "+ mPerson.getName() + ", Usia : "+ mPerson.getAge()+", Email : "+ mPerson.getEmail() + ", Lokasi : " + mPerson.getCity();
        tvObject.setText(t);
    }
}
