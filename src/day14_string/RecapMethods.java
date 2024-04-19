package day14_string;

import com.sun.jdi.PathSearchingVirtualMachine;

public class RecapMethods {
    public static void main(String[] args) {
        String s = "pen"; // s is a String declared by LITERALS and stored in STRING POOL in HEAP
        String s2 = new String("pen"); // s2 is a String object but declared by "new" keyword and stored in HEAP


        System.out.println("Compare with == :\t\t" + (s == s2)); // == ------ > compares the Memory locations . thats why its false
        System.out.println("Compare with .equals():\t" + s.equals(s2)); // .equals(); -- > Compares the value and since they are same its true
        System.out.println("Compare with .equals():\t" + s.equals("Pen"));//pen Vs Pen --> false
        System.out.println("Compare with .equals():\t" + s.equalsIgnoreCase("Pen"));// pen Vs Pen (ignoring cases) is true


        boolean isSame = s.equalsIgnoreCase("PENN");// pen vs PENN (penn) one more so false


        if (isSame) {
            System.out.println("By ignoring the case sensitivity the result is true");
        } else {
            System.out.println("Even ignoring the case sensitivity, the result is false");
        }
        int numOfCharacter = s2.length();// returns number in int datatype
        System.out.println("Number of characters in s2: " + numOfCharacter);

        int a = 9;
        // a.length();  cant do this because .length() method belongs to String class
        int num = (a + "").length();// a + ""-----> "9" ---->1
        System.out.println(a);
        System.out.println((a + "").length()); // a +"" --->"9" ----> 1
        System.out.println(a + ""); // 9 +"" -----> "9"

        if (num % 2 == 0) {
            System.out.println("length of num is even number");
        } else {
            System.out.println("length of num is odd number");
        String word = "loopcamp";

        if (word.length() % 2 == 0) {
            System.out.println("length of num is even number");
        }

        }
    }
}
