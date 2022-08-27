package com.example.hm3m33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<Integer> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    recyclerView = findViewById(R.id.recycle_view);
        numbers.add(42452553);
        numbers.add(35205053);
        numbers.add(525991);
        numbers.add(5789555);
        numbers.add(14557899);
        numbers.add(97096444);
        numbers.add(262626262);
        numbers.add(62652788);
        numbers.add(41445551);
        numbers.add(424666312);
        numbers.add(421453153);
        numbers.add(42452553);

    }
}