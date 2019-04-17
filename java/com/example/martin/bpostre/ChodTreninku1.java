package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import pl.droidsonroids.gif.GifImageView;

import static android.graphics.BitmapFactory.decodeResource;


public class ChodTreninku1 extends AppCompatActivity
{
    Button BTNChodJednaDalsi;

    Intent intentPocetCviku;
    int PocetCviku;

    Intent intentDelkaTreninku;
    String DelkaTreninku;

    TextView TVChodCvik;
    TextView TVUdelanaOpak;

    SeekBar SB;

    int UdelanaOpakPrvniSerie1;
    int UdelanaOpakPrvniSerie2;
    int UdelanaOpakPrvniSerie3;
    int UdelanaOpakPrvniSerie4;
    int UdelanaOpakPrvniSerie5;
    int UdelanaOpakPrvniSerie6;
    int UdelanaOpakPrvniSerie7;
    int UdelanaOpakPrvniSerie8;
    int UdelanaOpakPrvniSerie9;
    int UdelanaOpakPrvniSerie10;
    int UdelanaOpakPrvniSerie11;
    int UdelanaOpakPrvniSerie12;
    int UdelanaOpakPrvniSerie13;
    int UdelanaOpakPrvniSerie14;
    int UdelanaOpakPrvniSerie15;
    int UdelanaOpakPrvniSerie16;

    String CvikSerie1;
    String CvikSerie2;
    String CvikSerie3;
    String CvikSerie4;
    String CvikSerie5;
    String CvikSerie6;
    String CvikSerie7;
    String CvikSerie8;
    String CvikSerie9;
    String CvikSerie10;
    String CvikSerie11;
    String CvikSerie12;
    String CvikSerie13;
    String CvikSerie14;
    String CvikSerie15;
    String CvikSerie16;

    String AnimaceCvik;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chod_treninku1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        intentPocetCviku = getIntent();
        PocetCviku = intentPocetCviku.getIntExtra("PocetCviku", 0);

        intentDelkaTreninku = getIntent();
        DelkaTreninku = intentDelkaTreninku.getStringExtra("DelkaTreninku");

        SB = (SeekBar) findViewById(R.id.seekBar);
        SB.setMax(30);

        TVUdelanaOpak = (TextView) findViewById(R.id.tvUdelanaOpak);
        TVUdelanaOpak.setText("0");

        SB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                TVUdelanaOpak.setText(String.valueOf(i));

