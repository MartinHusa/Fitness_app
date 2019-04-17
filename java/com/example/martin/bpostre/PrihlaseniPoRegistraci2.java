package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PrihlaseniPoRegistraci2 extends AppCompatActivity {

    EditText ETJmeno2, ETHeslo2;
    boolean JmenoProslo2, HesloProslo2;
    String Jmeno2, Heslo2;

    public static Button BTNUloz2;
    public static Button BTNPrihlas2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prihlaseni_po_registraci2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        OnClickButtonListener10();
        OnClickButtonListener11();
    }

    public void UlozPrihlaseni2() {

        ETJmeno2 = (EditText) findViewById(R.id.ETJmeno2);
        ETHeslo2 = (EditText) findViewById(R.id.ETheslo2);

        Jmeno2 = ETJmeno2.getText().toString().toLowerCase();
        Heslo2 = ETHeslo2.getText().toString().toLowerCase();

        SharedPreferences sp3 = getSharedPreferences("Registrace", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor3 = sp3.edit();

        editor3.putString("Jmeno2", Jmeno2);
        editor3.commit();

        editor3.putString("Heslo2", Heslo2);
        editor3.commit();


        if ((Jmeno2.length() >= 3) && (Jmeno2.length() <= 12))
        {

            JmenoProslo2 = true;
        }
        else
        {

            JmenoProslo2 = false;
            Toast.makeText(this, "Vaše jméno je zadáno špatně. Zadejte jméno o délce 3 až 12 písmen.",Toast.LENGTH_LONG).show();
        }

        if (( Heslo2 .length() >= 3) && (Heslo2 .length() <= 15))
        {

            HesloProslo2 = true;
        }
        else
        {

            HesloProslo2 = false;
            Toast.makeText(this, "Vaše heslo je zadáno špatně. Zadejte heslo o délce 3 až 15 písmen.",Toast.LENGTH_LONG).show();
        }

        if  (JmenoProslo2 == true && HesloProslo2 == true)
        {

            Toast.makeText(this, "Vaše údaje jsou uloženy.",Toast.LENGTH_LONG).show();
        }
    }


    public void VyhodnoceniRegistrace2()
    {



        if  (JmenoProslo2 == true && HesloProslo2 == true)
        {


            Intent intent = new Intent("com.example.martin.bpostre.Zed");

            startActivity(intent);

        }

        else
        {

            Toast.makeText(this, "Zadejte a uložte svoje údaje.", Toast.LENGTH_LONG).show();


        }

    }



    public void OnClickButtonListener10()
    {

        BTNUloz2 = (Button) findViewById(R.id.BTNUloz10);

        BTNUloz2 .setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        UlozPrihlaseni2();
                    }
                }
        );

    }

    public void OnClickButtonListener11()
    {

        BTNPrihlas2 = (Button) findViewById(R.id.BTNprihlaseni2);

        BTNPrihlas2 .setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        VyhodnoceniRegistrace2();
                    }
                }
        );

    }
}
