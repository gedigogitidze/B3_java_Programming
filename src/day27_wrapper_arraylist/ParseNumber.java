package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {

        String year = "2024";
        //String year = "2024b"; //

        // normal concatenation
        System.out.println("Current year: "+year+1);
        System.out.println("Next year will be: "+(year+1));

        // sometimes i want to convert string "2024" into real 2024
        int yearInNum = Integer.parseInt(year); // int yearInNum = 2024;
        System.out.println("Current year: "+(yearInNum+1));


        System.out.println("=================");
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your message in this format: I am $x years old: ");
        String str = key.nextLine(); // I am 30 years old

        // in $5 years, I will be $x+5 years old


        String age =   str.split(" ")[2];//30 :TODO
        int ageInNum = Integer.parseInt(age);
        System.out.println("In 5 years, i will be " +(age+5)+ " years old"); // 305
        System.out.println("In 5 years, i will be " +(ageInNum+5)+ " years old"); // 305


    }
}
