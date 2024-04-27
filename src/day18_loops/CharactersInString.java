package day18_loops;

public class CharactersInString {
    public static void main(String[] args) {

        String str = "java";

        for (int i = 0; i < str.length() ; i++) {
            //int numChar = str.charAt(i);
            // System.out.println(numChar);
            System.out.println((int)str.charAt(i));

        }
    }
}
