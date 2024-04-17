package day09_a__scanner;

import java.util.Scanner;

public class UseNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is today");
        String day = input.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        input.nextLine(); // this nextLine(); is use to capture the "ENTER/RETURN from previous Scanner method

        System.out.println("Enter your address: ");
        String address = input.nextLine();// here we did not need to handle it because it is required for any OTHER SCANNER METHODS if they are before nextLine();

        System.out.println("Enter your balance: ");
        double balance = input.nextDouble();

        input.nextLine();// also for capturing the "ENTER"

        System.out.println("Enter job title: ");
        String jobTitle = input.nextLine();



        System.out.println("Today: " +day);
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("address: " + address);
        System.out.println("jobTitle: " + jobTitle);
        System.out.println("balance: " + balance);

    }
}
