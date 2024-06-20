package day40_exception.learn_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Enter a number: ");
            int userNumber = input.nextInt(); // one - InputMismatchException

            System.out.println("Enter another number: ");
            int userNumber2 = input.nextInt(); //InputMismatchException

            System.out.println(userNumber/userNumber2); // ArithmeticException

       }catch (InputMismatchException e ){
            e.printStackTrace(); // show me the exception in details in console
        }catch (ArithmeticException e){
            e.getMessage();
        }finally {
            System.out.println("FINALLY BLOCK");
            input.close();
        }




        System.out.println("Done");


    }
}
