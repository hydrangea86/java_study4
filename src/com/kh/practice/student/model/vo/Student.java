package com.kh.practice.student.model.vo;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Student {
    private String name; //이름
    private String subject; //과목
    private int score; //점수

    public Student() {

    }

    public Student(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //학생 필드 정보를 합쳐서 반환
    public String infrom() {
        // return "이름: " + this.name + "/ 과목: " + this.subject + "/ 점수: " + this.score );// int: 0 double: 0.0 String: null
        return String.format("이름: %s / 과목: %s / 점수: %d", this.name, this,subject, this.score);
    }
}
