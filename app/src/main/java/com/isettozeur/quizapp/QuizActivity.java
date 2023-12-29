package com.isettozeur.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {
    private EditText playerNameEditText;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        playerNameEditText = findViewById(R.id.editTextPlayerName);
        startButton = findViewById(R.id.buttonStart);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String playerName = playerNameEditText.getText().toString();
                if (!playerName.isEmpty()) {

                    Intent intent = new Intent(QuizActivity.this, ThemeSelectionActivity.class);


                    intent.putExtra("PLAYER_NAME", playerName);


                    startActivity(intent);
                } else {

                    Toast.makeText(QuizActivity.this, "Veuillez entrer votre nom.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
