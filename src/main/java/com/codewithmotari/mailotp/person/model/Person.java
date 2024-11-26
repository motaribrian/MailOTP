package com.codewithmotari.mailotp.person.model;

import com.codewithmotari.mailotp.otp.model.OTP;

import java.util.Scanner;

public class Person {
    private long ID;
    private String fName,lName,userName;
    private OTP otp;
    private boolean isLoggedIn;

    public long getID() {
        return ID;
    }



    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OTP getOtp() {
        return otp;
    }

    public void setOtp(int length) {
        if(length<10){
            System.out.println("please provide a valid length");
            length=new Scanner(System.in).nextInt();
            setOtp(length);
        }
        System.out.println("success");

    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
