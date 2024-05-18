package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList <int> numbers = new ArrayList<>(); // ArrayList does not except primitive data types
        ArrayList<Integer> numbers = new ArrayList<>(); // at this line in my ArrayList there is no element.
                                                            // it preserved location for 10

        System.out.println(numbers);
        System.out.println(numbers.size());// Even-though the default capacity is 10 the size is 0 atm

        /*
        int num[] = {1,2,3,4};
        System.out.println(Arrays.toString(num));
        // add/assign to Array
        num[2] = 45;
        System.out.println(Arrays.toString(num));
        */


        // add/assign to ArrayList
        numbers.add(40); // added 40 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(-40);  // added -40 to the end of ArrayList
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);



        // in array how do we access each element: ===> num [index];

        //but in ArrayList
        // numbers[1];  <==> this doesnt work like this

        System.out.println(numbers.get(0)); // this is how it supposed to be
        System.out.println(numbers.get(1)); // this is how it supposed to be
        System.out.println(numbers.get(2)); // this is how it supposed to be
        System.out.println(numbers.get(3)); // this is how it supposed to be
       // System.out.println(numbers.get(4)); // IndexOutOfBoundsException same as array

        // how do we know the number of total elements in ArrayList
        // nums.length ===> in array

        System.out.println(numbers.size()); // ====> this is in ArrayList so | .size |

        System.out.println(numbers.add(4));
        System.out.println(numbers);
    }
}
