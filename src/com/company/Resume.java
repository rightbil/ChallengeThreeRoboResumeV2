package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Resume {
    public final String YES = "Y";
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private ArrayList<Education> listOfEducation;
    private ArrayList<Experience> listOfExperiences;
    private ArrayList<Skill> listOfSkills;

    public Resume() {
    }

    public Resume(String fullName, String phoneNumber, String emailAddress, ArrayList<Education> listOfEducationalAchievement, ArrayList<Experience> listOfExperiences, ArrayList<Skill> listOfSkills) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.listOfEducation = listOfEducationalAchievement;
        this.listOfExperiences = listOfExperiences;
        this.listOfSkills = listOfSkills;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<Education> getListOfEducation() {
        return listOfEducation;
    }

    public void setListOfEducation(ArrayList<Education> listOfEducation) {
        this.listOfEducation = listOfEducation;
    }

    public ArrayList<Experience> getListOfExperiences() {
        return listOfExperiences;
    }

    public void setListOfExperiences(ArrayList<Experience> listOfExperiences) {
        this.listOfExperiences = listOfExperiences;
    }

    public ArrayList<Skill> getListOfSkills() {
        return listOfSkills;
    }

    public void setListOfSkills(ArrayList<Skill> listOfSkills) {
        this.listOfSkills = listOfSkills;
    }

    public ArrayList<Education> addEducationToResume() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Education> listOfEducation = new ArrayList<>();
        String universityName;
        String graduatingYear;
        String degree;
        String major;
        Education a;
        boolean addMoreAchievement = true;
        System.out.println("Enter education");
        while (addMoreAchievement) {
            System.out.println("university name>>");
            universityName = sc.nextLine();
            System.out.println("graduating year>>");
            graduatingYear = sc.nextLine();
            System.out.println("degree Type>>");
            degree = sc.nextLine();
            System.out.println("major>>");
            major = sc.nextLine();
            a = new Education(universityName, graduatingYear, degree, major);
            listOfEducation.add(a);
            System.out.println("More education Y/N");
            if (!sc.nextLine().equalsIgnoreCase(YES)) {
                break;
            }
        }
        return listOfEducation;
    }

    public ArrayList<Experience> addExperienceToResume() {
        Scanner sc = new Scanner(System.in);
        String company;
        String jobTitle;
        String startDate;
        String endDate;
        ArrayList<String> duties = new ArrayList<>();
        ArrayList<Experience> listOfExperiences = new ArrayList<>();
        Experience e;
        System.out.println("Enter Experience");
        boolean addMoreExperience = true;
        while (addMoreExperience) {
            // company
            System.out.println("company>>");
            company = sc.nextLine();
            // 2 Job Title
            System.out.println("job title>>");
            jobTitle = sc.nextLine();
            // 3 startDate
            System.out.println("start Date>>");
            startDate = sc.nextLine();
            //4 endDate
            System.out.println("end Date>>");
            endDate = sc.nextLine();
            //5 description
            boolean addMoreduty = true;
            while (addMoreduty) {
                System.out.println("duty>>");
                duties.add(sc.nextLine());
                System.out.println("More duty Y/N");
                if (!sc.nextLine().equalsIgnoreCase(YES)) {
                    addMoreduty = false;
                }
            }

            e = new Experience(company, jobTitle, startDate, endDate, duties);
            listOfExperiences.add(e);
            System.out.println("More experience Y/N");
            if (!sc.nextLine().equalsIgnoreCase(YES)) {
                break;
            }
        }


        return listOfExperiences;
    }

    public ArrayList<Skill> addSkillToResume() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Skill> listOfSkills = new ArrayList<>();
        String skill;
        Skill currentSkill;
        System.out.println("Enter skill ");
        while (true) {
            System.out.println("skill & ratings>>");
            skill = sc.nextLine();
            currentSkill = new Skill(skill);
            listOfSkills.add(currentSkill);
            System.out.println("More skills Y/N");
            if (!sc.nextLine().equalsIgnoreCase(YES)) {
                break;
            }
        }
        return listOfSkills;
    }

    public ArrayList<Resume> addResume() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Resume> resumes = new ArrayList<>();
        Resume currentResume = null;
        // 1 fullName
        System.out.println("Welcome to ResumeApp:");
        System.out.println("full name>>");
        fullName = sc.nextLine();
        // 2  phone number
        System.out.println("phone number>>");
        phoneNumber = sc.nextLine();
        // 3 emailAddress
        System.out.println("email Address>>");
        emailAddress = sc.nextLine();
        currentResume = new Resume();
        currentResume.setFullName(fullName);
        currentResume.setPhoneNumber(phoneNumber);
        currentResume.setEmailAddress(emailAddress);
        currentResume.setListOfEducation(addEducationToResume());
        currentResume.setListOfExperiences(addExperienceToResume());
        currentResume.setListOfSkills(addSkillToResume());
        resumes.add(currentResume);
        return resumes;
    }

}

