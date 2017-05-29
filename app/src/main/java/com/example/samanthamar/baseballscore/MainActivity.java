package com.example.samanthamar.baseballscore;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Intialize variables
    int homeStrike,awayStrike,homeBalls,awayBalls,homeRuns,awayRuns =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    

    //Display home score
    public void displayHomeScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScore);
        scoreView.setText(String.valueOf(score));
    }


    //Display away score
    public void displayAwayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayScore);
        scoreView.setText(String.valueOf(score));
    }


    //Display home strikes
    public void displayHomeStrikes(int strike) {
        TextView scoreView = (TextView) findViewById(R.id.homeStrikes);
        scoreView.setText(String.valueOf(strike));
    }


    //Display away strikes
    public void displayAwayStrikes(int strike) {
        TextView scoreView = (TextView) findViewById(R.id.awayStrikes);
        scoreView.setText(String.valueOf(strike));
    }

    //Display home balls
    public void displayHomeBalls(int ball) {
        TextView scoreView = (TextView) findViewById(R.id.homeBalls);
        scoreView.setText(String.valueOf(ball));
    }


    //Display away balls
    public void displayAwayBalls(int ball) {
        TextView scoreView = (TextView) findViewById(R.id.awayBalls);
        scoreView.setText(String.valueOf(ball));
    }

    //Set home runs
    public void homeRun(View view) {
        homeRuns++;
        displayHomeScore(homeRuns);
    }

    //Set home strikes
    public void homeStrike(View view) {

        if (homeStrike<3 & homeBalls !=4) {
            homeStrike++;
            displayHomeStrikes(homeStrike);
        }

        if (homeStrike==3) {
            homeStatus("OUT");
        }


    }

    //Set home balls
    public void homeBall(View view) {


            if (homeStrike<3 & homeBalls <4) {
                homeBalls++;
                displayHomeBalls(homeBalls);
            }

        if (homeBalls==4) {
            homeStatus("WALK");
        }


    }

    //Clear home count
    public void homeClearCount (View view) {
        homeStrike=0;
        homeBalls=0;
        displayHomeStrikes(homeStrike);
        displayHomeBalls(homeBalls);
        homeStatus("");

    }

    //Set away runs
    public void awayRun(View view) {
        awayRuns++;
        displayAwayScore(awayRuns);
    }

    //Set away strikes
    public void awayStrike(View view) {

        if (awayStrike<3 & awayBalls !=4) {
            awayStrike++;
            displayAwayStrikes(awayStrike);
        }

        if (awayStrike==3) {
            awayStatus("OUT");
        }


    }

    //Set away balls
    public void awayBall(View view) {


        if (awayStrike<3 & awayBalls <4) {
            awayBalls++;
            displayAwayBalls(awayBalls);
        }

        if (awayBalls==4) {
            awayStatus("WALK");
        }


    }

    //Clear away count
    public void awayClearCount (View view) {
        awayStrike=0;
        awayBalls=0;
        displayAwayStrikes(awayStrike);
        displayAwayBalls(awayBalls);
        awayStatus("");

    }

    public void resetGame (View view) {
        awayStrike=0;
        awayBalls=0;
        homeStrike=0;
        homeBalls=0;
        homeRuns =0;
        awayRuns=0;

        displayHomeStrikes(homeStrike);
        displayAwayStrikes(awayStrike);

        displayAwayBalls(awayBalls);
        displayHomeBalls(homeBalls);

        displayAwayScore(awayRuns);
        displayHomeScore(homeRuns);

        homeStatus("");
        awayStatus("");

    }

    //Display home update
    public void homeStatus(String status) {
        TextView homeUpdate = (TextView) findViewById(R.id.homeUpdate);
        homeUpdate.setText(String.valueOf(status));
        if (status == "OUT") {
            homeUpdate.setTextColor(Color.RED);
        }
        if (status == "WALK") {
            homeUpdate.setTextColor(Color.GREEN);
        }
    }

    //Display away update
    public void awayStatus(String status) {
        TextView awayUpdate = (TextView) findViewById(R.id.awayUpdate);
        awayUpdate.setText(String.valueOf(status));
        if (status == "OUT") {
            awayUpdate.setTextColor(Color.RED);
        }
        if (status == "WALK") {
            awayUpdate.setTextColor(Color.GREEN);
        }
    }



}






