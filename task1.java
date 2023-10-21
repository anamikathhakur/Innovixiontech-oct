/**
 * Create a command-line calculator using java that can perform
 * various mathematical operations, handle user input, and display results. **/

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("\t\t\t\tCommand-Line Calculator\n");

        System.out.println("Please Enter First number: ");
        a = sc.nextInt();

        System.out.println("Please Enter Your Operation (+,-,*,/): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': {
                System.out.println("Please Enter Second number: ");
                b = sc.nextInt();
                System.out.println("\n"+ a + " + " + b + " = " + (a + b));
                break;
            }
            case '-': {
                System.out.println("Please Enter Second number: ");
                b = sc.nextInt();
                System.out.println("\n"+ a + " - " + b + " = " + (a - b));
                break;
            }
            case '*': {
                System.out.println("Please Enter Second number: ");
                b = sc.nextInt();
                System.out.println("\n"+ a + " * " + b + " = " + (a * b));

                break;
            }
            case '/': {
                System.out.println("Please Enter Second number: ");
                b = sc.nextInt();
                if (b != 0)
                    System.out.println("\n"+ a + " / " + b + " = " + (a / b));
                else
                    System.out.println("Cannot divide a number by zero");
                break;
            }
            default:
                System.out.println("Wrong Input");
        }


        sc.close();
    }
}
