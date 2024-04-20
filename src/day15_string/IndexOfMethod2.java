package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String s = "javaxa";
        //          012345

        System.out.println(s.indexOf("a")); //1
        System.out.println(s.lastIndexOf("a")); //3
        System.out.println("--------------");
        String s2 = "abcbcbcb";
        System.out.println(s2.indexOf('b'));//1
        System.out.println(s2.lastIndexOf('b'));//5
        System.out.println("------------");

        System.out.println(s2.indexOf("cb")); //2
        System.out.println(s2.lastIndexOf("cb"));//4

        System.out.println("-----------------");

        System.out.println(s2.indexOf("cbd"));
        System.out.println(s2.lastIndexOf("cbd"));
        System.out.println("-----------------");

        System.out.println(s2.indexOf("bc"));
        System.out.println(s2.lastIndexOf("bc"));

        System.out.println("-----------------");
        // abcbcbcb
        // 01234567
        System.out.println(s2.indexOf("bc",2));
        System.out.println(s2.lastIndexOf("bc",2));//5

        System.out.println("-------------");

        String s3 = "ababababab";
        //           0123456789
        System.out.println(s3.indexOf("b",4));//5
        System.out.println(s3.lastIndexOf("b",4)); //3

        String s4 = "ababababab";
        //           0123456789
        System.out.println(s4.indexOf("ba",2));//3
        System.out.println(s4.lastIndexOf("ba",6)); //5
    }
}
