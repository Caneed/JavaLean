package com.studentManager.Entity;

import com.studentManager.Enum.Gender;
import com.studentManager.Enum.Grade;

import java.util.ArrayList;

public class Student {
    //    学号，年龄，姓名，性别，年级，科目
    String id;
    int age;
    String name;
    Gender gender;
    Grade grade;

    ArrayList<Subject> subject;

    public Student(String id, int age, String name, Gender gender, Grade grade, ArrayList<Subject> subject) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }
}
