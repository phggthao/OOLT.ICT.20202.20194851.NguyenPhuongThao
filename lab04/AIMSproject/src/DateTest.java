package Lab04.AIMSproject.src;

import java.util.Date;
public class DateTest {
    public static void main(String[] args) {
        //testing MyDate
        MyDate testDate = new MyDate();
        testDate.print();
        testDate.chooseDateFormat();

        //testing DateUtil
        DateUtils test = new DateUtils();
        Date date1 = test.inputDate();
        Date date2 = test.inputDate();
        test.dateCompare(date1, date2);
    }
}
