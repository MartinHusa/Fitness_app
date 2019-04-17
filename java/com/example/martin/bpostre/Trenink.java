package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Trenink extends AppCompatActivity {

    Toolbar tb1;
    RadioButton RB1;
    RadioButton RB2;
    Button BTNDalsiTrenink;
    String ZavaziNeboKali;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trenink);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);


        tb1 = (Toolbar) findViewById(R.id.TB1);
        setSupportActionBar(tb1);

        OnClickButtonListener20();
        OnClickButtonListener21();
        OnClickButtonListener22();

        VyberTypTreninku();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater MI = getMenuInflater();
        MI.inflate(R.menu.actionbar1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int I = item.getItemId();

        if (I == R.id.tlbZed)
        {
            Intent intent = new Intent("com.example.martin.bpostre.Zed");
            startActivity(intent);
        } else if (I == R.id.tlbTrenink)
        {
            Intent intent = new Intent("com.example.martin.bpostre.Trenink");
            startActivity(intent);
        } else if (I == R.id.tlbStatistiky)
        {
            Intent intent = new Intent("com.example.martin.bpostre.Statistiky");
            startActivity(intent);
        } else if (I == R.id.tlbProfil)
        {
            Intent intent = new Intent("com.example.martin.bpostre.Profil");
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void  VyberTypTreninku()
    {
        if (ZavaziNeboKali=="Závaží")
        {
            ZavaziNeboKali = "Závaží";

            Intent intent = new Intent("com.example.martin.bpostre.TreninkZavazi");
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }

        if (ZavaziNeboKali=="Kalistenika")
        {
            ZavaziNeboKali = "Kalistenika";

            Intent intent = new Intent("com.example.martin.bpostre.TreninkKali");
            intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
            startActivity(intent);
        }
    }

    public void OnClickButtonListener20()
    {
        RB1 = (RadioButton) findViewById(R.id.rbZavazi);
        RB1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        FrameLayout Napis3 = (FrameLayout) findViewById(R.id.FLTrenal);
                        Napis3.setBackgroundResource(R.drawable.zavazi);
                        ZavaziNeboKali="Závaží";
                    }
                }
        );

    }

    public void OnClickButtonListener21()
    {
        RB2 = (RadioButton) findViewById(R.id.rbKali);
        RB2.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        FrameLayout Napis3 = (FrameLayout) findViewById(R.id.FLTrenal);
                        Napis3.setBackgroundResource(R.drawable.kalyy);
                        ZavaziNeboKali="Kalistenika";
                    }
                }
        );

    }

    public void OnClickButtonListener22()
    {
        BTNDalsiTrenink = (Button) findViewById(R.id.btnTreninkDalsi);
        BTNDalsiTrenink.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                        VyberTypTreninku();
                    }
                }
        );

    }

}





