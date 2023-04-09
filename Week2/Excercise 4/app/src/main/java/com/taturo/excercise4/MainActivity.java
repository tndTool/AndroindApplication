package com.taturo.excercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText projectEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        projectEditText = findViewById(R.id.projectEditText);

        Button viewContactButton = findViewById(R.id.viewContactButton);
        viewContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String project = projectEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, ContactInfoActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("project", project);
                startActivity(intent);
            }
        });
    }
}