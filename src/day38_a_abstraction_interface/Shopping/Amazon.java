package day38_a_abstraction_interface.Shopping;

public final class Amazon extends  OnlinneShopping{
    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }

    @Override
    public void payForShipping(boolean hasPrime) {
        System.out.println(hasPrime?"No cost for shipping ": " Paying for shipping");


    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon");

    }
}
