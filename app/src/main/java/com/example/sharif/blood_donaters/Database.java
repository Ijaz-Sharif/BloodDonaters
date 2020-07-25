package com.example.sharif.blood_donaters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHARIF on 8/14/2018.
 */

 public class Database extends SQLiteOpenHelper{
    public static final   String DBName="DonaterDB";
    public static final   int DBVersion=1;
    public static final   String TableName="Donater";
    public static final   String D_Name="Name";
    public static final   String  D_CNIC="CNIC";
    public static final   String D_NUM="NUMBER";
    public static final   String Group="B_Group";
    public Database(Context context) {
        super(context, DBName, null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TableName + "(" + D_Name + " TEXT," + D_CNIC + " TEXT,"
                + D_NUM + " TEXT," + Group + " TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TableName );
        onCreate(db);
    }
    public void AddData(Donete donete){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(D_Name,donete.getName());
        cv.put(D_NUM,donete.getPhone());
        cv.put(D_CNIC,donete.getCnic());
        cv.put(Group,donete.getB_group());
        db.insert(TableName,null,cv);
        db.close();
    }
    public ArrayList<Donete> getData(){
        List<Donete> dataList=new ArrayList<Donete>();
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor = db.query(TableName, null, null, null, null, null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String a=cursor.getString(0);
            String b=cursor.getString(1);
            String c=cursor.getString(2);
            String d=cursor.getString(3);
            Donete ca=new Donete(a,b,c,d);
            dataList.add(ca);
            cursor.moveToNext();
        }
        return (ArrayList<Donete>) dataList;
    }
    public int Delete(String a){
        SQLiteDatabase db=this.getReadableDatabase();
       int b= db.delete(TableName,"NUMBER=?",new String[] {a});
       return b;
    }

}
