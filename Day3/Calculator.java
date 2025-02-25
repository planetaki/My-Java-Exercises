//operations: addition, subtraction, multiplication, and division. Once the user has selected an operation
//from the menu, the calculator performs the operation.
//Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is
//also a Double.parseDouble() method to parse real numbers. Similarly, class java.util.Scanner has
//a method nextDouble().

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a Scanner object

        boolean validOperation=false;
        while(!validOperation) {System.out.println("Enter the first number:");

            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number:");

            double number2 = scanner.nextDouble();

            System.out.println("Please choose an operation from the following:addition, substraction, division, multiplication." +
                    "Type in Exit to finish the programm.");
            scanner.nextLine();
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break; // Exit the loop
            }


            if (operation.equals("addition")) {
                double resault = number1 + number2;
                System.out.println(resault);
                validOperation=true;

            } else if (operation.equals("substraction")) {
                double resault = number1 - number2;
                System.out.println(resault);
                validOperation=true;

            } else if (operation.equals("division")) {
                double resault = number1 / number2;
                System.out.println(resault);
                validOperation=true;

            } else if (operation.equals("multiplication")) {
                double resault = number1 * number2;
                System.out.println(resault);
                validOperation=true;

            } else {
                System.out.println("Invalid operation choosen.Let's do it again.");
                validOperation=false;

            }


        }

    }
}

