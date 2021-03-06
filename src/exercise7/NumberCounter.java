package exercise7;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Array Size
        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();
        int[] numbers = new int[numberCount];


        //Array Numbers Stored
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        //Number Searched for in the Array
        System.out.print("Search for number: ");
        int number = input.nextInt();

        int numberOccurrences = countNumberOccurrences(number, numbers); // Call method
        System.out.println("Number occurrences: " + numberOccurrences);
    }

    public static int countNumberOccurrences(int number, int[] numbers) {
        int numberOcc = 0;
        for (int i = 0; i < numbers.length; i++){
          if (number == numbers[i]){
            numberOcc++;
          }
        }
        return numberOcc;
    }
}
