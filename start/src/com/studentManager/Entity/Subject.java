package com.studentManager.Entity;

import com.studentManager.Enum.SubjectName;

/**
 * @class
 * 科目类
 */
public class Subject {
    private SubjectName subjectName;

    private int score;

    Subject(SubjectName subjectName, int score){
        this.subjectName=subjectName;
        this.score=score;
    }

    public SubjectName getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(SubjectName subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
