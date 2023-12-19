package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.quiz.Object.Question;

public class Frame3 extends AppCompatActivity {
    public static String KEY_CODE_SCORE = "YOUR_SCORE";
    Question q;
    int score;
    int[] keyCodeAnswers = {R.id.F3rdi1, R.id.F3rdi2, R.id.F3rdi3, R.id.F3rdi4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame3);
        score = 0;
        NewQuestion();
        findViewById(R.id.F3btnCheck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = -1;
                int id = ((RadioGroup)findViewById(R.id.F3rdiGroup)).getCheckedRadioButtonId();
                for(int i=0; i<4; i++)
                    if(id == keyCodeAnswers[i]){
                        index = i;
                        break;
                    }
                if(index == q.getKey()){
                    score++;
                    NewQuestion();
                }else{
                    Intent intent = new Intent(Frame3.this, Frame4.class);
                    intent.putExtra(KEY_CODE_SCORE, score);
                    startActivity(intent);
                }
            }
        });
    }
    void NewQuestion(){
        ((TextView)findViewById(R.id.F3txtQuestion)).setText(q.getQuestion());
        for(int i=0; i<4; i++){
            ((CheckBox)findViewById(keyCodeAnswers[i])).setText(q.getAnswer(i));
        }
    }
}