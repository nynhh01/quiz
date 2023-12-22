package com.example.quiz.Object;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question {
    String id;
    String question;
    ArrayList<String> answers;
    int key;
    int level;
    int theme;
    public Question(){
        this.id = "";
        this.question = "";
        this.answers.add("");
        this.answers.add("");
        this.answers.add("");
        this.answers.add("");
        this.key = 0;
        this.level = 0;
        this.theme = 0;
    }
    public Question(String id, String question, ArrayList<String> answers, int key, int level, int theme) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.key = key;
        this.level = level;
        this.theme = theme;
    }
    public Question(String id, String question, String[] answers, int key, int level, int theme) {
        this.id = id;
        this.question = question;
        this.answers = new ArrayList<>(Arrays.asList(answers));
        this.key = key;
        this.level = level;
        this.theme = theme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswer() {
        return answers;
    }
    public String getAnswer(int i){
        return answers.get(i);
    }
    public void setAnswer(ArrayList<String> answer) {
        this.answers = answer;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getTheme(){return theme;}
    public  Boolean checkAnswer(int value){
        return value == key;
    }
    public void randomAnswer(){
        String stringResult = answers.get(key);
        Collections.shuffle(answers);
        key = answers.indexOf(stringResult);
    }
}
