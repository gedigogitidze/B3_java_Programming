package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {


       BestBuy store1 = new BestBuy("Fairfax, VA");
       BestBuy store2 = new BestBuy("Bergenfield, NJ");
       BestBuy store3 = new BestBuy("Boston, MA");


        //System.out.println(BestBuy.location); // NOT VALID - For instance variables
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();
        store1.headquarters = "Tysons,123Test str, VA, United States";
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();
        store3.headquarters = "Chantilly,987 check Dr , VA, United States";
        store3.location = "Manhattan, NY";
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println(store1.headquarters); // we can still call static by object but it is not good practice
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        System.out.println(BestBuy.headquarters);
        //Anything static should be called by class name
        System.out.println("=======================");
        store1.openStore();
        store2.openStore();
        store3.openStore();

        System.out.println("=======================");
        BestBuy.reStock();
        store1.reStock(); // you still can call static method by object referance but not good practice
        System.out.println(store1.numOfComp);
        System.out.println(store2.numOfComp);
        System.out.println(store3.numOfComp);

    }
}
