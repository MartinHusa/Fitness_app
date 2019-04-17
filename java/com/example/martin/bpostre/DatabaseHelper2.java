package com.example.martin.bpostre;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by marti on 28.02.2017.
 */

public class DatabaseHelper2 extends SQLiteOpenHelper
{

    public DatabaseHelper2(Context context)
    {
        super(context, "Vazeni.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String createtable="create table Vazeni_table (ID INTEGER PRIMARY KEY AUTOINCREMENT, DATUM INTEGER, VAHA INTEGER);";
        db.execSQL(createtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
    }

    public boolean insertData(String datum, String vaha)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("DATUM",datum);
        contentValues.put("VAHA",vaha);

        long result = db.insert("Vazeni_table",null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }


    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + "Vazeni_table", null);
        return res;
    }

    public Integer deletedata(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("Vazeni_table", "ID = ?", new String[] {id});
    }
}