package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.BasicRegistrationData;

public class RegistrationHelper extends BaseHelper {
    public RegistrationHelper(WebDriver wd) {
        super(wd);
    }

    public void fillRegistrationForm1(BasicRegistrationData data){
        type(By.name(""), data.getFirstName());
        type(By.name(""), data.getSecondName());
        type(By.name(""), data.getFatherName());
        type(By.name(""), data.getMotherName());
        type(By.name(""), data.getBirthday());
        type(By.name(""), data.getMobilePhone());
        type(By.name(""), data.getEmailAddress());
    }

    public void fillRegistrationForm2(BasicRegistrationData data){
        type(By.name(""), data.getSmsCode());
        type(By.name(""), data.getPassword());
        type(By.name(""), data.getConfirmationPassword());
    }

    public void agreeCookies() {

    }

    public void agreePersonal() {

    }
}
