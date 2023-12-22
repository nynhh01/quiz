package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quiz.Object.Data;
import com.example.quiz.Object.Setting;
import com.example.quiz.Object.ThemeAdapter;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class Frame2 extends AppCompatActivity {
    public static String KEY_F2_LV = "CAP_DO_KHO";
    public static String KEY_F2_THEME = "THE_LOAI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2);

        SetSize();

        ((TextView)findViewById(R.id.F2txtTotalScore)).setText(Data.getTotalScore() + "pts");

        ThemeAdapter adapter = new ThemeAdapter(Data.getListTheme());
        ListView listView = findViewById(R.id.F2list_subject);
        listView.setAdapter(adapter);

        findViewById(R.id.F2btnNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Frame2.this, Frame5.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2 = new Intent(Frame2.this, Frame3.class);
                intent2.putExtra(KEY_F2_LV, ((SwitchMaterial)findViewById(R.id.F2swCDK)).isChecked() ? 1 : 0);
                intent2.putExtra(KEY_F2_THEME, position);
                Toast.makeText(Frame2.this, Data.getListTheme().get(position).getName() + (((SwitchMaterial)findViewById(R.id.F2swCDK)).isChecked() ? 1 : 0), Toast.LENGTH_LONG).show();
                startActivity(intent2);
            }
        });
    }
    void SetSize(){
        ((TextView)findViewById(R.id.F2txtV1)).setTextSize(Setting.SIZE_TEXT_TITLE1);
        ((TextView)findViewById(R.id.F2txtTotalScore)).setTextSize(Setting.SIZE_TEXT_TITLE1);
        ((SwitchMaterial)findViewById(R.id.F2swCDK)).setTextSize(Setting.SIZE_TEXT_TITLE1);
        ((Button)findViewById(R.id.F2btnNext)).setTextSize(Setting.SIZE_TEXT_BUTTON);
    }
}