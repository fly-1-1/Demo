package com.example.demo.domain;

public class Teacher {

    private String  t_id;
    private String t_name;
    private String t_sex;
    private String t_college;
    private String t_address;
    private String t_number;
    private String t_password;
    private String t_age;

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_sex() {
        return t_sex;
    }

    public void setT_sex(String t_sex) {
        this.t_sex = t_sex;
    }

    public String getT_college() {
        return t_college;
    }

    public void setT_college(String t_college) {
        this.t_college = t_college;
    }

    public String getT_address() {
        return t_address;
    }

    public void setT_address(String t_address) {
        this.t_address = t_address;
    }

    public String getT_number() {
        return t_number;
    }

    public void setT_number(String t_number) {
        this.t_number = t_number;
    }

    public String getT_password() {
        return t_password;
    }

    public void setT_password(String t_password) {
        this.t_password = t_password;
    }

    public String getT_age() {
        return t_age;
    }

    public void setT_age(String t_age) {
        this.t_age = t_age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id='" + t_id + '\'' +
                ", t_name='" + t_name + '\'' +
                ", t_sex='" + t_sex + '\'' +
                ", t_college='" + t_college + '\'' +
                ", t_address='" + t_address + '\'' +
                ", t_number='" + t_number + '\'' +
                ", t_password='" + t_password + '\'' +
                ", t_age='" + t_age + '\'' +
                '}';
    }
}
