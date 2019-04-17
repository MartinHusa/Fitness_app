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


public class RamenaMenu2 extends AppCompatActivity

{

    int KRDruhTreninku;

    Button BTNKRZac;
    Button BTNKRPok;
    Button BTNKRPro;

    String ObtiznostTreninkuKali;

    Intent intent;
    String DruhTreninkuKali2;

    Intent intentZNK;
    String  ZavaziNeboKali;

    Intent  intentJakaPartieKali;
    String  JakaPartieKali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramena_menu2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intent = getIntent();
        DruhTreninkuKali2 = intent.getStringExtra("KRDRUHTRENINKU");

        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");

        intentJakaPartieKali = getIntent();
        JakaPartieKali  = intentJakaPartieKali.getStringExtra("JakaPartieKali");

        OnClickButtonListener196();
        OnClickButtonListener197();
        OnClickButtonListener198();


    }

    public void OnClickButtonListener196() {



        BTNKRZac = (Button) findViewById(R.id.btnKRZac);
        BTNKRZac.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ObtiznostTreninkuKali = "Začátečník";

                        Intent intent = new Intent("com.example.martin.bpostre.RozpisTreninku");
                        intent.putExtra("OBTIZNOSTTRENINKUKALI",ObtiznostTreninkuKali);
                        intent.putExtra("KRDRUHTRENINKU2", DruhTreninkuKali2);
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali", JakaPartieKali);
                        startActivity(intent);
                    }
                }
        );

    }

    public void OnClickButtonListener197() {



        BTNKRPok = (Button) findViewById(R.id.btnKRPok);
        BTNKRPok.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ObtiznostTreninkuKali = "Pokročilý";

                        Intent intent = new Intent("com.example.martin.bpostre.RozpisTreninku");
                        intent.putExtra("OBTIZNOSTTRENINKUKALI",ObtiznostTreninkuKali);
                        intent.putExtra("KRDRUHTRENINKU2", DruhTreninkuKali2);
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali", JakaPartieKali);
                        startActivity(intent);
                    }
                }
        );

    }

    public void OnClickButtonListener198() {



        BTNKRPro = (Button) findViewById(R.id.btnKRPro);
        BTNKRPro.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ObtiznostTreninkuKali = "Profesionál";

                        Intent intent = new Intent("com.example.martin.bpostre.RozpisTreninku");
                        intent.putExtra("OBTIZNOSTTRENINKUKALI",ObtiznostTreninkuKali);
                        intent.putExtra("KRDRUHTRENINKU2", DruhTreninkuKali2);
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali", JakaPartieKali);
                        startActivity(intent);
                    }
                }
        );

    }
}
