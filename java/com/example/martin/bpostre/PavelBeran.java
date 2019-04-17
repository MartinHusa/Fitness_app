package com.example.martin.bpostre;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class PavelBeran extends AppCompatActivity
{

    Button BTNPBDalsi;

    Intent intentZNK;
    String ZavaziNeboKali;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pavel_beran);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        BTNPBDalsi = (Button) findViewById(R.id.btnPBDalsi);

        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");

        Dalsi();
    }

    public void Dalsi()
    {
        BTNPBDalsi.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("com.example.martin.bpostre.PavelBeran2");
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        startActivity(intent);
                    }
                }
        );
    }
}
