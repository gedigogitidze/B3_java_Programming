package day10_if_statements;

public class IfWithoutBrackets {
    public static void main(String[] args) {

        if (4>2){
            System.out.println("Hello");
            System.out.println("Bye");
        }

        if (1>2)
            System.out.println("hello2"); // you can do this ONLY if u have one statement
            System.out.println("Bye2");


            if ( 10 % 5 ==0){
                System.out.println("Divisible");
            }else{
                System.out.println("Not divisible");
            }



            if (10 % 5 ==0)
                System.out.println("Divisible");
            else
                System.out.println("Not Divisible");
        System.out.println("Testing");  // this does not have anything to do with the if else above

//        else {
//            System.out.println("Bye3");      // we cant have just single else
//        }





        /*
        if (5>2)
             System.out.println("Loopcamp");
             else{
             System.out.println("Loopcamp2");
             System.out.println("Loopcamp3");
        }
         */
    }
}
