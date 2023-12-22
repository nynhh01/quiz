package com.example.quiz.Object;

import java.util.ArrayList;

public class Theme {
    String id;
    int picture;
    String name;
    String information;
    ArrayList<Question> questions;

    public Theme(String id, int picture, String name, String information) {
        this.id = id;
        this.picture = picture;
        this.name = name;
        this.information = information;
        this.questions = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public int getPicture() {
        return picture;
    }
    public void setPicture(int picture) {
        this.picture = picture;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    public void addQuestion(Question x){
        for(Question i : questions)
            if(i.id == x.id)
                return;
        questions.add(x);
    }
}
