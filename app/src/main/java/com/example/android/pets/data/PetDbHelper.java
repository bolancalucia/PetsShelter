package com.example.android.pets.data;

import com.example.android.pets.data.PetContract.PetEntry;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PetDbHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "Shelter.db";
    public static final int DATABASE_VERSION = 1;

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // db.execSQL(SQL_DELETE_ENTRIES);
        //  onCreate(db);
    }

    public static final String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME + "("
            + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL,"
            + PetEntry.COLUMN_PET_BREED + " TEXT,"
            + PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL,"
            + PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";
}
