package hust.soict.globalict.aims.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateUtils {
    public static void dateCompare(MyDate date1,MyDate date2) {
        if (date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDay() == date2.getDay()){
            System.out.println("Date1 is equal to Date2");
        }
        else if (date1.getYear()==date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDay() < date2.getDay()) {
            System.out.println("Date1 is before Date2");
        }
        else if (date1.getYear()==date2.getYear() && date1.getMonth() < date2.getMonth()) {
            System.out.println("Date1 is before Date2");
        }
        else if (date1.getYear() < date2.getYear()) {
            System.out.println("Date1 is before Date2");
        }
        else if (date1.getYear()==date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDay() > date2.getDay()) {
            System.out.println("Date1 is after Date2");
        }
        else if (date1.getYear()==date2.getYear() && date1.getMonth() > date2.getMonth()) {
            System.out.println("Date1 is after Date2");
        }
        else if (date1.getYear() > date2.getYear()) {
            System.out.println("Date1 is after Date2");
        }      
    }

    public static void dateSort(Date[] dates) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        Arrays.sort(dates);
        System.out.println("Sorted array:");
        for (int i=0;i<dates.length;i++) {
            System.out.println(sdf1.format(dates[i]));
        }
    }
}