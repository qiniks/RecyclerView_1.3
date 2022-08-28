package com.example.recyclerview13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers = new ArrayList<>();
        loadData();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new NumberAdaptor(numbers));
    }

    private void loadData() {
        numbers.add("2");
        numbers.add("67");
        numbers.add("1");
        numbers.add("43");
        numbers.add("1");
        numbers.add("75");
        numbers.add("34");
        numbers.add("124");
        numbers.add("12");
        numbers.add("31");
        numbers.add("52");
        numbers.add("7");
        numbers.add("83");
    }
}