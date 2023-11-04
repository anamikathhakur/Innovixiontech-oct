import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the MCQ Quiz Program!");
        // Question 1
        System.out.println("Question 1: Which of the following for loop declaration is not valid?");
        System.out.println("a.  for ( int i = 99; i >= 0; i / 9 )");
        System.out.println("b.  for ( int i = 7; i <= 77; i += 7 )");
        System.out.println("c.  for ( int i = 20; i >= 2; - -i )");
        System.out.println("d.  for ( int i = 2; i <= 20; i = 2* i )");
        String answer = input.nextLine().toLowerCase();
        if (answer.equals("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, the correct answer is for ( int i = 99; i >= 0; i / 9 ).");
        }

        // Question 2
        System.out.println("Question 2: What is the initial quantity of the ArrayList list?");
        System.out.println("a. 5");
        System.out.println("b. 10");
        System.out.println("c. 0");
        System.out.println("d. 100");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, the correct answer is 10.");
        }

        // Question 3
        System.out.println("Question 3: Which of the following is not a Java features?");
        System.out.println("a. Architecture Neutral");
        System.out.println("b. Dynamic");
        System.out.println("c. Use of pointers");
        System.out.println("d. Object-oriented");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, the correct answer is Use of pointers.");
        }

        // Question 4
        System.out.println("Question 4: _____ is used to find and fix bugs in the Java programs.");
        System.out.println("a. JVM");
        System.out.println("b. JRE");
        System.out.println("c. JDK");
        System.out.println("d. JDB");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("d")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, the correct answer is JDB");
        }

        // Question 5
        System.out.println("Question 5: Which package contains the Random class?");
        System.out.println("a. java.util package");
        System.out.println("b. java.lang package");
        System.out.println("c. java.awt package");
        System.out.println("d. java.io package");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, the correct answer is java.util package.");
        }


        System.out.println("Your final score is: " + score);
        System.out.println("thank you to participate ");

    }
}
