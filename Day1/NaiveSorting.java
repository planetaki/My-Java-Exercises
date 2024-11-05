/**Write a program that reads three numbers and prints them in order, from lowest to highest.**/

package src;

import java.util.Scanner;

public class NaiveSorting {
    public NaiveSorting() {
    }

    public static void main(String[] args) {
        int lowest = 0;
        int middle = 0;
        int biggest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number:");
        int number3 = scanner.nextInt();
        scanner.close();
        if (number1 > number2 && number1 > number3) {
            biggest = number1;
        } else if (number2 > number1 && number2 > number3) {
            biggest = number2;
        } else if (number3 > number1 && number3 > number2) {
            biggest = number3;
        }

        if (number1 < number2 && number1 < number3) {
            lowest = number1;
        } else if (number2 < number1 && number2 < number3) {
            lowest = number2;
        } else if (number3 < number1 && number3 < number2) {
            lowest = number3;
        }

        if ((number3 <= number1 || number3 >= number2) && (number3 >= number1 || number3 <= number2)) {
            if (number2 > number1 && number2 < number3 || number2 < number1 && number2 > number3) {
                middle = number2;
            } else if (number1 > number2 && number1 < number3 || number1 < number2 && number1 > number3) {
                middle = number1;
            }
        } else {
            middle = number3;
        }

        System.out.print("" + lowest + ", " + middle + ", " + biggest);
    }
}