package com.example.martin.bpostre;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LadaPridal extends AppCompatActivity
{
    Button BTNLPDalsi;

    Intent intentZNK;
    String ZavaziNeboKali;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lada_pridal);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);


        BTNLPDalsi = (Button) findViewById(R.id.btnLPDalsi);

        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");

        Dalsi();
    }

    public void Dalsi()
    {
        BTNLPDalsi.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("com.example.martin.bpostre.LadaPridal2");
                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        startActivity(intent);
                    }
                }
        );
    }
}

