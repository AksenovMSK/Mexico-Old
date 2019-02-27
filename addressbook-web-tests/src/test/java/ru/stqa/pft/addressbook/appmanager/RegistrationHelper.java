package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ru.stqa.pft.addressbook.model.RegistrationData;

import java.util.concurrent.TimeUnit;

public class RegistrationHelper extends BaseHelper {
    public RegistrationHelper(WebDriver wd) {
        super(wd);
    }

    public void fillFormStep1(RegistrationData data, GenerationHelper gData) {
        type(By.id("FirstName"), data.getFirstName());
        type(By.id("SecondName"), data.getSecondName());
        type(By.id("FatherLastName"), data.getFatherName());
        type(By.id("MotherLastName"), data.getMotherName());
        data.withBirthDay(gData.getGenerationDate());
        type(By.id("Birthday"), data.getBirthDay());
        type(By.xpath("//form[@id='regForm']/fieldset[2]/div/div/input"), gData.getGenerationPhone());
        type(By.id("EmailAddress"), data.getEmail());
        selectBirthPlace();
        //wd.findElement(By.xpath("(//input[@id='MobilePhone'])[2]")).click();
        //type(By.id("MobilePhone"), gData.getGenerationPhone());
    }

    public void fillFormStep2(RegistrationData data){
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        type(By.id("SmsCode"), data.getSmsCode());
        type(By.id("Password"), data.getPassword());
        type(By.id("ConfirmPassword"), data.getPassword());
    }

    public void agreeCookies() {
        ((JavascriptExecutor) wd).executeScript("document.getElementById(\"IsCookieUsingChecked\").click()");
    }

    public void agreePersonal() {
        ((JavascriptExecutor) wd).executeScript("document.getElementById(\"IsPersonalDataChecked\").click()");
    }

    public void agreeBuroCredito() {
        ((JavascriptExecutor) wd).executeScript("document.getElementById(\"IsCreditBureauConditionsChecked\").click()");
    }

    public void submitFormStep1() {
        click(By.xpath("//*[@id=\"regForm\"]/fieldset[2]/button"));
    }

    public void submitFormStep2() {
        click(By.xpath("//*[@id=\"regForm\"]/button"));
    }

    public void initFormStep1() {
        click(By.linkText("Crea tu perfil"));
    }

    public void selectBirthPlace() {
        click(By.cssSelector("span.selection"));
        click(By.cssSelector("li[role='treeitem']"), GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("li[role='treeitem']")))); // getBirthPlaceList
    }

    public void loguot() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[1]/div/div/div[2]/a[1]/span"));
    }

    public void generationTestClients(int count){
        for(int i = 0; i < count; i++){
            initFormStep1();
            fillFormStep1(
                    new RegistrationData()
                            .withFirstName("Testname")
                            .withSecondName("Testsecondname")
                            .withFatherName("Testfathername")
                            .withMotherName("Testmothername")
                            .withEmail("test@mail.ru"),
                    new GenerationHelper());
            selectBirthPlace();
            agreeCookies();
            agreePersonal();
            submitFormStep1();

            fillFormStep2(
                    new RegistrationData()
                            .withSmsCode("111111")
                            .withPassword("123456q"));
            submitFormStep2();
            loguot();
        }
    }


}
