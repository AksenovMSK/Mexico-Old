package ru.stqa.pft.addressbook.model;

public class BasicRegistrationData {

    private final String firstName;
    private final String secondName;
    private final String fatherName;
    private final String motherName;
    private final String birthday;
    private final String mobilePhone;
    private final String emailAddress;
    private final String smsCode;
    private final String password;
    private final String confirmationPassword;

    public BasicRegistrationData(String firstName,
                                 String secondName,
                                 String fatherName,
                                 String motherName,
                                 String birthday,
                                 String mobilePhone,
                                 String emailAddress,
                                 String smsCode,
                                 String password,
                                 String confirmationPassword){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.birthday = birthday;
        this.mobilePhone = mobilePhone;
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

    public String getBirthday() {
        return birthday;
    }

    public String getMobilePhone() {
        return mobilePhone;
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

