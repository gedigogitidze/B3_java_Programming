package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String str = "loopcamp";
        char [] letters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            letters[i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(letters));


        // The method .toCharArray(); converts the String into char [] -- this will do the same thing above
        char [] letters2 = str.toCharArray();
        System.out.println(Arrays.toString(letters2));


        System.out.println("----------");
        String word = "javav";

        //word.toCharArray(); //"java" ------ > ['j', 'a', 'v', 'a']
        //System.out.println(Arrays.toString(word.toCharArray()).substring(1, Arrays.toString(word.toCharArray()).length()-1));

        System.out.println(Arrays.toString(word.toCharArray()));

        for ( char each : word.toCharArray()) {
            System.out.println(each);
        }


        System.out.println("-----------");
        char [] letters3 =  {'j', 'a', 'v', 'a'};
        System.out.println(Arrays.toString(letters3));

        for ( char each : letters3) {
            System.out.println(each);
        }



    }
}
