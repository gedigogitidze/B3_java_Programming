package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [] [] groups2 = new String[4][3];// 2D array will hold total 4 SINGLE dimensional array which will have 3 elements on each
        System.out.println(Arrays.deepToString(groups2));
        System.out.println("==============");

        String [] [] groups = new String[4][]; // 2D array will hold total 4 SINGLE dimensional array
        System.out.println(Arrays.deepToString(groups));
        System.out.println("------------------");

        String [] groupTwo = {"Diliara","Laura","Alex"};
        groups[0] = groupTwo; // index
        System.out.println(Arrays.deepToString(groups));


        String [] groupThree = {"Alona","Roma","Kenan"};
        groups[2] = groupThree; // index
        System.out.println(Arrays.deepToString(groups));


        groups[3] = groupThree; // index
        System.out.println(Arrays.deepToString(groups));

        groups[1] = groups[0]; // index
        System.out.println(Arrays.deepToString(groups));

        groups [3] = new String []{"John","Mocky"};
        System.out.println(Arrays.deepToString(groups));

        System.out.println("=============+++++++++++");
        //String [] [] groups = [[Diliara, Laura, Alex], [Diliara, Laura, Alex], [Alona, Roma, Kenan], [John, Mocky]] how to loop

        for (String [] each : groups) { // this will loop through 2D array and get each SINGLE arrays
            // System.out.println(each); // cant print this because its array
           //  System.out.println(Arrays.toString(each)); // this can be printed

            for (String eachName :each) { // this will loop through each SINGLE array elements
                System.out.println(eachName);

            }
            System.out.println();

        }




    }
}
