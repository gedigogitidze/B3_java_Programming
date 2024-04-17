package day11_if_statements;

public class TernaryExample {
    public static void main(String[] args) {

        int a = 71;
        String evenOrOdd;
//Approach 1 with if else
        if(a % 2 ==0){
            evenOrOdd = "Even";
        }else {
            evenOrOdd = "Odd";
        }
        System.out.println("The number is "+evenOrOdd);




        // Approach 2 with Ternary
        evenOrOdd = (a % 2 ==0) ? "Even": "Odd";
        System.out.println("The number is "+evenOrOdd);


        System.out.println("-----------------------------");

        int num = -4;
        String positiveOrNegative;
        if(num < 0){
            positiveOrNegative= "Negative";

        }else{
            System.out.println("Positive");
        }

        positiveOrNegative =(num<0)? "Negative":"Positive";
        System.out.println(positiveOrNegative);

        positiveOrNegative = (num >=0)? "Positive":"Negative";

        System.out.println("-----------------------------");




        int time = 12;
        double price;

        //if time is between 10 and 15 the price will be 7.99 else the price is 10.99
        if(time >= 10 && time <=15){
            price = 7.99;

        }else{
            price = 10.99;
        }

        price = (time >= 10 && time <=15) ? 7.99:10.99;


    }
}
