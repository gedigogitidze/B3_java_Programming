package day10_if_statements;
/*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
    find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
 */
public class CheckCharacter {
    public static void main(String[] args) {
        char letter = 'B';

        if (letter >= 'a' && letter <='z'){
            System.out.println("It is a lowercase");}


//        }else {
//            System.out.println("It is an UPPERCASE");
//        }


        if (letter >= 'A' && letter <='Z'){
            System.out.println("It is a Uppercase");
        }

/*

if color is red
do...........
if color is green
do ..........
if color is yellow
do...........


 */



    }
}


