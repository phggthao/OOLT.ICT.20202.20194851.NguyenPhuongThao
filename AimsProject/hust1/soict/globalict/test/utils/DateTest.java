package hust.soict.globalict.test.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hust.soict.globalict.aims.utils.DateUtils;
import hust.soict.globalict.aims.utils.MyDate;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        //testing MyDate
        MyDate testDate = new MyDate();
        System.out.println("--Print today's date in \"MMMM dd yyyy\" format"); testDate.print();
        testDate.chooseDateFormat();

        //testing DateUtils.dateCompare
        System.out.println("--Compare Date1: 03-03-1963, and Date2: 08-08-1972");
        MyDate date1 = new MyDate(3, 3, 1963);
        MyDate date2 = new MyDate(8, 8, 1972);
        DateUtils.dateCompare(date1, date2);

        //testing DateUtils.dateSort
        System.out.println("--Sort the array of dates: 03-03-1963, 08-08-1972, 01-11-1994, 28-09-2001");
        SimpleDateFormat sdftest = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = sdftest.parse("08-08-1972");
        Date d2 = sdftest.parse("03-03-1963");
        Date d3 = sdftest.parse("01-11-1994");
        Date d4 = sdftest.parse("28-09-2001");
        Date[] dateArr = {d1,d2,d3,d4};
        DateUtils.dateSort(dateArr);
    }
}