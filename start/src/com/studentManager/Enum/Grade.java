package com.studentManager.Enum;

public enum Grade {
    GRADE_SEVEN("初一"),
    GRADE_EIGHT("初二"),
    GRADE_NINE("初三"),
    GRADE_TEN("高一"),
    GRADE_ELEVEN("高二"),
    GRADE_TWELVE("高三");

    private String grade;
    Grade(String grade){
        this.grade=grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
