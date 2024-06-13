package day31_custom_classes;

import day24_methods.Greeting;

public class UseTrafficLight {
    public static void main(String[] args) {

        //TrafficLight obj1 = new TrafficLight(); // this is our constructor
        //System.out.println(obj1.color);

        //obj1.color = "Green";
        //System.out.println(obj1.color);

        TrafficLight obj1 = new TrafficLight("Yellow");
        System.out.println(obj1.color);

        obj1.color = "Red";
        System.out.println(obj1.color);

        TrafficLight obj2 = new TrafficLight("Green");
        System.out.println(obj2.color);
    }
}


