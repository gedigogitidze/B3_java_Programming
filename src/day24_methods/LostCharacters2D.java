package day24_methods;

import java.util.Arrays;

public class LostCharacters2D {
    public static void main(String[] args) {

        String [] []  words = {
                {"James","is","back"},
                {"he","was","never","gone"},
                {"methods","tomorrow"}


        };
       // System.out.println(Arrays.deepToString(words));

        System.out.println("-----------------------");
        for (String [] eachArr:words) {
            //eachArr ===> this is single array on each cycle
            // System.out.println(eachArr); ===> not valid Array print way
            System.out.println(Arrays.toString(eachArr));

            for (String eachElem : eachArr) {
                System.out.print(eachElem.charAt(eachElem.length() -1));
            }




        }


        System.out.println("==================");
        for (int i = 0; i < words.length; i++) {
            //words [i] ===> this is single array on each cycle
          //  System.out.println(words[i]);===> not valid Array print way
           // System.out.println(Arrays.toString(words[i])); correct way

            // how do i print
            for (int j = 0; j < words[i].length; j++) {
                //each element ?
                //words [i][j] ===> String each elem
                System.out.print(words[i][j].charAt(words[i][j].length()-1));

            }

            System.out.println();
        }
        System.out.println();
    }
}
