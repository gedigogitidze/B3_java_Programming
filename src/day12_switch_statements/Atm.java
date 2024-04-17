package day12_switch_statements;

import java.util.Scanner;

public class Atm {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("***Welcome to the ATM***\n\nPlease, insert your card.\n\tThen type pin code: ");
        int userInputPin = input.nextInt();
        double balance = 1_000_000;
        int expectedPin = 6789;
        if(userInputPin == expectedPin) {     // parent if
            System.out.println("You are logged in");

            System.out.println("Select a number for your operation: ");
            System.out.println("\t1 - Check Balance");
            System.out.println("\t2 - Withdraw");
            System.out.println("\t3 - Deposit");
            System.out.print("\nYour choice: ");

            int option = input.nextInt();
            //INNER if - CHILD if - Nested
            if (option ==1 ){
                System.out.println("Your balance is $"+ balance);
            }else if (option == 2){
                System.out.println("How much do you want to withdraw ? $");
                double withdrawAmount = input.nextDouble();
                System.out.println("Stand by ... withdrawing $"+withdrawAmount);
                balance -=withdrawAmount; // shorthand operator balance = balance - withdraw
                System.out.println("After withdraw your balance is $"+balance);
            } else if (option == 3 ) {
                System.out.print("Please insert the money: $");
                double deposit = input.nextDouble();
                balance +=deposit;    //balance + deposit;
                System.out.println("After deposit your balance is $"+balance);
            }else {
                System.out.println("Invalid selection. Exiting the account");
            }

        }else {
            System.out.println("Invalid Pin Code\nTry once again");
        }










    }
}
