package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;

import com.example.quiz.Object.Data;
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

        q = Data.findQuestion(intent.getStringExtra(Frame5.KEY_F5));
        if(q == null){
            Toast.makeText(Frame6.this, (Data.getQuestion() == null ? "NULL" : Data.getQuestion().size() + ""), Toast.LENGTH_LONG).show();
            Data.InitQuestions();
            q = Data.findQuestion(intent.getStringExtra(Frame5.KEY_F5));
            //Toast.makeText(Frame6.this, intent.getStringExtra(Frame5.KEY_F5).toString(), Toast.LENGTH_LONG).show();
            //return;
        }
        ((TextView)findViewById(R.id.F6txtQuestion)).setText(q.getQuestion());
        for(int i=0; i<4; i++){
            ((TextView)findViewById(keyCodeAnswers[i])).setText(q.getAnswer(i));
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