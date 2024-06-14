package day38_a_abstraction_interface.Shopping;
/*
Create a concrete class Target
- Make the class final []
- Inherit Shopping and implement all abstract methods
 */
public class Target extends Shopping {
    @Override
    public void buyItem() {
        System.out.println("Buying from target");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");

    }
}
