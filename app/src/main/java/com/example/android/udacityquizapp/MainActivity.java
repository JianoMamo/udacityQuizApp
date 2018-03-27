package com.example.android.udacityquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    //Variables I have declared.
    int score = 0;
    private TextView nameUser;
    private EditText answerOne;
    private EditText answerTwo;
    private RadioButton answer3_1;
    private RadioButton answer3_2;
    private RadioButton answer3_3;
    private RadioButton answer4_1;
    private RadioButton answer4_2;
    private RadioButton answer4_3;
    private RadioButton answer5_1;
    private RadioButton answer5_2;
    private RadioButton answer5_3;
    private CheckBox answer6_1;
    private CheckBox answer6_2;
    private CheckBox answer6_3;
    private CheckBox answer7_1;
    private CheckBox answer7_2;
    private CheckBox answer7_3;
    private CheckBox answer8_1;
    private CheckBox answer8_2;
    private CheckBox answer8_3;
    private Button submitButton;
    private Button resetButton;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        setup();
        //Gets name from the name field.
        nameUser.setText(name);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionOne();
                questionTwo();
                questionThree();
                questionFour();
                questionFive();
                questionSix();
                questionSeven();
                questionEight();

                //Displays final score in the toast view at the end of the app.
                //Shows toast if the score is less than 30.
                if (score < 30) {
                    Toast.makeText(MainActivity.this, " " + getString(R.string.your_score_is) + " " + score + " " + getString(R.string.toast_score_1), Toast.LENGTH_LONG).show();
                }

                //Displays final score in the toast view at the end of the app.
                //Shows toast if the score is less than 110.
                else if (score < 110) {
                    Toast.makeText(MainActivity.this, " " + getString(R.string.your_score_is) + " " + score + " " + getString(R.string.toast_score_2), Toast.LENGTH_LONG).show();
                }

                //Displays final score in the toast view at the end of the app.
                //Shows toast if the score is 110 (Perfect game).
                else if (score == 110) {
                    Toast.makeText(MainActivity.this, " " + getString(R.string.your_score_is) + " " + score + " " + getString(R.string.toast_score_3), Toast.LENGTH_LONG).show();
                }
            }
        });

        //resets the score and the answers in editext and clear the radiobuttons and checkboxes.
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                answerOne.getText().clear();
                answerTwo.getText().clear();
                radioGroup3.clearCheck();
                radioGroup4.clearCheck();
                radioGroup5.clearCheck();
                answer6_1.setChecked(false);
                answer6_2.setChecked(false);
                answer6_3.setChecked(false);
                answer7_1.setChecked(false);
                answer7_2.setChecked(false);
                answer7_3.setChecked(false);
                answer8_1.setChecked(false);
                answer8_2.setChecked(false);
                answer8_3.setChecked(false);

            }
        });

    }


    private int questionOne() {

        String ansOne = answerOne.getText().toString().trim();
        //Checks if question 1 is answered.
        if (ansOne.isEmpty()) {
            Toast.makeText(this, getString(R.string.question) + " 1 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks whether the user has answered correctly in the question 1.
        else if (ansOne.equals("Hygrometer") || ansOne.equals("hygrometer") || ansOne.equals("HYGROMETER") || ansOne.equals("hygrometer.")) {
            score += 10;
        } else {
            score += 0;
        }

        return score;
    }


    private int questionTwo() {

        //Gets text from question 2.
        String ansTwo = answerTwo.getText().toString().trim();

        //Checks if question 2 is answered.
        if (ansTwo.isEmpty()) {
            Toast.makeText(this, getString(R.string.question) + " 2 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks whether the user has answered correctly in the question 2.
        else if (ansTwo.equals("Third law") || ansTwo.equals("third law") || ansTwo.equals("third law of Newton") || ansTwo.equals("Third law of Newton") || ansTwo.equals("Newton's third law")) {
            score += 10;
        } else {
            score += 0;
        }

        return score;
    }

    private int questionThree() {

        //Checks which radio button is checked in question 3.
        boolean answer_3_1 = answer3_1.isChecked();
        boolean answer_3_2 = answer3_2.isChecked();
        boolean answer_3_3 = answer3_3.isChecked();

        //Checks if question 3 is answered.
        if (!(answer_3_1 || answer_3_2 || answer_3_3)) {
            Toast.makeText(this, getString(R.string.question) + " 3 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks whether the user has checked the right radio button in question 3 (correct answer is 3).
        else if (answer_3_3) {
            score += 10;
        } else {
            score += 0;
        }

        return score;
    }

    private int questionFour() {

        //Checks which radio button is checked in question 4.
        boolean answer_4_1 = answer4_1.isChecked();
        boolean answer_4_2 = answer4_2.isChecked();
        boolean answer_4_3 = answer4_3.isChecked();

        //Checks if question 3 is answered.
        if (!(answer_4_1 || answer_4_2 || answer_4_3)) {
            Toast.makeText(this, getString(R.string.question) + " 4 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks whether the user has checked the right radio button in question 4 (correct answer is 4).
        else if (answer_4_3) {
            score += 10;
        } else {
            score += 0;
        }

        return score;
    }

    private int questionFive() {

        //Checks which radio button is checked in question 4.
        boolean answer_5_1 = answer5_1.isChecked();
        boolean answer_5_2 = answer5_2.isChecked();
        boolean answer_5_3 = answer5_3.isChecked();

        //Checks if question 3 is answered.
        if (!(answer_5_1 || answer_5_2 || answer_5_3)) {
            Toast.makeText(this, getString(R.string.question) + " 5 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks whether the user has checked the right radio button in question 5(correct answer is 3).
        else if (answer_5_3) {
            score += 10;
        } else {
            score += 0;
        }

        return score;
    }

    private int questionSix() {

        //Checks which checkboxes are checked in question 6.
        boolean answer_6_1 = answer6_1.isChecked();
        boolean answer_6_2 = answer6_2.isChecked();
        boolean answer_6_3 = answer6_3.isChecked();

        //Checks if question 6 is answered.
        if (!(answer_6_1 || answer_6_2 || answer_6_3)) {
            Toast.makeText(this, getString(R.string.question) + " 6 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks whether the user has checked the right checkboxes in question 6 (correct answers are 1 and 2).
        else if (answer_6_1 && answer_6_2) {
            score += 20;
        } else if (answer_6_1 && !(answer_6_2)) {
            score += 10;
        } else if (!(answer_6_1) && answer_6_2) {
            score += 10;
        } else {
            score += 0;
        }

        return score;
    }

    private int questionSeven() {

        //Checks which checkboxes are checked in question 7.
        boolean answer_7_1 = answer7_1.isChecked();
        boolean answer_7_2 = answer7_2.isChecked();
        boolean answer_7_3 = answer7_3.isChecked();

        //Checks if question 6 is answered.
        if (!(answer_7_1 || answer_7_2 || answer_7_3)) {
            Toast.makeText(this, getString(R.string.question) + " 7 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks whether the user has checked the right checkboxes in question 7 (correct answer is 3).
        else if (answer_7_3) {
            score += 10;
        } else {
            score += 0;
        }

        return score;
    }


    private int questionEight() {

        //Checks which checkboxes are checked in question 8.
        boolean answer_8_1 = answer8_1.isChecked();
        boolean answer_8_2 = answer8_2.isChecked();
        boolean answer_8_3 = answer8_3.isChecked();

        //Checks if question 6 is answered.
        if (!(answer_8_1 || answer_8_2 || answer_8_3)) {
            Toast.makeText(this, getString(R.string.question) + " 6 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks whether the user has checked the right checkboxes in question 8 (correct answers are 1,2 and 3).
        else if (answer_8_1 && answer_8_2 && answer_8_3) {
            score += 30;
        } else if (answer_8_1 && answer_8_2 && !(answer_8_3)) {
            score += 20;
        } else if (answer_8_1 && !(answer_8_2) && answer_8_3) {
            score += 20;
        } else if (!(answer_8_1) && answer_8_2 && answer_8_3) {
            score += 20;
        } else if (answer_8_1) {
            score += 10;
        } else if (answer_8_2) {
            score += 10;
        } else if (answer_8_3) {
            score += 10;
        } else {
            score += 0;
        }
        return score;
    }

    private void setup() {

        nameUser = findViewById(R.id.name_edit_text);
        answerOne = findViewById(R.id.answerOne_edit_text);
        answerTwo = findViewById(R.id.answerTwo_edit_text);
        answer3_1 = findViewById(R.id.date1);
        answer3_2 = findViewById(R.id.date2);
        answer3_3 = findViewById(R.id.date3);
        answer4_1 = findViewById(R.id.date4);
        answer4_2 = findViewById(R.id.date5);
        answer4_3 = findViewById(R.id.date6);
        answer5_1 = findViewById(R.id.law1);
        answer5_2 = findViewById(R.id.law2);
        answer5_3 = findViewById(R.id.law3);
        answer6_1 = findViewById(R.id.planet1);
        answer6_2 = findViewById(R.id.planet2);
        answer6_3 = findViewById(R.id.planet3);
        answer7_1 = findViewById(R.id.energyOne);
        answer7_2 = findViewById(R.id.energyTwo);
        answer7_3 = findViewById(R.id.energyThree);
        answer8_1 = findViewById(R.id.temperatureOne);
        answer8_2 = findViewById(R.id.temperatureTwo);
        answer8_3 = findViewById(R.id.temperatureThree);
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup5 = findViewById(R.id.radioGroup5);
        submitButton = findViewById(R.id.button);
        resetButton = findViewById(R.id.button1);
    }

}
