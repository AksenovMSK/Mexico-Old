package ru.stqa.pft.addressbook.model;

public class RegistrationStep1Data {

    private final String firstName;
    private final String secondName;
    private final String fatherName;
    private final String motherName;
    private final String birthday;
    private final String mobilePhone;
    private final String emailAddress;

    public RegistrationStep1Data(String firstName,
                                 String secondName,
                                 String fatherName,
                                 String motherName,
                                 String birthday,
                                 String mobilePhone,
                                 String emailAddress){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.birthday = birthday;
        this.mobilePhone = mobilePhone;
        this.emailAddress = emailAddress;
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
}

