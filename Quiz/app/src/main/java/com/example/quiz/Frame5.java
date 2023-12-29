package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quiz.Object.Data;
import com.example.quiz.Object.QuestionAdapter;
import com.example.quiz.Object.Setting;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class Frame5 extends AppCompatActivity {
    public static String KEY_F5 = "ID_QUESTIONS";
    ArrayList<String> nameTitles;
    TextInputLayout textField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame5);
        //Data.InitQuestions();
        InitName();

        textField = findViewById(R.id.F5txtInputField);
        ((MaterialAutoCompleteTextView) textField.getEditText()).setSimpleItems(nameTitles.toArray(new String[nameTitles.size()]));
        MaterialAutoCompleteTextView autoCompleteTextView = (MaterialAutoCompleteTextView) textField.getEditText();
        QuestionAdapter adapter = new QuestionAdapter(Data.getQuestion());
        ListView listView = findViewById(R.id.F5list_question);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2 = new Intent(Frame5.this, Frame6.class);
                intent2.putExtra(KEY_F5, adapter.getID(position));
                //Toast.makeText(Frame5.this, adapter.getID(position), Toast.LENGTH_LONG).show();

                startActivity(intent2);
            }
        });

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int p, long id) {
                String value = ((AutoCompleteTextView) findViewById(R.id.F5txtView2)).getText().toString();
                int position = nameTitles.indexOf(value);
                adapter.setQuestions(Data.getQuestion(position));
                adapter.notifyDataSetChanged();
                listView.setAdapter(adapter);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        if(Data.getQuestion().size() == 0){
            Data.InitQuestions();
        }
        QuestionAdapter adapter = new QuestionAdapter(Data.getQuestion());
        ListView listView = findViewById(R.id.F5list_question);
        listView.setAdapter(adapter);

    }
    void InitName(){
        nameTitles = new ArrayList<String>();
        int size = Data.getListTheme().size();
        //Toast.makeText(Frame5.this, size + "", Toast.LENGTH_LONG).show();
//        for(int i=0; i<Data.getQuestion(0).size(); i++)
//            Toast.makeText(Frame5.this, Data.getQuestion(0).get(i).getId(), Toast.LENGTH_LONG).show();
        for(int i=0; i<size; i++)
            nameTitles.add(Data.getListTheme().get(i).getName());
    }
    void SetSize(){
        ((TextView)findViewById(R.id.F5txt1)).setTextSize(Setting.SIZE_TEXT_TITLE1);
    }
}