package com.studentManager.Enum;

/**
 * @enum
 * 科目的枚举
 */
public enum SubjectName {
    MATH("数学"),
    CHINESE("语文"),
    ENGLISH("英语"),
    CHEMISTRY("化学"),
    PHYSICS("物理"),
    BIOLOGY("生物");


    private String subject;

    SubjectName(String subject) {
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
