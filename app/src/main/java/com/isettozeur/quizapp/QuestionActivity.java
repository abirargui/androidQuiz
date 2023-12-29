package com.isettozeur.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    private TextView textViewQuestion;
    private RadioGroup radioGroupOptions;
    private Button buttonNext;

    private String playerName;
    private String selectedTheme;
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int playerScore = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        Intent intent = getIntent();
        playerName = intent.getStringExtra("PLAYER_NAME");
        selectedTheme = intent.getStringExtra("SELECTED_THEME");


        if (selectedTheme.equals("Histoire")) {
            questions = QuizData.QUESTIONS_HISTOIRE;
        } else if (selectedTheme.equals("Géographie")) {
            questions = QuizData.QUESTIONS_GEOGRAPHIE;
        } else if (selectedTheme.equals("Sport")) {
            questions = QuizData.QUESTIONS_SPORT;
        } else if (selectedTheme.equals("Politique")) {
            questions = QuizData.QUESTIONS_POLITIQUE;
        } else if (selectedTheme.equals("Technologie")) {
            questions = QuizData.QUESTIONS_TECHNOLOGIE;
        }


        textViewQuestion = findViewById(R.id.textViewQuestion);
        radioGroupOptions = findViewById(R.id.radioGroupOptions);
        buttonNext = findViewById(R.id.buttonNext);


        showQuestion();


        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedOptionId = radioGroupOptions.getCheckedRadioButtonId();
                if (selectedOptionId == -1) {

                    Toast.makeText(QuestionActivity.this, "Veuillez choisir une réponse", Toast.LENGTH_SHORT).show();
                } else {

                    RadioButton selectedRadioButton = findViewById(selectedOptionId);
                    int selectedOptionIndex = radioGroupOptions.indexOfChild(selectedRadioButton);

                    if (selectedOptionIndex == questions.get(currentQuestionIndex).getCorrectOptionIndex()) {

                        playerScore += 5;
                    }


                    currentQuestionIndex++;

                    if (currentQuestionIndex < questions.size()) {
                        showQuestion();
                    } else {

                        showFinalScore();
                    }

                    radioGroupOptions.clearCheck();
                }
            }
        });
    }

    private void showQuestion() {
        Question currentQuestion = questions.get(currentQuestionIndex);
        textViewQuestion.setText(currentQuestion.getQuestionText());


        String[] options = currentQuestion.getOptions();
        radioGroupOptions.removeAllViews();

        for (int i = 0; i < options.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(options[i]);
            radioGroupOptions.addView(radioButton);
        }
        textViewQuestion.setText(questions.get(currentQuestionIndex).getQuestionText());

        currentQuestion = questions.get(currentQuestionIndex);
        textViewQuestion.setText(currentQuestion.getQuestionText());

        options = currentQuestion.getOptions();
        radioGroupOptions.removeAllViews();

        for (int i = 0; i < options.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(options[i]);
            radioButton.setId(View.generateViewId());  // Générer un ID unique pour chaque bouton radio
            radioGroupOptions.addView(radioButton);
        }
        options = questions.get(currentQuestionIndex).getOptions();
        radioGroupOptions.removeAllViews();

        for (int i = 0; i < options.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(options[i]);
            radioGroupOptions.addView(radioButton);
        }
    }

    private void showFinalScore() {

        Intent intent = new Intent(QuestionActivity.this, FinalScoreActivity.class);
        intent.putExtra("PLAYER_NAME", playerName);
        intent.putExtra("PLAYER_SCORE", playerScore);
        startActivity(intent);
        finish();
    }
}
