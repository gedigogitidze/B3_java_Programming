package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {

       // String str = "aP3d572&*jd@jdJU"; // char []
        String str = "ABCD123$%#@456EFG!"; // char []
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
         //list.addAll( Arrays.asList(str.split("")) ); // same thing as above
        System.out.println(list);


        ArrayList<String> numbers = new ArrayList<>(list);
        // i said anything from bottom if matches keep it
        numbers.retainAll( Arrays.asList( "0", "1", "2", "3", "4", "5", "6", "7", "8", "9") );

        System.out.println(numbers);

        ArrayList<String> special = new ArrayList<>(list);
        special.retainAll(Arrays.asList("!","@","#","$","%","%","^","&","*", "(", ")", "-"));
        System.out.println(special);

        ArrayList<String> letters = new ArrayList<>(list);
        letters.retainAll(numbers);
        letters.retainAll(special);
        letters.retainAll(letters);
    }
}
