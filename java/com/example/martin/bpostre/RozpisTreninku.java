package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class RozpisTreninku extends AppCompatActivity
{

    Button BTNRozpisDalsi;

    TextView TVRozepsanePolozky;
    TextView TVRozepsanePolozky2;
    TextView TVRozepsanePolozky3;
    TextView TVRozepsanePolozky4;
    TextView TVRozepsanePolozky5;
    TextView TVRozepsanePolozky6;
    TextView TVRozepsanePolozky7;
    TextView TVRozepsanePolozky8;
    TextView TVRozepsanePolozky9;
    TextView TVRozepsanePolozky10;
    TextView TVRozepsanePolozky11;
    TextView TVRozepsanePolozky12;
    TextView TVRozepsanePolozky13;
    TextView TVRozepsanePolozky14;
    TextView TVRozepsanePolozky15;
    TextView TVRozepsanePolozky16;

    TextView TVZacPokPro;
    TextView TVSilDynObo;
    TextView TVZavKali;
    TextView TVParLadaBer;


    Intent intentObtiznost;
    String Obtiznost;

    Intent intentSilDynObo;
    String SilDynObo;


    Intent intentZNK;
    String ZavaziNeboKali;

    Intent intentJakaPartieKali;
    String JakaPartieKali;

    Intent IntentPB;
    String PB;

    Intent IntentLP;
    String LP;

    String Obtiznost2;
    String SilDynObo2;
    String ZavaziNeboKali2;
    String JakaPartieKali2;


    int PocetCviku;

    String CvikSerie1;
    String CvikSerie2;
    String CvikSerie3;
    String CvikSerie4;
    String CvikSerie5;
    String CvikSerie6;
    String CvikSerie7;
    String CvikSerie8;
    String CvikSerie9;
    String CvikSerie10;
    String CvikSerie11;
    String CvikSerie12;
    String CvikSerie13;
    String CvikSerie14;
    String CvikSerie15;
    String CvikSerie16;

    String DelkaTreninku;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rozpis_treninku);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        TVZacPokPro = (TextView) findViewById(R.id.tvZacPokPro);
        intentObtiznost = getIntent();
        Obtiznost = intentObtiznost.getStringExtra("OBTIZNOSTTRENINKUKALI");
        TVZacPokPro.setText(Obtiznost);

        TVSilDynObo = (TextView) findViewById(R.id.tvSilDynObo);
        intentSilDynObo = getIntent();
        SilDynObo = intentSilDynObo.getStringExtra("KRDRUHTRENINKU2");
        TVSilDynObo.setText(SilDynObo);

        TVZavKali = (TextView) findViewById(R.id.tvZavKali);
        intentZNK = getIntent();
        ZavaziNeboKali = intentZNK.getStringExtra("ZavaziNeboKali");
        TVZavKali.setText(ZavaziNeboKali);

        TVParLadaBer = (TextView) findViewById(R.id.tvParLadaBer);
        intentJakaPartieKali = getIntent();
        JakaPartieKali = intentJakaPartieKali.getStringExtra("JakaPartieKali");
        TVParLadaBer.setText(JakaPartieKali);

        IntentPB = getIntent();
        PB = IntentPB.getStringExtra("PBTrenink");

        IntentLP = getIntent();
        LP = IntentLP.getStringExtra("LPTrenink");


        RozepisTrenink();
        OnClickButtonListener44();

    }


    public void RozepisTrenink()
    {

        Obtiznost2 = TVZacPokPro.getText().toString();
        SilDynObo2 = TVSilDynObo.getText().toString();
        ZavaziNeboKali2 = TVZavKali.getText().toString();
        JakaPartieKali2 = TVParLadaBer.getText().toString();

        SharedPreferences sp7777 = getSharedPreferences("ObtiznostAStyl", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor7777 = sp7777.edit();

        editor7777.putString("Styl7777", SilDynObo2);
        editor7777.commit();

        editor7777.putString("Obtiznost7777", Obtiznost2);
        editor7777.commit();

        editor7777.putString("ZavaziNeboKali7777", ZavaziNeboKali2);
        editor7777.commit();

        editor7777.putString("JakaPartieKali7777", JakaPartieKali2);
        editor7777.commit();



        if (ZavaziNeboKali2.equals("Závaží"))
        {
            if (JakaPartieKali2.equals("Ramena"))
            {

            }
            if (JakaPartieKali2.equals("Biceps"))
            {

            }
            if (JakaPartieKali2.equals("Triceps"))
            {

            }
            if (JakaPartieKali2.equals("Hrudník"))
            {
                if (SilDynObo2.equals("Síla"))
                {
                    if (Obtiznost2.equals("Začátečník"))
                    {
                        TreninkZavaziHrudnikZacatecnik();
                    }
                    if (Obtiznost2.equals("Pokročilý"))
                    {
                        TreninkZavaziHrudnikPokrocily();
                    }
                    if (Obtiznost2.equals("Profesionál"))
                    {
                        TreninkZavaziHrudnikProfesional();
                    }
                }
                if (SilDynObo2.equals("Dynamika"))
                {

                }
            }
            if (JakaPartieKali2.equals("Záda"))
            {

            }
            if (JakaPartieKali2.equals("Břicho"))
            {

            }
            if (JakaPartieKali2.equals("Nohy"))
            {

            }
            if (JakaPartieKali2.equals("Pavel Beran"))
            {
                if(SilDynObo2.equals("Hrudník + Triceps"))
                {
                    TreninkPBHrudnikBiceps();
                }

                if(SilDynObo2.equals("Záda + Biceps"))
                {

                }

                if(SilDynObo2.equals("Nohy + Břicho"))
                {

                }
            }
        }
        if (ZavaziNeboKali2.equals("Kalistenika"))
        {
            if (JakaPartieKali2.equals("Laďa Přidal"))
            {
                if(SilDynObo2.equals("7Up Routine"))
                {
                    SEVENUPROUTINE();
                }

                if(SilDynObo2.equals("Dip Push Routine"))
                {

                }

                if(SilDynObo2.equals("Diamond Pull Routine"))
                {

                }
            }

        }
    }

    public void OnClickButtonListener44()
    {
        BTNRozpisDalsi = (Button) findViewById(R.id.btnRozpisDalsi);
        BTNRozpisDalsi.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("com.example.martin.bpostre.ChodTreninku1");

                        intent.putExtra("PocetCviku", PocetCviku);
                        intent.putExtra("DelkaTreninku", DelkaTreninku);

                        startActivity(intent);
                    }
                }
        );

    }

















    public void TreninkZavaziHrudnikZacatecnik()
    {
        SharedPreferences sp2 = getSharedPreferences("CvikSerie", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = sp2.edit();

        TVRozepsanePolozky = (TextView) findViewById(R.id.tv1);
        CvikSerie1 = "BENCH PRESS 30KG x 8";
        TVRozepsanePolozky.setText(CvikSerie1);
        editor2.putString("CvikSerie1", CvikSerie1);
        editor2.commit();

        TVRozepsanePolozky2 = (TextView) findViewById(R.id.tv2);
        CvikSerie2 = "BENCH PRESS 40KG x 6";
        TVRozepsanePolozky2.setText(CvikSerie2);
        editor2.putString("CvikSerie2", CvikSerie2);
        editor2.commit();

        TVRozepsanePolozky3 = (TextView) findViewById(R.id.tv3);
        CvikSerie3 = "BENCH PRESS 50KG x 4";
        TVRozepsanePolozky3.setText(CvikSerie3);
        editor2.putString("CvikSerie3", CvikSerie3);
        editor2.commit();

        TVRozepsanePolozky4 = (TextView) findViewById(R.id.tv4);
        CvikSerie4 = "BENCH PRESS 60KG x 2";
        TVRozepsanePolozky4.setText(CvikSerie4);
        editor2.putString("CvikSerie4", CvikSerie4);
        editor2.commit();

        TVRozepsanePolozky5 = (TextView) findViewById(R.id.tv5);
        CvikSerie5 = "BENCH PRESS 80KG x 1";
        TVRozepsanePolozky5.setText(CvikSerie5);
        editor2.putString("CvikSerie5", CvikSerie5);
        editor2.commit();

        DelkaTreninku = "kratky";
        PocetCviku = 5;
    }

    public void TreninkZavaziHrudnikPokrocily()
    {
        TVRozepsanePolozky = (TextView) findViewById(R.id.tv1);
        TVRozepsanePolozky.setText("BENCH PRESS 50KG x 8");

        TVRozepsanePolozky2 = (TextView) findViewById(R.id.tv2);
        TVRozepsanePolozky2.setText("BENCH PRESS 60KG x 8");

        TVRozepsanePolozky3 = (TextView) findViewById(R.id.tv3);
        TVRozepsanePolozky3.setText("BENCH PRESS 70KG x 8");

        TVRozepsanePolozky4 = (TextView) findViewById(R.id.tv4);
        TVRozepsanePolozky4.setText("BENCH PRESS 80KG x 8");

        TVRozepsanePolozky5 = (TextView) findViewById(R.id.tv5);
        TVRozepsanePolozky5.setText("BENCH PRESS 100KG x 8");

        DelkaTreninku = "kratky";
        PocetCviku = 5;

    }

    public void TreninkZavaziHrudnikProfesional()
    {
        TVRozepsanePolozky = (TextView) findViewById(R.id.tv1);
        TVRozepsanePolozky.setText("BENCH PRESS 70KG x 8");

        TVRozepsanePolozky2 = (TextView) findViewById(R.id.tv2);
        TVRozepsanePolozky2.setText("BENCH PRESS 80KG x 8");

        TVRozepsanePolozky3 = (TextView) findViewById(R.id.tv3);
        TVRozepsanePolozky3.setText("BENCH PRESS 90KG x 8");

        TVRozepsanePolozky4 = (TextView) findViewById(R.id.tv4);
        TVRozepsanePolozky4.setText("BENCH PRESS 100KG x 8");

        TVRozepsanePolozky5 = (TextView) findViewById(R.id.tv5);
        TVRozepsanePolozky5.setText("BENCH PRESS 120KG x 8");

        DelkaTreninku = "kratky";
        PocetCviku = 5;
    }

    public void TreninkPBHrudnikBiceps()
    {
        SharedPreferences sp2 = getSharedPreferences("CvikSerie", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = sp2.edit();

        TVRozepsanePolozky = (TextView) findViewById(R.id.tv1);
        CvikSerie1 = "BENCH PRESS 90KG x 8";
        TVRozepsanePolozky.setText(CvikSerie1);
        editor2.putString("CvikSerie1", CvikSerie1);
        editor2.commit();

        TVRozepsanePolozky2 = (TextView) findViewById(R.id.tv2);
        CvikSerie2 = "BENCH PRESS 100KG x 6";
        TVRozepsanePolozky2.setText(CvikSerie2);
        editor2.putString("CvikSerie2", CvikSerie2);
        editor2.commit();

        TVRozepsanePolozky3 = (TextView) findViewById(R.id.tv3);
        CvikSerie3 = "BENCH PRESS 110KG x 4";
        TVRozepsanePolozky3.setText(CvikSerie3);
        editor2.putString("CvikSerie3", CvikSerie3);
        editor2.commit();

        TVRozepsanePolozky4 = (TextView) findViewById(R.id.tv4);
        CvikSerie4 = "BENCH PRESS 120KG x 2";
        TVRozepsanePolozky4.setText(CvikSerie4);
        editor2.putString("CvikSerie4", CvikSerie4);
        editor2.commit();

        TVRozepsanePolozky5 = (TextView) findViewById(R.id.tv5);
        CvikSerie5 = "BENCH PRESS 140KG x 1";
        TVRozepsanePolozky5.setText(CvikSerie5);
        editor2.putString("CvikSerie5", CvikSerie5);
        editor2.commit();

        TVRozepsanePolozky6 = (TextView) findViewById(R.id.tv6);
        CvikSerie6 = "ROZPAŽOVÁNÍ S JEDNORUČKAMI 20KG x 30";
        TVRozepsanePolozky6.setText(CvikSerie6);
        editor2.putString("CvikSerie6", CvikSerie6);
        editor2.commit();

        TVRozepsanePolozky7 = (TextView) findViewById(R.id.tv7);
        CvikSerie7 = "ROZPAŽOVÁNÍ S JEDNORUČKAMI 20KG x 25";
        TVRozepsanePolozky7.setText(CvikSerie7);
        editor2.putString("CvikSerie7", CvikSerie7);
        editor2.commit();

        TVRozepsanePolozky8 = (TextView) findViewById(R.id.tv8);
        CvikSerie8 = "TLAKY S JEDNORUČKAMI 20KG x 30";
        TVRozepsanePolozky8.setText(CvikSerie8);
        editor2.putString("CvikSerie8", CvikSerie8);
        editor2.commit();

        TVRozepsanePolozky9 = (TextView) findViewById(R.id.tv9);
        CvikSerie9 = "TLAKY S JEDNORUČKAMI 20KG x 25";
        TVRozepsanePolozky9.setText(CvikSerie9);
        editor2.putString("CvikSerie9", CvikSerie9);
        editor2.commit();

        TVRozepsanePolozky10 = (TextView) findViewById(R.id.tv10);
        CvikSerie10 = "ROZPAŽOVÁNÍ S JEDNORUČKAMI NA ŠÍKMÉ LAVICI 20KG x 30";
        TVRozepsanePolozky10.setText(CvikSerie10);
        editor2.putString("CvikSerie10", CvikSerie10);
        editor2.commit();

        TVRozepsanePolozky11 = (TextView) findViewById(R.id.tv11);
        CvikSerie11 = "ROZPAŽOVÁNÍ S JEDNORUČKAMI NA ŠIKMÉ LAVICI 20KG x 25";
        TVRozepsanePolozky11.setText(CvikSerie11);
        editor2.putString("CvikSerie11", CvikSerie11);
        editor2.commit();

        TVRozepsanePolozky12 = (TextView) findViewById(R.id.tv12);
        CvikSerie12 = "TLAKY S JEDNORUČKAMI NA ŠÍKMÉ LAVICI 20KG x 30";
        TVRozepsanePolozky12.setText(CvikSerie12);
        editor2.putString("CvikSerie12", CvikSerie12);
        editor2.commit();

        TVRozepsanePolozky13 = (TextView) findViewById(R.id.tv13);
        CvikSerie13 = "TLAKY S JEDNORUČKAMI NA ŠIKMÉ LAVICI 20KG x 25";
        TVRozepsanePolozky13.setText(CvikSerie13);
        editor2.putString("CvikSerie13", CvikSerie13);
        editor2.commit();

        TVRozepsanePolozky14 = (TextView) findViewById(R.id.tv14);
        CvikSerie14 = "KICK - BACK S JEDNORUČKAMI 15KG x 30";
        TVRozepsanePolozky14.setText(CvikSerie14);
        editor2.putString("CvikSerie14", CvikSerie14);
        editor2.commit();

        TVRozepsanePolozky15 = (TextView) findViewById(R.id.tv15);
        CvikSerie15 = "KICK - BACK S JEDNORUČKAMI 10KG x 30";
        TVRozepsanePolozky15.setText(CvikSerie15);
        editor2.putString("CvikSerie15", CvikSerie15);
        editor2.commit();

        TVRozepsanePolozky16 = (TextView) findViewById(R.id.tv16);
        CvikSerie16 = "KICK - BACK S JEDNORUČKAMI 5KG x 30";
        TVRozepsanePolozky16.setText(CvikSerie16);
        editor2.putString("CvikSerie16", CvikSerie16);
        editor2.commit();

        DelkaTreninku = "dlouhy";
        PocetCviku = 16;
    }

    public void SEVENUPROUTINE()
    {
        SharedPreferences sp2 = getSharedPreferences("CvikSerie", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = sp2.edit();

        TVRozepsanePolozky = (TextView) findViewById(R.id.tv1);
        CvikSerie1 = "KLIK x 7";
        TVRozepsanePolozky.setText(CvikSerie1);
        editor2.putString("CvikSerie1", CvikSerie1);
        editor2.commit();

        TVRozepsanePolozky2 = (TextView) findViewById(R.id.tv2);
        CvikSerie2 = "DIP x 7";
        TVRozepsanePolozky2.setText(CvikSerie2);
        editor2.putString("CvikSerie2", CvikSerie2);
        editor2.commit();

        TVRozepsanePolozky3 = (TextView) findViewById(R.id.tv3);
        CvikSerie3 = "SHYB x 7";
        TVRozepsanePolozky3.setText(CvikSerie3);
        editor2.putString("CvikSerie3", CvikSerie3);
        editor2.commit();

        TVRozepsanePolozky4 = (TextView) findViewById(R.id.tv4);
        CvikSerie4 = "KLIK x 7";
        TVRozepsanePolozky4.setText(CvikSerie4);
        editor2.putString("CvikSerie4", CvikSerie4);
        editor2.commit();

        TVRozepsanePolozky5 = (TextView) findViewById(R.id.tv5);
        CvikSerie5 = "DIP x 7";
        TVRozepsanePolozky5.setText(CvikSerie5);
        editor2.putString("CvikSerie5", CvikSerie5);
        editor2.commit();

        TVRozepsanePolozky6 = (TextView) findViewById(R.id.tv6);
        CvikSerie6 = "SHYB x 7";
        TVRozepsanePolozky6.setText(CvikSerie6);
        editor2.putString("CvikSerie6", CvikSerie6);
        editor2.commit();

        TVRozepsanePolozky7 = (TextView) findViewById(R.id.tv7);
        CvikSerie7 = "KLIK x 7";
        TVRozepsanePolozky7.setText(CvikSerie7);
        editor2.putString("CvikSerie7", CvikSerie7);
        editor2.commit();

        TVRozepsanePolozky8 = (TextView) findViewById(R.id.tv8);
        CvikSerie8 = "DIP x 7";
        TVRozepsanePolozky8.setText(CvikSerie8);
        editor2.putString("CvikSerie8", CvikSerie8);
        editor2.commit();

        TVRozepsanePolozky9 = (TextView) findViewById(R.id.tv9);
        CvikSerie9 = "SHYB x 7";
        TVRozepsanePolozky9.setText(CvikSerie9);
        editor2.putString("CvikSerie9", CvikSerie9);
        editor2.commit();

        TVRozepsanePolozky10 = (TextView) findViewById(R.id.tv10);
        CvikSerie10 = "KLIK x 7";
        TVRozepsanePolozky10.setText(CvikSerie10);
        editor2.putString("CvikSerie10", CvikSerie10);
        editor2.commit();

        TVRozepsanePolozky11 = (TextView) findViewById(R.id.tv11);
        CvikSerie11 = "DIP x 7";
        TVRozepsanePolozky11.setText(CvikSerie11);
        editor2.putString("CvikSerie11", CvikSerie11);
        editor2.commit();

        TVRozepsanePolozky12 = (TextView) findViewById(R.id.tv12);
        CvikSerie12 = "SHYB x 7";
        TVRozepsanePolozky12.setText(CvikSerie12);
        editor2.putString("CvikSerie12", CvikSerie12);
        editor2.commit();

        TVRozepsanePolozky13 = (TextView) findViewById(R.id.tv13);
        CvikSerie13 = "KLIK x 7";
        TVRozepsanePolozky13.setText(CvikSerie13);
        editor2.putString("CvikSerie13", CvikSerie13);
        editor2.commit();

        TVRozepsanePolozky14 = (TextView) findViewById(R.id.tv14);
        CvikSerie14 = "DIP x 7";
        TVRozepsanePolozky14.setText(CvikSerie14);
        editor2.putString("CvikSerie14", CvikSerie14);
        editor2.commit();

        TVRozepsanePolozky15 = (TextView) findViewById(R.id.tv15);
        CvikSerie15 = "SHYB x 7";
        TVRozepsanePolozky15.setText(CvikSerie15);
        editor2.putString("CvikSerie15", CvikSerie15);
        editor2.commit();


        DelkaTreninku = "kali";
        PocetCviku = 15;
    }
}





