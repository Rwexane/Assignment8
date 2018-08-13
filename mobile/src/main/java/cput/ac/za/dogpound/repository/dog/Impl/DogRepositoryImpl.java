package cput.ac.za.dogpound.repository.dog.Impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import cput.ac.za.dogpound.conf.DBConstants;
import cput.ac.za.dogpound.domain.Dog;
import cput.ac.za.dogpound.repository.dog.DogRepository;

public class DogRepositoryImpl extends SQLiteOpenHelper
implements DogRepository {

    public static final String TABLE_NAME = "Dog";
    private SQLiteDatabase db;

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_ANIMALID = "dogId";
    public static final String COLUMN_BREED = "breed";
    public static final String COLUMN_WEIGHT = "weight";

    // Database creation sql statement
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_ANIMALID + " TEXT UNIQUE NOT NULL , "
            + COLUMN_BREED + " TEXT NOT NULL , "
            + COLUMN_WEIGHT  + " TEXT NOT NULL);";






    public DogRepositoryImpl(Context context) {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }

    public void open() throws SQLException {
        db = this.getWritableDatabase();
    }

    public void close() {
        this.close();
    }

    @Override
    public Dog findById(Long id) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                TABLE_NAME,
                new String[]{
                        COLUMN_ANIMALID,
                        COLUMN_BREED,
                        COLUMN_WEIGHT},
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(id)},
                null,
                null,
                null,
                null);
        if (cursor.moveToFirst()) {
            final Dog dog = new Dog.Builder()
                    .dogId((Long.parseLong(cursor.getString(cursor.getColumnIndex(COLUMN_ANIMALID)))))
                    .weight(Double.parseDouble(cursor.getString(cursor.getColumnIndex(COLUMN_WEIGHT))))
                    .breed(cursor.getString(cursor.getColumnIndex(COLUMN_BREED)))
                    .build();

            return dog;
        } else {
            return null;
        }
    }

    @Override
    public Dog save(Dog entity) {
        try {
            open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ContentValues values = new ContentValues();
        values.put( COLUMN_ANIMALID, entity.getDogId());
        values.put( COLUMN_BREED, entity.getbreed());
        values.put(COLUMN_WEIGHT, entity.getWeight());
        long id = db.insertOrThrow(TABLE_NAME, null, values);
        Dog insertedEntity = new Dog.Builder()
                .copy(entity)
                .dogId(new Long(id))
                .build();
        return insertedEntity;
    }

    @Override
    public Dog update(Dog entity) {

        try {
            open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ContentValues values = new ContentValues();
        values.put( COLUMN_ANIMALID, entity.getDogId());
        values.put( COLUMN_BREED, entity.getbreed());
        values.put(COLUMN_WEIGHT, entity.getWeight());
        db.update(
                TABLE_NAME,
                values,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(entity.getDogId())}
        );
        return entity;
    }

    @Override
    public Dog delete(Dog entity) {
        try {
            open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.delete(
                TABLE_NAME,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(entity.getDogId())});
        return entity;
    }

    @Override
    public Set<Dog> findAll() {
        SQLiteDatabase db = this.getReadableDatabase();
        Set<Dog> dogs = new HashSet<>();

        try {
            open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Cursor cursor = db.query(TABLE_NAME, null,null,null,null,null,null);
        if (cursor.moveToFirst()) {
            do {
                final Dog dog2 = new Dog.Builder()
                        .dogId((Long.parseLong(cursor.getString(cursor.getColumnIndex(COLUMN_ANIMALID)))))
                        .weight(Double.parseDouble(cursor.getString(cursor.getColumnIndex(COLUMN_WEIGHT))))
                        .breed(cursor.getString(cursor.getColumnIndex(COLUMN_BREED)))
                        .build();
                dogs.add(dog2);
            } while (cursor.moveToNext());
        }
        return dogs;
    }

    @Override
    public int deleteAll() {

        try {
            open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int rowsDeleted = db.delete(TABLE_NAME,null,null);
        close();
        return rowsDeleted;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(this.getClass().getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}


