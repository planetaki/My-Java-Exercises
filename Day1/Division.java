/**Write a program that requests two positive numbers from the user and then outputs the quotient and
 the remainder, e.g., if the user enters 7 and 3, your program should output something like “7 divided
 by 3 is 2, remainder 1”. You cannot use the “/” or “%” operators.
**/


 package src;

import java.util.Scanner;

public class Division {
    public Division() {
    }

    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1 = scanner.nextInt();
        int remainder = number1;
        System.out.print("Enter the second number:");
        int number2 = scanner.nextInt();
        scanner.close();

        while(remainder >= number2) {
            remainder -= number2;
            ++result;
        }

        System.out.print("" + number1 + " divided by " + number2 + " is " + result + " with the remainder of " + remainder);
    }
}
