package day23_multidimensional_arrays;
/*
    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 123, 62, 100}
 */
import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("How many Elements in your first array you want to have: ");
       // int firstArraySize = key.nextInt();
        int [] firstArr = new int[key.nextInt()]; // 3

      //  System.out.println("Please, enter your number of element one by one pressing enter"); if we want it once
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print("Enter your data/value: "); // if we want this every iteration :) baby be focused
            firstArr[i] = key.nextInt();

        }
        System.out.println("First Array: "+ Arrays.toString(firstArr));

        System.out.print("How many more elements do you want to add to the first Array: ");
        // int numsToAdd = key.nextInt(); or we can use the variable name // 2
        int [] secondArr = Arrays.copyOf(firstArr,firstArr.length+key.nextInt());  // here i already gave numbers

        for (int i = firstArr.length; i < secondArr.length; i++) { // [23,66,77, - - ] // here i dont want to delete first numbers i gave so my start point is firstArr.length to make it dynamic
            System.out.print("Enter your data/value to add: ");
            secondArr[i] = key.nextInt();


        }
        System.out.println("Second Array: "+Arrays.toString(secondArr));






    }
}
