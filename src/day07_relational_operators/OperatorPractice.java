package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {
        int b =10;
        b++; // b= b+1; -----post increment
        System.out.println(b);// 1 action print the value
        b--; // post decrement ...just a standalone statement to update b value by - 1
        System.out.println(b);// 1 action print value of b


        System.out.println(b++);// two actions : print and update +1
                                // 1st - use it
                                // 2 nd - update

        System.out.println(b--); // 11     ----> b= 11-1=10
        System.out.println(b);//10






    }
}
