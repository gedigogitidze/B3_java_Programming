package day38_a_abstraction_interface.Shopping;
/*
Create an abstract class OnlineShopping
    -Inherit Shopping and implement Shipping
    - does not need to implement any abstract methods
    -Declare an abstract method
    viewCart()
 */
public abstract class OnlinneShopping extends Shopping implements Shipping{

    public abstract  void viewCart();


}
