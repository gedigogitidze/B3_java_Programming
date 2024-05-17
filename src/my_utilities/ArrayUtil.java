package my_utilities;

import java.util.Arrays;

public class ArrayUtil {


    /**
     * This method returns the min number from array using sorted method
     * @param arr is the parameter that excepts array
     * @return the minimum number among all the numbers in array
     */


    public static int minNumInSortedArr (int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    /**
     * This method returns the min number from array using fori loop method
     * @param arr is the parameter that excepts array
     * @return the minimum number among all the numbers in array
     */
    public static int minNumInArr (int [] arr){
        int min = arr[0];
        for(int eachNum: arr){
            if(eachNum <min){
                min = eachNum;
            }
        }
        return min;
    }

    /**
     * This method returns the max number from array using sorted method
     * @param arr is the parameter that excepts array
     * @return the maximum number among all the numbers in array
     */
    public static int maxNumInSortedArr (int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    /**
     * This method returns the max number from array using fori loop method
     * @param arr is the parameter that excepts array
     * @return the maximum number among all the numbers in array
     */
    public static int maxNumInArr (int [] arr){
        int max = arr[0];
        for(int eachNum: arr){
            if(eachNum > max){
                max = eachNum;
            }
        }
        return max;
    }

    /**
     * This method checks if the given number exists in the array
     * @param arr is the given array to be checked
     * @param num is the given number to check if it exists in array
     * @return boolean if given num exists in array or not
     */
    public static boolean contains (int []arr, int num) {
        //boolean result = false;
        for (int eachNum: arr){
            if(eachNum == num){
                return true;
            }
        }


        return false;
    }

    /**
     * This method returns new array with added element at the end
     * @param original is an array where we will add an element to the end
     * @param elementToAdd is the element we will add to the end
     * @return new array with already added element
     */
    public static int [] addElementInArr (int [] original,int elementToAdd){

        int [] newArr = Arrays.copyOf(original,original.length+1);
        //                                                  {1,2,3, _ };
        newArr [newArr.length-1] = elementToAdd;

        return newArr;
    }

    //TODO: crate a reusable method that takes 2 int array and returns one array combined


    /**
     * This method finds the first matched elements index
     * @param array is the parameter where we will check for the element
     * @param num is the parameter where we will check if there is match to it
     * @return the index if there is a match and -1 if there is no match baby :)
     */

    public static int indexOf (int [] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                return i;
            }
        }


        return -1;
    }

    /**
     * This method finds the first matched elements index
     * @param array is the parameter where we will check for the element
     * @param word is the parameter where we will check if there is match to it
     * @return the index if there is a match and -1 if there is no match baby :)
     */

    public static int indexOf (String [] array, String word) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word) ){
                return i;
            }
        }


        return -1;
    }

    /**
     * This method sum up all the  elements in int array
     * @param nums is the array where I get all elements
     * @return sum of all the elements
     */
    public static int sum (int ... nums) {

        int sum = 0;
        for ( int each : nums) {
            sum += each;
        }
        return sum;
    }

}

