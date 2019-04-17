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
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;


public class registrace extends AppCompatActivity {

    private static Button BTNdalsi;
    private static Button BTNUloz;



    boolean VyskaProsla;
    boolean RokProsel;

    EditText ETVyska;
    EditText ETRok;

    int Vyska;
    int Rok;

    String Vyska2;
    String Rok2;

    RadioButton RBMuž;
    RadioButton RBŽena;
    String Pohlavi;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_registrace);




        OnClickButtonListener4();
        OnClickButtonListener3();
        OnClickButtonListener5();
        OnClickButtonListener6();

    }

    public void VyhodnoceniRegistrace()
    {

        if (VyskaProsla == true&&  RokProsel == true)
        {

            Intent intent = new Intent("com.example.martin.bpostre.PrihlaseniPoRegistraci2");
            startActivity(intent);

        }

        else
        {

            Toast.makeText(this, "Zadejte a uložte svoje údaje.", Toast.LENGTH_LONG).show();


        }

    }

    public void KontrolaUlozeni()
    {
        ETVyska = (EditText) findViewById(R.id.editTextVyska);
        ETRok = (EditText) findViewById(R.id.editTextNarozeni);

        Vyska2 = ETVyska.getText().toString();
        Rok2 = ETRok.getText().toString();

        SharedPreferences sp33 = getSharedPreferences("FyzickeUdaje", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor33 = sp33.edit();

        editor33.putString("Pohlavi", Pohlavi);
        editor33.commit();

        editor33.putString("Vyska2", Vyska2);
        editor33.commit();

        editor33.putString("Rok2", Rok2);
        editor33.commit();

        if(Pohlavi != "MUŽ" && Pohlavi != "ŽENA")
        {
            Toast.makeText(this, "Nezvolil jste pohlaví.", Toast.LENGTH_LONG).show();
        }

        if (Vyska2.length() == 0)
        {
            Toast.makeText(this, "Nezadal jste výšku.", Toast.LENGTH_LONG).show();
        }

        else
        {
            Vyska = Integer.parseInt(ETVyska.getText().toString());

            if ((Vyska >= 130) && (Vyska <= 230))
            {

                VyskaProsla = true;

            }
            else
            {

                VyskaProsla = false;

                Toast.makeText(this, "Vaše výška je zadaná špatně. Zadejte výšku v rozmezí od 130cm do 230cm.", Toast.LENGTH_LONG).show();

            }

        }

        if (Rok2.length() == 0)
        {
            Toast.makeText(this, "Nezadal jste rok.", Toast.LENGTH_LONG).show();

        } else
        {
            Rok = Integer.parseInt(ETRok.getText().toString());

            if ((Rok >= 10) && (Rok <= 70))
            {

                RokProsel = true;

            }
            else
            {

                RokProsel = false;
                Toast.makeText(this, "Váš věk je zadán špatně. Zadejte věk v rozmezí od 10 do 70.", Toast.LENGTH_LONG).show();

            }
        }

        if (RokProsel == true && VyskaProsla == true)
        {

            Toast.makeText(this, "Vaše údaje jsou uloženy.", Toast.LENGTH_LONG).show();
        }
    }


    public void OnClickButtonListener3()
    {

        BTNdalsi = (Button) findViewById(R.id.btnDALSI);

            BTNdalsi.setOnClickListener
                    (
                    new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View v)
                        {
                            VyhodnoceniRegistrace();
                        }
                    }
            );
        }


    public void OnClickButtonListener4()
    {

        BTNUloz = (Button) findViewById(R.id.btnUloz);
        BTNUloz.setOnClickListener
                (
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        KontrolaUlozeni();
                    }
                }
        );
    }

    public void OnClickButtonListener5()
    {

        RBMuž = (RadioButton) findViewById(R.id.rbMuž);
        RBMuž.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                              Pohlavi = "MUŽ";
                            }
                        }
                );
    }

    public void OnClickButtonListener6()
    {

       RBŽena = (RadioButton) findViewById(R.id.rbŽena);
        RBŽena.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                               Pohlavi = "ŽENA";
                            }
                        }
                );
    }


}











