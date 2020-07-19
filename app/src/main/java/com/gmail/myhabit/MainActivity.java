package com.gmail.myhabit;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    TextView category, duration, date, description;



    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Make a reference to the RecyclerView
        recyclerView = findViewById(R.id.recycler_view);

        //Create and set a layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        loadTime();

    }

    public void onButtonClick2(View view){
        Intent intent2 = new Intent(this, TrackActivity.class);
        startActivity(intent2);
    }


    public void onClickDetail(View view){
        Intent intent5 = new Intent(this, ActivityDetailActivity.class);
        category = view.findViewById(R.id.txt_category);
        duration = view.findViewById(R.id.txt_duration);
        date = view.findViewById(R.id.txt_date);
        description = view.findViewById(R.id.txt_description);

        intent5.putExtra("activity category", category.getText().toString());
        intent5.putExtra("duration", duration.getText().toString());
        intent5.putExtra("date", date.getText().toString());
        intent5.putExtra("description", description.getText().toString());

        startActivity(intent5);

    }


    private void loadTime(){

        //load time log from the server
        String url = "https://my.api.mockaroo.com/time.json?key=7920b420";

        //create a request
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //convert json string to array of Time using Gson
                Gson gson = new Gson();
                Time[] times = gson.fromJson(response, Time[].class);
                //Create and set an adapter
                TimesAdapter adapter = new TimesAdapter(times);
                recyclerView.setAdapter(adapter);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "An error occurred while retrieving data from the server.", Toast.LENGTH_LONG).show();
                Log.d("piumyhabit", "error data retrieval" + error.getMessage());

            }
        });

        //Add the request to the Queue
        Volley.newRequestQueue(this ).add(request);

    }

}
