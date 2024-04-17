package day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Are you hungry? [true/false]: ");
        boolean isHungry = key.nextBoolean();

        //approach 1 - single if statement
        if( key.nextBoolean()){
            System.out.println("You are hungry so i will get some food for you.");
        }
        if( key.nextBoolean()){
            System.out.println("Great, then practice java");
        }
// Approach 2
        if (isHungry){
            System.out.println("You are hungry so i will get some food");
        }else{
            System.out.println("great lets practive java");
        }
        //approach 3 with no brackets

        if (isHungry)
            System.out.println("You are hungry so i will get some food");
        else
            System.out.println("great lets practive java");




    }
}
