package com.example.martin.bpostre;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.Calendar;


public class Vaha extends AppCompatActivity
{

    EditText ETVaha;
    EditText ETId;

    int Vaaha;
    String Vaaaha;

    Button BTNAdd;
    Button BTNViewAll;
    Button btnDelete;

    Button BTNVahaZpet;

    Calendar c;

    Integer DatumTreninku1;
    Integer DatumTreninku2;
    Integer DatumTreninku3;

    DatabaseHelper2 myDb;
    SQLiteDatabase sqLiteDatabaze;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaha);

        ETVaha = (EditText) findViewById(R.id.editText_VAHA);
        ETId = (EditText) findViewById(R.id.editText_id);

        BTNAdd = (Button) findViewById(R.id.btnUlozVahu);
        BTNViewAll = (Button) findViewById(R.id.btnHistorie);
        btnDelete = (Button) findViewById(R.id.btnSmazat);
        BTNVahaZpet = (Button) findViewById(R.id.btnVahaZpet);

        c = Calendar.getInstance();

        DatumTreninku1 = c.get(Calendar.DATE);
        DatumTreninku2 = c.get(Calendar.MONTH);
        DatumTreninku3 = c.get(Calendar.YEAR);

        myDb = new DatabaseHelper2(this);
        sqLiteDatabaze = myDb.getWritableDatabase();

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(getData());
        graph.addSeries(series);

        AddData();
        ViewAll();
        DeleteData();
        ZpetProfil();
    }



    private DataPoint[] getData()
    {
        String[] columns={"ID", "VAHA"};
        Cursor cursor = sqLiteDatabaze.query("Vazeni_table", columns, null, null, null, null, null);

        DataPoint[] dp=new DataPoint[cursor.getCount()];

        for(int i=0;i<cursor.getCount();i++)
        {
            cursor.moveToNext();
            dp[i]=new DataPoint(cursor.getInt(0),cursor.getInt(1));
        }
        return dp;
    }

    public void ZpetProfil()
    {
        BTNVahaZpet.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("com.example.martin.bpostre.Profil");
                        startActivity(intent);
                    }
                }
        );
    }

    public void DeleteData()
    {
        btnDelete.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Integer deletedRows = myDb.deletedata(ETId.getText().toString());

                        if(deletedRows > 0)
                        {
                            Toast.makeText(Vaha.this, "Vaše vážení bylo smazáno.", Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(Vaha.this, "Vaše vážení nebylo smazáno.", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }

    public void ViewAll()
    {
        BTNViewAll.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Cursor res = myDb.getAllData();

                        if(res.getCount() == 0)
                        {
                            ShowMessage("Error", "Data nenalezena");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext())
                        {
                            buffer.append("Id :"+ res.getString(0)+"\n");
                            buffer.append("Datum :"+ res.getString(1)+"\n");
                            buffer.append("Vaha :"+ res.getString(2)+"\n\n");
                        }

                        ShowMessage("Data", buffer.toString());
                    }
                }
        );
    }

    public void ShowMessage(String title, String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    public void AddData()
    {
        BTNAdd.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Vaaaha = ETVaha.getText().toString();

                        if (Vaaaha.length() == 0)
                        {
                            Toast.makeText(Vaha.this, "Nezadali jste váhu k uložení.", Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            Vaaha = Integer.parseInt(ETVaha.getText().toString());


                            if (Vaaha >= 50 && Vaaha <= 150)
                            {
                                boolean isInserted = myDb.insertData(DatumTreninku1.toString() + ". " + DatumTreninku2.toString() + ". " + DatumTreninku3.toString() + ". ", ETVaha.getText().toString() + "Kg");

                                if (isInserted == true)
                                {
                                    Toast.makeText(Vaha.this, "Vaše aktuální váha byla uložena.", Toast.LENGTH_LONG).show();

                                    GraphView graph = (GraphView) findViewById(R.id.graph);
                                    LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(getData());
                                    graph.addSeries(series);
                                }

                                else
                                {
                                    Toast.makeText(Vaha.this, "Vaše aktuální váha nebyla uložena.", Toast.LENGTH_LONG).show();
                                }
                            }

                            else
                            {
                                Toast.makeText(Vaha.this, "Vaše aktuální váha nebyla uložena. Zadejte váhu v rozmezí 50kg až 150kg", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                }
        );
    }
}




