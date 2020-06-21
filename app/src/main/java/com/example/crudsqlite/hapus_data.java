package com.example.crudsqlite;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class hapus_data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hapus_data);
    }

    public void deleteButtonPressed(View view) {
        EditText editText = findViewById(R.id.deleteEditText);
        String text = editText.getText().toString();
        int deleted = DatabaseHandler.deleteUsingName(text);
        Toast.makeText(this, deleted +" Data Berhasil Di Hapus", Toast.LENGTH_SHORT).show();
        editText.setText("");
    }
}
