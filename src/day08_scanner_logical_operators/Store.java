package day08_scanner_logical_operators;

public class Store {
    public static void main (String [] args){

        String store = "Target";
        int numOfTv = 100;

        System.out.println("In the " +store+" store, there are "+numOfTv+" Tvs.");
        System.out.println("Someone comes into store and purchased 1 TV");
        //numOfTv--;
        //--numOfTv;
       // numOfTv-=1;
        System.out.println();
        System.out.println("Now, in the store we have "+--numOfTv+" Tvs.");
        System.out.println("Another person comes into store and purchased 1 TV");
        System.out.println("Now, in the store we have "+--numOfTv+" Tvs.");


        System.out.println("Another person comes in and puts 1 TV into the shopping cart");
        System.out.println("Now, in the store we have "+numOfTv--+" Tvs");



    }
}