                SharedPreferences sp = getSharedPreferences("UdelanaOpakovani", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();

                if (DelkaTreninku.equals("kratky"))
                {
                    if (PocetCviku == 5) {
                        UdelanaOpakPrvniSerie1 = i;


                        editor.putInt("UdelanaOpakPrvniSerie1", UdelanaOpakPrvniSerie1);
                        editor.commit();
                    }
                    if (PocetCviku == 4) {
                        UdelanaOpakPrvniSerie2 = i;

                        editor.putInt("UdelanaOpakPrvniSerie2", UdelanaOpakPrvniSerie2);
                        editor.commit();
                    }
                    if (PocetCviku == 3) {
                        UdelanaOpakPrvniSerie3 = i;

                        editor.putInt("UdelanaOpakPrvniSerie3", UdelanaOpakPrvniSerie3);
                        editor.commit();
                    }
                    if (PocetCviku == 2) {
                        UdelanaOpakPrvniSerie4 = i;

                        editor.putInt("UdelanaOpakPrvniSerie4", UdelanaOpakPrvniSerie4);
                        editor.commit();
                    }
                    if (PocetCviku == 1) {
                        UdelanaOpakPrvniSerie5 = i;

                        editor.putInt("UdelanaOpakPrvniSerie5", UdelanaOpakPrvniSerie5);
                        editor.commit();
                    }
                }

                if (DelkaTreninku.equals("dlouhy"))
                {
                    if (PocetCviku == 16) {
                        UdelanaOpakPrvniSerie1 = i;

                        editor.putInt("UdelanaOpakPrvniSerie1", UdelanaOpakPrvniSerie1);
                        editor.commit();
                    }
                    if (PocetCviku == 15) {
                        UdelanaOpakPrvniSerie2 = i;

                        editor.putInt("UdelanaOpakPrvniSerie2", UdelanaOpakPrvniSerie2);
                        editor.commit();
                    }
                    if (PocetCviku == 14) {
                        UdelanaOpakPrvniSerie3 = i;

                        editor.putInt("UdelanaOpakPrvniSerie3", UdelanaOpakPrvniSerie3);
                        editor.commit();
                    }
                    if (PocetCviku == 13) {
                        UdelanaOpakPrvniSerie4 = i;

                        editor.putInt("UdelanaOpakPrvniSerie4", UdelanaOpakPrvniSerie4);
                        editor.commit();
                    }
                    if (PocetCviku == 12) {
                        UdelanaOpakPrvniSerie5 = i;

                        editor.putInt("UdelanaOpakPrvniSerie5", UdelanaOpakPrvniSerie5);
                        editor.commit();
                    }
                    if (PocetCviku == 11) {
                        UdelanaOpakPrvniSerie6 = i;

                        editor.putInt("UdelanaOpakPrvniSerie6", UdelanaOpakPrvniSerie6);
                        editor.commit();
                    }
                    if (PocetCviku == 10) {
                        UdelanaOpakPrvniSerie7 = i;

                        editor.putInt("UdelanaOpakPrvniSerie7", UdelanaOpakPrvniSerie7);
                        editor.commit();
                    }
                    if (PocetCviku == 9) {
                        UdelanaOpakPrvniSerie8 = i;

                        editor.putInt("UdelanaOpakPrvniSerie8", UdelanaOpakPrvniSerie8);
                        editor.commit();
                    }
                    if (PocetCviku == 8) {
                        UdelanaOpakPrvniSerie9 = i;

                        editor.putInt("UdelanaOpakPrvniSerie9", UdelanaOpakPrvniSerie9);
                        editor.commit();
                    }
                    if (PocetCviku == 7) {
                        UdelanaOpakPrvniSerie10 = i;

                        editor.putInt("UdelanaOpakPrvniSerie10", UdelanaOpakPrvniSerie10);
                        editor.commit();
                    }
                    if (PocetCviku == 6) {
                        UdelanaOpakPrvniSerie11 = i;

                        editor.putInt("UdelanaOpakPrvniSerie11", UdelanaOpakPrvniSerie11);
                        editor.commit();
                    }
                    if (PocetCviku == 5) {
                        UdelanaOpakPrvniSerie12 = i;

                        editor.putInt("UdelanaOpakPrvniSerie12", UdelanaOpakPrvniSerie12);
                        editor.commit();
                    }
                    if (PocetCviku == 4) {
                        UdelanaOpakPrvniSerie13 = i;

                        editor.putInt("UdelanaOpakPrvniSerie13", UdelanaOpakPrvniSerie13);
                        editor.commit();
                    }
                    if (PocetCviku == 3) {
                        UdelanaOpakPrvniSerie14 = i;

                        editor.putInt("UdelanaOpakPrvniSerie14", UdelanaOpakPrvniSerie14);
                        editor.commit();
                    }
                    if (PocetCviku == 2) {
                        UdelanaOpakPrvniSerie15 = i;

                        editor.putInt("UdelanaOpakPrvniSerie15", UdelanaOpakPrvniSerie15);
                        editor.commit();
                    }
                    if (PocetCviku == 1) {
                        UdelanaOpakPrvniSerie16 = i;

                        editor.putInt("UdelanaOpakPrvniSerie16", UdelanaOpakPrvniSerie16);
                        editor.commit();
                    }

                }
                if (DelkaTreninku.equals("kali")) {

                    if (PocetCviku == 15) {
                        UdelanaOpakPrvniSerie1 = i;

                        editor.putInt("UdelanaOpakPrvniSerie1", UdelanaOpakPrvniSerie1);
                        editor.commit();
                    }
                    if (PocetCviku == 14) {
                        UdelanaOpakPrvniSerie2 = i;

                        editor.putInt("UdelanaOpakPrvniSerie2", UdelanaOpakPrvniSerie2);
                        editor.commit();
                    }
                    if (PocetCviku == 13) {
                        UdelanaOpakPrvniSerie3 = i;

                        editor.putInt("UdelanaOpakPrvniSerie3", UdelanaOpakPrvniSerie3);
                        editor.commit();
                    }
                    if (PocetCviku == 12) {
                        UdelanaOpakPrvniSerie4 = i;

                        editor.putInt("UdelanaOpakPrvniSerie4", UdelanaOpakPrvniSerie4);
                        editor.commit();
                    }
                    if (PocetCviku == 11) {
                        UdelanaOpakPrvniSerie5 = i;

                        editor.putInt("UdelanaOpakPrvniSerie5", UdelanaOpakPrvniSerie5);
                        editor.commit();
                    }
                    if (PocetCviku == 10) {
                        UdelanaOpakPrvniSerie6 = i;

                        editor.putInt("UdelanaOpakPrvniSerie6", UdelanaOpakPrvniSerie6);
                        editor.commit();
                    }
                    if (PocetCviku == 9) {
                        UdelanaOpakPrvniSerie7 = i;

                        editor.putInt("UdelanaOpakPrvniSerie7", UdelanaOpakPrvniSerie7);
                        editor.commit();
                    }
                    if (PocetCviku == 8) {
                        UdelanaOpakPrvniSerie8 = i;

                        editor.putInt("UdelanaOpakPrvniSerie8", UdelanaOpakPrvniSerie8);
                        editor.commit();
                    }
                    if (PocetCviku == 7) {
                        UdelanaOpakPrvniSerie9 = i;

                        editor.putInt("UdelanaOpakPrvniSerie9", UdelanaOpakPrvniSerie9);
                        editor.commit();
                    }
                    if (PocetCviku == 6) {
                        UdelanaOpakPrvniSerie10 = i;

                        editor.putInt("UdelanaOpakPrvniSerie10", UdelanaOpakPrvniSerie10);
                        editor.commit();
                    }
                    if (PocetCviku == 5) {
                        UdelanaOpakPrvniSerie11 = i;

                        editor.putInt("UdelanaOpakPrvniSerie11", UdelanaOpakPrvniSerie11);
                        editor.commit();
                    }
                    if (PocetCviku == 4) {
                        UdelanaOpakPrvniSerie12 = i;

                        editor.putInt("UdelanaOpakPrvniSerie12", UdelanaOpakPrvniSerie12);
                        editor.commit();
                    }
                    if (PocetCviku == 3) {
                        UdelanaOpakPrvniSerie13 = i;

                        editor.putInt("UdelanaOpakPrvniSerie13", UdelanaOpakPrvniSerie13);
                        editor.commit();
                    }
                    if (PocetCviku == 2) {
                        UdelanaOpakPrvniSerie14 = i;

                        editor.putInt("UdelanaOpakPrvniSerie14", UdelanaOpakPrvniSerie14);
                        editor.commit();
                    }
                    if (PocetCviku == 1) {
                        UdelanaOpakPrvniSerie15 = i;

                        editor.putInt("UdelanaOpakPrvniSerie15", UdelanaOpakPrvniSerie15);
                        editor.commit();
                    }
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });

