package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;


public class VyhodnoceniTreninku extends AppCompatActivity
{
    Button BTNKonecTreninku;

    TextView TVVyppsanePolozky1;
    TextView TVVyppsanePolozky2;
    TextView TVVyppsanePolozky3;
    TextView TVVyppsanePolozky4;
    TextView TVVyppsanePolozky5;
    TextView TVVyppsanePolozky6;
    TextView TVVyppsanePolozky7;
    TextView TVVyppsanePolozky8;
    TextView TVVyppsanePolozky9;
    TextView TVVyppsanePolozky10;
    TextView TVVyppsanePolozky11;
    TextView TVVyppsanePolozky12;
    TextView TVVyppsanePolozky13;
    TextView TVVyppsanePolozky14;
    TextView TVVyppsanePolozky15;
    TextView TVVyppsanePolozky16;

    TextView TVCelkoveXP;

    int UdelanaOpakPrvniSerie1;
    int UdelanaOpakPrvniSerie2;
    int UdelanaOpakPrvniSerie3;
    int UdelanaOpakPrvniSerie4;
    int UdelanaOpakPrvniSerie5;
    int UdelanaOpakPrvniSerie6;
    int UdelanaOpakPrvniSerie7;
    int UdelanaOpakPrvniSerie8;
    int UdelanaOpakPrvniSerie9;
    int UdelanaOpakPrvniSerie10;
    int UdelanaOpakPrvniSerie11;
    int UdelanaOpakPrvniSerie12;
    int UdelanaOpakPrvniSerie13;
    int UdelanaOpakPrvniSerie14;
    int UdelanaOpakPrvniSerie15;
    int UdelanaOpakPrvniSerie16;


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

    double XP1;
    double XP2;
    double XP3;
    double XP4;
    double XP5;
    double XP6;
    double XP7;
    double XP8;
    double XP9;
    double XP10;
    double XP11;
    double XP12;
    double XP13;
    double XP14;
    double XP15;
    double XP16;

    double XP111;
    double XP22;
    double XP33;
    double XP44;
    double XP55;
    double XP66;
    double XP77;
    double XP88;
    double XP99;
    double XP1010;
    double XP1111;
    double XP1212;
    double XP1313;
    double XP1414;
    double XP1515;
    double XP1616;


    double XPCelkove;
    double XPCelkove2;

    String Styl;
    String Obtiznost;
    String ZavaziNeboKali;
    String JakaPartieKali;


    Calendar c;

    int DatumTreninku;
    int DatumTreninku2;
    int DatumTreninku3;

