package day10_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {

        if (false) {
            System.out.println("Hello World!");// since if condition is false, the code block that belongs to if statement won't be executed
        }

        System.out.println("Second print statement");

        if (true) {
            System.out.println("Today is Wednesday!");
        }


        int score = 60;
        if (score >= 75) {
            System.out.println("Passing the exam!");

        }


        if (score < 75) {
            System.out.println("Failing the exam!");
        }

        int year = 2020;
        boolean isLockdown = year == 2020 || year == 2021;      // || this is or .....&& this is and
        if (isLockdown) {
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        }

//
        if (!isLockdown) {
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        }

    }
}
