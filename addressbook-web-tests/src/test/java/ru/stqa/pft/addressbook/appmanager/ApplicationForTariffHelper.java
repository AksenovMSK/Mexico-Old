package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.RegistrationData;

import java.text.ParseException;

public class ApplicationForTariffHelper extends BaseHelper {

    public ApplicationForTariffHelper(WebDriver wd) {
        super(wd);
    }

    public void selectGender(RegistrationData data) {

        click(By.cssSelector("span.selection")); //для открытия дропдауна
        int gender = GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-Gender-results li[role='treeitem']")));
        click(By.cssSelector("#select2-Gender-results li[role='treeitem']"), gender);
        data.withGender(gender);
    }

    public void selectLivingYears() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset[2]/div/div[5]/div[1]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-RegAddress_ResidenceYears-results li[role='treeitem']"),
                GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-RegAddress_ResidenceYears-results li[role='treeitem']"))));
    }

    public void selectWorkingYears() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[2]/div[2]/div/div[5]/div[1]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-OrgAddress_ResidenceYears-results li[role='treeitem']"),
                GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-OrgAddress_ResidenceYears-results li[role='treeitem']"))));
    }

    public void selectLivingMonths() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset[2]/div/div[5]/div[2]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-RegAddress_ResidenceMonths-results li[role='treeitem']"),
                GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-RegAddress_ResidenceMonths-results li[role='treeitem']"))));
    }

    public void selectWorkingMonths() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[2]/div[2]/div/div[5]/div[2]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-OrgAddress_ResidenceMonths-results li[role='treeitem']"),
                GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-OrgAddress_ResidenceMonths-results li[role='treeitem']"))));
    }

    public void selectEducation() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[1]/div[1]/div/span/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-Education-results li[role='treeitem']"),
                GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-Education-results li[role='treeitem']"))));
    }

    public void selectEmployment(RegistrationData data) {

        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[1]/div[2]/div/span/span[1]/span")); //для открытия дропдауна // пример селектора span.selection
        int employment = GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-Employment-results li[role='treeitem']")));
        click(By.cssSelector("#select2-Employment-results li[role='treeitem']"), employment); //пример селектора #select2-Gender-results li[role='treeitem']
        data.withEmployment(employment);
    }

    private void selectMaritalStatus() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[1]/div[1]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-MaritalStatus-results li[role='treeitem']"),
                GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-MaritalStatus-results li[role='treeitem']"))));
    }

    private void selectCountChildren() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[1]/div[2]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-Children-results li[role='treeitem']"),
                GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-Children-results li[role='treeitem']"))));
    }

    private void SelectHouseType() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[1]/div[3]/div/span[1]/span[1]/span")); //для открытия дропдауна
        click(By.cssSelector("#select2-HouseType-results li[role='treeitem']"),
                GenerationHelper.getRandomElementFromList(getElementsList(By.cssSelector("#select2-HouseType-results li[role='treeitem']"))));
    }

    private void selectCheckboxes(GenerationHelper gData) {
        if(gData.random(1,2) == 1){
            click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[4]/div/div/label"));
        }
        if(gData.random(1,2) == 1){
            click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[5]/div/div/label"));
        }
        if(gData.random(1,2) == 1){
            click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[6]/div/div/label"));
            type(By.id("CreditCardNumber"), gData.getGenerationCard());
        }
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/fieldset/div[8]/div/div/label"));
    }

    public void fillFormStep1(RegistrationData data, GenerationHelper gData) throws ParseException {
        selectGender(data);
        type(By.id("Curp"), gData.getGenerationCurp(data));
        type(By.id("Rfc"), gData.getGenerationRfc(data));
        type(By.id("RegAddress_House"), data.getHouse());
        type(By.id("RegAddress_Flat"), data.getFlat());
        type(By.id("RegAddress_StreetName"), data.getStreet());
        type(By.id("RegAddress_PostIndex"), data.getPostIndex());
        type(By.id("RegAddress_Colony"), data.getColony());
        type(By.id("RegAddress_State"), data.getState());
        type(By.id("RegAddress_Municipality"), data.getDelegation());
        selectLivingYears();
        selectLivingMonths();
    }

    public void fillFormStep2(RegistrationData data) {
        selectEducation();
        selectEmployment(data);
        if(data.getEmployment() == 1){
            type(By.id("OrganizationName"), data.getOrganizationName());
            type(By.id("OrgAddress_House"), data.getOrganizationHouse());
            type(By.id("OrgAddress_Flat"), data.getOrganizationFlat());
            type(By.id("OrgAddress_StreetName"), data.getOrganizationStreet());
            type(By.id("OrgAddress_PostIndex"), data.getOrganizationPostIndex());
            type(By.id("OrgAddress_Colony"), data.getOrganizationColony());
            type(By.id("OrgAddress_State"), data.getOrganizationState());
            type(By.id("OrgAddress_Municipality"), data.getOrganizationDelegation());
            selectWorkingYears();
            selectWorkingMonths();
        }
        type(By.id("Income"), data.getIncome());
        type(By.id("NextSalaryDate"), data.getNextIncomeDate());
    }

    public void fillFormStep3(RegistrationData data, GenerationHelper gData) {
        selectMaritalStatus();
        selectCountChildren();
        SelectHouseType();
        type(By.id("HomePhone"), gData.getGenerationPhone());
        type(By.id("AdditionalPhone"), gData.getGenerationPhone());
        type(By.id("AdditionalPhoneOwner"), data.getAdditionalPhoneOwner());
        selectCheckboxes(gData);
    }

    public void submitFormStep1() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/div/button"));
    }

    public void submitFormStep2() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/div/button"));
    }

    public void submitFormStep3() {
        click(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div/div/button"));
    }
}
