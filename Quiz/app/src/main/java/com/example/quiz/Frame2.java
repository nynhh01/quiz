package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.quiz.Object.Setting;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class Frame2 extends AppCompatActivity {
    public static String KEY_F2 = "CAP_DO_KHO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2);

        SetSize();

        findViewById(R.id.F2btnNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Frame2.this, Frame5.class);
                startActivity(intent);
            }
        });
    }
    void UpdateLevel(Intent x){
        x.putExtra(KEY_F2, ((SwitchMaterial)findViewById(R.id.F2swCDK)).isChecked() ? 1 : 0);
    }
    void SetSize(){
        ((TextView)findViewById(R.id.F2txtV1)).setTextSize(Setting.SIZE_TEXT_TITLE1);
        ((TextView)findViewById(R.id.F2txtTotalScore)).setTextSize(Setting.SIZE_TEXT_TITLE1);
        ((SwitchMaterial)findViewById(R.id.F2swCDK)).setTextSize(Setting.SIZE_TEXT_TITLE1);
        ((Button)findViewById(R.id.F2btnNext)).setTextSize(Setting.SIZE_TEXT_BUTTON);
    }
}