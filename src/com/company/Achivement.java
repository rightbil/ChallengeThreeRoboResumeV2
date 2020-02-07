package com.company;

public class Achivement {

    public Achivement(String universityName, String graduatingYear, String degree, String major) {
        this.universityName = universityName;
        this.graduatingYear = graduatingYear;
        this.degree = degree;
        this.major = major;
    }

    private String universityName;
    private String graduatingYear;
    private String degree;
    private String major;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGraduatingYear() {
        return graduatingYear;
    }

    public void setGraduatingYear(String graduatingYear) {
        this.graduatingYear = graduatingYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
