package com.example.hm3m33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
    textView = itemView.findViewById(R.id.item_number);
    }

    public void bind(Integer number) {
     textView.setText(number);
    }
}
