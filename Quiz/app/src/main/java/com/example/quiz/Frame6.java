package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.graphics.Color;

import com.example.quiz.Object.Question;

public class Frame6 extends AppCompatActivity {
    Question q;
    String[] colors = {"#00BCD4", "#f05c5c"};
    int[] keyCodeAnswers = {R.id.F6txtAnswer1, R.id.F6txtAnswer2, R.id.F6txtAnswer3, R.id.F6txtAnswer4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame6);
        Intent intent = getIntent();

        ((TextView)findViewById(R.id.F6txtQuestion)).setText(q.getQuestion());
        for(int i=0; i<4; i++){
            ((CheckBox)findViewById(keyCodeAnswers[i])).setText(q.getAnswer(i));
        }
        ((TextView)findViewById(R.id.F6txtKey)).setText(q.getAnswer(q.getKey()));
        if(q.getLevel() == 0){
            ((Button)findViewById(R.id.F6btnLevel)).setText("Dễ");
            ((Button)findViewById(R.id.F6btnLevel)).setBackgroundColor(Color.parseColor(colors[0]));
        }else{
            ((Button)findViewById(R.id.F6btnLevel)).setText("Khó");
            ((Button)findViewById(R.id.F6btnLevel)).setBackgroundColor(Color.parseColor(colors[1]));
        }
    }
}