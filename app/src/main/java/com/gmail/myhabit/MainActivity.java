package com.gmail.myhabit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onButtonClick2(View view){
        Intent intent2 = new Intent(this, Activity2.class);
        startActivity(intent2);
    }

    public void onButtonClick3(View view){
        Intent intent3 = new Intent(this, Activity3.class);
        startActivity(intent3);
    }

}
