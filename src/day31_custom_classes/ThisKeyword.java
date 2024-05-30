package day31_custom_classes;

public class ThisKeyword {
    // instance variable
    int a = 100 ;


    //                  Local variable
    public ThisKeyword(int a ){

        a = a;//
        // how can I make a difference between LOCAL and INSTANCE variables if they have SAME NAMES...
        System.out.println(a); // This is LOCAL VARIABLE --->a
        System.out.println(this.a); // THIS IS INSTANCE VARIABLE --- > a
        this.a = 400;
    }



}
