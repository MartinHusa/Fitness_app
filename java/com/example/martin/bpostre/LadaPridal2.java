package com.example.martin.bpostre;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LadaPridal2 extends AppCompatActivity
{

    Intent intentZNK;
    String ZavaziNeboKali;

    Button BTNLP7UP;
    Button BTNLPDAP;
    Button BTNLPDIAMOND;

    String JakaPartieKali;
    String SilDynObo;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lada_pridal2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");

        SEVENUP();
        DIPANDPUSH();
        DIAMOND();
    }

    public void SEVENUP()
    {
        BTNLP7UP = (Button) findViewById(R.id.btnLP7up);

        BTNLP7UP.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        JakaPartieKali = "Laďa Přidal";
                        SilDynObo = "7Up Routine";

                        Intent intent = new Intent("com.example.martin.bpostre.RozpisTreninku");

                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali",  JakaPartieKali);
                        intent.putExtra("KRDRUHTRENINKU2", SilDynObo);

                        startActivity(intent);
                    }
                }
        );

    }

    public void DIPANDPUSH()
    {
        BTNLPDAP = (Button) findViewById(R.id.btnLPDipPush);

        BTNLPDAP.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        JakaPartieKali = "Laďa Přidal";
                        SilDynObo = "Dip Push Routine";

                        Intent intent = new Intent("com.example.martin.bpostre.RozpisTreninku");

                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali",  JakaPartieKali);
                        intent.putExtra("KRDRUHTRENINKU2", SilDynObo);

                        startActivity(intent);
                    }
                }
        );
    }

    public void DIAMOND()
    {
        BTNLPDIAMOND = (Button) findViewById(R.id.btnLPDiamond);

        BTNLPDIAMOND.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        JakaPartieKali = "Laďa Přidal";
                        SilDynObo = "Diamond Pull Routine";

                        Intent intent = new Intent("com.example.martin.bpostre.RozpisTreninku");

                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali",  JakaPartieKali);
                        intent.putExtra("KRDRUHTRENINKU2", SilDynObo);

                        startActivity(intent);
                    }
                }
        );
    }
}
