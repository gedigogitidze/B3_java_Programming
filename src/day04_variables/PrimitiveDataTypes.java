package day04_variables;

/*
    Data Types
    Primitive - total 8
        integer types: Byte-short-int-long
        floating Types: float-double
        character: char
        true/false: boolean

        compiler uses int and double by default

        Non-primitive
        String: Multiple characters


 */

public class PrimitiveDataTypes {

    public static void main (String[] args) {


        byte age = 60;
        System.out.println("age");
        System.out.println(age);
        System.out.println(60);
        //byte age2 = 200; 200 is too big for byte data type


        short year; // declared a variable called year which has datayype short
        year=2024; // assigned a value, 2024, into ,y variable called year
        System.out.println(year); //datatype here is: short
        System.out.println(2024); //datatype here is: int



        int addressNumber=244432; //declared and assigned
        System.out.println(addressNumber); // datatype here is : int
        System.out.println(244432);   // datatype here is: int




        long bigNumber;
        bigNumber = 95344432231343L;  // putting L to the end of number, tells the compiler: it is: long number



    }

}
