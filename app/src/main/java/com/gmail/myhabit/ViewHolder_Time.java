package com.gmail.myhabit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder_Time extends RecyclerView.ViewHolder {

    private TextView textCategory;
    private TextView textDuration;


    public ViewHolder_Time(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(Time time) {
        textCategory.setText(time.getCategory());
        textDuration.setText(time.getDuration());

    }
}
