package com.example.crudsqlite;

import androidx.appcompat.app.AppCompatActivity;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Scanner;
import android.os.Bundle;

public class tambah_siswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_siswa);
    }
    public void addButtonPressed(View view) {
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText mobileEditText = findViewById(R.id.mobileEditText);

        String name = nameEditText.getText().toString();
        String mobile = mobileEditText.getText().toString();

        addToDatabase(name, mobile);

        nameEditText.setText("");
        mobileEditText.setText("");
    }


    private void addToDatabase(String name, String mobile) {
        DatabaseHandler.addToDatabase(name, mobile);
        Toast.makeText(this, "Data Berhasil di Tambah ",Toast.LENGTH_SHORT).show();
    }
}
