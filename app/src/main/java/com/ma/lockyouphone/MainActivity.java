package com.ma.lockyouphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView.LayoutManager layoutManager = new RecyclerView.LayoutManager() {
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return null;
            }
        };

    }
}