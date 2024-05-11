package day24_methods;
/*
unlock car
open the door
sit in the car
close the door
put the sit belt on
start the engine
put into drive and go
 */
public class Car {
    public static void unlockCar () {
        System.out.println("Unlocking the car");
    }

    public static void openDoor () {
        System.out.println("Opening the door");
    }

    public static void getInTheCar () {
        System.out.println("Sitting in the car");
        System.out.println("Close The Door");
    }

    public static void getReady(){
        System.out.println("Put the sit belt on");
        System.out.println("Check the mirrors");
        System.out.println("Put the music on");
        System.out.println("Put the navigation");

    }

    public static void startCar() {
        System.out.println("Starting car");
    }

    public static void driveGo() {
        System.out.println("Putting gear into D");
        System.out.println("Press gas pedal to go");
    }


    public static void goInHurry () {

        unlockCar();
        openDoor();
        getInTheCar();
        startCar();
        driveGo();
    }

    public static void main(String[] args) {

        driveGo();
        startCar();
        getReady();
        getInTheCar();
        unlockCar();
        unlockCar();
        unlockCar();
        openDoor();
    }
}
