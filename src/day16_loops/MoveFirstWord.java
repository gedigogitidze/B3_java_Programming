package day16_loops;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = key.nextLine().trim(); // Java is a fun language

        // take the part from sentence --> .substring(0, indexOfFirstSpace
        //                     how do i find index of first space); ---> .indexOf(" ");
//        int indexOfFirstSpace =sentence.indexOf(" ");
//        String firstWord = sentence.substring(0, indexOfFirstSpace);

        String firstWord = sentence.substring(0, sentence.indexOf(" "));
//        String restOfSentence = sentence.substring(sentence.indexOf(" ")+1);
//        String restOfSentence = sentence.substring(sentence.indexOf(" ")).trim();// is fun language
        String restOfSentence = sentence.substring(sentence.indexOf(" ")+1);// is fun language



//        System.out.println(firstWord);
        System.out.println(restOfSentence + " "+firstWord);// ---> Java is fun language Java

    }
}
