package day09_a__scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your yearly salary? $");
        double salary = input.nextDouble(); //120,000 per hour

        System.out.println("How many hours do you work in a week? ");
        int hoursInWeek = input.nextInt(); //40

        double hourlyRate = salary / (hoursInWeek * 52);

        System.out.println("With the yearly salary of "+salary+ " and working for "+hoursInWeek+" hours in a week, your hourly rate is $"+hourlyRate);



    }
}
