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
