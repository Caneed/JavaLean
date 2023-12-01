package com.studentManager.Utils;

import com.studentManager.Entity.School;
import com.studentManager.Entity.Student;
import com.studentManager.Enum.Gender;
import com.studentManager.Enum.Grade;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 学生查找类
 */
public class StudentQuery {
    /**
     * 通过性别查找学生
     *
     * @param gender 性别
     * @return 返回学生集合
     */
    public List<Student> queryStudentByGender(School school, Gender gender) {
        return school.getStudents().stream().filter(student -> student.getGender() == gender).collect(Collectors.toList());
    }

    /**
     * 通过年龄查找学生
     *
     * @param school
     * @param age
     * @return 符合条件的学生
     */
    public List<Student> queryStudentByAge(School school, int age) {
        return school.getStudents().stream().filter(student -> student.getAge() == age).collect(Collectors.toList());
    }

    /**
     * 查找一个年级的学生
     *
     * @param school
     * @param grade
     * @return 返回符合条件的学生集合
     */
    public List<Student> queryStudentByGrade(School school, Grade grade) {
        return school.getStudents().stream().filter(student -> student.getGrade() == grade).collect(Collectors.toList());
    }

    /**
     * 通过姓名查找学生
     *
     * @param school
     * @param name
     * @return 返回符合条件的学生
     */
    public List<Student> queryStudentByName(School school, String name) {
        return school.getStudents().stream().filter(student -> student.getName() == name).collect(Collectors.toList());
    }

    public List<Student> queryStudentById(School school, String id) {
        return school.getStudents().stream().filter(student -> student.getId() == id).collect(Collectors.toList());
    }
}
