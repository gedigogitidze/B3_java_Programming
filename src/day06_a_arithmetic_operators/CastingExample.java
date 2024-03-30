package day06_a_arithmetic_operators;

public class CastingExample {

    public static void main(String [] args){

        int num1 =40;
        float num2 =num1;  //int is smaller than float. implicit /automatic casting happens
        System.out.println(num1);
        System.out.println(num2);


        float num3 =10.5f;
        short num4 =(short)num3;    //short is smaller than float. we need casting - explicit/manual/narrowing casting - data loss
        System.out.println(num3);
        System.out.println(num4);



       float num5 = 300.77f;
       byte num6 = (byte)num5;//byte is smaller than float we need Casting - Explicit/Manual/Narrowing casting-DAta loss

        System.out.println(num5);
        System.out.println(num6);

        //I can convert char to int because each character has a number assigned to it
        // So, i am actually converting number datatype to number datatype
        char letter = 'A';
        int letterInt = letter;

        System.out.println(letter);
        System.out.println(letterInt);
        System.out.println('B');
        System.out.println((int)'B');

        System.out.println('6');
        System.out.println((int)'6');
    }
}
