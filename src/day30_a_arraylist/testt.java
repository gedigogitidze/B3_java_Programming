package day30_a_arraylist;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

public class testt {
    public static void main(String[] args) {
        String z = "popcorn";
        // z = z.substring(1,8);
        //   System.out.println(z);
//       String result = "jemali kai bichia";
//       String index = "";
//        for (int i = result.length()-1; i <=0 ; i--) {
//            index += result.charAt(i);
//        }
//        System.out.println(index);
//        String str [] = {"petre","pavle","jemali","muxrani","shalva"};
//
//       int b = str[4].length();
//        System.out.println(b);
        String[] words = {"one", "two", "Three", "four"};
        String [] other = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            other[i] = words[i]+words[i].length();
        }
        System.out.println(Arrays.toString(other));
    }
}

