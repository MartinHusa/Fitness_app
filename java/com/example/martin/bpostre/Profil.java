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
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Profil extends AppCompatActivity
{

    Toolbar tb1;

    String Pohlavi, Vyska, Rok, Jmeno;

    TextView TVPohlavi, TVVyska, TVRok, TVJmeno, TVLevel, TVXp;

    Button BTNEditaceVahy, BTNOdhlasitSe;

    DatabaseHelper3 mojeDB;

    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);


        tb1 = (Toolbar) findViewById(R.id.TB1);
        setSupportActionBar(tb1);

        mojeDB = new DatabaseHelper3(this);

        OnClickOdhlasitSe();
        OnClickButtonListener2222();
        SeberAZobrazFyzickeUdaje();
        SectiXp();
        VypocitejLevel();
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



    public void SeberAZobrazFyzickeUdaje()
    {
        SharedPreferences sp33 = getSharedPreferences("FyzickeUdaje", Context.MODE_PRIVATE);
        Pohlavi = sp33.getString("Pohlavi", "");
        Vyska = sp33.getString("Vyska2", "");
        Rok = sp33.getString("Rok2", "");

        SharedPreferences sp3 = getSharedPreferences("Registrace", Context.MODE_PRIVATE);
        Jmeno = sp3.getString("Heslo2", "");


        TVJmeno = (TextView) findViewById(R.id.tvProfilJmeno2);
        TVJmeno.setText(Jmeno);

        TVPohlavi = (TextView) findViewById(R.id.tvProfilPohlavi2);
        TVPohlavi.setText(Pohlavi);

        TVVyska = (TextView) findViewById(R.id.tvProfilVyska2);
        TVVyska.setText(Vyska);

        TVRok = (TextView) findViewById(R.id.tvProfilVek2);
        TVRok.setText(Rok);

    }

    public void OnClickOdhlasitSe()
    {
        BTNOdhlasitSe = (Button) findViewById(R.id.btnProfilOdhlasitSe);
        BTNOdhlasitSe.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("com.example.martin.bpostre.prihlaseni");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListener2222()
    {
        BTNEditaceVahy = (Button) findViewById(R.id.btnEditaceVahy);
        BTNEditaceVahy.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("com.example.martin.bpostre.Vaha");
                        startActivity(intent);
                    }
                }
        );

    }

    public void SectiXp()
    {
        sum = mojeDB.Sum();

        TVXp = (TextView) findViewById(R.id.tvProfilXp2);
        TVXp.setText(Integer.toString(sum));

    }

    public void VypocitejLevel()
    {
        if (sum >= 100)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("1");
        }

        if (sum >= 200)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("2");
        }

        if (sum >= 300)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("3");
        }

        if (sum >= 400)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("4");
        }

        if (sum >= 500)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("5");
        }

        if (sum >= 600)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("6");
        }

        if (sum >= 700)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("7");
        }

        if (sum >= 800)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("8");
        }

        if (sum >= 900)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("9");
        }

        if (sum >= 1000)
        {
            TVLevel = (TextView) findViewById(R.id.tvProfilLevel2);
            TVLevel.setText("10");
        }
    }
}
