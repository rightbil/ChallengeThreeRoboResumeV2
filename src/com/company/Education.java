package com.company;
public class Education {
    public Education(String universityName, String graduatingYear, String degreeType, String major) {
        this.universityName = universityName;
        this.graduatingYear = graduatingYear;
        this.degreeType = degreeType;
        this.major = major;
    }
    private String universityName;
    private String graduatingYear;
    private String degreeType;
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
    public String getDegreeType() {
        return degreeType;
    }
    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
}
