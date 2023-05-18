package com.taturo.excercise3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    private ArrayList<String> historyList;
    private ArrayAdapter<String> adapter;
    private ListView listView;
    private Button buttonClearHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);

        historyList = getIntent().getStringArrayListExtra("historyList");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, historyList);
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        buttonClearHistory = findViewById(R.id.button_clear_history);
        buttonClearHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                historyList.clear();
                adapter.notifyDataSetChanged();
            }
        });
    }
}
