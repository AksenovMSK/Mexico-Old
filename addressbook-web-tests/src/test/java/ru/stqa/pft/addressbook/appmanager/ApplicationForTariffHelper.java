package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.RegistrationData;

import java.text.ParseException;
import java.util.List;

public class ApplicationForTariffHelper extends BaseHelper {

    public ApplicationForTariffHelper(WebDriver wd) {
        super(wd);
    }


    public void fillFormStep1(RegistrationData data, GenerationHelper gData) throws ParseException {
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
        click(By.cssSelector("span.selection")); //для открытия дропдауна
        click(By.cssSelector("#select2-Gender-results li[role='treeitem']"), GenerationHelper.getRandomElementFromList(getGenderList()));
    }

    private List<WebElement> getGenderList() {
        List<WebElement> elements = wd.findElements(By.cssSelector("#select2-Gender-results li[role='treeitem']"));
        return elements;
    }

    public void selectLivingYears() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset[2]/div/div[5]/div[1]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-RegAddress_ResidenceYears-results li[role='treeitem']"), GenerationHelper.getRandomElementFromList(getYearsList()));
    }

    private List<WebElement> getYearsList() {
        List<WebElement> elements = wd.findElements(By.cssSelector("#select2-RegAddress_ResidenceYears-results li[role='treeitem']"));
        return elements;
    }

    public void selectLivingMonths() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset[2]/div/div[5]/div[2]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-RegAddress_ResidenceMonths-results li[role='treeitem']"), GenerationHelper.getRandomElementFromList(getMonthsList()));
    }

    private List<WebElement> getMonthsList() {
        List<WebElement> elements = wd.findElements(By.cssSelector("#select2-RegAddress_ResidenceMonths-results li[role='treeitem']"));
        return elements;
    }

    public void submitFormStep1() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/div/button"));
    }
}
