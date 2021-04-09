package Lab04.AIMSproject.src;

import java.util.Scanner;
import java.util.Date;

public class DateUtils {
    public Date inputDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day (dd): ");
        int date = scanner.nextInt();
        scanner.close();

        scanner = new Scanner(System.in);
        System.out.print("Enter month (mm): ");
        int month = scanner.nextInt();
        scanner.close();

        scanner = new Scanner(System.in);
        System.out.print("Enter year (yyyy): ");
        int year = scanner.nextInt();
        scanner.close();

        Date dateIN = new Date(year, month, date);
        return dateIN;
    }

    public static void dateCompare(Date date1,Date date2) {
        if (date1.after(date2)) {
            System.out.println(date1 + " is after " + date2);
        }
        
        else if (date1.before(date2)) {
            System.out.println(date1 + " is before " + date2);
        }
        
        else if (date1.equals(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }
    }

    public static void dateSort(Date[] dates) {
        
    }
}
