package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidate {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private ArrayList<String> achivement;
    private String major;
    private String universityName;
    private String graduatingYear;
    private ArrayList<Experience> listOfExperiences; //experience


    public Candidate() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<String> getAchivement() {
        return achivement;
    }

    public void setAchivement(ArrayList<String> achivement) {
        this.achivement = achivement;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

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

    public ArrayList<Experience> getListOfExperiences() {
        return listOfExperiences;
    }

    public void setListOfExperiences(ArrayList<Experience> listOfExperiences) {
        this.listOfExperiences = listOfExperiences;
    }

    public void addCandidate() {
        // candidate
        Scanner sc = new Scanner(System.in);
        ArrayList<String> localAchivments = new ArrayList<>();
        // Expericance
        String company;
        String jobTitle;
        String startDate;
        String endDate;
        ArrayList<String> jobDescription;
        ArrayList<String> skills;
        Experience e;
        String wantToContinue = "Y";
        ArrayList<Experience> userExperienceList = new ArrayList<>();
        // (1) firstName
        System.out.println("Candidate Biography information");
        System.out.println("Enter first name");
        setFirstName(sc.nextLine());
        // (2) lastName
        System.out.println("Enter last name");
        setLastName(sc.nextLine());
        // (2) emailAddress
        System.out.println("Enter email Address");
        setEmailAddress(sc.nextLine());
        while (true) {
            System.out.println("Enter achivements {Associate,Bachlor...PhD");
            localAchivments.add(sc.nextLine());

            System.out.println("Continue adding achivement Y/N");
            if (!sc.nextLine().equalsIgnoreCase("Y")) break;
        }
        setAchivement(localAchivments);
        // (3) major
        System.out.println("Enter major");
        setMajor(sc.nextLine());
        // (4) university Name
        System.out.println("Enter University name");
        setUniversityName(sc.nextLine());
        // (5) graduating year
        System.out.println("Enter graduating year");
        setGraduatingYear(sc.nextLine());
        System.out.println("Press enter to continue");
        //sc.nextLine();
        //System.out.println("Personal info saved. Add experiences");
        addExperience();
    }
    public void addExperience() //experience
    {

        // candidate
        Scanner sc = new Scanner(System.in);
       // sc.nextLine();
        ArrayList<String> localAchivments = new ArrayList<>();
        // Expericance
        String company;
        String jobTitle;
        String startDate;
        String endDate;
        ArrayList<String> jobDescription;
        ArrayList<String> skills;
        Experience e;
        String wantToContinue = "Y";
        ArrayList<Experience> userExperienceList = new ArrayList<>();
        // (6) Experiance infomation
        //System.out.println("Enter Work Experiance:");// for " + this.getFirstName() + " " + this.getLastName());
        boolean addMoreExperiance = true;
        while (addMoreExperiance) {
            //for every expreriance
            jobDescription = new ArrayList<>();
            skills = new ArrayList<>();
            sc.nextLine();
            // 6.1 company
            System.out.println("Enter company");
            company = sc.nextLine();
            // 6.2 Jobtitle
            System.out.println("Enter Job Title");
            jobTitle = sc.nextLine();
           // 6.3 startDate
            System.out.println("Enter startDate");
            startDate = sc.nextLine();
            //6.4 endDate
            System.out.println("Enter end Date");
            endDate = sc.nextLine();
            //6.5 job description needs while loop
            boolean addMoreJobDescription = true;
            while (addMoreJobDescription) {
                System.out.println("Enter Job description");
                jobDescription.add(sc.nextLine());
                System.out.println("Continue adding description ? Y/N");
                if (!sc.nextLine().equalsIgnoreCase("Y")) {
                    addMoreJobDescription = false;
                }

            }

            //6.6 Add while loop for multiple entry
            boolean addMoreSkill = true;
            while (addMoreSkill) {
                System.out.println("Enter skill");
                skills.add(sc.nextLine());

                System.out.println("Continue adding skills ? Y/N");
                if (!sc.nextLine().equalsIgnoreCase("Y")) {
                    addMoreSkill = false;
                }
            }
             // add more experiance

            e = new Experience(company, jobTitle, startDate, endDate, jobDescription, skills);
            System.out.println("display expricance" + e.getStartDate());
            userExperienceList.add(e);

            System.out.println("Continue another job experiance? Y/N");
            if (!sc.nextLine().equalsIgnoreCase("Y")) {
                addMoreExperiance = false;
            }

        }// for each expericance outer while loop ends here
        // 7 adding the Experiancce / s to the Candidate
        setListOfExperiences(userExperienceList);

    }// end of add candidate

    @Override
    public String toString() {
        return "Candidate{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", achivement=" + achivement +
                ", major='" + major + '\'' +
                ", universityName='" + universityName + '\'' +
                ", graduatingYear='" + graduatingYear + '\'' +
                ", candidateExperiances=" + listOfExperiences +
                '}';
    }
}
