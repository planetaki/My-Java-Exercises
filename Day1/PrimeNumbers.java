/**Write a program that asks for a number from the user, then says whether the number is prime or not.
 Remember that a prime number is a positive number (i.e., it is greater than 0) that is divisible only by
 1 and itself. You can use the modulo operator (if a % b is zero, then a is divisible by b).**/

package src;

import java.util.Scanner;

public class PrimeNumbers {
    public PrimeNumbers() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number > 0 && number % number == 0 && number % 1 == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

    }
}

