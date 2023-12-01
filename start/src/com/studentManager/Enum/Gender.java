package com.studentManager.Enum;

public enum Gender {
    MALE("男生"),
    FEMALE("女生");
    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
