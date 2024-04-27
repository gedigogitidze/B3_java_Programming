package day18_loops;

public class Backwards {
    public static void main(String[] args) {

        // can you print the numbers starting from 20 and print until 0
        for (int i =20; i >=0 ; i--) {
            System.out.println(i);
        }
        System.out.println("--------------");
        String str = "loop";
//        System.out.println(str.charAt(str.length()-1));
        for (int i =str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
