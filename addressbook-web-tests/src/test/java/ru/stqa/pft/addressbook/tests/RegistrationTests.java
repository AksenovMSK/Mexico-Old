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
        app.getRegistrationHelper().fillRegistrationForm1(new BasicRegistrationData(
                "Testname",
                "Testsecondname",
                "TestFathername",
                "TestMothername",
                "test@mail.ru"), new GenerationData());
        app.getRegistrationHelper().openDropDownselectBirthPlace();
        List<WebElement> birthPlaceList = app.getRegistrationHelper().getBirthPlaceList();
        int index = GenerationData.getRandomBirthPlace(birthPlaceList);
        app.getRegistrationHelper().selectBirthPlace(index);
        app.getRegistrationHelper().agreeCookies();
        app.getRegistrationHelper().agreePersonal();
//        app.getRegistrationHelper().submitRegistrationForm1();
//        app.getRegistrationHelper().fillRegistrationForm2(new BasicRegistrationData(
//                "111111",
//                "123456q",
//                "123456q"));
//        app.getRegistrationHelper().submitRegistrationForm2();
    }

}
