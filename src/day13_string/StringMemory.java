package day13_string;

public class StringMemory {
    public static void main(String[] args) {

        //Option 1- by STRING LITERALS
        String str1 = "java";



        //Option 2- by "new" keyword   ----- > we actually creat an Object
        String str2 = new String ("java");

        String str3 = "java";
        String str4 = "javac";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("---------------");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);

        // == ------------- > with this relational operator, when it is used with String ...it compares the Memory Location


    }
}
