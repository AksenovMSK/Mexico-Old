package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.RegistrationData;

import java.util.List;

public class ApplicationForTariffHelper extends BaseHelper {

    public ApplicationForTariffHelper(WebDriver wd) {
        super(wd);
    }


    public void fillFormStep1(RegistrationData data, GenerationHelper gData) {
        type(By.id("Curp"), gData.getGenerationCurp(data));
        type(By.id("Rfc"), gData.getGenerationRfc(data));
        type(By.id("RegAddress_House"), data.getHouse());
        type(By.id("RegAddress_Flat"), data.getFlat());
        type(By.id("RegAddress_StreetName"), data.getStreet());
        type(By.id("RegAddress_PostIndex"), data.getPostIndex());
        type(By.id("RegAddress_Colony"), data.getColony());
        type(By.id("RegAddress_State"), data.getState());
        type(By.id("RegAddress_Municipality"), data.getDelegation());
    }

    public void selectGender() {
        click(By.cssSelector(""), GenerationHelper.getRandomElementFromList(getGenderList()));
    }

    private List<WebElement> getGenderList() {
        return null;
    }

    public void selectLivingYears() {
        click(By.cssSelector(""), GenerationHelper.getRandomElementFromList(getYearsList()));
    }

    private List<WebElement> getYearsList() {
        return null;
    }

    public void selectLivingMonths() {
        click(By.cssSelector(""), GenerationHelper.getRandomElementFromList(getMonthsList()));
    }

    private List<WebElement> getMonthsList() {
        return null;
    }

    public void submitFormStep1() {

    }
}
