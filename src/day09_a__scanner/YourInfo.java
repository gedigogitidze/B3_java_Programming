package day09_a__scanner;
import java.util.Scanner;

/*
    Ask the user to enter their age (byte),
    ask them to enter their favorite number (long),
    and ask them to enter their favorite book
    Print all the values from the inputs
 */
public class YourInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite book: ");
        String book = input.nextLine();;

        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        System.out.print("Enter your favourite number: ");
        long number = input.nextLong();

        System.out.println("Information");
        System.out.println(age);
        System.out.println(number);
        System.out.println(book);
    }
}
