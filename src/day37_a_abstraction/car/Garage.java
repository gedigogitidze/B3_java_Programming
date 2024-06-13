package day37_a_abstraction.car;

public class Garage {
    public static void main(String[] args) {


     //   Car obj1 = new Car();//We CANNOT CREATE object of ABSTRACT CLASS
     //   obj1.start();


        Toyota obj2 = new Toyota();
        obj2.start();

        Honda obj3 = new Honda();
        obj3.start();

        //Both Toyota and Honda are CONCRETE Classes because they are not Abstract Class , we had to implement abstract methods from abstract parent class


//        ElectricCar electricCar = new ElectricCar(); // We CANNOT CREATE Object of this class

        System.out.println();

        Tesla obj5 = new Tesla();
        obj5.start();
        //start(): it was defined in Car class but implemented in Tesla
        obj5.charge();
        //charge(): it was defined in ElectricCar class but implemented in Tesla

        //Tesla is non abstract class (CONCRETE class), so it was required to implement ALL the abstract methods from all abstract parent classes

    }
}
