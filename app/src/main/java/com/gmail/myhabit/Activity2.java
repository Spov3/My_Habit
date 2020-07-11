package com.gmail.myhabit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);
    }

    public void onButtonClickLog (View view){
        Intent intent1 = new Intent(this, TimesActivity.class);
        startActivity(intent1);
    }
}
