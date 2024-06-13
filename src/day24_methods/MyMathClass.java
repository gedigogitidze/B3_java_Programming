package day24_methods;

public class MyMathClass {
    // create 4 custom methods that calculates ADDITION,SUBTRACTIONS,MULTIPLICATION,   and DIVISION

    public static void addition (int num1,int num2){

        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    public static void subtraction (int num1, int num2){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }

    public static void multiplication (int num1,int num2){
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }
    public static void division (double num1, double num2){
       if (num2 == 0){
           System.out.println("Cannot divide by 0");
       }else {
           System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
       }
    }

    public static void main(String[] args) {

    addition(12,32);
    subtraction(3,5);
    multiplication(6,7);
    division(3,0);
    }
}
