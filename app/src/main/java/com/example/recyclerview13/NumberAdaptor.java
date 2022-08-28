package com.example.recyclerview13;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumberAdaptor extends RecyclerView.Adapter<NumberViewHolder> {

    private final ArrayList<String> numbers;

    public NumberAdaptor(ArrayList<String> numbers) {
        this.numbers = numbers;
    }


    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumberViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_numbers, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(numbers.get(position));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }
}