        VypisCviku();
        OnClickButtonListener9999();
        AnimaceCviku();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void VypisCviku()
    {
        SharedPreferences sp2 = getSharedPreferences("CvikSerie", Context.MODE_PRIVATE);

        CvikSerie1 = sp2.getString("CvikSerie1", "");
        CvikSerie2 = sp2.getString("CvikSerie2", "");
        CvikSerie3 = sp2.getString("CvikSerie3", "");
        CvikSerie4 = sp2.getString("CvikSerie4", "");
        CvikSerie5 = sp2.getString("CvikSerie5", "");
        CvikSerie6 = sp2.getString("CvikSerie6", "");
        CvikSerie7 = sp2.getString("CvikSerie7", "");
        CvikSerie8 = sp2.getString("CvikSerie8", "");
        CvikSerie9 = sp2.getString("CvikSerie9", "");
        CvikSerie10 = sp2.getString("CvikSerie10", "");
        CvikSerie11 = sp2.getString("CvikSerie11", "");
        CvikSerie12 = sp2.getString("CvikSerie12", "");
        CvikSerie13 = sp2.getString("CvikSerie13", "");
        CvikSerie14 = sp2.getString("CvikSerie14", "");
        CvikSerie15 = sp2.getString("CvikSerie15", "");
        CvikSerie16 = sp2.getString("CvikSerie16", "");

        TVChodCvik = (TextView) findViewById(R.id.tvChodCvik);

        if (DelkaTreninku.equals("dlouhy"))
        {
            if (PocetCviku == 16) {
                TVChodCvik.setText(CvikSerie1);
            }
            if (PocetCviku == 15) {
                TVChodCvik.setText(CvikSerie2);
            }
            if (PocetCviku == 14) {
                TVChodCvik.setText(CvikSerie3);
            }
            if (PocetCviku == 13) {
                TVChodCvik.setText(CvikSerie4);
            }
            if (PocetCviku == 12) {
                TVChodCvik.setText(CvikSerie5);
            }
            if (PocetCviku == 11) {
                TVChodCvik.setText(CvikSerie6);
            }
            if (PocetCviku == 10) {
                TVChodCvik.setText(CvikSerie7);
            }
            if (PocetCviku == 9) {
                TVChodCvik.setText(CvikSerie8);
            }
            if (PocetCviku == 8) {
                TVChodCvik.setText(CvikSerie9);
            }
            if (PocetCviku == 7) {
                TVChodCvik.setText(CvikSerie10);
            }
            if (PocetCviku == 6) {
                TVChodCvik.setText(CvikSerie11);
            }
            if (PocetCviku == 5) {
                TVChodCvik.setText(CvikSerie12);
            }
            if (PocetCviku == 4) {
                TVChodCvik.setText(CvikSerie13);
            }
            if (PocetCviku == 3) {
                TVChodCvik.setText(CvikSerie14);
            }
            if (PocetCviku == 2) {
                TVChodCvik.setText(CvikSerie15);
            }
            if (PocetCviku == 1) {
                TVChodCvik.setText(CvikSerie16);
            }

        }

        if (DelkaTreninku.equals("kali"))
        {
            if (PocetCviku == 15) {
                TVChodCvik.setText(CvikSerie1);
            }
            if (PocetCviku == 14) {
                TVChodCvik.setText(CvikSerie2);
            }
            if (PocetCviku == 13) {
                TVChodCvik.setText(CvikSerie3);
            }
            if (PocetCviku == 12) {
                TVChodCvik.setText(CvikSerie4);
            }
            if (PocetCviku == 11) {
                TVChodCvik.setText(CvikSerie5);
            }
            if (PocetCviku == 10) {
                TVChodCvik.setText(CvikSerie6);
            }
            if (PocetCviku == 9) {
                TVChodCvik.setText(CvikSerie7);
            }
            if (PocetCviku == 8) {
                TVChodCvik.setText(CvikSerie8);
            }
            if (PocetCviku == 7) {
                TVChodCvik.setText(CvikSerie9);
            }
            if (PocetCviku == 6) {
                TVChodCvik.setText(CvikSerie10);
            }
            if (PocetCviku == 5) {
                TVChodCvik.setText(CvikSerie11);
            }
            if (PocetCviku == 4) {
                TVChodCvik.setText(CvikSerie12);
            }
            if (PocetCviku == 3) {
                TVChodCvik.setText(CvikSerie13);
            }
            if (PocetCviku == 2) {
                TVChodCvik.setText(CvikSerie14);
            }
            if (PocetCviku == 1) {
                TVChodCvik.setText(CvikSerie15);
            }
        }

        if (DelkaTreninku.equals("kratky"))
        {
            if (PocetCviku == 5)
            {
                TVChodCvik.setText(CvikSerie1);

            }
            if (PocetCviku == 4)
            {
                TVChodCvik.setText(CvikSerie2);

            }
            if (PocetCviku == 3)
            {
                TVChodCvik.setText(CvikSerie3);

            }
            if (PocetCviku == 2)
            {
                TVChodCvik.setText(CvikSerie4);

            }
            if (PocetCviku == 1)
            {
                TVChodCvik.setText(CvikSerie5);
            }
        }

    }


