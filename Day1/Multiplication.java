/**Write a program that requests two numbers from the user and then outputs their product. You cannot use the “*” operator.
Can you make your program work correctly also if one or both numbers are negative?**/

package src;

import java.util.Scanner;

public class Multiplication {
    public Multiplication() {
    }

    public static void main(String[] args) {
        int result = 0;
        int repetition = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        int number2 = scanner.nextInt();
        scanner.close();

        while(repetition <= number2) {
            ++repetition;
            result += number1;
        }

        System.out.print(result);
    }
}

