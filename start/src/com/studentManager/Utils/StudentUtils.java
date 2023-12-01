package com.studentManager.Utils;

import com.studentManager.Entity.Student;
import com.studentManager.Entity.Subject;
import com.studentManager.Enum.Gender;
import com.studentManager.Enum.Grade;

import java.util.ArrayList;

public class StudentUtils {
    /**
     * 创建学生
     *
     * @param id
     * @param age
     * @param name
     * @param gender
     * @param grade
     * @param subjects
     * @return
     */
    public Student createStudent(String id, int age, String name, Gender gender, Grade grade, ArrayList<Subject> subjects) {
        Student student = new Student(id,age, name, gender, grade, subjects);
        return student;
    }
}
