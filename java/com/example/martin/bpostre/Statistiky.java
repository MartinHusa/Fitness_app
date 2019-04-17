package com.example.martin.bpostre;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class Statistiky extends AppCompatActivity
{

    Toolbar tb1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiky);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        tb1 = (Toolbar) findViewById(R.id.TB1);
        setSupportActionBar(tb1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater MI = getMenuInflater();
        MI.inflate(R.menu.actionbar1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
}
