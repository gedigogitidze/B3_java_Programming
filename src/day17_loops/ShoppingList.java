package day17_loops;

import java.util.Scanner;
/*
repeated actions
 - ask the user to enter the item
 - add item to shopping list
 - ask a user if they want to add more items.

  at the end show the whole item list
 */
public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String list = "Shopping list:";
        String userAnswer;

        do {
            System.out.println("Please, enter the name of the item: ");
            String userItem = key.nextLine();
            list =  list + "\n\t"+ userItem;

            System.out.println("Do you want to add more items? ");
            userAnswer = key.nextLine(); // yes , Yes ,y , Y

        }while (userAnswer.equalsIgnoreCase("yes")||userAnswer.equalsIgnoreCase("y"));
        // if the user types anything but "yes" or "y" the loop will stop the execution
        //The loop will continue ITERATION/cycle as long as user enters "Yes", "y"
        System.out.println(list);





    }
}
