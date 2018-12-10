package ru.stqa.pft.addressbook.model;

public class RegistrationData {

    private String firstName;
    private String secondName;
    private String fatherName;
    private String motherName;
    private String birthDay;
    private String email;
    private String smsCode;
    private String password;

    public RegistrationData withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public RegistrationData withSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public RegistrationData withFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public RegistrationData withMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public RegistrationData withBirthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public RegistrationData withEmail(String emailAddress) {
        this.email = emailAddress;
        return this;
    }

    public RegistrationData withSmsCode(String smsCode) {
        this.smsCode = smsCode;
        return this;
    }

    public RegistrationData withPassword(String password) {
        this.password = password;
        return this;
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

    public String getBirthDay() { return birthDay; }

    public String getEmail() {
        return email;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public String getPassword() {
        return password;
    }

}

