package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ChodTreninku2 extends AppCompatActivity
{

    TextView CAS;
    CountDownTimer CDT;

    Button BTNChodDvaPreskoc;

    Intent intentPocetCviku;
    int PocetCviku;

    Intent intentDelkaTreninku;
    String DelkaTreninku;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chod_treninku2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intentDelkaTreninku = getIntent();
        DelkaTreninku = intentDelkaTreninku.getStringExtra("DelkaTreninku");

        Odpocitavej();
        OnClickButtonListener222();
    }

    private void Odpocitavej()
    {
        CAS = (TextView) findViewById(R.id.cas);

        if (DelkaTreninku.equals("kratky"))
        {
            CAS.setText("120");
            CDT = new CountDownTimer(120 * 1000, 1000)
            {
                @Override
                public void onTick(long millisUtilFinished)
                {
                    CAS.setText("" + millisUtilFinished / 1000);
                }

                @Override
                public void onFinish()
                {
                    CAS.setText("HOTOVO!");

                }
            };
        }

        if (DelkaTreninku.equals("dlouhy"))
        {
            CAS.setText("90");
            CDT = new CountDownTimer(90 * 1000, 1000)
            {
                @Override
                public void onTick(long millisUtilFinished)
                {
                    CAS.setText("" + millisUtilFinished / 1000);
                }

                @Override
                public void onFinish()
                {
                    CAS.setText("HOTOVO!");

                }
            };
        }

        if (DelkaTreninku.equals("kali"))
        {
            CAS.setText("60");
            CDT = new CountDownTimer(60 * 1000, 1000)
            {
                @Override
                public void onTick(long millisUtilFinished)
                {
                    CAS.setText("" + millisUtilFinished / 1000);
                }

                @Override
                public void onFinish()
                {
                    CAS.setText("HOTOVO!");

                }
            };
        }




        CDT.start();
    }



    public void OnClickButtonListener222()
    {

        BTNChodDvaPreskoc = (Button) findViewById(R.id.btnChodDvaPreskoc);
        BTNChodDvaPreskoc.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        VyhodnotPreskoceni();
                    }
                }
        );

    }

    public void VyhodnotPreskoceni()
    {
        intentDelkaTreninku = getIntent();
        DelkaTreninku = intentDelkaTreninku.getStringExtra("DelkaTreninku");

        intentPocetCviku = getIntent();
        PocetCviku = intentPocetCviku.getIntExtra("PocetCviku", 0) - 1;

        if(PocetCviku != 0)
        {
            Intent intent = new Intent("com.example.martin.bpostre.ChodTreninku1");

            intent.putExtra("PocetCviku", PocetCviku);
            intent.putExtra("DelkaTreninku", DelkaTreninku);

            startActivity(intent);
        }

        if(PocetCviku == 0)
        {
            Intent intent = new Intent("com.example.martin.bpostre.VyhodnoceniTreninku");

            intent.putExtra("DelkaTreninku", DelkaTreninku);

            startActivity(intent);
        }

    }


}
