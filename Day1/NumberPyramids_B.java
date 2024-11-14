/**Write a program that reads a number between 1 and 25, and then outputs a number pyramid like the
 one below (the example is for number 8) with that number of levels. Notice that you must write the
 right number of spaces at each level so that the pyramid is properly aligned to the right.
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 6 6 6 6 6 6
 7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8**/

package src;

import java.util.Scanner;

public class NumberPyramids_B {
    public NumberPyramids_B() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 25: ");
        int levels = scanner.nextInt();
        if (levels >= 1 && levels <= 25) {
            for(int i = 1; i <= levels; ++i) {
                int j;
                for(j = 0; j < levels - i; ++j) {
                    System.out.print(" ");
                }

                for(j = 0; j < i; ++j) {
                    System.out.print("" + i + " ");
                }

                System.out.println();
            }

        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 25.");
        }
    }
}
