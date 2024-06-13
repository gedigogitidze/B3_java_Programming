package day16_loops;
/*
    [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.
        Ex:
        Input: elephant
        Output: The middle characters: ph
 */
public class MiddleChar {
    public static void main(String[] args) {

        //"abcdef" --->6 - even --->cd
        // "abcde" ---->5 - off ---> c

       String str = "abcdef";
       if(str.length()%2 == 0) { //even
                str.substring(str.length()/2-1,str.length()/2+1); // 2, 3 -- > cd
       }else {
           //odd
           str.substring(str.length()/2,str.length()/2+1);
       }
    }
}
