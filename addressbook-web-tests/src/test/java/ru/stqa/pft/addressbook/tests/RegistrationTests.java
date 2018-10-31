package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.BasicRegistrationData;

public class RegistrationTests extends TestBase  {

    @Test
    public void testRegistration(){
        app.getRegistrationHelper().initRegistrarionForm1();
        app.getRegistrationHelper().fillRegistrationForm1(new BasicRegistrationData(
                "Testname",
                "Testsecondname",
                "TestFathername",
                "TestMothername",
                "20.04.1984",
                "5552224444",
                "test@mail.ru"));
        app.getRegistrationHelper().agreeCookies();
        app.getRegistrationHelper().agreePersonal();
        app.getRegistrationHelper().submitRegistrationForm1();
        app.getRegistrationHelper().fillRegistrationForm2(new BasicRegistrationData(
                "111111",
                "123456q",
                "123456q"));
        app.getRegistrationHelper().submitRegistrationForm2();
    }

}
