package com.gmail.myhabit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityDetailAdapter extends RecyclerView.Adapter<ActivityDetailViewHolder> {

    //Dataset
    private ActivityDetail[] activityDetails;

    public ActivityDetailAdapter(ActivityDetail[] activityDetails) {
        this.activityDetails = activityDetails;
    }

    @NonNull
    @Override
    public ActivityDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Load a layout file
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.viewholder_timedetail, parent, false);

        return new ActivityDetailViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityDetailViewHolder holder, int position) {
        ActivityDetail activityDetail = activityDetails [position];
        holder.bind(activityDetail);

    }

    @Override
    public int getItemCount() { return activityDetails.length; }
}
