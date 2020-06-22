package com.gmail.myhabit;

import android.os.Bundle;
import android.util.Log;
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

public class TimesActivity extends AppCompatActivity{

    RecyclerView recyclerView;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_times);

        //Make a reference to the RecyclerView
        recyclerView = findViewById(R.id.recycler_view);

        //Create and set a layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        loadTime();

    }

    private void loadTime(){
        //load time log from the server
        String url = "http://10.0.2.2:8888/time.php";

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
                Toast.makeText(TimesActivity.this, "An error occurred while retrieving data from the server.", Toast.LENGTH_LONG).show();
                Log.d("piumyhabit", "error data retrieval" + error.getMessage());

            }
        });

        //Add the request to the Queue
        Volley.newRequestQueue(this ).add(request);

    }

}
