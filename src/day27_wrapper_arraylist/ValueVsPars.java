package day27_wrapper_arraylist;

public class ValueVsPars {
    public static void main(String[] args) {


        String s = "30";
        // what this does?
        int num1 = Integer.parseInt(s); // converting String "30" into an int 30 [primitive]


        //okay now what does this do ?
        Integer num2 = Integer.valueOf(s);// converting String "30" into an INTEGER 30 [ wrapper class/ non-primitive / object type]

        int num3 = Integer.valueOf(s);
        /*
        Integer.valueOf(s); ------> converts String "30" intp INTEGER OBJECT ( Integer Wrapper Class Object)
        int num3 = ----> i am trying to store the value into a primitive variable

        primitive = object [unboxing]
         */
//
//        int a = 4;
//        byte b = (byte) a; // narrowing casting
//        System.out.println(a);
//        System.out.println(b);

        Integer num4 = Integer.parseInt(s);
        /*
        Integer.parseInt(s); ====> converts String "30" into primitive data type [int]
        Integer num4 = ---> i am trying to store the value An Integer type (Wrapper Class Object)

        object type = primitive [autoboxing]
         */








    }
}
