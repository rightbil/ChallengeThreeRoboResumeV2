package com.company;

import java.util.ArrayList;

public class DriverApp {

    public static void main(String[] args) {
        ResumeDB db= new ResumeDB();
        Resume c= null;
        ArrayList<Resume> listOfResume= new ArrayList<>();
        Resume r = new Resume();
        listOfResume= r.addResume();
        db.setResumes(listOfResume);
        db.info();

        }



    }


