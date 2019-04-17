package com.example.martin.bpostre;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by marti on 06.03.2017.
 */

public class DatabaseHelper3 extends SQLiteOpenHelper
{
    public static final String DATABASE_JMENO = "Treninky.db";
    public static final String TABLE_JMENO = "Treninky_table";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "DATUM";
    public static final String COL_3 = "XP";


    public DatabaseHelper3(Context context) {
        super(context, DATABASE_JMENO, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table " + TABLE_JMENO + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, DATUM INTEGER, XP INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_JMENO);
        onCreate(db);
    }

    public boolean insertData(String datum, String xp)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, datum);
        contentValues.put(COL_3, xp);

        long result = db.insert(TABLE_JMENO, null, contentValues);

        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor res = db.rawQuery("select * from " + TABLE_JMENO, null);
        return res;
    }

    public int Sum()
    {
        int total = 0;

        SQLiteDatabase dbb = this.getWritableDatabase();

        Cursor c = dbb.rawQuery("SELECT SUM(" + (COL_3) + ") FROM " + TABLE_JMENO, null);

        if (c.moveToFirst())
        {
            total = c.getInt(0);
        }
        return total;
    }
}