    Intent intentDelkaTreninku;
    String DelkaTreninku;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vyhodnoceni_treninku);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);


        intentDelkaTreninku = getIntent();
        DelkaTreninku = intentDelkaTreninku.getStringExtra("DelkaTreninku");

        OnClickButtonListener7777();
        VypocetAVypisXp();

    }

    public void OnClickButtonListener7777()
{
    BTNKonecTreninku = (Button) findViewById(R.id.btnVyhodnoceniKonec);
    BTNKonecTreninku.setOnClickListener(
            new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent intent = new Intent("com.example.martin.bpostre.Zed");

                    intent.putExtra("DatumTreninku", DatumTreninku);
                    intent.putExtra("DatumTreninku2", DatumTreninku2);
                    intent.putExtra("DatumTreninku3", DatumTreninku3);
                    intent.putExtra("Zkusenosti", XPCelkove);
                    intent.putExtra("Styl7777", Styl);
                    intent.putExtra("Obtiznost7777", Obtiznost);
                    intent.putExtra("ZavaziNeboKali7777", ZavaziNeboKali);
                    intent.putExtra("JakaPartieKali7777", JakaPartieKali);
                    startActivity(intent);
                }
            }
    );
}

    public void VypocetAVypisXp()
    {
        if(DelkaTreninku.equals("kratky"))
        {
            SharedPreferences sp = getSharedPreferences("UdelanaOpakovani", Context.MODE_PRIVATE);

            UdelanaOpakPrvniSerie1 = sp.getInt("UdelanaOpakPrvniSerie1", 0);
            UdelanaOpakPrvniSerie2 = sp.getInt("UdelanaOpakPrvniSerie2", 0);
            UdelanaOpakPrvniSerie3 = sp.getInt("UdelanaOpakPrvniSerie3", 0);
            UdelanaOpakPrvniSerie4 = sp.getInt("UdelanaOpakPrvniSerie4", 0);
            UdelanaOpakPrvniSerie5 = sp.getInt("UdelanaOpakPrvniSerie5", 0);

            SharedPreferences sp7777 = getSharedPreferences("ObtiznostAStyl", Context.MODE_PRIVATE);

            Styl = sp7777.getString("Styl7777", "");
            Obtiznost = sp7777.getString("Obtiznost7777", "");
            ZavaziNeboKali = sp7777.getString("ZavaziNeboKali7777", "");
            JakaPartieKali = sp7777.getString("JakaPartieKali7777", "");

            SharedPreferences sp2 = getSharedPreferences("CvikSerie", Context.MODE_PRIVATE);

            CvikSerie1 = sp2.getString("CvikSerie1", "");
            CvikSerie2 = sp2.getString("CvikSerie2", "");
            CvikSerie3 = sp2.getString("CvikSerie3", "");
            CvikSerie4 = sp2.getString("CvikSerie4", "");
            CvikSerie5 = sp2.getString("CvikSerie5", "");

            if (Styl.equals("Síla"))
            {
                if (Obtiznost.equals("Začátečník"))
                {
                    XP111 = UdelanaOpakPrvniSerie1 * 2;
                    XP1 = Math.round(XP111 * 100) / 100.0;

                    XP22 = UdelanaOpakPrvniSerie2 * 2.1;
                    XP2 = Math.round(XP22 * 100) / 100.0;

                    XP33 = UdelanaOpakPrvniSerie3 * 2.2;
                    XP3 = Math.round(XP33 * 100) / 100.0;

                    XP44 = UdelanaOpakPrvniSerie4 * 2.3;
                    XP4 = Math.round(XP44 * 100) / 100.0;

                    XP55 = UdelanaOpakPrvniSerie5 * 2.4;
                    XP5 = Math.round(XP55 * 100) / 100.0;


                    XPCelkove2 = XP111 + XP22 + XP33 + XP44 + XP55;
                    XPCelkove = Math.round(XPCelkove2 * 100) / 100.0;
                }


                if (Obtiznost.equals("Pokročilý"))
                {
                    XP111 = UdelanaOpakPrvniSerie1 * 2.2;
                    XP1 = Math.round(XP111 * 100) / 100.0;

                    XP22 = UdelanaOpakPrvniSerie2 * 2.3;
                    XP2 = Math.round(XP22 * 100) / 100.0;

                    XP33 = UdelanaOpakPrvniSerie3 * 2.4;
                    XP3 = Math.round(XP33 * 100) / 100.0;

                    XP44 = UdelanaOpakPrvniSerie4 * 2.5;
                    XP4 = Math.round(XP44 * 100) / 100.0;

                    XP55 = UdelanaOpakPrvniSerie5 * 2.6;
                    XP5 = Math.round(XP55 * 100) / 100.0;

                    XPCelkove2 = XP111 + XP22 + XP33 + XP44 + XP55;
                    XPCelkove = Math.round(XPCelkove2 * 100) / 100.0;
                }

                if (Obtiznost.equals("Profesionál")) {

                    XP111 = UdelanaOpakPrvniSerie1 * 2.4;
                    XP1 = Math.round(XP111 * 100) / 100.0;

                    XP22 = UdelanaOpakPrvniSerie2 * 2.5;
                    XP2 = Math.round(XP22 * 100) / 100.0;

                    XP33 = UdelanaOpakPrvniSerie3 * 2.6;
                    XP3 = Math.round(XP33 * 100) / 100.0;

                    XP44 = UdelanaOpakPrvniSerie4 * 2.7;
                    XP4 = Math.round(XP44 * 100) / 100.0;

                    XP55 = UdelanaOpakPrvniSerie5 * 2.8;
                    XP5 = Math.round(XP55 * 100) / 100.0;

                    XPCelkove2 = XP111 + XP22 + XP33 + XP44 + XP55;
                    XPCelkove = Math.round(XPCelkove2 * 100) / 100.0;
                }
            }

            if (Styl.equals("Dynamika"))
            {

            }


            TVVyppsanePolozky1 = (TextView) findViewById(R.id.tvR1);
            TVVyppsanePolozky1.setText(CvikSerie1 + " - " + String.valueOf(UdelanaOpakPrvniSerie1) + " - " + XP1 + "Xp");

            TVVyppsanePolozky2 = (TextView) findViewById(R.id.tvR2);
            TVVyppsanePolozky2.setText(CvikSerie2 + " - " + String.valueOf(UdelanaOpakPrvniSerie2) + " - " + XP2 + "Xp");

            TVVyppsanePolozky3 = (TextView) findViewById(R.id.tvR3);
            TVVyppsanePolozky3.setText(CvikSerie3 + " - " + String.valueOf(UdelanaOpakPrvniSerie3) + " - " + XP3 + "Xp");

            TVVyppsanePolozky4 = (TextView) findViewById(R.id.tvR4);
            TVVyppsanePolozky4.setText(CvikSerie4 + " - " + String.valueOf(UdelanaOpakPrvniSerie4) + " - " + XP4 + "Xp");

            TVVyppsanePolozky5 = (TextView) findViewById(R.id.tvR5);
            TVVyppsanePolozky5.setText(CvikSerie5 + " - " + String.valueOf(UdelanaOpakPrvniSerie5) + " - " + XP5 + "Xp");


            TVCelkoveXP = (TextView) findViewById(R.id.tvCelkoveXP);
            TVCelkoveXP.setText("Celkový počet Xp:" + String.valueOf(XPCelkove) + "Xp");


            c = Calendar.getInstance();

            DatumTreninku = c.get(Calendar.DATE);
            DatumTreninku2 = c.get(Calendar.MONTH);
            DatumTreninku3 = c.get(Calendar.YEAR);

        }

        if (DelkaTreninku.equals("dlouhy"))
        {
            SharedPreferences sp = getSharedPreferences("UdelanaOpakovani", Context.MODE_PRIVATE);

            UdelanaOpakPrvniSerie1 = sp.getInt("UdelanaOpakPrvniSerie1", 0);
            UdelanaOpakPrvniSerie2 = sp.getInt("UdelanaOpakPrvniSerie2", 0);
            UdelanaOpakPrvniSerie3 = sp.getInt("UdelanaOpakPrvniSerie3", 0);
            UdelanaOpakPrvniSerie4 = sp.getInt("UdelanaOpakPrvniSerie4", 0);
            UdelanaOpakPrvniSerie5 = sp.getInt("UdelanaOpakPrvniSerie5", 0);
            UdelanaOpakPrvniSerie6 = sp.getInt("UdelanaOpakPrvniSerie6", 0);
            UdelanaOpakPrvniSerie7 = sp.getInt("UdelanaOpakPrvniSerie7", 0);
            UdelanaOpakPrvniSerie8 = sp.getInt("UdelanaOpakPrvniSerie8", 0);
            UdelanaOpakPrvniSerie9 = sp.getInt("UdelanaOpakPrvniSerie9", 0);
            UdelanaOpakPrvniSerie10 = sp.getInt("UdelanaOpakPrvniSerie10", 0);
            UdelanaOpakPrvniSerie11 = sp.getInt("UdelanaOpakPrvniSerie11", 0);
            UdelanaOpakPrvniSerie12 = sp.getInt("UdelanaOpakPrvniSerie12", 0);
            UdelanaOpakPrvniSerie13 = sp.getInt("UdelanaOpakPrvniSerie13", 0);
            UdelanaOpakPrvniSerie14 = sp.getInt("UdelanaOpakPrvniSerie14", 0);
            UdelanaOpakPrvniSerie15 = sp.getInt("UdelanaOpakPrvniSerie15", 0);
            UdelanaOpakPrvniSerie16 = sp.getInt("UdelanaOpakPrvniSerie16", 0);



            SharedPreferences sp2 = getSharedPreferences("CvikSerie", Context.MODE_PRIVATE);

            CvikSerie1 = sp2.getString("CvikSerie1", "");
            CvikSerie2 = sp2.getString("CvikSerie2", "");
            CvikSerie3 = sp2.getString("CvikSerie3", "");
            CvikSerie4 = sp2.getString("CvikSerie4", "");
            CvikSerie5 = sp2.getString("CvikSerie5", "");
            CvikSerie6 = sp2.getString("CvikSerie6", "");
            CvikSerie7 = sp2.getString("CvikSerie7", "");
            CvikSerie8 = sp2.getString("CvikSerie8", "");
            CvikSerie9 = sp2.getString("CvikSerie9", "");
            CvikSerie10 = sp2.getString("CvikSerie10", "");
            CvikSerie11 = sp2.getString("CvikSerie11", "");
            CvikSerie12 = sp2.getString("CvikSerie12", "");
            CvikSerie13 = sp2.getString("CvikSerie13", "");
            CvikSerie14 = sp2.getString("CvikSerie14", "");
            CvikSerie15 = sp2.getString("CvikSerie15", "");
            CvikSerie16 = sp2.getString("CvikSerie16", "");


            XP111 = UdelanaOpakPrvniSerie1 * 2.5;
            XP1 = Math.round(XP111 * 100) / 100.0;

            XP22 = UdelanaOpakPrvniSerie2 * 2.6;
            XP2 = Math.round(XP22 * 100) / 100.0;

            XP33 = UdelanaOpakPrvniSerie3 * 2.7;
            XP3 = Math.round(XP33 * 100) / 100.0;

            XP44 = UdelanaOpakPrvniSerie4 * 2.8;
            XP4 = Math.round(XP44 * 100) / 100.0;

            XP55 = UdelanaOpakPrvniSerie5 * 2.9;
            XP5 = Math.round(XP55 * 100) / 100.0;

            XP66 = UdelanaOpakPrvniSerie6 * 0.5;
            XP6 = Math.round(XP66 * 100) / 100.0;

            XP77 = UdelanaOpakPrvniSerie7 * 0.5;
            XP7 = Math.round(XP77 * 100) / 100.0;

            XP88 = UdelanaOpakPrvniSerie8 * 0.5;
            XP8 = Math.round(XP88 * 100) / 100.0;

            XP99 = UdelanaOpakPrvniSerie9 * 0.5;
            XP9 = Math.round(XP99 * 100) / 100.0;

            XP1010 = UdelanaOpakPrvniSerie10 * 0.5;
            XP10 = Math.round(XP1010 * 100) / 100.0;

            XP1111 = UdelanaOpakPrvniSerie11 * 0.5;
            XP11 = Math.round(XP1111 * 100) / 100.0;

            XP1212 = UdelanaOpakPrvniSerie12 * 0.5;
            XP12 = Math.round(XP1212 * 100) / 100.0;

            XP1313 = UdelanaOpakPrvniSerie13 * 0.5;
            XP13 = Math.round(XP1313 * 100) / 100.0;

            XP1414 = UdelanaOpakPrvniSerie14 * 0.5;
            XP14 = Math.round(XP1414 * 100) / 100.0;

            XP1515 = UdelanaOpakPrvniSerie15 * 0.5;
            XP15 = Math.round(XP1515 * 100) / 100.0;

            XP1616 = UdelanaOpakPrvniSerie16 * 0.5;
            XP16 = Math.round(XP1616 * 100) / 100.0;


            XPCelkove2 = XP111 + XP22 + XP33 + XP44 + XP55 + XP66 + XP77 + XP88 + XP99 + XP1010 + XP1111 + XP1212 + XP1313 + XP1414 + XP1515 + XP1616;
            XPCelkove = Math.round(XPCelkove2 * 100) / 100.0;


            TVVyppsanePolozky1 = (TextView) findViewById(R.id.tvR1);
            TVVyppsanePolozky1.setText(CvikSerie1 + " - " + String.valueOf(UdelanaOpakPrvniSerie1) + " - " + XP1 + "Xp");

            TVVyppsanePolozky2 = (TextView) findViewById(R.id.tvR2);
            TVVyppsanePolozky2.setText(CvikSerie2 + " - " + String.valueOf(UdelanaOpakPrvniSerie2) + " - " + XP2 + "Xp");

            TVVyppsanePolozky3 = (TextView) findViewById(R.id.tvR3);
            TVVyppsanePolozky3.setText(CvikSerie3 + " - " + String.valueOf(UdelanaOpakPrvniSerie3) + " - " + XP3 + "Xp");

            TVVyppsanePolozky4 = (TextView) findViewById(R.id.tvR4);
            TVVyppsanePolozky4.setText(CvikSerie4 + " - " + String.valueOf(UdelanaOpakPrvniSerie4) + " - " + XP4 + "Xp");

            TVVyppsanePolozky5 = (TextView) findViewById(R.id.tvR5);
            TVVyppsanePolozky5.setText(CvikSerie5 + " - " + String.valueOf(UdelanaOpakPrvniSerie5) + " - " + XP5 + "Xp");

            TVVyppsanePolozky6 = (TextView) findViewById(R.id.tvR6);
            TVVyppsanePolozky6.setText(CvikSerie6 + " - " + String.valueOf(UdelanaOpakPrvniSerie6) + " - " + XP6 + "Xp");

            TVVyppsanePolozky7 = (TextView) findViewById(R.id.tvR7);
            TVVyppsanePolozky7.setText(CvikSerie7 + " - " + String.valueOf(UdelanaOpakPrvniSerie7) + " - " + XP7 + "Xp");

            TVVyppsanePolozky8 = (TextView) findViewById(R.id.tvR8);
            TVVyppsanePolozky8.setText(CvikSerie8 + " - " + String.valueOf(UdelanaOpakPrvniSerie8) + " - " + XP8 + "Xp");

            TVVyppsanePolozky9 = (TextView) findViewById(R.id.tvR9);
            TVVyppsanePolozky9.setText(CvikSerie9 + " - " + String.valueOf(UdelanaOpakPrvniSerie9) + " - " + XP9 + "Xp");

            TVVyppsanePolozky10 = (TextView) findViewById(R.id.tvR10);
            TVVyppsanePolozky10.setText(CvikSerie10 + " - " + String.valueOf(UdelanaOpakPrvniSerie10) + " - " + XP10 + "Xp");

            TVVyppsanePolozky11 = (TextView) findViewById(R.id.tvR11);
            TVVyppsanePolozky11.setText(CvikSerie11 + " - " + String.valueOf(UdelanaOpakPrvniSerie11) + " - " + XP11 + "Xp");

            TVVyppsanePolozky12 = (TextView) findViewById(R.id.tvR12);
            TVVyppsanePolozky12.setText(CvikSerie12 + " - " + String.valueOf(UdelanaOpakPrvniSerie12) + " - " + XP12 + "Xp");

            TVVyppsanePolozky13 = (TextView) findViewById(R.id.tvR13);
            TVVyppsanePolozky13.setText(CvikSerie13 + " - " + String.valueOf(UdelanaOpakPrvniSerie13) + " - " + XP13 + "Xp");

            TVVyppsanePolozky14 = (TextView) findViewById(R.id.tvR14);
            TVVyppsanePolozky14.setText(CvikSerie14 + " - " + String.valueOf(UdelanaOpakPrvniSerie14) + " - " + XP14 + "Xp");

            TVVyppsanePolozky15 = (TextView) findViewById(R.id.tvR15);
            TVVyppsanePolozky15.setText(CvikSerie15 + " - " + String.valueOf(UdelanaOpakPrvniSerie3) + " - " + XP15 + "Xp");

            TVVyppsanePolozky16 = (TextView) findViewById(R.id.tvR16);
            TVVyppsanePolozky16.setText(CvikSerie16 + " - " + String.valueOf(UdelanaOpakPrvniSerie4) + " - " + XP16 + "Xp");


            TVCelkoveXP = (TextView) findViewById(R.id.tvCelkoveXP);
            TVCelkoveXP.setText("Celkový počet Xp:" + String.valueOf(XPCelkove) + "Xp");


            c = Calendar.getInstance();

            DatumTreninku = c.get(Calendar.DATE);
            DatumTreninku2 = c.get(Calendar.MONTH);
            DatumTreninku3 = c.get(Calendar.YEAR);
        }

        if (DelkaTreninku.equals("kali"))
        {
            SharedPreferences sp = getSharedPreferences("UdelanaOpakovani", Context.MODE_PRIVATE);

            UdelanaOpakPrvniSerie1 = sp.getInt("UdelanaOpakPrvniSerie1", 0);
            UdelanaOpakPrvniSerie2 = sp.getInt("UdelanaOpakPrvniSerie2", 0);
            UdelanaOpakPrvniSerie3 = sp.getInt("UdelanaOpakPrvniSerie3", 0);
            UdelanaOpakPrvniSerie4 = sp.getInt("UdelanaOpakPrvniSerie4", 0);
            UdelanaOpakPrvniSerie5 = sp.getInt("UdelanaOpakPrvniSerie5", 0);
            UdelanaOpakPrvniSerie6 = sp.getInt("UdelanaOpakPrvniSerie6", 0);
            UdelanaOpakPrvniSerie7 = sp.getInt("UdelanaOpakPrvniSerie7", 0);
            UdelanaOpakPrvniSerie8 = sp.getInt("UdelanaOpakPrvniSerie8", 0);
            UdelanaOpakPrvniSerie9 = sp.getInt("UdelanaOpakPrvniSerie9", 0);
            UdelanaOpakPrvniSerie10 = sp.getInt("UdelanaOpakPrvniSerie10", 0);
            UdelanaOpakPrvniSerie11 = sp.getInt("UdelanaOpakPrvniSerie11", 0);
            UdelanaOpakPrvniSerie12 = sp.getInt("UdelanaOpakPrvniSerie12", 0);
            UdelanaOpakPrvniSerie13 = sp.getInt("UdelanaOpakPrvniSerie13", 0);
            UdelanaOpakPrvniSerie14 = sp.getInt("UdelanaOpakPrvniSerie14", 0);
            UdelanaOpakPrvniSerie15 = sp.getInt("UdelanaOpakPrvniSerie15", 0);



            SharedPreferences sp2 = getSharedPreferences("CvikSerie", Context.MODE_PRIVATE);

            CvikSerie1 = sp2.getString("CvikSerie1", "");
            CvikSerie2 = sp2.getString("CvikSerie2", "");
            CvikSerie3 = sp2.getString("CvikSerie3", "");
            CvikSerie4 = sp2.getString("CvikSerie4", "");
            CvikSerie5 = sp2.getString("CvikSerie5", "");
            CvikSerie6 = sp2.getString("CvikSerie6", "");
            CvikSerie7 = sp2.getString("CvikSerie7", "");
            CvikSerie8 = sp2.getString("CvikSerie8", "");
            CvikSerie9 = sp2.getString("CvikSerie9", "");
            CvikSerie10 = sp2.getString("CvikSerie10", "");
            CvikSerie11 = sp2.getString("CvikSerie11", "");
            CvikSerie12 = sp2.getString("CvikSerie12", "");
            CvikSerie13 = sp2.getString("CvikSerie13", "");
            CvikSerie14 = sp2.getString("CvikSerie14", "");
            CvikSerie15 = sp2.getString("CvikSerie15", "");


            XP111 = UdelanaOpakPrvniSerie1 * 1;
            XP1 = Math.round(XP111 * 100) / 100.0;

            XP22 = UdelanaOpakPrvniSerie2 * 1;
            XP2 = Math.round(XP22 * 100) / 100.0;

            XP33 = UdelanaOpakPrvniSerie3 * 1;
            XP3 = Math.round(XP33 * 100) / 100.0;

            XP44 = UdelanaOpakPrvniSerie4 * 1;
            XP4 = Math.round(XP44 * 100) / 100.0;

            XP55 = UdelanaOpakPrvniSerie5 * 1;
            XP5 = Math.round(XP55 * 100) / 100.0;

            XP66 = UdelanaOpakPrvniSerie6 * 1;
            XP6 = Math.round(XP66 * 100) / 100.0;

            XP77 = UdelanaOpakPrvniSerie7 * 1;
            XP7 = Math.round(XP77 * 100) / 100.0;

            XP88 = UdelanaOpakPrvniSerie8 * 1;
            XP8 = Math.round(XP88 * 100) / 100.0;

            XP99 = UdelanaOpakPrvniSerie9 * 1;
            XP9 = Math.round(XP99 * 100) / 100.0;

            XP1010 = UdelanaOpakPrvniSerie10 * 1;
            XP10 = Math.round(XP1010 * 100) / 100.0;

            XP1111 = UdelanaOpakPrvniSerie11 * 1;
            XP11 = Math.round(XP1111 * 100) / 100.0;

            XP1212 = UdelanaOpakPrvniSerie12 * 1;
            XP12 = Math.round(XP1212 * 100) / 100.0;

            XP1313 = UdelanaOpakPrvniSerie13 * 1;
            XP13 = Math.round(XP1313 * 100) / 100.0;

            XP1414 = UdelanaOpakPrvniSerie14 * 1;
            XP14 = Math.round(XP1414 * 100) / 100.0;

            XP1515 = UdelanaOpakPrvniSerie15 * 1;
            XP15 = Math.round(XP1515 * 100) / 100.0;


            XPCelkove2 = XP111 + XP22 + XP33 + XP44 + XP55 + XP66 + XP77 + XP88 + XP99 + XP1010 + XP1111 + XP1212 + XP1313 + XP1414 + XP1515;
            XPCelkove = Math.round(XPCelkove2 * 100) / 100.0;


            TVVyppsanePolozky1 = (TextView) findViewById(R.id.tvR1);
            TVVyppsanePolozky1.setText(CvikSerie1 + " - " + String.valueOf(UdelanaOpakPrvniSerie1) + " - " + XP1 + "Xp");

            TVVyppsanePolozky2 = (TextView) findViewById(R.id.tvR2);
            TVVyppsanePolozky2.setText(CvikSerie2 + " - " + String.valueOf(UdelanaOpakPrvniSerie2) + " - " + XP2 + "Xp");

            TVVyppsanePolozky3 = (TextView) findViewById(R.id.tvR3);
            TVVyppsanePolozky3.setText(CvikSerie3 + " - " + String.valueOf(UdelanaOpakPrvniSerie3) + " - " + XP3 + "Xp");

            TVVyppsanePolozky4 = (TextView) findViewById(R.id.tvR4);
            TVVyppsanePolozky4.setText(CvikSerie4 + " - " + String.valueOf(UdelanaOpakPrvniSerie4) + " - " + XP4 + "Xp");

            TVVyppsanePolozky5 = (TextView) findViewById(R.id.tvR5);
            TVVyppsanePolozky5.setText(CvikSerie5 + " - " + String.valueOf(UdelanaOpakPrvniSerie5) + " - " + XP5 + "Xp");

            TVVyppsanePolozky6 = (TextView) findViewById(R.id.tvR6);
            TVVyppsanePolozky6.setText(CvikSerie6 + " - " + String.valueOf(UdelanaOpakPrvniSerie6) + " - " + XP6 + "Xp");

            TVVyppsanePolozky7 = (TextView) findViewById(R.id.tvR7);
            TVVyppsanePolozky7.setText(CvikSerie7 + " - " + String.valueOf(UdelanaOpakPrvniSerie7) + " - " + XP7 + "Xp");

            TVVyppsanePolozky8 = (TextView) findViewById(R.id.tvR8);
            TVVyppsanePolozky8.setText(CvikSerie8 + " - " + String.valueOf(UdelanaOpakPrvniSerie8) + " - " + XP8 + "Xp");

            TVVyppsanePolozky9 = (TextView) findViewById(R.id.tvR9);
            TVVyppsanePolozky9.setText(CvikSerie9 + " - " + String.valueOf(UdelanaOpakPrvniSerie9) + " - " + XP9 + "Xp");

            TVVyppsanePolozky10 = (TextView) findViewById(R.id.tvR10);
            TVVyppsanePolozky10.setText(CvikSerie10 + " - " + String.valueOf(UdelanaOpakPrvniSerie10) + " - " + XP10 + "Xp");

            TVVyppsanePolozky11 = (TextView) findViewById(R.id.tvR11);
            TVVyppsanePolozky11.setText(CvikSerie11 + " - " + String.valueOf(UdelanaOpakPrvniSerie11) + " - " + XP11 + "Xp");

            TVVyppsanePolozky12 = (TextView) findViewById(R.id.tvR12);
            TVVyppsanePolozky12.setText(CvikSerie12 + " - " + String.valueOf(UdelanaOpakPrvniSerie12) + " - " + XP12 + "Xp");

            TVVyppsanePolozky13 = (TextView) findViewById(R.id.tvR13);
            TVVyppsanePolozky13.setText(CvikSerie13 + " - " + String.valueOf(UdelanaOpakPrvniSerie13) + " - " + XP13 + "Xp");

            TVVyppsanePolozky14 = (TextView) findViewById(R.id.tvR14);
            TVVyppsanePolozky14.setText(CvikSerie14 + " - " + String.valueOf(UdelanaOpakPrvniSerie14) + " - " + XP14 + "Xp");

            TVVyppsanePolozky15 = (TextView) findViewById(R.id.tvR15);
            TVVyppsanePolozky15.setText(CvikSerie15 + " - " + String.valueOf(UdelanaOpakPrvniSerie3) + " - " + XP15 + "Xp");




            TVCelkoveXP = (TextView) findViewById(R.id.tvCelkoveXP);
            TVCelkoveXP.setText("Celkový počet Xp:" + String.valueOf(XPCelkove) + "Xp");


            c = Calendar.getInstance();

            DatumTreninku = c.get(Calendar.DATE);
            DatumTreninku2 = c.get(Calendar.MONTH);
            DatumTreninku3 = c.get(Calendar.YEAR);
        }
    }

}
