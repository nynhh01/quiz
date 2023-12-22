package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.quiz.Object.Data;
import com.example.quiz.Object.Setting;

import java.util.ArrayList;
import java.util.List;

public class Frame4 extends AppCompatActivity {

    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame4);

        SetSize();
        Intent intent = getIntent();
        score = intent.getIntExtra(Frame3.KEY_CODE_SCORE, 0);
        ((TextView)findViewById(R.id.F4txtScore)).setText(score + "");

        Data.setTotalScore(intent.getIntExtra(Frame3.KEY_CODE_SCORE, 0) + Data.getTotalScore());
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
                Intent intent2 = new Intent(Frame4.this, Frame3.class);
                intent2.putExtra(Frame2.KEY_F2_LV, getIntent().getIntExtra(Frame2.KEY_F2_LV, 0));
                intent2.putExtra(Frame2.KEY_F2_THEME, getIntent().getIntExtra(Frame2.KEY_F2_THEME, 0));
                startActivity(intent2);
            }
        });

        findViewById(R.id.F4btnShare).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Điểm số của bạn là " + score);

                // Tạo danh sách các Intent để chia sẻ với Messenger, Zalo, Facebook và Gmail
                List<Intent> shareIntents = new ArrayList<>();

                // Intent cho Messenger
                Intent messengerIntent = new Intent(Intent.ACTION_SEND);
                messengerIntent.setType("text/plain");
                messengerIntent.setPackage("com.facebook.orca");
                messengerIntent.putExtra(Intent.EXTRA_TEXT, "Điểm số của bạn là " + score);
                shareIntents.add(messengerIntent);

                // Intent cho Zalo
                Intent zaloIntent = new Intent(Intent.ACTION_SEND);
                zaloIntent.setType("text/plain");
                zaloIntent.setPackage("com.zing.zalo");
                zaloIntent.putExtra(Intent.EXTRA_TEXT, "Điểm số của bạn là " + score);
                shareIntents.add(zaloIntent);

                // Intent cho Facebook
                Intent facebookIntent = new Intent(Intent.ACTION_SEND);
                facebookIntent.setType("text/plain");
                facebookIntent.setPackage("com.facebook.katana");
                facebookIntent.putExtra(Intent.EXTRA_TEXT, "Điểm số của bạn là " + score);
                shareIntents.add(facebookIntent);

                // Intent cho Gmail
                Intent gmailIntent = new Intent(Intent.ACTION_SEND);
                gmailIntent.setType("text/plain");
                gmailIntent.setPackage("com.google.android.gm");
                gmailIntent.putExtra(Intent.EXTRA_TEXT, "Điểm số của bạn là " + score);
                shareIntents.add(gmailIntent);

                Intent chooserIntent = Intent.createChooser(shareIntent, "Chia sẻ đến");
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, shareIntents.toArray(new Parcelable[shareIntents.size()]));

                // Mở menu chia sẻ
                startActivity(chooserIntent);
            }
        });
    }
    void SetSize(){
        ((TextView)findViewById(R.id.F4txt1)).setTextSize(Setting.SIZE_TEXT_TITLE1);
        ((Button)findViewById(R.id.F4btnShare)).setTextSize(Setting.SIZE_TEXT_BUTTON);
        ((Button)findViewById(R.id.F4btnF1)).setTextSize(Setting.SIZE_TEXT_BUTTON);
        ((Button)findViewById(R.id.F4btnF3)).setTextSize(Setting.SIZE_TEXT_BUTTON);
    }
}