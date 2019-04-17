package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class TreninkKali extends AppCompatActivity {

    Button BTNLadaPridal;
    Intent intentZNK;
    String  ZavaziNeboKali;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trenink_kali);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");

        OnClickButtonListener111();

    }

    public void OnClickButtonListener111() {

        BTNLadaPridal = (Button) findViewById(R.id.btnLadaKali);
        BTNLadaPridal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent("com.example.martin.bpostre.LadaPridal");
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        startActivity(intent);
                    }
                }
        );
    }
}
