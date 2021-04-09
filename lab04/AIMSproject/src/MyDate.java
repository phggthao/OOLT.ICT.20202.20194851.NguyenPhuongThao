package Lab04.AIMSproject.src;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    private int day,month,year;
    private Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd yyyy\n");
    String strDate = sdf.format(date);

    public MyDate(int day, int month, int year) { //constructor method
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public MyDate() {
        LocalDate now = LocalDate.now();
        this.day = now.getDayOfMonth();
        this.month = now.getMonthValue();
        this.year = now.getYear(); 
    }

    public void print() { //print date in "MMMM dd yyyy" format
        System.out.printf("Date: " + strDate);
    }

    public void chooseDateFormat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a date format:");
        System.out.println("1. yyyy-MM-dd\n2. d/M/yyyy\n3. dd-MMM-yyyy\n4. MMM d yyyy\n5. mm-dd-yyyy");
        int dateFormat = scanner.nextInt();
        
        switch (dateFormat) {
            case 1: {
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                String strDate = sdf.format(date);
                System.out.printf("Date: " + strDate);
                break;}
        
            case 2: {
                sdf = new SimpleDateFormat("d/M/yyyy");
                String strDate = sdf.format(date);
                System.out.printf("Date: " + strDate);
                break;}

            case 3: {
                sdf = new SimpleDateFormat("dd-MMM-yyyy");
                String strDate = sdf.format(date);
                System.out.printf("Date: " + strDate);
                break;}

            case 4: {
                sdf = new SimpleDateFormat("MMM d yyyy");
                String strDate = sdf.format(date);
                System.out.printf("Date: " + strDate);
                break;}

            case 5: {
                sdf = new SimpleDateFormat("mm-dd-yyyy");
                String strDate = sdf.format(date);
                System.out.printf("Date: " + strDate);
                break;}

            default: {
                System.out.println("Error");
                break;}
        }
        scanner.close();
    }    
}
