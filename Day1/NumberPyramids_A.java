/**Write a program that outputs a number pyramid like the one below, going on forever (until you press
 Ctrl-C to stop the program).
 1
 22
 333
 4444
 55555
 666666
 7777777
**/

 package src;

public class NumberPyramids_A {
    public NumberPyramids_A() {
    }

    public static void main(String[] args) {
        for(int number = 1; number <= 9; ++number) {
            for(int i = 0; i < number; ++i) {
                System.out.print(number);
            }

            System.out.println();
        }

    }
}
