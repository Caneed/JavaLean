package com.studentManager.Entity;

import java.util.ArrayList;

/**
 * @class 学校类
 */
public class School {
    //    学生集合
    ArrayList<Student> students;

    public School() {
        this.students = new ArrayList<Student>();
    }

    public School(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
