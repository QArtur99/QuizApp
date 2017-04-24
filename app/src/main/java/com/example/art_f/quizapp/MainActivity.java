package com.example.art_f.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int points;
    public void submit(View view) {
        RadioButton q14 = (RadioButton) findViewById(R.id.answer14);
        if(q14.isChecked()){
            points++;
            q14.setChecked(false);
        }
        CheckBox q21 = (CheckBox) findViewById(R.id.answer21);
        if(q21.isChecked()){
            points++;
            q21.setChecked(false);
        }
        CheckBox q22 = (CheckBox) findViewById(R.id.answer22);
        if(q22.isChecked()){
            points++;
            q22.setChecked(false);
        }
        CheckBox q24 = (CheckBox) findViewById(R.id.answer24);
        if(q24.isChecked()){
            points++;
            q24.setChecked(false);
        }
        EditText q3 = (EditText) findViewById(R.id.answer3);
        Boolean check = q3.getText().toString().contains("Perignon");
        if(check){
            points++;
            q3.setText("");

        }
        RadioButton q43 = (RadioButton) findViewById(R.id.answer43);
        if(q43.isChecked()){
            points++;
            q43.setChecked(false);
        }
        CheckBox q51 = (CheckBox) findViewById(R.id.answer51);
        if(q51.isChecked()){
            points++;
            q51.setChecked(false);
        }
        CheckBox q53 = (CheckBox) findViewById(R.id.answer53);
        if(q53.isChecked()){
            points++;
            q53.setChecked(false);
        }
        CheckBox q54 = (CheckBox) findViewById(R.id.answer54);
        if(q54.isChecked()){
            points++;
            q54.setChecked(false);
        }
        EditText q6 = (EditText) findViewById(R.id.answer6);
        Boolean check2 = q6.getText().toString().contains("Christmas");
        if(check2){
            points++;
            q6.setText("");
        }
        int  result = (points*100/10);
        if(points < 5){
            Toast.makeText(getApplicationContext(), "Could be better your result is " + result + "% !", Toast.LENGTH_LONG).show();
        }else if(points<=9){
            Toast.makeText(getApplicationContext(), "Your result is " + result + "% it's amazing!", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(), "You are the best " + result + "% Congratulation!", Toast.LENGTH_LONG).show();
        }


        RadioButton q11 = (RadioButton) findViewById(R.id.answer11);
        RadioButton q12 = (RadioButton) findViewById(R.id.answer12);
        RadioButton q13 = (RadioButton) findViewById(R.id.answer13);
        RadioButton q41 = (RadioButton) findViewById(R.id.answer41);
        RadioButton q42 = (RadioButton) findViewById(R.id.answer42);
        RadioButton q44 = (RadioButton) findViewById(R.id.answer44);
        q11.setChecked(false);
        q12.setChecked(false);
        q13.setChecked(false);
        q41.setChecked(false);
        q42.setChecked(false);
        q44.setChecked(false);

        CheckBox q23 = (CheckBox) findViewById(R.id.answer23);
        q23.setChecked(false);
        CheckBox q52 = (CheckBox) findViewById(R.id.answer52);
        q52.setChecked(false);
        points = 0;
    }
}
