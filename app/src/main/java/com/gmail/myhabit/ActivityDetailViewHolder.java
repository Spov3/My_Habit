package com.gmail.myhabit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityDetailViewHolder extends RecyclerView.ViewHolder {

    private TextView txtCategory;
    private TextView txtDuration;
    private TextView txtDescription;

    public ActivityDetailViewHolder(@NonNull View itemView) {
        super(itemView);

        txtCategory = itemView.findViewById(R.id.txt_category);
        txtDuration = itemView.findViewById(R.id.txt_duration);
        txtDescription = itemView.findViewById(R.id.txt_description);

    }

    public void bind(ActivityDetail activityDetail) {
        txtCategory.setText(activityDetail.getCategory());
        txtDuration.setText(activityDetail.getDuration());
        txtDuration.setText(activityDetail.getDescription());
    }
}
