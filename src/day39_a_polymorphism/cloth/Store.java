package day39_a_polymorphism.cloth;

public class Store {
    public static void main(String[] args) {

        //ALL Possible References of TShirt
        // #1 - ITSELF

        TShirt t1 = new TShirt();
        t1.wear();


        // #2 - PARENT
        Clothes t2 = new TShirt();
         t2.wear();

        System.out.println("-----------");


        //ALL Possible References of Jacket
        // #1 - ITSELF
        Jacket j1 = new Jacket();
        j1.wear();
        j1.putOnHood();

        // #2 - Parent Class
        Clothes j2 = new  Jacket();
        j2.wear();
        //j2.putOnHood(); // in Clothes I do not have this method, so I cant reach it

        //#3 - INTERFACE
        HasHood j3 = new Jacket();
        // j3.wear(); // HasHood Reference does not have access to wear();
        j3.putOnHood();

        //Reference side is responsible weather or not i have access to methods and variables

        // #4 - Object
        Object j4 = new Jacket();
        //j4.wear();// Object reference does not have access to the wear();
        //j4.putOnHood();// Object reference does not have access to the putOnHood();

        System.out.println("-----------");

      //  buy(); i cant call because static only accepts static and main method is static
        TShirt ts = new TShirt();
        //References Itself --> TShirt ts = new TShirt():
        //References Parent --> Clothes ts = new TShirt():
        Jacket jt = new Jacket();
        //References Itself --> Jacket jt = new TShirt():
        //References Parent --> Clothes jt = new Jacket();
        //Reference Interface --> HasHood jt = new Jacket();
        buy(ts); // buy ( new TShirt() );
        buy(jt);
        buy(new TShirt());
        buy(new Jacket());

        HasHood jj3 = new Jacket();
        buy( (Jacket)jj3) ; //  HasHood jj3 = new Jacket(); -- > Jacket jj3 = new Jacket();
        //buy( (jj3) ); //  HasHood jj3 = new Jacket(); -- > Clothes close cannot accept HasHood jj3
    }
    public static void buy (Clothes  clothes) {// Clothes clothes = new TShirt();


        if(clothes instanceof TShirt){
            //Clothes clothes = new TShirt();---> new TShirt(); is instanceOf TShirt
            //Clothes clothes = new Jacket(); --- > new TShirt(); is instanceOf TShirt
            System.out.println("Bought TShirt");
        } else if (clothes instanceof  Jacket) {
            //Clothes clothes = new Jacket(); --- > new TShirt(); is instanceOf Jacket
            System.out.println("Bought a Jacket");

        }

    }
    public static  void test (String str) {

    }
}
