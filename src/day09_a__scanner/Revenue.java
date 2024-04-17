package day09_a__scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = keyboard.nextDouble();//34.00

        System.out.print("Enter the quantity of the item: ");
        int quantity = keyboard.nextInt();
//        int revenue =(int)(price * quantity); int type cast but we need double

        double revenue = price * quantity;
        System.out.println("The revenue is $"+ revenue);

    }
}
