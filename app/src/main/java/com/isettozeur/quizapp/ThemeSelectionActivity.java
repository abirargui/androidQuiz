package com.isettozeur.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThemeSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_selection);


        String playerName = getIntent().getStringExtra("PLAYER_NAME");
        TextView textViewWelcome = findViewById(R.id.textViewWelcome);
        textViewWelcome.setText("Bienvenue, " + playerName + "!");




        final String[] themes = QuizData.THEMES;


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, themes);

        ListView listView = findViewById(R.id.listViewThemes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedTheme = themes[position];

                Intent intent = new Intent(ThemeSelectionActivity.this, QuestionActivity.class);
                intent.putExtra("PLAYER_NAME", playerName);
                intent.putExtra("SELECTED_THEME", selectedTheme);
                startActivity(intent);
            }
        });
    }
}
