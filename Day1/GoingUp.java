package src;

import java.util.Scanner;

public class GoingUp {
    public GoingUp() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number(last one should be -1):");
        int input = scanner.nextInt();
        int previous = input;
        String result = "yes";

        while(input != -1) {
            System.out.print("Enter the first number(last one should be -1):");
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            if (input >= previous) {
                previous = input;
            } else {
                result = "no";
            }
        }

        System.out.print(result);
    }
}
