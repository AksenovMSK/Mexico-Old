package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GenerationData;
import ru.stqa.pft.addressbook.model.RegistrationData;

import java.util.List;

public class RegistrationTests extends TestBase  {

    @Test
    public void testRegistration(){
        //app.getRegistrationHelper().generationTestClients(10);

        app.getRegistrationHelper().initRegistrarionForm1();
        app.getRegistrationHelper().fillRegistrationForm1(
                new RegistrationData()
                        .withFirstName("Testname")
                        .withSecondName("Testsecondname")
                        .withFatherName("Testfathername")
                        .withMotherName("Testmothername")
                        .withEmail("test@mail.ru"),
                new GenerationData());
        app.getRegistrationHelper().openDropDownselectBirthPlace();
        List<WebElement> birthPlaceList = app.getRegistrationHelper().getBirthPlaceList();
        app.getRegistrationHelper().selectBirthPlace(GenerationData.getRandomElementFromList(birthPlaceList));
        app.getRegistrationHelper().agreeCookies();
        app.getRegistrationHelper().agreePersonal();
        app.getRegistrationHelper().submitRegistrationForm1();

        app.getRegistrationHelper().fillRegistrationForm2(
                new RegistrationData()
                    .withSmsCode("111111")
                    .withPassword("123456q"));
        app.getRegistrationHelper().submitRegistrationForm2();
    }

    @Test (enabled = false)
    public void testApplicationForTariff(){

    }

}
