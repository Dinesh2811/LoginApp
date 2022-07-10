package com.example.loginapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "employeeManager";
    public static final String TABLE_NAME = "table_1";
    public static final String COL_1 = "id";
    public static final String COL_2 = "name";
    public static final String COL_3 = "contact";
    public static final String COL_4 = "email";
    public static final String COL_5 = "otp";
    public static final String COL_6 = "password";

    SQLiteDatabase db;

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + TABLE_NAME + " (" + COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_2 + ", " + COL_3 + ", " + COL_4 + ", " + COL_5 + ", " + COL_6 + ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public long addEmployee(String name, String contact, String email, String otp, String password) {
        db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COL_2, name);
        values.put(COL_3, contact);
        values.put(COL_4, email);
        values.put(COL_5, otp);
        values.put(COL_6, password);

        return db.insert(TABLE_NAME, null, values);
    }

    public String getEmployee() {
        db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[] {COL_1, COL_2, COL_3, COL_4, COL_5, COL_6},
                null, null, null, null, null);

        int eId = cursor.getColumnIndex(COL_1);
        int eName = cursor.getColumnIndex(COL_2);
        int eContact = cursor.getColumnIndex(COL_3);
        int eEmail = cursor.getColumnIndex(COL_4);
        int eOtp = cursor.getColumnIndex(COL_5);
        int ePassword = cursor.getColumnIndex(COL_6);

        String res = "";

        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){
            res = res +
                    "Id: "+cursor.getString(eId)+"\n"+
                    "Name: "+cursor.getString(eName)+"\n"+
                    "Contact: "+cursor.getString(eContact)+"\n"+
                    "Email: "+cursor.getString(eEmail)+"\n"+
                    "Otp: "+cursor.getString(eOtp)+"\n"+
                    "Password: "+cursor.getString(ePassword)+"\n\n";
        }

        db.close();
        return res;
    }

    public Cursor getData() {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from " + TABLE_NAME,null);
        return cursor;
    }

}
