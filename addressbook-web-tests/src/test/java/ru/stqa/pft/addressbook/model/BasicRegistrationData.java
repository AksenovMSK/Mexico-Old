package ru.stqa.pft.addressbook.model;

public class BasicRegistrationData {

    private String firstName;
    private String secondName;
    private String fatherName;
    private String motherName;
    private String emailAddress;
    private String reversBirthDate;
    private String smsCode;
    private String password;
    private String confirmationPassword;

    public BasicRegistrationData(String firstName,
                                 String secondName,
                                 String fatherName,
                                 String motherName,
                                 String emailAddress,
                                 String smsCode,
                                 String password,
                                 String confirmationPassword){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.emailAddress = emailAddress;
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

    public String getReversBirthDate() { return reversBirthDate;
    }

    public void setReversBirthDate(String reversBirthDate) {
        this.reversBirthDate = reversBirthDate;
    }
}

