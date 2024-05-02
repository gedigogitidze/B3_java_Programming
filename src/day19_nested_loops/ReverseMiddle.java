package day19_nested_loops;
/*
    Reverse only second word [String, Loops]

    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java

        Ouput:
        I evol java


 */
public class ReverseMiddle {
    public static void main(String[] args) {


        String str = "You love java";
                    //
        int firstSpaceIndex = str.indexOf(" "); // 3
        int lastSpaceIndex = str.lastIndexOf(" ");// 8

        String middle = str.substring(firstSpaceIndex+1,lastSpaceIndex);
        String reverse = "";


        for (int i = middle.length()-1; i >= 0; i--) {
            reverse+=middle.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(str.substring(0,firstSpaceIndex+1)+ reverse+ str.substring(lastSpaceIndex));
    }
}
