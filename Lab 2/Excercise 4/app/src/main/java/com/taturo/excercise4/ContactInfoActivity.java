package com.taturo.excercise4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContactInfoActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView emailTextView;
    private TextView projectTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactinfo);

        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        projectTextView = findViewById(R.id.projectTextView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String project = intent.getStringExtra("project");

        nameTextView.setText("Name: " + name);
        emailTextView.setText("Email: " + email);
        projectTextView.setText("Project: " + project);

        Button finishButton = findViewById(R.id.finishButton);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
}
}
