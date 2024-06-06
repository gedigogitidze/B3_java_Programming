package day34_a_static;
/*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

 */
public class Computer {
    //Instance variables - Each OBJECT has its OWN COPY
    double price;
    String brand;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static{
        System.out.println("Running Static Block");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
        //price = 50; // this is Invalid input because static accepts only static
    }

    public Computer(double price, String brand,String color){
        System.out.println("Running Constructor");
        this.price = price;
        this.brand = brand;
        this.color = color;

    }



}
