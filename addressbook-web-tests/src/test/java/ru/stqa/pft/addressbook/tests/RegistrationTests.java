package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GenerationHelper;
import ru.stqa.pft.addressbook.model.RegistrationData;

public class RegistrationTests extends TestBase  {

    @Test
    public void testRegistration(){
        app.registration().initFormStep1();
        app.registration().fillFormStep1(
                new RegistrationData()
                        .withFirstName("Testname")
                        .withSecondName("Testsecondname")
                        .withFatherName("Testfathername")
                        .withMotherName("Testmothername")
                        .withEmail("test@mail.ru"),
                new GenerationHelper());
        app.registration().openDropDownBirthPlace();
        app.registration().selectBirthPlace();
        app.registration().agreeCookies();
        app.registration().agreePersonal();
        app.registration().submitFormStep1();

        app.registration().fillFormStep2(
                new RegistrationData()
                    .withSmsCode("111111")
                    .withPassword("123456q"));
        app.registration().submitFormStep2();
    }

    @Test (enabled = false)
    public void testApplicationForTariff(){

    }

    @Test (enabled = false)
    public void testGenerationClients(){
        app.registration().generationTestClients(10);
    }

}
