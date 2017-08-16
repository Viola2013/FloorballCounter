package com.example.android.floorballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0 ;
    int scoreTeamB = 0 ;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the penalty for Team A by 1 point.
     */
    public void addPenaltyForTeamA(View v) {
        penaltyTeamA = penaltyTeamA + 1;
        displayOnePenaltyForTeamA(penaltyTeamA);
    }
      /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the penalty for Team B by 1 point.
     */
    public void addPenaltyForTeamB(View v) {
        penaltyTeamB = penaltyTeamB + 1;
        displayOnePenaltyForTeamB(penaltyTeamB);
    }
    /** Resets the score for the both teams
     *
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /** Resets the penalties for the both teams
     *
     */
    public void resetPenalty(View v) {
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        displayOnePenaltyForTeamA(penaltyTeamA);
        displayOnePenaltyForTeamB(penaltyTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalties for Team A.
     */
    public void displayOnePenaltyForTeamA(int penalty) {
        TextView penaltyView = (TextView) findViewById(R.id.penalty_for_team_a);
        penaltyView.setText(String.valueOf(penalty));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
   }
    /**
     * Displays the penalties for Team B.
     */
    public void displayOnePenaltyForTeamB(int penalty) {
        TextView penaltyView = (TextView) findViewById(R.id.penalty_for_team_b);
        penaltyView.setText(String.valueOf(penalty));
    }
}


