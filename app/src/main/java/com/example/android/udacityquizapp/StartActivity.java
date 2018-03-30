package com.example.android.udacityquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private EditText EditName;
    private String playerName;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setup();

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerName = getName();
                if (playerName.equals("")) {
                    Toast.makeText(StartActivity.this, "Enter your name please", Toast.LENGTH_LONG).show();
                }

                else {
                    Intent intent = new Intent(StartActivity.this, MainActivity.class);
                    intent.putExtra("name", playerName);
                    startActivity(intent);
                }
            }
        });

    }

    private void setup() {
        EditName = findViewById(R.id.et_Name);
        startButton = findViewById(R.id.bt_Start);
    }

    private String getName(){
        return EditName.getText().toString();
    }
}
