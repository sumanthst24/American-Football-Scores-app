package com.example.android.americanfootballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.americanfootballscores.R;

public class MainActivity extends AppCompatActivity {
    int teamascore=0;
    int teambscore=0;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void incra6(View view){
        teamascore=teamascore+6;
        displayForTeamA(teamascore);
    }
    public void incra4(View view){
        teamascore=teamascore+4;
        displayForTeamA(teamascore);
    }
    public void incra2(View view){
        teamascore=teamascore+2;
        displayForTeamA(teamascore);
    }
    public void incra1(View view){
        teamascore=teamascore+1;
        displayForTeamA(teamascore);
    }
    public void incrb6(View view){
        teambscore=teambscore+6;
        displayForTeamB(teambscore);
    }
    public void incrb4(View view){
        teambscore=teambscore+4;
        displayForTeamB(teambscore);
    }
    public void incrb2(View view){
        teambscore=teambscore+2;
        displayForTeamB(teambscore);
    }
    public void incrb1(View view){
        teambscore=teambscore+1;
        displayForTeamB(teambscore);
    }
    public void resetScore(View view){
        teamascore=0;
        teambscore=0;
        displayForTeamA(teamascore);
        displayForTeamB(teambscore);
        msg="";
        TextView scoreView = (TextView) findViewById(R.id.endgame);
        scoreView.setText(msg);

    }
    public void endtime(View v){
        if(teamascore>teambscore)
            msg="Team A won the match";
        else if(teambscore>teamascore)
            msg="Team B won the match";
        else
            msg="Match Drawn";
        TextView scoreView = (TextView) findViewById(R.id.endgame);
        scoreView.setText(msg);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
