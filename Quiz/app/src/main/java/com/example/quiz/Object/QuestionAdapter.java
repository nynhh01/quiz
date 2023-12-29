package com.example.quiz.Object;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quiz.R;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionAdapter extends BaseAdapter {
    ArrayList<Question> questions;
    public QuestionAdapter(ArrayList<Question> x){
        questions = new ArrayList<Question>();
        for(int i=0; i<x.size(); i++)
            questions.add(x.get(i));
        Collections.shuffle(questions);
    }
    public void setQuestions(ArrayList<Question> x){
        questions.clear();
        for(int i=0; i<x.size(); i++)
            questions.add(x.get(i));
        Collections.shuffle(questions);
    }
    public String getID(int i){
        return questions.get(i).getId();
    }
    @Override
    public int getCount() {
        return questions.size();
    }
    @Override
    public Object getItem(int position) {
        return questions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View resultView;

        if(view != null)
            resultView = view;
        else
            resultView = View.inflate(viewGroup.getContext(), R.layout.item_question, null);

        Question question = questions.get(i);
        ((TextView)resultView.findViewById(R.id.textQuestionItem)).setText("Câu " + (i + 1) + ". " + question.getQuestion());
        ((TextView)resultView.findViewById(R.id.textQuestionItem)).setTextSize(Setting.SIZE_TEXT_NORMAL);
        return resultView;
    }
}
