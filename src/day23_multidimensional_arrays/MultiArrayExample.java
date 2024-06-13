package day23_multidimensional_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {5, 10, 20, 10}; // single dimensional array
        int [] m = {5, 10, 100, 39, 19}; // also Single dimensional array

        int [] [] all = {n, m}; // we stored already decleared SINGLE arrays into Multidimensional/2d array

        System.out.println(all); // will give some hashcode/ memory location for 2D array

        System.out.println(Arrays.toString(all)); // will give some hashcode / memory location for each array

        System.out.println(Arrays.deepToString(all)); // this is how to declare multi dimensional arr

        System.out.println("========================");

        int [] [] multi = {
                {90, 80, 70},                    // SINGLE ARRAY at 2D Array index of 0
                {19,324,5646,23},               // SINGLE ARRAY at 2D Array index of 1
                {234,324},                     // SINGLE ARRAY at 2D Array index of 2
                {65}                          // SINGLE ARRAY at 2D Array index of 3
        };
        System.out.println(multi.length); // 4
        System.out.println(multi[0].length); // 3
        System.out.println(multi[1].length); // 4
        System.out.println(multi[2].length); // 2
        System.out.println(multi[3].length); // 1
        System.out.println("========");
        System.out.println(multi[1][2]); // 5646
//        System.out.println(multi[3][2]);  //ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1

        System.out.println("---------");
        System.out.println(multi[1]); // single array how to print
        System.out.println(Arrays.toString(multi[1]));




    }
}
