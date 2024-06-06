
// Import all static things in utill package specifically Arrays class
// if you do static import all the non-static things are not accessible
package day34_b_encapsulation;

import static my_utilities.StringUtil.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;


public class WithImport {
    public static void main(String[] args) {
        int [] a = {81,23,65,33};
        sort(a);
        //Arrays.sort(a);

        System.out.println(PI);
        // System.out.println(Math.PI);

        System.out.println(reverse("Java"));
        //System.out.println(StringUtil.reverse("java"));


    }
}
