package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GenerationHelper;
import ru.stqa.pft.addressbook.model.RegistrationData;

import java.io.File;
import java.text.ParseException;

import static org.testng.Assert.assertTrue;

public class RegistrationTests extends TestBase  {

    @Test (enabled = false)
    public void testRegistration(){

        RegistrationData data = new RegistrationData();
        GenerationHelper generationData = new GenerationHelper();

            data.withFirstName("Testname")
                .withSecondName("Testsecondname")
                .withFatherName("Testfathername")
                .withMotherName("Testmothername")
                .withEmail("test@mail.ru")
                .withSmsCode("111111")
                .withPassword("123456q");

        app.registration().initFormStep1();
        app.registration().fillFormStep1(data, generationData);
        app.registration().selectBirthPlace();
        app.registration().agreeCookies();
        app.registration().agreePersonal();
        app.registration().submitFormStep1();

        app.registration().fillFormStep2(data);
        app.registration().submitFormStep2();

        assertTrue(app.isElementPresent(By.name("Curp")));

        app.registration().loguot();
    }

    @Test (enabled = true)
    public void testApplicationForTariff() throws ParseException, InterruptedException {

        RegistrationData data = new RegistrationData();
        GenerationHelper generationData = new GenerationHelper();

        data.withFirstName("Testname")
                .withSecondName("Testsecondname")
                .withFatherName("Testfathername")
                .withMotherName("Testmothername")
                .withEmail("test@mail.ru")
                .withSmsCode("111111")
                .withPassword("123456q");

        app.registration().initFormStep1();
        app.registration().fillFormStep1(data, generationData);
        app.registration().agreeCookies();
        app.registration().agreePersonal();
        app.registration().submitFormStep1();

        app.registration().fillFormStep2(data);
        app.registration().submitFormStep2();

            data.withHouse("Testhouse")
                .withFlat("Testflat")
                .withStreet("Teststreet")
                .withPostIndex("45047")
                .withColony("Testcolony")
                .withState("Teststate")
                .withDelegation("Testdelegarion");

        app.applicationForTariff().fillFormStep1(data, generationData);
        app.applicationForTariff().submitFormStep1();

        assertTrue(app.isElementPresent(By.name("Income")));

        data.withOrganizationName("Testorgname")
                .withOrganizationHouse("Testorghouse")
                .withOrganizationFlat("Testorgflat")
                .withOrganizationStreet("Testorgstreet")
                .withOrganizationPostIndex("87945")
                .withOrganizationColony("Testorgcolony")
                .withOrganizationState("Testorgstate")
                .withOrganizationDelegation("Testorgdelegarion")
                .withIncome("123456");

        app.applicationForTariff().fillFormStep2(data, generationData);
        app.applicationForTariff().submitFormStep2();

        assertTrue(app.isElementPresent(By.name("AdditionalPhone")));

        data.withAdditionalPhoneOwner("Testphoneowner");

        app.applicationForTariff().fillFormStep3(data, generationData);
        app.applicationForTariff().submitFormStep3();

        assertTrue(app.isElementPresent(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div[1]/form/div/fieldset/div/a")));

            data.withBankAccountStatement(new File("addressbook-web-tests/src/test/resources/Bank_account_statement.pdf"))
                .withIfeCredential(new File("addressbook-web-tests/src/test/resources/IFE_credential.jpg"))
                .withPhotoOfYourselfHoldingYourIFE(new File("addressbook-web-tests/src/test/resources/Photo_of_yourself_holding_your_IFE.png"));

        app.applicationForTariff().fillFormStep4(data);
        app.applicationForTariff().submitFormStep4();

        assertTrue(app.isElementPresent(By.xpath("//*[@id=\"nojs\"]/body/div[2]/div/div[3]/div/div/div/div/form/div[1]/div/div/label")));

        app.registration().loguot();
    }
}
