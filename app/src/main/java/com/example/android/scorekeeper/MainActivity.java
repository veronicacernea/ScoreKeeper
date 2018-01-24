package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int yellowTeamA = 0;
    int redTeamA = 0;
    int yellowTeamB = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulsForTeamA(0);
        displayFoulsForTeamB(0);
        displayYellowTeamA(0);
        displayRedTeamA(0);
        displayYellowTeamB(0);
        displayRedTeamB(0);

    }

    /**
     * Displays the given score for Team A.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the fouls number for Team A.
     */
    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulsForTeamA(foulTeamA);
    }
    /**
     * Displays the number of yellow cards for Team A.
     */
    public void addYellowForTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowTeamA(yellowTeamA);
    }
    /**
     * Displays the number of red cards for Team A.
     */
    public void addRedForTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayRedTeamA(redTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the fouls number for Team B.
     */
    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulsForTeamB(foulTeamB);

    }
    /**
     * Displays the number of yellow cards for Team B.
     */
    public void addYellowForTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowTeamB(yellowTeamB);
    }
    /**
     * Displays the number of red cards for Team B.
     */
    public void addRedForTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayRedTeamB(redTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        yellowTeamA = 0;
        redTeamA = 0;
        yellowTeamB = 0;
        redTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulsForTeamA(0);
        displayFoulsForTeamB(0);
        displayYellowTeamB(0);
        displayRedTeamB(0);
        displayYellowTeamB(0);
        displayRedTeamB(0);
        displayYellowTeamA(0);
        displayYellowTeamB(0);
        displayRedTeamA(0);
        displayRedTeamB(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("Score: " + String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("Score: " + String.valueOf(score));
    }

    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText("Fouls: " + String.valueOf(score));
    }

    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText("Fouls: " + String.valueOf(score));
    }

    public void displayYellowTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }
}
