package com.test.pwpbsesi6.Latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.test.pwpbsesi6.R;

public class Latihan2_Move_For_Result extends AppCompatActivity implements View.OnClickListener{
    Button btnPilih;
    RadioGroup rgAngka;

    public static String EXTRA_NUM_SELECTED = "extra_num_selected";
    public static int NUM_RESULT_CODE = 110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2__move__for__result);

        btnPilih = findViewById(R.id.btn_choose);
        rgAngka = findViewById(R.id.rg_angka);
        btnPilih.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_choose){
            if(rgAngka.getCheckedRadioButtonId() != 0){
                int value = 0;
                switch (rgAngka.getCheckedRadioButtonId()){
                    case R.id.rb_50:
                        value = 50;
                        break;
                    case R.id.rb_100:
                        value = 100;
                        break;
                    case R.id.rb_150:
                        value = 150;
                        break;
                    case R.id.rb_200:
                        value = 200;
                        break;

                }
                Intent resultNum = new Intent();
                resultNum.putExtra(EXTRA_NUM_SELECTED,value);
                setResult(NUM_RESULT_CODE,resultNum);
                finish();
            }
        }
    }
}
