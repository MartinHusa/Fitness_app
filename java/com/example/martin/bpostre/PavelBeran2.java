package com.example.martin.bpostre;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class PavelBeran2 extends AppCompatActivity
{

    Button BTNHrudTric;
    Button BTNZadaBic;
    Button BTNNohyBrich;

    String JakaPartieKali;
    String SilDynObo;

    Intent intentZNK;
    String ZavaziNeboKali;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pavel_beran2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intentZNK = getIntent();
        ZavaziNeboKali  = intentZNK.getStringExtra("ZavaziNeboKali");

        HrudTric();
        ZadaBic();
        NohyBrich();

    }

    public void HrudTric()
    {

        BTNHrudTric = (Button) findViewById(R.id.btnPBHrudTric);

        BTNHrudTric.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                        JakaPartieKali = "Pavel Beran";
                        SilDynObo = "Hrudník + Triceps";

                        Intent intent = new Intent("com.example.martin.bpostre.RozpisTreninku");

                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali",  JakaPartieKali);
                        intent.putExtra("KRDRUHTRENINKU2", SilDynObo);

                        startActivity(intent);
                    }
                }
        );
    }

    public void ZadaBic()
    {

        BTNZadaBic = (Button) findViewById(R.id.btnPBZadaBic);

        BTNZadaBic.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                        JakaPartieKali = "Pavel Beran";
                        SilDynObo = "Záda + Biceps";

                        Intent intent = new Intent("com.example.martin.bpostre.RozpisTreninku");

                        intent.putExtra("ZavaziNeboKali", ZavaziNeboKali);
                        intent.putExtra("JakaPartieKali",  JakaPartieKali);
                        intent.putExtra("KRDRUHTRENINKU2", SilDynObo);

                        startActivity(intent);
                    }
                }
        );
    }

    public void NohyBrich()
    {

        BTNNohyBrich = (Button) findViewById(R.id.btnPBNohyBrich);

        BTNNohyBrich.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                        JakaPartieKali = "Pavel Beran";
                        SilDynObo = "Nohy + Břicho";

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
