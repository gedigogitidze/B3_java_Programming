package day38_a_abstraction_interface.animal;

public class Dog extends  Animal{

    double beakSize;


    @Override
    public void eat() {
        System.out.println("Dog eats from bowls");

    }
}
