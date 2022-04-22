package com.company;

import java.util.Locale;
import java.util.Scanner;

public class DayOfWeekResolver {
    private static Scanner scanner = new Scanner(System.in);

    public void start() {
        String dayOfWeek = readDayOfWeek();
        System.out.println("It is " + isDayOf(dayOfWeek));
        scanner.close();

    }

    private String readDayOfWeek() {
        System.out.println("Enter day of the week");
        return scanner.next();
    }

    private boolean isDayOf(String day) {
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
        return isDayOff(dayOfWeek);
    }

    private boolean isDayOff(DayOfWeek day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        DayOfWeekResolver resolver = new DayOfWeekResolver();
        resolver.start();
    }
}

