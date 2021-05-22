package com.example.foodzilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class fav_food extends AppCompatActivity {

    private RecyclerView fav_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_food);
        fav_food = findViewById(R.id.fav_card_view);
    }
}