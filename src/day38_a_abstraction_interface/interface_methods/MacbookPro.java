package day38_a_abstraction_interface.interface_methods;

import day38_a_abstraction_interface.Shopping.Runner;

public class MacbookPro implements Mac {

    @Override
    public void turnOn(){
        System.out.println("Macbook Pro is turning on ....");

    }



}
class Runnner {
    public static void main(String[] args) {

        // Still good way to call
        System.out.println(MacbookPro.NAME); // you can use child class name to reach static variables inherited from parent interface
        System.out.println(MacbookPro.OS);// you can use child class name to reach static variables inherited from parent interface


        //best way to call interface name and OS
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);


        Mac.company();
        //Mac.faceTime(); //default method needs to be called from object
        //Mac.turnOn(); not valid since in mac interface there is no implementation of turnOn() method so i can not call it like this


        MacbookPro obj = new MacbookPro();
        obj.turnOn();
        obj.faceTime();
        //obj.company(); // static methods from interface , are not inherited, so they can not be accessed from object we need interface name to call it  


    }

}
