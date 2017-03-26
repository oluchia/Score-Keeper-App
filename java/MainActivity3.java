package com.example.oluchianyabuike.myproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void toMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_da_score);
        scoreView.setText(String.valueOf(score));

        TextView scoreView1 = (TextView) findViewById(R.id.team_da_score1);
        scoreView1.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_db_score);
        scoreView.setText(String.valueOf(score));

        TextView scoreView1 = (TextView) findViewById(R.id.team_db_score1);
        scoreView1.setText(String.valueOf(score));
    }

    public void pointA(View view) {
        if (scoreForTeamA < 40) {
            scoreForTeamA += 15;
            displayForTeamA(scoreForTeamA);

            if (scoreForTeamA == 15) {
                displayMessageA("15 Love");
            }else if (scoreForTeamA == 30) {
                displayMessageA("30 Love");
            }else if (scoreForTeamA == 40) {
                displayMessageA("Deuce");
            } else {
                displayMessageA("");
            }
        }

    }

    public void pointB(View view) {
        if(scoreForTeamB < 40) {
            scoreForTeamB += 15;
            displayForTeamB(scoreForTeamB);

            if (scoreForTeamB == 15) {
                displayMessageB("15 Love");
            }else if (scoreForTeamB == 30) {
                displayMessageB("30 Love");
            }else if (scoreForTeamB == 40) {
                displayMessageB("Deuce");
            } else {
                displayMessageB("");
            }
        }

    }

    public void displayMessageA(String message) {
        TextView scoreATextView = (TextView) findViewById(R.id.text_a_score);
        scoreATextView.setText(message);

        TextView scoreATextView1 = (TextView) findViewById(R.id.text_a_score1);
        scoreATextView1.setText(message);
    }

    public void displayMessageB(String message) {
        TextView scoreBTextView = (TextView) findViewById(R.id.text_b_score);
        scoreBTextView.setText(message);

        TextView scoreBTextView1 = (TextView) findViewById(R.id.text_b_score1);
        scoreBTextView1.setText(message);
    }


    public void gamePointA(View view) {
        if (scoreForTeamA < 40) {
            scoreForTeamA += 10;
            displayForTeamA(scoreForTeamA);

            if (scoreForTeamA == 40 ) {
                String message = "Deuce";
                displayMessageA(message);
            }
        }
    }

    public void gamePointB(View view) {
        if (scoreForTeamB < 40) {
            scoreForTeamB += 10;
            displayForTeamB(scoreForTeamB);

            if (scoreForTeamB == 40) {
                String message = "Deuce";
                displayMessageB(message);
            }
        }
    }

    public void reset(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;

        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);

        displayMessageA("");
        displayMessageB("");
    }
}
