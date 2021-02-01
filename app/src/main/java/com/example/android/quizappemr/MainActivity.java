package com.example.android.quizappemr;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * method called when the check answers button is clicked
     * finds the state of all check boxes and radio buttons for each question,
     * calls to methods for comparing current state to the correct answer,
     * calculates total of correct answers and displays results in a toast.
     *
     */
    public void checkAnswers(View view) {
        int numberOfCorrectAnswers = 0;
        // question 1 find selected radio button and check against correct answer
        RadioGroup question1Group = findViewById(R.id.question1_radioGroup);
        RadioButton selectedRadioButtonQuestion1 = findViewById(question1Group.getCheckedRadioButtonId());
        RadioButton correctAnswerQuestion1 = findViewById(R.id.answer_radioButton_1a);
        Boolean isAnswerCorrect1 = checkRadioQuestions(selectedRadioButtonQuestion1, correctAnswerQuestion1);

        // if answer for question 1 is correct increment numberOfCorrectAnswers by 1
        if (isAnswerCorrect1) {
            numberOfCorrectAnswers += 1;
        }

        // question 2 find selected radio button and check against correct answer
        RadioGroup question2Group = findViewById(R.id.question2_radioGroup);
        RadioButton selectedRadioButtonQuestion2 = findViewById(question2Group.getCheckedRadioButtonId());
        RadioButton correctAnswerQuestion2 = findViewById(R.id.answer_radioButton_2c);
        Boolean isAnswerCorrect2 = checkRadioQuestions(selectedRadioButtonQuestion2, correctAnswerQuestion2);

        // if answer for question 2 is correct increment numberOfCorrectAnswers by 1
        if (isAnswerCorrect2) {
            numberOfCorrectAnswers += 1;
        }

        //question 3 call checkQuestion3 method to see if the correct check boxes are checked
        Boolean isAnswerCorrect3 = checkQuestion3();

        // if answer for question 3 is correct increment numberOfCorrectAnswers by 1
        if (isAnswerCorrect3) {
            numberOfCorrectAnswers += 1;
        }

        //question 4 find selected radio button and check against correct answer
        RadioGroup question4Group = findViewById(R.id.question4_radioGroup);
        RadioButton selectedRadioButtonQuestion4 = findViewById(question4Group.getCheckedRadioButtonId());
        RadioButton correctAnswerQuestion4 = findViewById(R.id.answer_radioButton_4b);
        Boolean isAnswerCorrect4 = checkRadioQuestions(selectedRadioButtonQuestion4, correctAnswerQuestion4);

        // if answer for question 4 is correct increment numberOfCorrectAnswers by 1
        if (isAnswerCorrect4) {
            numberOfCorrectAnswers += 1;
        }

        // question 5 call checkQuestion5 method to see if the correct check boxes are checked
        Boolean isAnswerCorrect5 = checkQuestion5();

        // if answer for question 5 is correct increment numberOfCorrectAnswers by 1
        if (isAnswerCorrect5) {
            numberOfCorrectAnswers += 1;
        }

        // question 6 find selected radio button and check against correct answer
        RadioGroup question6Group = findViewById(R.id.question6_radioGroup);
        RadioButton selectedRadioButtonQuestion6 = findViewById(question6Group.getCheckedRadioButtonId());
        RadioButton correctAnswerQuestion6 = findViewById(R.id.answer_radioButton_6d);
        Boolean isAnswerCorrect6 = checkRadioQuestions(selectedRadioButtonQuestion6, correctAnswerQuestion6);

        // if answer for question 6 is correct increment numberOfCorrectAnswers by 1
        if (isAnswerCorrect6) {
            numberOfCorrectAnswers += 1;
        }

        // question 7 find selected radio button and check against correct answer
        RadioGroup question7Group = findViewById(R.id.question7_radioGroup);
        RadioButton selectedRadioButtonQuestion7 = findViewById(question7Group.getCheckedRadioButtonId());
        RadioButton correctAnswerQuestion7 = findViewById(R.id.answer_radioButton_7b);
        Boolean isAnswerCorrect7 = checkRadioQuestions(selectedRadioButtonQuestion7, correctAnswerQuestion7);

        // if answer for question 7 is correct increment numberOfCorrectAnswers by 1
        if (isAnswerCorrect7) {
            numberOfCorrectAnswers += 1;
        }

        // question 8 find selected radio button and check against correct answer
        RadioGroup question8Group = findViewById(R.id.question8_radioGroup);
        RadioButton selectedRadioButtonQuestion8 = findViewById(question8Group.getCheckedRadioButtonId());
        RadioButton correctAnswerQuestion8 = findViewById(R.id.answer_radioButton_8a);
        Boolean isAnswerCorrect8 = checkRadioQuestions(selectedRadioButtonQuestion8, correctAnswerQuestion8);

        // if answer for question 8 is correct increment numberOfCorrectAnswers by 1
        if (isAnswerCorrect8) {
            numberOfCorrectAnswers += 1;
        }

        // question 9 get users input
        EditText editTextFieldQuestion9 = findViewById(R.id.editText_question_9);
        String userInputTextQuestion9 = editTextFieldQuestion9.getText().toString().trim();
        String correctAnswerQuestion9 = getString(R.string.answer_question_9);

        // if answer for question 9 is correct increment numberOfCorrectAnswers by 1
        if (correctAnswerQuestion9.contentEquals(userInputTextQuestion9)) {
            numberOfCorrectAnswers += 1;
        }

        // question 10 get users input
        EditText editTextFieldQuestion10 = findViewById(R.id.editText_question_10);
        String userInputTextQuestion10 = editTextFieldQuestion10.getText().toString().trim();
        String correctAnswerQuestion10 = getString(R.string.answer_question_10);

        // if answer for question 10 is correct increment numberOfCorrectAnswers by 1
        if (correctAnswerQuestion10.contentEquals(userInputTextQuestion10)) {
            numberOfCorrectAnswers += 1;
        }

        // get user name
        EditText userName = findViewById(R.id.editText_name);

        // display results as toast
        if (numberOfCorrectAnswers == 10) {
            Toast.makeText(this, getString(R.string.all_correct, userName.getText()), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.wrong_answers, userName.getText(), numberOfCorrectAnswers), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * method used to check if the correct answer is selected for radio buttons
     *
     * @param selected is the id of the currently selected radio button in the group
     * @param answer   is the id of the radio button for the correct answer in the group
     * @return true if answer correct, else false
     */
    private boolean checkRadioQuestions(RadioButton selected, RadioButton answer) {
        return selected == answer;
    }

    /**
     * method to check if all the correct check boxes for question 3 are checked.
     *
     * @return true if all the correct and none of the incorrect check boxes are checked,
     * else it returns false
     */
    private boolean checkQuestion3() {
        CheckBox checkBoxQuestion3A = findViewById(R.id.question_3_checkBox_a);
        boolean isBoxChecked3A = checkBoxQuestion3A.isChecked();

        CheckBox checkBoxQuestion3B = findViewById(R.id.question_3_checkBox_b);
        boolean isBoxChecked3B = checkBoxQuestion3B.isChecked();

        CheckBox checkBoxQuestion3C = findViewById(R.id.question_3_checkBox_c);
        boolean isBoxChecked3C = checkBoxQuestion3C.isChecked();

        CheckBox checkBoxQuestion3D = findViewById(R.id.question_3_checkBox_d);
        boolean isBoxChecked3D = checkBoxQuestion3D.isChecked();

        if (isBoxChecked3A && isBoxChecked3B && isBoxChecked3D) {
            return !isBoxChecked3C;
        } else {
            return false;
        }
    }

    /**
     * method to check if all the correct check boxes for question 5 are checked.
     *
     * @return true if all the correct and none of the incorrect check boxes are checked,
     * else it returns false
     */
    private boolean checkQuestion5() {
        CheckBox checkBoxQuestion5A = findViewById(R.id.question_5_checkBox_a);
        boolean isBoxChecked5A = checkBoxQuestion5A.isChecked();

        CheckBox checkBoxQuestion5B = findViewById(R.id.question_5_checkBox_b);
        boolean isBoxChecked5B = checkBoxQuestion5B.isChecked();

        CheckBox checkBoxQuestion5C = findViewById(R.id.question_5_checkBox_c);
        boolean isBoxChecked5C = checkBoxQuestion5C.isChecked();

        CheckBox checkBoxQuestion5D = findViewById(R.id.question_5_checkBox_d);
        boolean isBoxChecked5D = checkBoxQuestion5D.isChecked();

        if (isBoxChecked5B && isBoxChecked5C && isBoxChecked5D) {
            return !isBoxChecked5A;
        } else {
            return false;
        }
    }
}