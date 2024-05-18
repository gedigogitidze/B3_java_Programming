package day27_wrapper_arraylist;
/*
    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU
 */
public class CountCharacters {
    public static void main(String[] args) {
        String str  = "aP3d572&*jd@jdJU";
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(Character.isDigit(each)) {
                upper++;
            } else if (Character.isUpperCase(each)) {
                lower++;
            } else if (Character.isLowerCase(each)) {
                digits++;
            }else {
                others++;
            }

        }
        System.out.println("Uppercase letters count: "+upper);
        System.out.println("Lowercase letters count: "+lower);
        System.out.println("Digit letters count: "+digits);
        System.out.println("Other letters count: "+others);

        System.out.println(Integer.MAX_VALUE);  // these are not method. these are Constants which we will learn later
        System.out.println(Integer.MIN_VALUE);
    }
}
