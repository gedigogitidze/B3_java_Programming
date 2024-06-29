package day44_map_and_functions.string_builder_buffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {

        //1.String Class
        // Strings are ***IMMUTABLE*** - we can not change
        String  str1 = " loopcamp";                      // Stored in String pool in Heap
        String  str2 = new String("loopcamp");   // Directly in Heap
        str1 = str1 + str2;                             // IMMUTABLE  - we can not change it - here we created a nex String



        //2. StringBuilder Class
        //  it is in java.lang package
        // ****MUTABLE*******     ---> once object is created we still can change the SAME object
        //It is not synchronized
        //It can only be created by using "new" keyword

        StringBuilder str3 = new StringBuilder("loopcamp"); // Stored directly in Heap
        System.out.println(str3);
        str3.append(" course");
        System.out.println(str3);


        //3.StringBuffer Class
        // It is in java.lang package
        //***MUTABLE**** once object is created we still can change the SAME object
        // It is synchronized
        // It can be only be created using "new" keyword


        StringBuffer str4 = new StringBuffer("loopcamp");
        System.out.println(str4);
        str4.reverse();
        System.out.println(str4);




    }
}
