package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;


public class hlavni extends AppCompatActivity
{

      private static Button BTNreg;
      private static Button BTNlog;

      @Override
      protected void onCreate(Bundle savedInstanceState)
      {
          super.onCreate(savedInstanceState);

          requestWindowFeature(Window.FEATURE_NO_TITLE);
          setContentView(R.layout.activity_hlavni);


          AnimationDrawable animace = new AnimationDrawable();
          FrameLayout Napis = (FrameLayout) findViewById(R.id.UvodniAnimace);

          animace.addFrame(getResources().getDrawable(R.drawable.uvodnianim), 3000);
          animace.addFrame(getResources().getDrawable(R.drawable.cinka2), 3000);
          animace.addFrame(getResources().getDrawable(R.drawable.calli2), 3000);


          Napis.setBackground(animace);

          animace.start();


          OnClickButtonListener();
          OnClickButtonListener2();
      }


        public void OnClickButtonListener()
        {
            BTNreg = (Button) findViewById(R.id.btnREG);
            BTNreg.setOnClickListener(
                    new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View v)
                        {
                            Intent intent = new Intent("com.example.martin.bpostre.registrace");

                            startActivity(intent);
                        }
                    }
            );

        }

      public void OnClickButtonListener2()
      {

          BTNlog = (Button) findViewById(R.id.btnLOG);
          BTNlog.setOnClickListener(
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






  }
