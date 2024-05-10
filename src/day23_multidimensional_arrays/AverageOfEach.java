package day23_multidimensional_arrays;

import java.util.Arrays;

/*

            Given a 2D array find the average of each inner array
            and extra: average of the whole array

            Ex:

                3, 4, 5, 6
                5, 2, 6
                10, 20, 30

 */
public class AverageOfEach {
    public static void main(String[] args) {

        int [] [] nums = {
                {3,4,5,6},
                {5,2,6},
                {10, 20, 30}
        };

        //int sum = 0;

        int totalSum = 0;
        int totalElem = 0;

        // OUTER LOOP will get single dimensional array
        for( int [] eachSingleArray :nums ) {
          double sum = 0;
            //INNER LOOP will get each element in SINGLE DIMENSIONAL array
            for (int eachElemennt : eachSingleArray){

            sum+=eachElemennt;
           // totalSum +=eachElemennt;

            }
            totalSum+=sum;
            totalElem+=eachSingleArray.length;

            System.out.println("Average of: "+ Arrays.toString(eachSingleArray) + ": ==== "+sum/ eachSingleArray.length);
        }
        System.out.println("--------");
        System.out.println("2D array average: "+totalSum / totalElem);

    }
}
