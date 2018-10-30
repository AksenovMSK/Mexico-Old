package ru.stqa.pft.addressbook.model;

public class RegistrationStep2Data {
    private final String smsCode;
    private final String password;
    private final String confirmationPassword;

    public RegistrationStep2Data (String smsCode,
                                  String password,
                                  String confirmationPassword){

        this.smsCode = smsCode;
        this.password = password;
        this.confirmationPassword = confirmationPassword;
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
