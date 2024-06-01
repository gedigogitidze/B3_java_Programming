package day33_a_static;

public class BestBuy {
    //INSTANCE VARIABLE - They belong to Object
    String location;

    // STATIC VARIABLE  - They belong to class
    static String headquarters = "Richfield, 7601 Penn Ave S, United States";

    static int numOfComp = 100;
    static String specialDay = "Wednesday";

    public BestBuy(String location){
        this.location = location;
    }
    //=======================================================

    public void openStore(){
        System.out.println("Opening location in  "+location);
    }
    //Static method
    public static void reStock (){
        System.out.println("Today is "+specialDay+", Special day and we are restocking ");
        numOfComp = 200;
    }

}
