package com.example.art_f.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int points;
    RadioButton q14, q43;
    CheckBox q21, q22, q23, q24;
    CheckBox q51, q52, q53, q54;
    EditText q3, q6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadViews();
    }

    private void loadViews() {
        q14 = (RadioButton) findViewById(R.id.answer14);

        q21 = (CheckBox) findViewById(R.id.answer21);
        q22 = (CheckBox) findViewById(R.id.answer22);
        q23 = (CheckBox) findViewById(R.id.answer23);
        q24 = (CheckBox) findViewById(R.id.answer24);

        q3 = (EditText) findViewById(R.id.answer3);

        q43 = (RadioButton) findViewById(R.id.answer43);

        q51 = (CheckBox) findViewById(R.id.answer51);
        q52 = (CheckBox) findViewById(R.id.answer52);
        q53 = (CheckBox) findViewById(R.id.answer53);
        q54 = (CheckBox) findViewById(R.id.answer54);

        q6 = (EditText) findViewById(R.id.answer6);
    }

    public void submit(View view) {
        checkResult();
        showResult();
    }

    private void checkResult() {
        if (q14.isChecked()) {
            points++;
        }
        if (q21.isChecked() && q22.isChecked() && q24.isChecked() && !q23.isChecked()) {
            points += 3;
        }

        Boolean check = q3.getText().toString().trim().contains("Perignon");
        if (check) {
            points++;
        }

        if (q43.isChecked()) {
            points++;
        }

        if (q51.isChecked() && q53.isChecked() && q54.isChecked() && !q52.isChecked()) {
            points += 3;
        }

        Boolean check2 = q6.getText().toString().trim().contains("Christmas");
        if (check2) {
            points++;
        }
    }

    private void showResult() {
        int result = (points * 100 / 10);
        if (points < 5) {
            Toast.makeText(getApplicationContext(), "Could be better your result is " + result + "% !", Toast.LENGTH_LONG).show();
        } else if (points <= 9) {
            Toast.makeText(getApplicationContext(), "Your result is " + result + "% it's amazing!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "You are the best " + result + "% Congratulation!", Toast.LENGTH_LONG).show();
        }

        points = 0;
        setContentView(R.layout.activity_main);
        loadViews();
    }
}
