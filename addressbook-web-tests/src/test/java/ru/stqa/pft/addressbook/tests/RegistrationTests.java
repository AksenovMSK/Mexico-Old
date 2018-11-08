package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GenerationData;
import ru.stqa.pft.addressbook.model.BasicRegistrationData;

import java.util.List;

public class RegistrationTests extends TestBase  {

    @Test
    public void testRegistration(){
        app.getRegistrationHelper().initRegistrarionForm1();
        BasicRegistrationData basicData = new BasicRegistrationData(
                "Testname",
                "Testsecondname",
                "TestFathername",
                "TestMothername",
                "test@mail.ru",
                "111111",
                "123456q",
                "123456q");
        app.getRegistrationHelper().fillRegistrationForm1(basicData, new GenerationData());
        app.getRegistrationHelper().reversBirthdayDate(basicData);
        app.getRegistrationHelper().openDropDownselectBirthPlace();
        List<WebElement> birthPlaceList = app.getRegistrationHelper().getBirthPlaceList();
        app.getRegistrationHelper().selectBirthPlace(GenerationData.getRandomElementFromList(birthPlaceList));
        app.getRegistrationHelper().agreeCookies();
        app.getRegistrationHelper().agreePersonal();
        app.getRegistrationHelper().submitRegistrationForm1();
        app.getRegistrationHelper().fillRegistrationForm2(basicData);
        app.getRegistrationHelper().submitRegistrationForm2();
    }

}
