package day31_custom_classes;

public class UseCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);

        //car.model = 30 ; // since it is instance method, we cannot reach by class name
        car1.model = "Tesla";
        car1.year = 2020;
        car1.fuelLevel= 80.0;
        car1.color = "Red";

        System.out.println();
        System.out.println(car1);

        System.out.println();
        car1.drive(); // here it goes down from 80 to 75
        car1.drive(); // here it becomes 70 because driving takes of 5
        System.out.println(car1.fuelLevel);//should be 70


        System.out.println();
        car1.fillTank();
        System.out.println(car1.fuelLevel);


    }
}
