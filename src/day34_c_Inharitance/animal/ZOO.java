package day34_c_Inharitance.animal;

public class ZOO {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.type = "General Animal";
        a1.numberOfLegs = 0;
        a1.walk();
        //a1.road();// Invalid: Parent class can not access child class members
        //a1.bark();// Invalid: Parent class can not access child class members

        Dog dog1 = new Dog();
        dog1.type = "German Shepard";
        dog1.walk(); // child class can access parent class members
        dog1.bark();// child class can access its own member
        //dog.roar(); dog class has no such method



        Lion lion1 = new Lion();
        lion1.type = "Arctic Lion";
        lion1.walk();
        lion1.roar();
        //lion1.bark(); lion class has no such method
    }
}
