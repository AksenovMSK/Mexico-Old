package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.BasicRegistrationData;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationHelper extends BaseHelper {
    public RegistrationHelper(WebDriver wd) {
        super(wd);
    }

    public void fillRegistrationForm1(BasicRegistrationData data, GenerationData gData){
        type(By.id("FirstName"), data.getFirstName());
        type(By.id("SecondName"), data.getSecondName());
        type(By.id("FatherLastName"), data.getFatherName());
        type(By.id("MotherLastName"), data.getMotherName());
        type(By.id("Birthday"), gData.getGenerationDate());
        type(By.id("MobilePhone"), gData.getGenerationPhone());
        type(By.id("EmailAddress"), data.getEmailAddress());
    }

    public void fillRegistrationForm2(BasicRegistrationData data){
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        type(By.id("SmsCode"), data.getSmsCode());
        type(By.id("Password"), data.getPassword());
        type(By.id("ConfirmPassword"), data.getConfirmationPassword());
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
        click(By.xpath("//button[@type='submit']"));
    }

    public void initRegistrarionForm1() {
        click(By.linkText("Crea tu perfil"));
    }

    public void openDropDownselectBirthPlace(){
        click(By.cssSelector("span.selection"));
    }

    public void selectBirthPlace(int index) {
        click(By.cssSelector("li[role='treeitem']"), index);
    }

    public List<WebElement> getBirthPlaceList(){
        List<WebElement> elements = wd.findElements(By.cssSelector("li[role='treeitem']"));
        return elements;
    }
}
