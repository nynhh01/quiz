package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quiz.Object.Data;
import com.example.quiz.Object.Question;
import com.example.quiz.Object.Setting;

import java.util.ArrayList;

public class Frame3 extends AppCompatActivity {
    public static String KEY_CODE_SCORE = "YOUR_SCORE";
    Question q;
    ArrayList<Question> questions;
    int score;
    int lv;
    int[] keyCodeAnswers = {R.id.F3rdi1, R.id.F3rdi2, R.id.F3rdi3, R.id.F3rdi4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame3);

        SetSize();

        score = 0;
        Intent t = getIntent();
        lv = t.getIntExtra(Frame2.KEY_F2_LV, 0);
        questions = Data.getQuestion(t.getIntExtra(Frame2.KEY_F2_THEME, 0), lv);
        if(questions.isEmpty())
            Toast.makeText(Frame3.this, "Dung", Toast.LENGTH_LONG).show();
        if(NewQuestion()) {
            findViewById(R.id.F3btnCheck).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int index = -1;
                    int id = ((RadioGroup) findViewById(R.id.F3rdiGroup)).getCheckedRadioButtonId();
                    for (int i = 0; i < 4; i++)
                        if (id == keyCodeAnswers[i]) {
                            index = i;
                            break;
                        }
                    if (index == q.getKey()) {
                        score += (lv + 1);
                        if(!NewQuestion()){
                            NextFrame4();
                            //((RadioGroup) findViewById(R.id.F3rdiGroup)).clearCheck();
                        }
                        //((RadioButton)findViewById(keyCodeAnswers[0])).setChecked(false);

                        //Toast.makeText(Frame3.this, "Dung", Toast.LENGTH_LONG).show();
                    } else {
                        NextFrame4();
                        //Toast.makeText(Frame3.this, "Sai", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }else{
            NextFrame4();
        }
    }
    Boolean NewQuestion(){
        if(questions.size() == 0) return false;
        q = questions.get(0);
        questions.remove(0);
        ((TextView)findViewById(R.id.F3txtQuestion)).setText(q.getQuestion());
        for(int i=0; i<4; i++) {
            RadioButton radioButton = findViewById(keyCodeAnswers[i]);
            radioButton.setText(q.getAnswer(i));
            //radioButton.setChecked(false);
        }
        ((RadioButton)findViewById(keyCodeAnswers[0])).setChecked(true);

        return true;
    }
    void SetSize(){
        ((TextView)findViewById(R.id.F3txtQuestion)).setTextSize(Setting.SIZE_TEXT_QUESTIONS);
        for(int i=0; i<4; i++){
            ((RadioButton)findViewById(keyCodeAnswers[i])).setTextSize(Setting.SIZE_TEXT_ANSWER);
        }
        ((Button)findViewById(R.id.F3btnCheck)).setTextSize(Setting.SIZE_TEXT_BUTTON);
    }
    void NextFrame4(){
        Intent intent = new Intent(Frame3.this, Frame4.class);
        intent.putExtra(KEY_CODE_SCORE, score);
        intent.putExtra(Frame2.KEY_F2_LV, lv);
        intent.putExtra(Frame2.KEY_F2_THEME, getIntent().getIntExtra(Frame2.KEY_F2_THEME, 0));
        startActivity(intent);
    }
}