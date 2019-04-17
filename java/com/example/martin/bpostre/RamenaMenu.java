package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class RamenaMenu extends AppCompatActivity
{

    Button BTNKRSila;
    Button BTNKRDyn;

    String DruhTreninkuKali;

    Intent  intentZNK;
    String  ZavaziNeboKali;

    Intent  intentJakaPartieKali;
    String  JakaPartieKali;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramena_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intentJakaPartieKali = getIntent();
        JakaPartieKali  = intentJakaPartieKali.getStringExtra("JakaPartieKali");



        AnimationDrawable animace = new AnimationDrawable();
        FrameLayout Napis = (FrameLayout) findViewById(R.id.flRamAnim);

        if (JakaPartieKali.equals("Ramena"))
        {
            animace.addFrame(getResources().getDrawable(R.drawable.rampredek), 4000);
            animace.addFrame(getResources().getDrawable(R.drawable.ramzadek), 4000);
        }

        if (JakaPartieKali.equals("Hrudník"))
        {
            animace.addFrame(getResources().getDrawable(R.drawable.prsaanim), 4000);
        }

        Napis.setBackground(animace);

        animace.start();



        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");




        OnClickButtonListener96();
        OnClickButtonListener97();


    }

    public void OnClickButtonListener96()
    {
        BTNKRSila = (Button) findViewById(R.id.btnKRSila);
        BTNKRSila.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        DruhTreninkuKali = "Síla";

                        Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu2");
                        intent.putExtra("KRDRUHTRENINKU", DruhTreninkuKali);
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali", JakaPartieKali);
                        startActivity(intent);
                    }
                }
        );

    }

    public void OnClickButtonListener97()
    {
        BTNKRDyn = (Button) findViewById(R.id.btnKRDyn);
        BTNKRDyn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        DruhTreninkuKali = "Dynamika";

                        Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu2");
                        intent.putExtra("KRDRUHTRENINKU", DruhTreninkuKali);
                        startActivity(intent);
                    }
                }
        );

    }


}
