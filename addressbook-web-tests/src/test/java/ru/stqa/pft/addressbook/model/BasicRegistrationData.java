package ru.stqa.pft.addressbook.model;

import ru.stqa.pft.addressbook.appmanager.GenerationData;

public class BasicRegistrationData {

    private String firstName;
    private String secondName;
    private String fatherName;
    private String motherName;
    private String emailAddress;
    private String smsCode;
    private String password;
    private String confirmationPassword;

    public BasicRegistrationData(String firstName,
                                 String secondName,
                                 String fatherName,
                                 String motherName,
                                 String emailAddress){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.emailAddress = emailAddress;;
    }

    public BasicRegistrationData(String smsCode,
                                 String password,
                                 String confirmationPassword){
        this.smsCode = smsCode;
        this.password = password;
        this.confirmationPassword = confirmationPassword;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmationPassword() {
        return confirmationPassword;
    }
}

