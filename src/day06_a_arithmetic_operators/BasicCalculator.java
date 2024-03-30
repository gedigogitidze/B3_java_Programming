package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main (String [] args){

        double num1 = 7; // the values datatype is int . Since we assigned it to double variable it was converted automatically into double
        double num2 = 5;

        double addition = num1+num2;
        double subtraction = num1-num2;
        double multiplication =num1*num2;
        double division = num1/num2;
        double remainder= num1 % num2;//module ------>7 / 5 =what ever is not Divisible will be remainder


        System.out.println(num1+" + "+num2+ " = "+ addition);
        System.out.println(num1+" - "+num2+ " = "+ subtraction);
        System.out.println(num1+" * "+num2+ " = "+ multiplication);
        System.out.println(num1+" / "+num2+ " = "+ division);
        System.out.println(num1+" % "+num2+ " = "+ remainder);


        num1 = 13;
        num2=5;
        remainder= num1 % num2;

        System.out.println(num1+" % "+num2+ " = "+ remainder); //what ever is not Divisible will be remainder 13/5 so 3


        /*
        13/5 = 2.6
        13 % 5 = 3
        13 - 5 =8
        8-5 = 3
        3-5 = this 3 stays
        5+5+ 3
         */

        int n1 =7;
        int n2 =5;
        int result = n1/n2;

        System.out.println(result);// 1.4 ----->1 data lose because of datatype


        System.out.println("------------------------------------------------------------");
        System.out.println(3.2+1); // 4 or 4.2 ----output is double

        int a =3;
        double d = 4; ///4.0
        System.out.println(a+d);  //

        byte b = 3;
        short s =7;
        System.out.println(b+s); // 10 -----int

        byte b2=3;
        short s2=7;
        short total= (short)(b2+s2); // by default anything smaller than int will become as int after any operation. so we need to cast it



      byte a1 =4;
      short a2 = 5;
        double d2 = a1+a2;


    }
}
