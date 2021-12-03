package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = areHoursValid(hours) && areMinutesValid(minutes);
        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
        return hours >= 0 && hours < 24;
    }


    public static boolean areMinutesValid(int minutes) {
        return minutes>= 0 && minutes < 60;
    }
}
