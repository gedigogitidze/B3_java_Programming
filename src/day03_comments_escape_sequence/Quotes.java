package day03_comments_escape_sequence;

public class Quotes {
        public static void main (String[] args) {

    /*
    Q:How can you run this:
    I like "java" programming,
    */


    System.out.println("i Like \"java\" programming");
    System.out.println("This is a q double quote");
    System.out.println("\"This is a q double quote\"");

    /*
    Q: How About if  i want to print following

     The car has on\off button
     */
            System.out.println("The car has on\\off button");
            //The first backward slash is for syntax
            //second backword slash is for the text to be print out


            /*
            Q: how about i want to print double backward slash
            The car has on\\off button
             */
            System.out.println("the car has on\\\\off button");// on\\off
            // for forward slash we do not need any escape sequence
            System.out.println("The password can be true/false");

    }
}
