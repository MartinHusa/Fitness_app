package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class prihlaseni extends AppCompatActivity {

     EditText ETJmeno, ETHeslo;
     boolean JmenoProslo, HesloProslo;
     String Jmeno, Heslo;

    String JmenoSP, HesloSP;

    public static Button BTNPrihlaseni;



     @Override
     protected void onCreate(Bundle savedInstanceState)
     {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prihlaseni);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

         OnClickButtonListener5();

     }


     public void VyhodnotPrihlaseni()
     {

         ETJmeno = (EditText) findViewById(R.id.ETJmeno);
         Jmeno = ETJmeno.getText().toString();

         ETHeslo = (EditText) findViewById(R.id.ETheslo);
         Heslo = ETHeslo.getText().toString();

         SharedPreferences sp5 = getSharedPreferences("Registrace", Context.MODE_PRIVATE);

         JmenoSP = sp5.getString("Jmeno2", "");
         HesloSP = sp5.getString("Heslo2", "");

         if (Jmeno.equals(JmenoSP) && Heslo.equals(HesloSP))
         {
             Intent intent = new Intent("com.example.martin.bpostre.Zed");

             startActivity(intent);
         }

         else {
             Toast.makeText(this, "Vaše přihlašovací údaje nejsou správné.",Toast.LENGTH_LONG).show();

         }



     }



    public void OnClickButtonListener5()
    {

        BTNPrihlaseni = (Button) findViewById(R.id.BTNprihlaseni);

        BTNPrihlaseni.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        VyhodnotPrihlaseni();
                    }
                }
        );

    }
  }



