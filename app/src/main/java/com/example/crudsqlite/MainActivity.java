package com.example.crudsqlite;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler.loadDatabase(this);
    }

    public void buttonPressed(View view) {
        String tag = view.getTag().toString().toLowerCase();
        switch (tag) {
            case "viewbutton": {
                Intent intent = new Intent(MainActivity.this, lihat_data.class);
                startActivity(intent);
                break;
            }
            case "addbutton": {
                Intent intent = new Intent(MainActivity.this, tambah_siswa.class);
                startActivity(intent);
                break;
            }
            case "deletebutton": {
                Intent intent = new Intent(MainActivity.this, hapus_data.class);
                startActivity(intent);
                break;
            }
            case "updatebutton": {
                Intent intent = new Intent(MainActivity.this, update_data.class);
                startActivity(intent);
                break;
            }
        }
    }
}
