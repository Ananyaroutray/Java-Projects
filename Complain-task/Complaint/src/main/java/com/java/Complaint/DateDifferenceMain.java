package com.java.Complaint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDifferenceMain {
    public int dateDifferenceInDays(String inputDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date(); // Get the current date
        Date startDate = sdf.parse(inputDate); // Parse the input date
        long differenceMillis = startDate.getTime() - currentDate.getTime();
        long differenceDays = differenceMillis / (1000 * 60 * 60 * 24);
        return (int) differenceDays;
    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in yyyy-MM-dd format: ");
        String date = sc.next();
        DateDifferenceMain mains = new DateDifferenceMain();
        int difference = mains.dateDifferenceInDays(date)*(-1);
        System.out.println("Date difference in days: " + difference);
    }
}
