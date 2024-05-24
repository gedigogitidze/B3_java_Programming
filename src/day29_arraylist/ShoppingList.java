package day29_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        // can we make a reusable method
        //System.out.println(shoppingList.isEmpty()? "Shopping list is empty!":"You have some items");
        System.out.println(statusOfShoppingList(shoppingList));
        String userAnswer= "";
        do {


            System.out.print("Enter the item: ");
            shoppingList.add(input.nextLine());

            System.out.print("Do you want to continue y/n: ");
            userAnswer = input.nextLine();

        }while(userAnswer.equalsIgnoreCase("yes")|| userAnswer.equalsIgnoreCase("y")); // ask as long as user says "yes" or "y"

        // loop through list
        System.out.println("Shopping list has "+ shoppingList.size() + " items: ");
        for( String each :shoppingList ){
            System.out.println("\t"+ each);
        }

        System.out.println(statusOfShoppingList(shoppingList));
        System.out.println("=================");

        // check if shopping list has an item: $item is on list / $item is not on list
        System.out.println("What item do you want to check if it is in the list?");
        input.nextLine(); // hat
        itemAvailability(shoppingList,input.nextLine());
        System.out.println("=================");

        System.out.print("Do you want to remove any item?");

       if ( input.nextLine().equalsIgnoreCase("yes")){
           System.out.print("What item do you want to remove: ");
           String itemRemove = input.nextLine(); // user item to remove  ---> Bread, "1"

            // "1"/"10' -- "Bread"
           if(Character.isDigit(itemRemove.charAt(0))) { // // "1"/"10' ----> 1 / 10
               int num = Integer.parseInt(itemRemove);

               shoppingList.remove(num -1 );
           }else {
               shoppingList.remove(itemRemove);
           }
        }
        System.out.println("Final list: "+shoppingList);

//        if (shoppingList.isEmpty()){
//            System.out.println("Shopping list is empty!");
//
//        }else {
//            System.out.println("You have some items");
//        }

    }
    public static String statusOfShoppingList(ArrayList <String> sl) {
      return  sl.isEmpty()? "Shopping list is empty!":"You have some items";

    }
    public static void itemAvailability (ArrayList<String> sl, String itemToCheck) {
        System.out.println(sl.contains(itemToCheck) ? itemToCheck+" is on list": itemToCheck+ " Is not on the list" );

    }


}
