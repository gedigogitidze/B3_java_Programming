package day24_methods;

public class MyFirstMethod {
    public static void main(String[] args) {

        System.out.println("Hello World1!");
        helloWorld(); // i called a method

        System.out.println("Hello World2!");
        System.out.println();
        helloWorld50();
    }

    public static void helloWorld50 (){
        for (int i = 0; i < 50; i++) {
           // System.out.println("Hello World50");
        helloWorld();
        }
    }

    public static void helloWorld () {
        System.out.println("Hello World!");
    }











}
