package day04_variables;

import java.sql.SQLOutput;

public class Fruits {


    public static void main (String [] args) {

        int apples = 80;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have:" + 70);// the value 70 is Hardcoded
        System.out.println("This is how many apples we have:" + apples); // the value of apples is Dynamically used
        System.out.println("Grapes " + grapes);
        System.out.println("bananas " + bananas);


        //REASSIGNMENT
        System.out.println("Sold out some of apples");
        apples = 30; // i reassigned container called apples to be 30
        System.out.println("Apples after selling: " + apples);


        int price = 15;
        System.out.println("The price of my 30 apples is $20"); //Hardcoded
        System.out.println("The price of my "+ apples+ " apples is $"+price);









        //CONCATENATION SAMPLE
        System.out.println();
        System.out.println(50+50);
        //NOTE: Anything after fist string is CONCATENATION
        System.out.println("50" + 50);
        System.out.println(10+10+"10"+10);


    }

}
