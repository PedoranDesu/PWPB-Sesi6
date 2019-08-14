package com.test.pwpbsesi6.Latihan2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.pwpbsesi6.R;

public class Latihan2_Base extends AppCompatActivity implements View.OnClickListener {
    public Button btnMove;
    public Button btnMoveData;
    public Button btnMoveObject;
    Button btnDialNumber;
    Button btnMoveResult;
    TextView tvResult;

    private int GET_NUM_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2__base);

        btnMove = findViewById(R.id.btn_move_activity);
        btnMove.setOnClickListener(this);
        btnMoveData = findViewById(R.id.btn_move_with_data_activity);
        btnMoveData.setOnClickListener(this);
        btnMoveObject = findViewById(R.id.btn_move_activity_object);
        btnMoveObject.setOnClickListener(this);

        btnDialNumber = findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);
        btnMoveResult = findViewById(R.id.btn_move_for_result);
        btnMoveResult.setOnClickListener(this);

        tvResult = findViewById(R.id.tv_result);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_move_activity:
                Intent move = new Intent(Latihan2_Base.this, Latihan2_Move.class);
                startActivity(move);
                break;
            case R.id.btn_move_with_data_activity:
                Intent moveData = new Intent(Latihan2_Base.this, Latihan2_Move_With_Data.class);
                moveData.putExtra(Latihan2_Move_With_Data.EXTRA_NAME, "Alvaro Dwi");
                moveData.putExtra(Latihan2_Move_With_Data.EXTRA_AGE, 17);
                startActivity(moveData);
                break;
            case R.id.btn_move_activity_object:
                Person paro = new Person();
                paro.setName("Alvaro Dwi");
                paro.setAge(17);
                paro.setEmail("varoalvaro493@gmail.com");
                paro.setCity("Bandung");
                Intent moveObject = new Intent(Latihan2_Base.this, Latihan2_Move_With_Object.class);
                moveObject.putExtra(Latihan2_Move_With_Object.EXTRA_PERSON, paro);
                startActivity(moveObject);
                break;
            case R.id.btn_dial_number:
                String myPhoneNum = "081324904522";
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + myPhoneNum));
                startActivity(dialIntent);
                break;
            case R.id.btn_move_for_result:
                Intent moveResult = new Intent(Latihan2_Base.this, Latihan2_Move_For_Result.class);
                startActivityForResult(moveResult, GET_NUM_CODE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GET_NUM_CODE){
            if(resultCode == Latihan2_Move_For_Result.NUM_RESULT_CODE){
                int nomorPilihan = data.getIntExtra(Latihan2_Move_For_Result.EXTRA_NUM_SELECTED,0);
                tvResult.setText(String.format("Nomor Pilihan : %s",nomorPilihan));
            }
        }
    }
}

