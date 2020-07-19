package com.gmail.myhabit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityDetailActivity extends AppCompatActivity{

//    RecyclerView recyclerView;

    TextView category, duration, date, description;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_activitydetail);

        category = findViewById(R.id.txt_category_detail);
        duration = findViewById(R.id.txt_duration_detail);
        date = findViewById(R.id.txt_date_detail);
        description = findViewById(R.id.txt_description_detail);

        Intent intent = getIntent();
        category.setText(intent.getStringExtra("activity category"));
        duration.setText(intent.getStringExtra("duration"));
        date.setText(intent.getStringExtra("date"));
        description.setText(intent.getStringExtra("description"));






//        //Make a reference to the RecyclerView
//        recyclerView = findViewById(R.id.recycler_view);
//
//        //Create and set a layout manager
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

//        loadTime();

    }


    public void onButtonClickEdit(View view){
        Intent intent4 = new Intent(this, EditActivity.class);

//        category = view.findViewById(R.id.txt_category);
//        duration = view.findViewById(R.id.txt_duration);
//        date = view.findViewById(R.id.txt_date);
//        description = view.findViewById(R.id.txt_description);

        intent4.putExtra("activity category", category.getText().toString());
        intent4.putExtra("duration", duration.getText().toString());
        intent4.putExtra("date", date.getText().toString());
        intent4.putExtra("description", description.getText().toString());

        startActivity(intent4);

    }





//    private void loadTime(){
//        //load time log from the server
//        String url = "https://my.api.mockaroo.com/time.json?key=7920b420";
//
//        //create a request
//        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                //convert json string to array of Time using Gson
//                Gson gson = new Gson();
//                Time[] activityDetails = gson.fromJson(response, Time[].class);
//                //Create and set an adapter
//                TimesAdapter adapter = new TimesAdapter(activityDetails);
//                recyclerView.setAdapter(adapter);
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(ActivityDetailActivity.this, "An error occurred while retrieving data from the server.", Toast.LENGTH_LONG).show();
//                Log.d("piumyhabit", "error data retrieval" + error.getMessage());
//
//            }
//        });
//
//        //Add the request to the Queue
//        Volley.newRequestQueue(this ).add(request);
//
//    }

}
