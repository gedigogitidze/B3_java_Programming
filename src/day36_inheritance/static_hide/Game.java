package day36_inheritance.static_hide;

public class Game {
    public static void main(String[] args) {


        Sports.cheer(); //Calling cheer method from the sports class
        System.out.println();
        Soccer.cheer();
        // if  there is no same method declared in the child class it will still call the parent
        // if there is same method declared in the child class, it will call depending on whether you are using parent class to call or child class
        // if you use child class to call the same method the one from parent gets hidden


    }
}
