package com.example.rajarajeshwari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamcsk = 0;
    int teamrcb=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team b.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the threepoints score for Team A.
     */
    public void threepoints(View view) {
        teamcsk=teamcsk+3;
        displayForTeamA(teamcsk);

    }
    /**
     * Displays the twopoints score for Team A.
     */
    public void twopoints(View view) {
        teamcsk=teamcsk+2;
        displayForTeamA(teamcsk);

    }
    /**
     * Displays the freepoints score for Team A.
     */
    public void freepoints(View view) {
        teamcsk=teamcsk+1;
        displayForTeamA(teamcsk);
    }

    /**
     * Displays the threepoints score for Team b.
     */
    public void threepointsr(View view) {
        teamrcb=teamrcb+3;
        displayForTeamB(teamrcb);

    }
    /**
     * Displays the twopoints score for Team b.
     */
    public void twopointsr(View view) {
        teamrcb=teamrcb+2;
        displayForTeamB(teamrcb);

    }
    /**
     * Displays the freepoints score for Team b.
     */
    public void freepointsr(View view) {
        teamrcb=teamrcb+1;
        displayForTeamB(teamrcb);
    }

    public void reset(View view){
        int reset=0;
        teamrcb=reset*teamrcb;
        teamcsk=reset*teamcsk;
        displayForTeamB(teamrcb);
        displayForTeamA(teamcsk);

    }

}
