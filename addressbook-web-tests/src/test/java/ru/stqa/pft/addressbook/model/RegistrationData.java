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
    private String curp;
    private String rfc;
    private String flat;
    private String house;
    private String street;
    private String postIndex;
    private String colony;
    private String State;
    private String delegation;

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

    public RegistrationData withCurp(String curp) {
        this.curp = curp;
        return this;
    }

    public RegistrationData withRfc(String rfc) {
        this.rfc = rfc;
        return this;
    }

    public RegistrationData withFlat(String flat) {
        this.flat = flat;
        return this;
    }

    public RegistrationData withHouse(String house) {
        this.house = house;
        return this;
    }

    public RegistrationData withStreet(String street) {
        this.street = street;
        return this;
    }

    public RegistrationData withPostIndex(String postIndex) {
        this.postIndex = postIndex;
        return this;
    }

    public RegistrationData withColony(String colony) {
        this.colony = colony;
        return this;
    }

    public RegistrationData withState(String State) {
        this.State = State;
        return this;
    }

    public RegistrationData withDelegation(String delegation) {
        this.delegation = delegation;
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

    public String getCurp() {
        return curp;
    }

    public String getRfc() {
        return rfc;
    }

    public String getFlat() {
        return flat;
    }

    public String getHouse() {
        return house;
    }

    public String getStreet() {
        return street;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public String getColony() {
        return colony;
    }

    public String getState() {
        return State;
    }

    public String getDelegation() {
        return delegation;
    }
}

