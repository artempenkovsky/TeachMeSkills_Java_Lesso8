package by.teachmeskills.penkovsky.homework8;

public class DateTimeUtils {
    public static String getLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return year + " - это високосный год!";
            //System.out.println(year + " - это високосный год!");
        } else {
            return year + " - это  не високосный год!";
            //System.out.println(year + " - это не високосный год!");
        }
    }
}
