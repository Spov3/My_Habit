package com.gmail.myhabit;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

public class ActivityDetailActivity extends AppCompatActivity{

    RecyclerView recyclerView;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detailactivity);

        //Make a reference to the RecyclerView
        recyclerView = findViewById(R.id.recycler_view_detail);

        //Create and set a layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        loadTime();

    }


    public void onButtonClickEdit(View view){
        Intent intent4 = new Intent(this, EditActivity.class);
        startActivity(intent4);
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
                ActivityDetail[] activityDetails = gson.fromJson(response, ActivityDetail[].class);
                //Create and set an adapter
                ActivityDetailAdapter adapter = new ActivityDetailAdapter(activityDetails);
                recyclerView.setAdapter(adapter);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ActivityDetailActivity.this, "An error occurred while retrieving data from the server.", Toast.LENGTH_LONG).show();
                Log.d("piumyhabit", "error data retrieval" + error.getMessage());

            }
        });

        //Add the request to the Queue
        Volley.newRequestQueue(this ).add(request);

    }

}
