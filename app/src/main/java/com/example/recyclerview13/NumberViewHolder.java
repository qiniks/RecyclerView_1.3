package com.example.recyclerview13;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberViewHolder extends RecyclerView.ViewHolder {

    TextView tvNumber;

    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNumber = itemView.findViewById(R.id.tv_number);
    }

    public void bind(String number) {
        tvNumber.setText(number);
    }
}
