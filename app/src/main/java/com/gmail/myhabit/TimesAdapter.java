package com.gmail.myhabit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TimesAdapter extends RecyclerView.Adapter<TimeViewHolder> {

    //Dataset
    private Time[] times;

    public TimesAdapter(Time[] times) {
        this.times = times;
    }

    @NonNull
    @Override
    public TimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Load a layout file
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.viewholder_time, parent, false);

        return new TimeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeViewHolder holder, int position) {
        Time time = times [position];
        holder.bind(time);

    }

    @Override
    public int getItemCount() { return times.length; }
}
