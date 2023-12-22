package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.quiz.Object.Data;
import com.example.quiz.Object.Setting;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetSize();
        Data.InitQuestions();
        findViewById(R.id.F1bntStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Frame2.class);
                startActivity(intent);
            }
        });
    }
    void SetSize(){
        ((TextView)findViewById(R.id.F1txtName)).setTextSize(Setting.SIZE_TEXT_TITLE2);
        ((TextView)findViewById(R.id.F1txtInformation)).setTextSize(Setting.SIZE_TEXT_NORMAL);
        ((Button)findViewById(R.id.F1bntStart)).setTextSize(Setting.SIZE_TEXT_BUTTON);
    }
}