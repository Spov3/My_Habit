package com.gmail.myhabit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditActivity extends AppCompatActivity {

    EditText category, duration, date, description;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_edit);

        category = findViewById(R.id.editText5);
        duration = findViewById(R.id.editText6);
        date = findViewById(R.id.editText7);
        description = findViewById(R.id.editText8);

        Intent intent = getIntent();
        category.setText(intent.getStringExtra("activity category"));
        duration.setText(intent.getStringExtra("duration"));
        date.setText(intent.getStringExtra("date"));
        description.setText(intent.getStringExtra("description"));
    }



    public void onButtonClickConfirm (View view){
        Intent intent1 = new Intent(this, MainActivity.class);

        this.finish();
    }
}