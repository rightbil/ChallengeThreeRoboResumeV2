package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidate {
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private ArrayList<Achivement> listOfAchivement;
    private ArrayList<Experience> listOfExperiences;
    private ArrayList<Skill> listOfSkills;

    public Candidate(){

        listOfAchivement= new ArrayList<>();
        listOfExperiences = new ArrayList<>();
        listOfSkills = new ArrayList<>();
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

    public ArrayList<Achivement> getListOfAchivement() {
        return listOfAchivement;
    }

    public void setListOfAchivement(ArrayList<Achivement> listOfAchivement) {
        this.listOfAchivement = listOfAchivement;
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

    public void addCandidate() {
    Scanner sc = new Scanner(System.in);
        String fullName;
        String phoneNumber;
        String emailAddress;
        ArrayList<Achivement> listOfAchivement;
        ArrayList<Experience> listOfExperiences;
        ArrayList<Skill> listOfSkills;

        // candidate
        // (1) fullName
        System.out.println("Candidate Biography information");
        System.out.println("Enter full name");
        setFullName(sc.nextLine());
        // (2) phone numbber
        System.out.println("Enter phone number");
        setPhoneNumber(sc.nextLine());
        // (2) emailAddress
        System.out.println("Enter email Address");
        setEmailAddress(sc.nextLine());

        // Achivement
        ArrayList<Achivement> localAchivments = new ArrayList<>();
        String universityName;
        String graduatingYear;
        String degree;
        String major;
        Achivement a;
        boolean addMoreAchivement = true;
        while (addMoreAchivement) {
                System.out.println("Enter University Name ");
                universityName=sc.nextLine();
            System.out.println("Enter Graduating Year");
            graduatingYear=sc.nextLine();

            System.out.println("Enter Degree");
            degree= sc.next();

            System.out.println("Enter Major");
            major= sc.nextLine();

            a= new Achivement(universityName,graduatingYear,degree,major);
            localAchivments.add(a);
            System.out.println("Continue adding achivement Y/N");
                if (!sc.nextLine().equalsIgnoreCase("Y")) {
                    break;
                }
            }
            setListOfAchivement(localAchivments);

        // Expericance
        String company;
        String jobTitle;
        String startDate;
        String endDate;
        String description;
        Experience e;

        ArrayList<Experience> userExperienceList = new ArrayList<>();
        String wantToContinue = "Y";
        // (6) Experiance infomation
        boolean addMoreExperiance = true;
        while (addMoreExperiance) {
            //for every expreriance
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
 //              public Experience(String company, String jobTitle, String startDate, String endDate, ArrayList<String> jobDescription, ArrayList<String> skills) {

                e= new Experience(company,startDate,endDate,u);
            userExperienceList.add(e);
            System.out.println("Continue adding achivement Y/N");
            if (!sc.nextLine().equalsIgnoreCase("Y")) {
                break;
            }

        }

            boolean addMoreJobDescription = true;
            while (addMoreJobDescription) {
                System.out.println("Enter Job description");
                userExperienceList.add(sc.nextLine());
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



    public void displayInformation() {
        System.out.println("===================================");
        System.out.println(this.getFirstName() + this.getLastName());
        System.out.println(this.getEmailAddress());
        System.out.println("Education");
        for (String s : this.getAchivement()) {
            System.out.println(s);
        }
        System.out.println("Experiance");
        System.out.println("Company  Start Date End Date");
        for (Experience e : getListOfExperiences()) {
            System.out.println(e.getCompany() + " " + e.getStartDate() + " " + e.getEndDate());
        }
        System.out.println("Skills ");
        for (Experience e : getListOfExperiences()) {
            for (String s : e.getSkills()) {
                System.out.println(s);
            }
        }
    }
}
