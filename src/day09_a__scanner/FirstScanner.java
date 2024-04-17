package day09_a__scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {
        //#1 - declare Scanner Object / instantiate
        //Scanner inout; ----> input is object reference name
        Scanner input = new Scanner(System.in); // scanner object declaration. / instantiation


        System.out.println("Please, enter a number: ");

        //#2 - we get the value from console
       int userNumber = input.nextInt(); // returns input as int ---> therefor, I can assign it into int variable.
        System.out.println("You entered: " +userNumber);


    }
}
