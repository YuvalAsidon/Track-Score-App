package com.yuvalasidon.trackscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void A_add_threePoints(View view){
        scoreTeamA+=3;
        displayTeamA(scoreTeamA);
    }
    public void A_add_twoPoints(View view){
        scoreTeamA+=2;
        displayTeamA(scoreTeamA);
    }
    public void A_add_Point(View view){
        scoreTeamA+=1;
        displayTeamA(scoreTeamA);
    }
    public void displayTeamA(int number){
        TextView score1=(TextView)findViewById(R.id.scoreA);
        score1.setText(String.valueOf(number));
    }
    public void B_add_threePoints(View view){
        scoreTeamB+=3;
        displayTeamB(scoreTeamB);
    }
    public void B_add_twoPoints(View view){
        scoreTeamB+=2;
        displayTeamB(scoreTeamB);
    }
    public void B_add_Point(View view){
        scoreTeamB+=1;
        displayTeamB(scoreTeamB);
    }
    public void displayTeamB(int number){
        TextView score2=(TextView)findViewById(R.id.scoreB);
        score2.setText(String.valueOf(number));
    }
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
}
