package day21_arrays;
/*
        Biggest Substring of matching characters
        Given a String find the biggest substring of chars that match and print it.
        Ex : aaabbbcccccddddee Otput:ccccc
 */
public class BiggestSubstring {
    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";
        String first = "";
        String longest = "";

        for (int i = 0; i < str.length()-1; i++) {

            first += str.charAt(i);
            if(str.charAt(i) != str.charAt(i+1)){// when the caharacter is not matching the next one
                if (first.length() >longest.length()){
                    longest = first;
                }
                first = "";
            }
        }
        System.out.println(longest);
    }
}
