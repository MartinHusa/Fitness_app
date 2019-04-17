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
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Trenink22 extends AppCompatActivity
{
    RadioButton RBKR;
    RadioButton RBKB;
    RadioButton RBKT;
    RadioButton RBKH;
    RadioButton RBKZ;
    RadioButton RBKBR;
    RadioButton RBKN;

    Button BTNTrenink22Dalsi;

    int JakyTreninkKali;


    Intent intentZNK;
    String  ZavaziNeboKali;

    String JakaPartieKali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trenink22);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");

        OnClickButtonListener71();
        OnClickButtonListener72();
        OnClickButtonListener73();
        OnClickButtonListener74();
        OnClickButtonListener75();
        OnClickButtonListener76();
        OnClickButtonListener77();
        OnClickButtonListener78();

    }

    public void  VyberTypTreninkuKali()
    {
        if (JakyTreninkKali==1)
        {
           JakaPartieKali = "Ramena";
            Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu");
            intent.putExtra("JakaPartieKali", JakaPartieKali);
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }
        if (JakyTreninkKali==2)
        {
            JakaPartieKali = "Biceps";
            Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu");
            intent.putExtra("JakaPartieKali", JakaPartieKali);
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }
        if (JakyTreninkKali==3)
        {
            JakaPartieKali = "Triceps";
            Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu");
            intent.putExtra("JakaPartieKali", JakaPartieKali );
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }
        if (JakyTreninkKali==4)
        {
            JakaPartieKali = "Hrudník";
            Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu");
            intent.putExtra("JakaPartieKali", JakaPartieKali );
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }
        if (JakyTreninkKali==5)
        {
            JakaPartieKali = "Záda";
            Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu");
            intent.putExtra("JakaPartieKali",JakaPartieKali );
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }
        if (JakyTreninkKali==6)
        {
            JakaPartieKali = "Břicho";
            Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu");
            intent.putExtra("JakaPartieKali", JakaPartieKali );
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }
        if (JakyTreninkKali==7)
        {
            JakaPartieKali = "Nohy";
            Intent intent = new Intent("com.example.martin.bpostre.RamenaMenu");
            intent.putExtra("JakaPartieKali", JakaPartieKali );
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }


    }

    public void OnClickButtonListener71() {



        RBKR = (RadioButton) findViewById(R.id.rbRamena);
        RBKR.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JakyTreninkKali=1;
                    }
                }
        );

    }

    public void OnClickButtonListener72() {



        RBKB = (RadioButton) findViewById(R.id.rbBiceps);
        RBKB.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JakyTreninkKali=2;
                    }
                }
        );

    }

    public void OnClickButtonListener73() {



        RBKT = (RadioButton) findViewById(R.id.rbTriceps);
        RBKT.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JakyTreninkKali=3;
                    }
                }
        );

    }

    public void OnClickButtonListener74() {



        RBKH = (RadioButton) findViewById(R.id.rbHrudnik);
        RBKH.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JakyTreninkKali=4;
                    }
                }
        );

    }

    public void OnClickButtonListener75() {



        RBKZ = (RadioButton) findViewById(R.id.rbZada);
        RBKZ.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JakyTreninkKali=5;
                    }
                }
        );

    }

    public void OnClickButtonListener76() {



        RBKBR = (RadioButton) findViewById(R.id.rbBricho);
        RBKBR.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JakyTreninkKali=6;
                    }
                }
        );

    }

    public void OnClickButtonListener77() {



        RBKN = (RadioButton) findViewById(R.id.rbNohy);
        RBKN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JakyTreninkKali=7;
                    }
                }
        );

    }

    public void OnClickButtonListener78()
    {
        BTNTrenink22Dalsi = (Button) findViewById(R.id.btnTrenink22Dalsi);
        BTNTrenink22Dalsi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        VyberTypTreninkuKali();
                    }
                }
        );

    }
}

