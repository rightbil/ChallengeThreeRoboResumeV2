package com.company;
import java.util.ArrayList;
public class ResumeDB {
    private ArrayList<Resume> resumes;
    public ResumeDB() {
    }
    public ArrayList<Resume> getResumes() {
        return resumes;
    }
    public void setResumes(ArrayList<Resume> resumes) {
        this.resumes = resumes;
    }

    public void info() {
        for (Resume r : getResumes()) {
            System.out.println(r.getEmailAddress());
            System.out.println(r.getPhoneNumber());

            System.out.println();
            System.out.println();

            System.out.println("\n Education");
            System.out.println("==========");
            for (Education a : r.getListOfEducation()) {
                System.out.println(a.getDegreeType());
                System.out.println(a.getUniversityName() + "," + a.getGraduatingYear());
            }
            System.out.println("\n Experience");
            System.out.println("==========");
            for (Experience e : r.getListOfExperiences()) {
                System.out.println(e.getJobTitle());
                System.out.println(e.getCompany() + " from " + e.getStartDate() + "_" + e.getEndDate());
                for (String s : e.getDuties()) {
                    System.out.println(s);

                }
            }
            System.out.println("\n Skills");
            System.out.println("==========");
            for (Skill s : r.getListOfSkills()) {
                System.out.println(s.getSkill());
            }
        }
    }
}
