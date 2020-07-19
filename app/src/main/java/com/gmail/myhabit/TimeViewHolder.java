package com.gmail.myhabit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TimeViewHolder extends RecyclerView.ViewHolder {

    private TextView txtCategory;
    private TextView txtDuration;
    private TextView txtDate;
    private TextView txtDes;

    public TimeViewHolder(@NonNull View itemView) {
        super(itemView);

        txtCategory = itemView.findViewById(R.id.txt_category);
        txtDuration = itemView.findViewById(R.id.txt_duration);
        txtDate = itemView.findViewById(R.id.txt_date);
        txtDes = itemView.findViewById(R.id.txt_description);
    }

    public void bind(Time time) {
        txtCategory.setText(time.getCategory());
        txtDuration.setText(time.getDuration());
        txtDate.setText(time.getDate());
        txtDes.setText(time.getDescription());
    }
}