    public void AnimaceCviku()
    {

        GifImageView GIWAnimCviku = (GifImageView) findViewById(R.id.giwAnimCviku);
        AnimaceCvik = TVChodCvik.getText().toString();


        if (AnimaceCvik.contains("BENCH"))
        {
            GIWAnimCviku.setBackgroundResource(R.drawable.gifbench);
        }

        if (AnimaceCvik.contains("ROZPAŽOVÁNÍ"))
        {
            GIWAnimCviku.setBackgroundResource(R.drawable.gifrozpaz);
        }

        if (AnimaceCvik.contains("TLAKY"))
        {
            GIWAnimCviku.setBackgroundResource(R.drawable.giztlaky);
        }


        if (AnimaceCvik.contains("KICK"))
        {
            GIWAnimCviku.setBackgroundResource(R.drawable.gifkbc);
        }

    }


    public void OnClickButtonListener9999()
    {

        BTNChodJednaDalsi = (Button) findViewById(R.id.btnChodDalsi);
        BTNChodJednaDalsi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.martin.bpostre.ChodTreninku2");

                        intent.putExtra("PocetCviku", PocetCviku);
                        intent.putExtra("DelkaTreninku", DelkaTreninku);

                        startActivity(intent);
                    }
                }
        );

    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("ChodTreninku1 Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}


