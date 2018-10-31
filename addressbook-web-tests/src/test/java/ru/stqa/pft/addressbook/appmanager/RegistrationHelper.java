package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.BasicRegistrationData;

public class RegistrationHelper extends BaseHelper {
    public RegistrationHelper(WebDriver wd) {
        super(wd);
    }

    public void fillRegistrationForm1(BasicRegistrationData data){
        type(By.id("FirstName"), data.getFirstName());
        type(By.id("SecondName"), data.getSecondName());
        type(By.id("FatherLastName"), data.getFatherName());
        type(By.id("MotherLastName"), data.getMotherName());
        type(By.id("Birthday"), data.getBirthday());
        type(By.id("MobilePhone"), data.getMobilePhone());
        type(By.id("EmailAddress"), data.getEmailAddress());
    }

    public void fillRegistrationForm2(BasicRegistrationData data){
        type(By.name(""), data.getSmsCode());
        type(By.name(""), data.getPassword());
        type(By.name(""), data.getConfirmationPassword());
    }

    public void agreeCookies() {
        click(By.xpath("//div[4]/div/label"));
    }

    public void agreePersonal() {
        click(By.xpath("//div[5]/div/label"));
    }

    public void submitRegistrationForm1() {
        click(By.xpath("//button[@type='submit']"));
    }

    public void submitRegistrationForm2() {
        click(By.cssSelector(""));
    }

    public void initRegistrarionForm1() {
        click(By.linkText("Crea tu perfil"));
    }

    public void selectBirthPlace() {

    }
}
