/**Write a program that reads a (arbitrarily long) sequence of positive numbers. The sequence is ended
 when the users enters “-1”. At that point, the program must output the highest number in the sequence.
**/
 package src;

import java.util.Scanner;

public class Maximizing {
    public Maximizing() {
    }

    public static void main(String[] args) {
        int HighestNr = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int input = scanner.nextInt();
        int previous = input;

        while(input != -1) {
            System.out.print("Enter another number(ending your sequence with -1:");
            input = scanner.nextInt();
            if (input >= previous) {
                HighestNr = input;
            }
        }

        System.out.print(HighestNr);
    }
}