package com.example.demo.domain;

public class Student {

    private String s_id;
    private String s_name;
    private String s_sex;
    private String s_college;
    private String s_class;
    private String s_score;
    private String S_number;
    private String s_password;
    private String s_age;

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_college() {
        return s_college;
    }

    public void setS_college(String s_college) {
        this.s_college = s_college;
    }

    public String getS_class() {
        return s_class;
    }

    public void setS_class(String s_class) {
        this.s_class = s_class;
    }

    public String getS_score() {
        return s_score;
    }

    public void setS_score(String s_score) {
        this.s_score = s_score;
    }

    public String getS_number() {
        return S_number;
    }

    public void setS_number(String s_number) {
        S_number = s_number;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public String getS_age() {
        return s_age;
    }

    public void setS_age(String s_age) {
        this.s_age = s_age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id='" + s_id + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_college='" + s_college + '\'' +
                ", s_class='" + s_class + '\'' +
                ", s_score='" + s_score + '\'' +
                ", S_number='" + S_number + '\'' +
                ", s_password='" + s_password + '\'' +
                ", s_age='" + s_age + '\'' +
                '}';
    }
}
