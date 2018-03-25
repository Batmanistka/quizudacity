package com.example.android.quizudacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndQuiz extends AppCompatActivity {

    TextView mUserName, mCongrats, mFinalScore;
    Button mRetryButton;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_quiz);

        mCongrats = (TextView) findViewById(R.id.congrats);
        mFinalScore = (TextView) findViewById(R.id.result);
        mRetryButton = (Button) findViewById(R.id.retry_button);
        mUserName = (TextView) findViewById(R.id.user_name);

        Intent intentName = getIntent();
        nameString = intentName.getStringExtra("user_name");
        mUserName.setText(nameString);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of 6");

        if (score == 6) {
            mCongrats.setText(R.string.result6p);
        } else if (score == 5) {
            mCongrats.setText(R.string.result5p);
        } else if (score == 4) {
            mCongrats.setText(R.string.result4p3p);
        } else if (score == 3) {
            mCongrats.setText(R.string.result4p3p);
        } else if (score < 3) {
            mCongrats.setText(R.string.result2p1p);
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentName = new Intent(EndQuiz.this, StartQuiz.class);
                intentName.putExtra("user_name", nameString);
                startActivity(intentName);
            }
        });
    }
}