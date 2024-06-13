package day31_custom_classes;
/*
    Create a class Car

    create instance variables:
    model, year, color, fuel level (percent number)

    create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

    Create a separate class to create Car objects and test the methods created
 */
public class Car {

  //  model, year, color, fuel level (percent number)
    String model;
    String color;
    int year;
    double fuelLevel;



    public String toString() {


        //String msg
        return "Model: " + model
                + "\nYear: " + year
                + "\nColor: " + color
                + "\nFuel Level: " + fuelLevel;

        // i can generate this
    }

    public void drive (){
        System.out.println("Driving: "+model);
        fuelLevel -=5;
    }
    public void fillTank(){
        System.out.println("Filling tank.");
        fuelLevel = 100;
    }


    public boolean isLow (){
        boolean result = false;
        if(fuelLevel < 25){
            result = true;
        }
        return result;
    }
}


//class Runner {
//    public static void main(String[] args) {
//        Car obj = new Car();
//    }
//}
