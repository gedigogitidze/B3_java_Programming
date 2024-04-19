package day14_string;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Loopcamp";

        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));
        System.out.println("---------------------------");
        System.out.println(str.startsWith("Loopcamp"));
        System.out.println(str.startsWith("Loopcamp!"));
        System.out.println("---------------------------");
        String str2 = "Loop";
        System.out.println(str.startsWith(str2)); // does str start with str2 which is Loop? true
        System.out.println(str.startsWith(" Loop"));
        System.out.println("----------------------------");
        System.out.println( "Loop");
        System.out.println(str.startsWith(    "Loop"));
        System.out.println("------------------------------");
        String sentence = "today it was a Java day";
        System.out.println(sentence.startsWith("today it was"));
        System.out.println(sentence.startsWith("today it was aJava day"));
        System.out.println(sentence.startsWith("today "));
        System.out.println(sentence.startsWith("today"));
        System.out.println("-----------------------------");
        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day")); // 1 space its oki
        System.out.println(sentence.endsWith("  day")); // 2 spaces false
        System.out.println(sentence.endsWith(" Java "));
        System.out.println(sentence.endsWith("y"));
        System.out.println("-----------------------------");
        System.out.println(sentence.startsWith("today it was a Java day"));
        System.out.println(sentence.endsWith("today it was a Java day"));

        System.out.println("-----------------------------");
        boolean result1 = str.startsWith("Loop");
        boolean result2 = str.endsWith("camp");


    }
}
