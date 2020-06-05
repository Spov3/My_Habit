package com.gmail.myhabit;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Activity_Time extends AppCompatActivity{

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_time);

        //Make a reference to the RecylcerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //Create and set a layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Create and set an adapter
        Adapter_Time adapter = new Adapter_Time(times);
        recyclerView.setAdapter(adapter);

    }

    private Time[] loadTime(){
        // Temporary Data
        Time time1 = new Time();
        time1.setCategory("Work");
        time1.setDuration("40 min");

        Time time2 = new Time();
        time2.setCategory("Study");
        time2.setDuration("50 min");

    }

}
