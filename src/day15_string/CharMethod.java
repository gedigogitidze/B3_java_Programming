package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String str = "loop";
        //            0123     ---> indexes
        //               (number of characters -1)
        //count of char 4 characters
        System.out.println(str.length()); //4

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        char first = str.charAt(0); // charAt(index); method returns us a SINGLE CHARACTER

       // System.out.println(str.charAt(4)); // it gives StringIndexOutOfBoundsException error - and nothing in code after this line will run

        //can you give me last character of the String
        String longWord = "asegergqerghqegeqgwrgw  g    weg wegwefer tgetrww44wf,,wr-wr";
        //                 0123
        System.out.println(longWord.length());
        System.out.println(longWord.length()-1);
        System.out.println(longWord.charAt(   longWord.length() -1   ));

        // Can you get me the last 2nd character ??
        System.out.println(longWord.charAt(longWord.length()-2));

        // can you get me the last index ??

        System.out.println("Num of character: "+longWord.length());
        System.out.println("Last index of String: "+(longWord.length()-1));
        System.out.println("Last chat is: "+longWord.charAt(longWord.length()-1));








    }
}
