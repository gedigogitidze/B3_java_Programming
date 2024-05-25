package day30_b_custom_classes;

public class App {
    //INSTANCE VARIABLES / DATA MEMBERS
    // THESE ARE NOT IN METHOD they are directly in the CLASS LEVEL
    // NOTE: If variables are declared in METHODS, they are called LOCAL VARIABLES
    String name;
    double version;
    boolean isFree;

    //This method is INSTANCE METHOD  - does not have static keyword
    // Each object will run its own version
    public void run() {
        System.out.println(name + " is running");
    }

    public void update() {
        System.out.println(name+" is updating...");
        version+=1.1;
    }


}
