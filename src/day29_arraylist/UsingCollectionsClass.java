package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,6,2,27,40,234,38));
        System.out.println(list);

        // .sort();
        Collections.sort(list); // sorted in ascending order from small to big
        System.out.println(list);

        //.reverse ()
        Collections.reverse(list); // reverse the order
        System.out.println(list);

        System.out.println("=============");
        ArrayList<Character> letters = new ArrayList<>( Arrays.asList('A','B','D','C'));
        System.out.println(letters);
        Collections.sort(letters);
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters);
        System.out.println("=============");

        // max() and min()
        System.out.println(Collections.max( list )); // shows me the biggest number in arraylist
        System.out.println(Collections.min( list )); // shows me the smallest number in arraylist


        // .swap() // we can change places of elements
        Collections.swap(letters,0,3);
        System.out.println(letters);

        //.frequency() // tells us how many times did the element accured
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11,11,20,11,20,30));
        // [11,11,20,11,20,30]
        // "aabbccccddee

        System.out.println(Collections.frequency(numbers,11)); //3

        String str = "aabbcccccdde";
        ArrayList<String> word = new ArrayList<>( Arrays.asList(str.split("")) );
        String checked = "";
        for ( String each :word ){
            if(!checked.contains(each)){
                System.out.println(each+": "+Collections.frequency(word,each));
                checked+=each;
            }

        }

        ArrayList<String>stringArrayList = new ArrayList<>( Arrays.asList("one","five","two","five","ten") );

        System.out.println( Collections.frequency(stringArrayList,"six"));
        System.out.println( Collections.frequency(stringArrayList,"five"));
        System.out.println( Collections.frequency(stringArrayList,"ten"));
    }
}
