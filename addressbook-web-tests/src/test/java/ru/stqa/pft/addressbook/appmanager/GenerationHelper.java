package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebElement;

import java.util.Calendar;
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

    public String getGenerationDate() {

        int yyyy = random(1930, 1999);
        int mm = random(1, 12);
        int dd = 0; // will set it later depending on year and month

        switch(mm) {
            case 2:
                if (isLeapYear(yyyy)) {
                    dd = random(1, 29);
                } else {
                    dd = random(1, 28);
                }
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dd = random(1, 31);
                break;

            default:
                dd = random(1, 30);
                break;
        }

        String year = Integer.toString(yyyy);
        String month = Integer.toString(mm);
        String day = Integer.toString(dd);

        if (mm < 10) {
            month = "0" + mm;
        }

        if (dd < 10) {
            day = "0" + dd;
        }

        return day + "" + month + "" + year;
    }

    public static int random(int lowerBound, int upperBound) {
        return (lowerBound + (int) Math.round(Math.random()
                * (upperBound - lowerBound)));
    }

    public static boolean isLeapYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        int noOfDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

        if (noOfDays > 365) {
            return true;
        }

        return false;
    }

    public static int getRandomElementFromList(List<WebElement> birthPlaceList){
        int randomBirthPlaceNumber = 1 + (int)(Math.random() * birthPlaceList.size() - 1);
        return randomBirthPlaceNumber;
    }
}
