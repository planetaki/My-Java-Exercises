/**Modify your program from the previous exercise so that it outputs “Yes” when the numbers are consecutive, regardless of whether they go up or down. For example, both “2,3,4,5,6,-1” and “10,9,8,7,-
 1” should now result in “Yes”.**/

package src;

import java.util.Scanner;

public class High_Low {
    public High_Low() {
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

            if (input != previous + 1 && input != previous - 1) {
                result = "no";
            } else {
                previous = input;
            }
        }

        System.out.print(result);
    }
}

