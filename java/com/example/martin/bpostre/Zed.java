package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
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
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class Zed extends AppCompatActivity
{

    Toolbar tb1;
    TextView TVPeknyDen;
    String JmenoSP;

    Intent intentDatumTreninku;
    Integer DatumTreninku;

    Intent intentDatumTreninku2;
    Integer DatumTreninku2;

    Intent intentDatumTreninku3;
    Integer DatumTreninku3;

    Intent intentXXXP;
    Double XXXP;


    Intent intentStyl;
    String Styl;

    Intent intentObtiznost;
    String Obtiznost;

    Intent intentZavaziNeoKali;
    String ZavaziNeboKali;

    Intent intentJakaPartie;
    String JakaPartie;


    Button BTNHistorieTreninku;

    DatabaseHelper3 mojeDB;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zed);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        tb1 = (Toolbar) findViewById(R.id.TB1);
        setSupportActionBar(tb1);

        SharedPreferences sp5 = getSharedPreferences("Registrace", Context.MODE_PRIVATE);

        JmenoSP = sp5.getString("Jmeno2", "");

        TVPeknyDen = (TextView) findViewById(R.id.tvPeknyDen);
        TVPeknyDen.setText("Dobrý den uživateli: " + JmenoSP);


        intentDatumTreninku = getIntent();
        DatumTreninku = intentDatumTreninku.getIntExtra("DatumTreninku", 0);

        intentDatumTreninku2 = getIntent();
        DatumTreninku2 = intentDatumTreninku2.getIntExtra("DatumTreninku2", 0);

        intentDatumTreninku3 = getIntent();
        DatumTreninku3 = intentDatumTreninku3.getIntExtra("DatumTreninku3", 0);

        intentXXXP = getIntent();
        XXXP = intentXXXP.getDoubleExtra("Zkusenosti", 0);

        intentStyl = getIntent();
        Styl = intentStyl.getStringExtra("Styl7777");

        intentObtiznost = getIntent();
        Obtiznost = intentObtiznost.getStringExtra("Obtiznost7777");

        intentZavaziNeoKali = getIntent();
        ZavaziNeboKali = intentZavaziNeoKali.getStringExtra("ZavaziNeboKali7777");

        intentJakaPartie = getIntent();
        JakaPartie =  intentJakaPartie.getStringExtra("JakaPartieKali7777");



        BTNHistorieTreninku = (Button) findViewById(R.id.btnHistorieTreninku);

        mojeDB = new DatabaseHelper3(this);

        PridejData();
        UkažVše();
    }

    public void UkažVše()
    {
        BTNHistorieTreninku.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Cursor ress = mojeDB.getAllData();

                        if(ress.getCount() == 0)
                        {
                            UkažMessage("Error", "Data nenalezena");
                            return;
                        }

                        StringBuffer bufferr = new StringBuffer();
                        while (ress.moveToNext())
                        {
                            bufferr.append("Id :"+ ress.getString(0)+"\n");
                            bufferr.append("Datum :"+ ress.getString(1)+"\n");
                            bufferr.append("Xp :"+ ress.getString(2)+"\n\n");
                        }

                        UkažMessage("Data", bufferr.toString());
                    }
                }
        );
    }
    public void PridejData()
    {
        mojeDB.insertData(DatumTreninku.toString() +". "+ DatumTreninku2.toString()+". " + DatumTreninku3.toString()+". ", XXXP.toString() + "Xp");
    }

    public void UkažMessage(String title, String message)
    {
        AlertDialog.Builder builderr = new AlertDialog.Builder(this);

        builderr.setCancelable(true);
        builderr.setTitle(title);
        builderr.setMessage(message);
        builderr.show();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater MI=getMenuInflater();
        MI.inflate(R.menu.actionbar1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int I=item.getItemId();

        if(I==R.id.tlbZed)
        {
            Intent intent = new Intent("com.example.martin.bpostre.Zed");
            startActivity(intent);
        }
        else if (I==R.id.tlbTrenink)
        {
            Intent intent = new Intent("com.example.martin.bpostre.Trenink");
            startActivity(intent);
        }
        else if (I==R.id.tlbStatistiky)
        {
            Intent intent = new Intent("com.example.martin.bpostre.Statistiky");
            startActivity(intent);
        }
        else if (I==R.id.tlbProfil)
        {
            Intent intent = new Intent("com.example.martin.bpostre.Profil");
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }



}
