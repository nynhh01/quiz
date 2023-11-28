package com.example.quiz.Object;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Question implements Parcelable {
    String id;
    String question;
    ArrayList<String> answers;
    int key;
    Level level;

    public Question(String id, String question, ArrayList<String> answers, int key, Level level) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.key = key;
        this.level = level;
    }

    protected Question(Parcel in) {
        id = in.readString();
        question = in.readString();
        answers = in.createStringArrayList();
        key = in.readInt();
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

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

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
    public  Boolean checkAnswer(int value){
        return value == key;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(question);
        dest.writeArray(answers.toArray());
        dest.writeInt(key);
        dest.writeValue(level);
    }
}
