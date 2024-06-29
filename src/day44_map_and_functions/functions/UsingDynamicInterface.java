package day44_map_and_functions.functions;

public class UsingDynamicInterface {
    public static void main(String[] args) {


        DynamicInterface <String> printEachChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));

            }
        };

        printEachChar.test("loopcamp");

        System.out.println("---------");

    DynamicInterface <Integer> printNumberFiveTimes = (n) -> {
        for (int i = 0; i < 5; i++) {
            System.out.println(n);
        }
    };

    printNumberFiveTimes.test(7);
    }
}
