package day18_loops;

public class PrintEachChar {
    public static void main(String[] args) {

        String str = "loopcamp";  // 8
        //            01234567

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));


        System.out.println("This is with the loop");
        for (int i = 0; i <= str.length() - 1; i++) {  // [7 <= 8-1] --- [7 < 8]
            System.out.println(str.charAt(i));
        }

        // i <= str.length()-1 --- > 7 <= 8-1
        // i < str.length() ------ > 7 < 8


        System.out.println(str.contains("x"));

        if (str.indexOf("x") == -1) {
            System.out.println(false);
        }

    }
}
