package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Frame4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame4);

        Intent intent = getIntent();

        ((TextView)findViewById(R.id.F4txtScore)).setText(intent.getIntExtra(Frame3.KEY_CODE_SCORE, 0));

        findViewById(R.id.F4btnF1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(Frame4.this, MainActivity.class);
                startActivity(t);
            }
        });

        findViewById(R.id.F4btnF3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(Frame4.this, Frame3.class);
                startActivity(t);
            }
        });

        findViewById(R.id.F4btnShare).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}