package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GenerationHelper;
import ru.stqa.pft.addressbook.model.RegistrationData;

public class RegistrationTests extends TestBase  {

    private RegistrationData data = new RegistrationData();
    private GenerationHelper generationData = new GenerationHelper();

    @Test
    public void testRegistration(){
            data.withFirstName("Testname")
                .withSecondName("Testsecondname")
                .withFatherName("Testfathername")
                .withMotherName("Testmothername")
                .withEmail("test@mail.ru")
                .withSmsCode("111111")
                .withPassword("123456q");

        app.registration().initFormStep1();
        app.registration().fillFormStep1(data, generationData);
        app.registration().openDropDownBirthPlace();
        app.registration().selectBirthPlace();
        app.registration().agreeCookies();
        app.registration().agreePersonal();
        app.registration().submitFormStep1();

        app.registration().fillFormStep2(data);
        app.registration().submitFormStep2();
    }

    @Test (enabled = false)
    public void testApplicationForTariff(){
            data.withFlat("Testflat")
                .withHouse("Testhouse")
                .withStreet("Teststreet")
                .withPostIndex("45047")
                .withColony("Testcolony")
                .withState("Teststate")
                .withDelegation("Testdelegarion");
        app.applicationForTariff().selectGender();
        app.applicationForTariff().fillFormStep1(data, generationData);
        app.applicationForTariff().selectLivingYears();
        app.applicationForTariff().selectLivingMonths();
        app.applicationForTariff().submitFormStep1();
    }

    @Test (enabled = false)
    public void testGenerationClients(){
        app.registration().generationTestClients(10);
    }

}
