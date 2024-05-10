package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr = {30,90,60,360,180};
        int [] arr2 = {180,360,30,90,60};
        // how to print arrays
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        // how to compare arrays
        System.out.println("Compare before sorting: "+Arrays.equals(arr,arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println("Compare before sorting: "+Arrays.equals(arr,arr2));


        // how to join the elements of an array
        String [] words = {"java","selenium","api","db"};

        System.out.println(String.join(" ### ", words));

        //how to convert String into String Array
        String str = "Today is Thursday";   //  =========> str.toCharArray(): ====> ['T', 'o', 'd', 'a', .....]
        System.out.println(str.split(" ")); // see the difference this and below
        System.out.println(Arrays.toString(str.split(" "))); // see the difference this and above

        // how to convert String into a char Array
        System.out.println(str.toCharArray()); // EXCEPTION: this will actually print it as Full String
        System.out.println(Arrays.toString(str.toCharArray()));


    }
}
