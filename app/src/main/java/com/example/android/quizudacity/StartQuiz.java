package com.example.android.quizudacity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Handler;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class StartQuiz extends AppCompatActivity {

    Button mSumButton;
    private CheckBox mFirstQCheckBoxChoice1;
    private CheckBox mFirstQCheckBoxChoice2;
    private CheckBox mFirstQCheckBoxChoice3;
    private CheckBox mFirstQCheckBoxChoice4;
    private RadioButton mSecondQRadioButtonChoice1;
    private RadioButton mSecondQRadioButtonChoice2;
    private RadioButton mSecondQRadioButtonChoice3;
    private RadioButton mSecondQRadioButtonChoice4;
    private RadioButton mThirdQRadioButtonChoice1;
    private RadioButton mThirdQRadioButtonChoice2;
    private RadioButton mThirdQRadioButtonChoice3;
    private RadioButton mThirdQRadioButtonChoice4;
    private RadioButton mFourthQRadioButtonChoice1;
    private RadioButton mFourthQRadioButtonChoice2;
    private RadioButton mFourthQRadioButtonChoice3;
    private RadioButton mFourthQRadioButtonChoice4;
    private RadioButton mFifthQRadioButtonChoice1;
    private RadioButton mFifthQRadioButtonChoice2;
    private RadioButton mFifthQRadioButtonChoice3;
    private RadioButton mFifthQRadioButtonChoice4;
    private int mScore;
    private String name;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        mScore = 0;

        //Passes user name
        Intent cdName = getIntent();
        name = cdName.getStringExtra("user_name");

        mSumButton = (Button) findViewById(R.id.sum_button);
        mFirstQCheckBoxChoice1 = (CheckBox) findViewById(R.id.first_q_answer_1);
        mFirstQCheckBoxChoice2 = (CheckBox) findViewById(R.id.first_q_answer_2);
        mFirstQCheckBoxChoice3 = (CheckBox) findViewById(R.id.first_q_answer_3);
        mFirstQCheckBoxChoice4 = (CheckBox) findViewById(R.id.first_q_answer_4);
        mSecondQRadioButtonChoice1 = (RadioButton) findViewById(R.id.second_q_answer_1);
        mSecondQRadioButtonChoice2 = (RadioButton) findViewById(R.id.second_q_answer_2);
        mSecondQRadioButtonChoice3 = (RadioButton) findViewById(R.id.second_q_answer_3);
        mSecondQRadioButtonChoice4 = (RadioButton) findViewById(R.id.second_q_answer_4);
        mThirdQRadioButtonChoice1 = (RadioButton) findViewById(R.id.third_q_answer_1);
        mThirdQRadioButtonChoice2 = (RadioButton) findViewById(R.id.third_q_answer_2);
        mThirdQRadioButtonChoice3 = (RadioButton) findViewById(R.id.third_q_answer_3);
        mThirdQRadioButtonChoice4 = (RadioButton) findViewById(R.id.third_q_answer_4);
        mFourthQRadioButtonChoice1 = (RadioButton) findViewById(R.id.fourth_q_answer_1);
        mFourthQRadioButtonChoice2 = (RadioButton) findViewById(R.id.fourth_q_answer_2);
        mFourthQRadioButtonChoice3 = (RadioButton) findViewById(R.id.fourth_q_answer_3);
        mFourthQRadioButtonChoice4 = (RadioButton) findViewById(R.id.fourth_q_answer_4);
        mFifthQRadioButtonChoice1 = (RadioButton) findViewById(R.id.fifth_q_answer_1);
        mFifthQRadioButtonChoice2 = (RadioButton) findViewById(R.id.fifth_q_answer_2);
        mFifthQRadioButtonChoice3 = (RadioButton) findViewById(R.id.fifth_q_answer_3);
        mFifthQRadioButtonChoice4 = (RadioButton) findViewById(R.id.fifth_q_answer_4);

        //When user click correct checkbox
        mFirstQCheckBoxChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if button is clicked counter get + 1 and set the color green
                if (mFirstQCheckBoxChoice1.isChecked()) {
                    mScore = mScore + 1;
                    mFirstQCheckBoxChoice1.setBackgroundColor(getResources().getColor(R.color.my_green));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mFirstQCheckBoxChoice1.setBackgroundColor(getResources().getColor(R.color.my_white));
                        }
                    }, 700);
                    Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
                }
                if (mScore > 2) {
                    mScore = 2;
                }
            }
        });
        //When user click correct checkbox
        mFirstQCheckBoxChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if button is clicked counter get + 1 and set the color green
                if (mFirstQCheckBoxChoice4.isChecked()) {
                    mScore = mScore + 1;
                    mFirstQCheckBoxChoice4.setBackgroundColor(getResources().getColor(R.color.my_green));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mFirstQCheckBoxChoice4.setBackgroundColor(getResources().getColor(R.color.my_white));
                        }
                    }, 700);
                    Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
                }
                if (mScore > 2) {
                    mScore = 2;
                }
            }
        });
        //When user click checkbox
        mFirstQCheckBoxChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if radio button is checked set the color green
                mFirstQCheckBoxChoice2.setBackgroundColor(getResources().getColor(R.color.my_green));
                // change to original after 3 secs.
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        mFirstQCheckBoxChoice2.setBackgroundColor(getResources().getColor(R.color.my_white));
                    }
                }, 700);
                Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
            }
        });
        //When user click checkbox
        mFirstQCheckBoxChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /// if radio button is checked set the color green
                mFirstQCheckBoxChoice3.setBackgroundColor(getResources().getColor(R.color.my_green));
                // change to original after 3 secs.
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        mFirstQCheckBoxChoice3.setBackgroundColor(getResources().getColor(R.color.my_white));
                    }
                }, 700);
                Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onRadioButtonSecondQuestionClicked(View view) {
        //if button is clicked counter get + 1 and set the color green
        if (mSecondQRadioButtonChoice1.isChecked()) {
            mScore = mScore + 1;
            // if radio button is checked set the color green
            mSecondQRadioButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mSecondQRadioButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mScore > 3) {
            mScore = 3;
        }
        if (mSecondQRadioButtonChoice2.isChecked()) {
            // if radio button is checked set the color green
            mSecondQRadioButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mSecondQRadioButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mSecondQRadioButtonChoice3.isChecked()) {
            // if radio button is checked set the color green
            mSecondQRadioButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mSecondQRadioButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mSecondQRadioButtonChoice4.isChecked()) {
            // if radio button is checked set the color green
            mSecondQRadioButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mSecondQRadioButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
    }

    public void onRadioButtonThirdQuestionClicked(View view) {
        //if button is clicked counter get + 1 and set the color green
        if (mThirdQRadioButtonChoice3.isChecked()) {
            mScore = mScore + 1;
            // if radio button is checked set the color green
            mThirdQRadioButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mThirdQRadioButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mScore > 4) {
            mScore = 4;
        }
        if (mThirdQRadioButtonChoice1.isChecked()) {
            // if radio button is checked set the color green
            mThirdQRadioButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mThirdQRadioButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mThirdQRadioButtonChoice2.isChecked()) {
            // if radio button is checked set the color green
            mThirdQRadioButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mThirdQRadioButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mThirdQRadioButtonChoice4.isChecked()) {
            // if radio button is checked set the color green
            mThirdQRadioButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mThirdQRadioButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
    }

    public void onRadioButtonFourthQuestionClicked(View view) {
        //if button is clicked counter get + 1 and set the color green
        if (mFourthQRadioButtonChoice4.isChecked()) {
            mScore = mScore + 1;
            // if radio button is checked set the color green
            mFourthQRadioButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mFourthQRadioButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mScore > 5) {
            mScore = 5;
        }
        if (mFourthQRadioButtonChoice1.isChecked()) {
            // if radio button is checked set the color green
            mFourthQRadioButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mFourthQRadioButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mFourthQRadioButtonChoice2.isChecked()) {
            // if radio button is checked set the color green
            mFourthQRadioButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mFourthQRadioButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mFourthQRadioButtonChoice3.isChecked()) {
            // if radio button is checked set the color green
            mFourthQRadioButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mFourthQRadioButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
    }

    public void onRadioButtonFifthQuestionClicked(View view) {
        //if button is clicked counter get + 1 and set the color green
        if (mFifthQRadioButtonChoice3.isChecked()) {
            mScore = mScore + 1;
            // if radio button is checked set the color green
            mFifthQRadioButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mFifthQRadioButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mScore > 6) {
            mScore = 6;
        }
        if (mFifthQRadioButtonChoice1.isChecked()) {
            // if radio button is checked set the color green
            mFifthQRadioButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mFifthQRadioButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mFifthQRadioButtonChoice2.isChecked()) {
            // if radio button is checked set the color green
            mFifthQRadioButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mFifthQRadioButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
        if (mFifthQRadioButtonChoice4.isChecked()) {
            // if radio button is checked set the color green
            mFifthQRadioButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_green));
            // change to original after 3 secs.
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    mFifthQRadioButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_white));
                }
            }, 700);
            Toast.makeText(StartQuiz.this, R.string.toast_two, Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickSumButtonClicked(View view) {
        Intent i = new Intent(StartQuiz.this, EndQuiz.class);
        i.putExtra("user_name", name);
        Bundle bundle = new Bundle();
        bundle.putInt("finalScore", mScore);
        i.putExtras(bundle);
        StartQuiz.this.finish();
        startActivity(i);
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // saving the content of textview and image using the key
        outState.putInt("score", mScore);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mScore = savedInstanceState.getInt("score");
    }
}
