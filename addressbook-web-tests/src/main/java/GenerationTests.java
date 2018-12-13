import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class GenerationTests {

    public static void main(String[] args) throws ParseException {

//        long randomDate = ThreadLocalRandom.current().nextLong(-1262325600000L, 915127200000L + 1);
//        String dateString = new SimpleDateFormat("dd/MM/yyyy").format(new Date(randomDate));

for(int i = 0; i < 100; i++){
    long randomDate = ThreadLocalRandom.current().nextLong(System.currentTimeMillis(), (System.currentTimeMillis()+31556952000L) + 1);;
    String dateString = new SimpleDateFormat("ddMMyyyy").format(new Date(randomDate));
    System.out.println(dateString);
}





//        final int min = 11111111; // Минимальное число для диапазона
//        final int max = 99999999; // Максимальное число для диапазона
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println("рандомный телефон: 55" + rnd(min, max) + " рандомный год рожления: " + randomDOB());
//        }
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


    public static String randomDOB() {

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
}
