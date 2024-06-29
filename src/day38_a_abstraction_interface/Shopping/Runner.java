package day38_a_abstraction_interface.Shopping;

public class Runner {
    public static void main(String[] args) {
        // can i create obj of Shopping, Shipping ??
        // No, because shopping is abstract class
        //No, because Shipping is interface

        // Cna i make object of Target
        // yes
        Target target = new Target();
        target.price = 10;
        target.buyItem();
        target.returnItem();
        //target.payForShipping(true);
        // no relation does not implement

        System.out.println("===========");
        Amazon amazon = new Amazon();
        amazon.price = 300;
        System.out.println(amazon.price);
        amazon.payForShipping(true);
        amazon.buyItem();
        amazon.viewCart();

    }
}
