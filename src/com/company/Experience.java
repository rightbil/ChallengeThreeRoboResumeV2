package com.company;
import java.util.ArrayList;
public class Experience { //experience
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private ArrayList<String> duties;
public Experience() {}

    public Experience(String company, String jobTitle, String startDate, String endDate, ArrayList<String> duties) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duties = duties;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getDuties() {
        return duties;
    }

    public void setDuties(ArrayList<String> duties) {
        this.duties = duties;
    }


  }
