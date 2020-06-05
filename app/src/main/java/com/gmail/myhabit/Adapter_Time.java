package com.gmail.myhabit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter_Time extends RecyclerView.Adapter<ViewHolder_Time> {

    //Dataset
    private Time[] times;

    public Adapter_Time(Time[] time) {
        this.times = time;
    }

    @NonNull
    @Override
    public ViewHolder_Time onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Load a layout file
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.viewholder_time, parent, attachToRoot: false);

        ViewHolder_Time viewHolder = new ViewHolder_Time(itemView);
        return new ViewHolder_Time(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_Time holder, int position) {
        Time time = time[position];
        holder.bind(time);

    }

    @Override
    public int getItemCount() {
        return times.length;
    }
}
