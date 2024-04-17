package day09_a__scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Are you employed? [true/false] ");
        boolean isEmployed = input.nextBoolean();
        System.out.print("Are you a student? [true/false] ");
        boolean isStudent = input.nextBoolean();

        String personInfo = firstName+ " "+ lastName+"\n\tis employed "+ isEmployed+"\n\tis a student: "+ isStudent;






        System.out.println("Your name is: "+personInfo);

    }
}