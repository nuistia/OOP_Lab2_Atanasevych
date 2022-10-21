package Lab2;

import java.util.Scanner;
import static Lab2.Tasks.*;

public class Lab2 {

    //сканер для считывания с клавиатуры
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input some text to check if it ends with \"ed\":");
        String taskOne = sc.nextLine();
        System.out.println("Answer is: " + endsWithEd(taskOne));

        System.out.println("\nInput some text to sum up numbers:");
        String taskTwo = sc.nextLine();
        System.out.println("Sum of numbers in string is " + sumOfDigits(taskTwo));

        System.out.println("\nInput some text to find the longest block of ch-ers:");
        String taskThree = sc.nextLine();
        System.out.println("Answer is: " + lengthOfBlock(taskThree));

        System.out.println("\nInput some text to split it to words:");
        String taskFour = sc.nextLine();
        foundWords(taskFour);

        System.out.println("\nInput 1st string to mix it:");
        String taskFive1 = sc.nextLine();
        System.out.println("\nInput 2nd string to mix it:");
        String taskFive2 = sc.nextLine();
        System.out.println("Result:");
        System.out.println(mixStrings(taskFive1, taskFive2));
    }
}