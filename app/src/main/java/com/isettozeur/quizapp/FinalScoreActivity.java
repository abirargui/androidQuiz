package com.isettozeur.quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FinalScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);


        Intent intent = getIntent();
        String playerName = intent.getStringExtra("PLAYER_NAME");
        int playerScore = intent.getIntExtra("PLAYER_SCORE", 0);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewPlayerName = findViewById(R.id.textViewPlayerName);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewFinalScore = findViewById(R.id.textViewFinalScore);

        textViewPlayerName.setText("Joueur : " + playerName);
        textViewFinalScore.setText("Score Final : " + playerScore);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonReturnToThemes = findViewById(R.id.buttonReturnToThemes);
        buttonReturnToThemes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent returnIntent = new Intent(FinalScoreActivity.this, ThemeSelectionActivity.class);
                startActivity(returnIntent);
                finish();
            }
        });
    }
}
