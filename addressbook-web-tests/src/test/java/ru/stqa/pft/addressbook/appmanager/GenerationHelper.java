package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.RegistrationData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GenerationHelper {

    public String getGenerationPhone(){
        final int min = 1111111; // Минимальное число для диапазона
        final int max = 9999999; // Максимальное число для диапазона
        final int rnd = rnd(min, max);
        return "551" + rnd;
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int random(int lowerBound, int upperBound) {
        return (lowerBound + (int) Math.round(Math.random()
                * (upperBound - lowerBound)));
    }

    public static int getRandomElementFromList(List<WebElement> birthPlaceList){
        int randomBirthPlaceNumber = 1 + (int)(Math.random() * birthPlaceList.size() - 1);
        return randomBirthPlaceNumber;
    }

    public String getGenerationCurp(RegistrationData data) throws ParseException {
        String curp = null;
        if(data.getGender() == 1){
            Date oldFormatDate = new SimpleDateFormat("ddMMyyyy").parse(data.getBirthDay());
            String newFormatDate = new SimpleDateFormat("yyyyMMdd").format(oldFormatDate);
            curp = "BADD" + newFormatDate.substring(2) + "HCMLNS09";
        } else {
            Date oldFormatDate = new SimpleDateFormat("ddMMyyyy").parse(data.getBirthDay());
            String newFormatDate = new SimpleDateFormat("yyyyMMdd").format(oldFormatDate);
            curp = "BADD" + newFormatDate.substring(2) + "MVZRRL04";
        }
        return curp;
    }

    public String getGenerationRfc(RegistrationData data) throws ParseException {
        Date oldFormatDate = new SimpleDateFormat("ddMMyyyy").parse(data.getBirthDay());
        String newFormatDate = new SimpleDateFormat("yyyyMMdd").format(oldFormatDate);
        String rfc = "BADD" + newFormatDate.substring(2) + "S09";
        return rfc;
    }

    public String getGenerationDate(){
        int yyyy = random(1930, 1999);
        int mm = random(1, 12);
        int dd = random(1, 28);
        String month = null;
        String day = null;
        String result = null;

        if(mm < 10){
            month = "0" + mm;
        }
        if(dd < 10){
            day = "0" + dd;
        }

        if(month == null && day == null){
            result = "" + dd + "" + mm + "" + yyyy;
        } else if (month != null && day == null){
            result = "" + dd + "" + month + "" + yyyy;
        } else if(month == null && day != null){
            result = "" + day + "" + mm + "" + yyyy;
        } else if(month != null && day != null){
            result = "" + day + "" + month + "" + yyyy;
        }
        return result;
    }
}
