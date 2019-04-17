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


public class TreninkZavazi extends AppCompatActivity
{
    Button BTNSvaParZavazi;
    Button BTNPavelBeran;

    Intent intentZNK;
    String ZavaziNeboKali;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_trenink_zavazi);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");

        OnClickButtonListener100();
        OnClickButtonListener101();

    }


    public void OnClickButtonListener100()
    {
        BTNSvaParZavazi = (Button) findViewById(R.id.btnSvalParZavaz);
        BTNSvaParZavazi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.martin.bpostre.Trenink22");
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        startActivity(intent);
                    }
                }
        );

    }


    public void OnClickButtonListener101()
    {
        BTNPavelBeran = (Button) findViewById(R.id.btnPavelBeran);
        BTNPavelBeran.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.martin.bpostre.PavelBeran");
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        startActivity(intent);
                    }
                }
        );

    }

}
