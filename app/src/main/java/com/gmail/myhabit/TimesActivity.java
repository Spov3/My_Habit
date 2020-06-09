package com.gmail.myhabit;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TimesActivity extends AppCompatActivity{

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_times);

        //Make a reference to the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //Create and set a layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Create and set an adapter
        Time[] times = loadTime();
        TimesAdapter adapter = new TimesAdapter(times);
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

        Time time3 = new Time();
        time3.setCategory("Personal");
        time3.setDuration("120 min");

        return new Time[]{time1, time2, time3};
    }

}
