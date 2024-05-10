package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] arr = {4, 55, 10, -1, 100, 150};

        // for this method to work array has to be sorted otherwise we wont be able to find anything
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.binarySearch(arr,100));
        System.out.println(Arrays.binarySearch(arr,200)); // would be in position 4+1 =5 since its not there * -1
        System.out.println(Arrays.binarySearch(arr,50));


        // hey find  index of number 1  how to do it

        // we can write a code that checks for the first matched / found index
        int num = -4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i]== num){
                System.out.println("Your first matched index: "+i);
                break;
            }else {
                count++;
               // System.out.println("There was no match");
            }

        }
        if (count == arr.length){
            System.out.println("There was no match");
        }





    }
}
