package com.example.steamgamesapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DatabaseControl {
    SQLiteDatabase database;
    DatabaseHelper helper;

    public DatabaseControl(Context context){
        helper = new DatabaseHelper(context);
    }

    public void open(){
        database = helper.getWritableDatabase();
    }

    public void close(){
        helper.close();
    }

    public boolean insert(String name){
        ContentValues values = new ContentValues();
        values.put("name", name);
        return database.insert("games", null, values) > 0;
    }

    public void delete(String name){
        database.delete("games", "name=\""+name+"\"", null);
    }

    public String[] getAllNamesArray(){
        String query = "select name from games";
        Cursor cursor = database.rawQuery(query, null);
        cursor.moveToFirst();
        ArrayList<String> list = new ArrayList<String>();
        while(!cursor.isAfterLast()){
            String name = cursor.getString(0);
            list.add(name);
            cursor.moveToNext();
        }
        cursor.close();
        String[] array = new String[list.size()];
        return list.toArray(array);
    }

    public String getPrice(String name){
        String query = "select price from games where name=\""+name+"\"";
        Cursor cursor = database.rawQuery(query, null);
        cursor.moveToFirst();
        String price = cursor.getString(0);
        cursor.close();
        return price;
    }


    public String[] getAllPricesArray(String s){
        String query = "select company from games";
        Cursor cursor = database.rawQuery(query, null);
        cursor.moveToFirst();
        ArrayList<String> list = new ArrayList<String>();
        while(!cursor.isAfterLast()){
            String name = cursor.getString(0);
            list.add(name);
            cursor.moveToNext();
        }
        cursor.close();
        String[] array = new String[list.size()];
        return list.toArray(array);
    }


}
