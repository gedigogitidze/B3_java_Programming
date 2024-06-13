package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "    Thursday    ";
        System.out.println(str);
        System.out.println(str.length()); // 4 spaces start and end 4 so 8+ thursday = 16

        str = str.trim(); //this method cuts spaces  "____Thursday____"--->"Thursday"
        System.out.println(str.length());


        String str2 = "     Java is fun     ";
        System.out.println(str2.length()); //21
        str2 = str2.trim(); // trim removes spaces from beginning and end
        System.out.println(str2.length());// 11

        String str3 = "    loopcamp has Sdet program    ";
        System.out.println(str3.length()); //33
        System.out.println(str3.startsWith("loopcamp")); // this is false

        System.out.println(str3.trim());
        System.out.println(str3.length());//33 because i did not re assign

        str3 = str3.trim();
        System.out.println(str3.length());//22

    }
}
