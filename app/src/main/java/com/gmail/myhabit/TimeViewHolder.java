package com.gmail.myhabit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TimeViewHolder extends RecyclerView.ViewHolder {

    private TextView txtCategory;
    private TextView txtDuration;

    public TimeViewHolder(@NonNull View itemView) {
        super(itemView);

        txtCategory = itemView.findViewById(R.id.txt_category);
        txtDuration = itemView.findViewById(R.id.txt_duration);
    }

    public void bind(Time time) {
        txtCategory.setText(time.getCategory());
        txtDuration.setText(time.getDuration());
    }
}
