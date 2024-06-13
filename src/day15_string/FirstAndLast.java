package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String sentence = key.nextLine(); // java is a fun coding language

        System.out.println(0+sentence.charAt(0));
        System.out.println(0+sentence.charAt(sentence.length()-1));

        System.out.println("First char: "+sentence.charAt(0));
        System.out.println("Last char: "+sentence.charAt(sentence.length()-1));

        //length
        //length();
    }
}
