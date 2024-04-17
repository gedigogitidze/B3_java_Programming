package day12_switch_statements;
/*
create a class Diver

You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
    Above 70 - Don't go too far
    Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
 */
public class Diver {
    public static void main (String [] args){
        System.out.println("Hello world");
        int oxygenLvl= 80;
         // you need to be careful with the order of else if sequence.
//        if(oxygenLvl >50 && oxygenLvl<=60){
//            System.out.println("Be careful");
//        } else if (oxygenLvl>60) {
//            System.out.println("Start to head back");
//
//        }

         //    if you want to to with this order you have to apply range with ur logic
        //        if(oxygenLvl >50 && oxygenLvl<=60){
//            System.out.println("Be careful");
//        } else if (oxygenLvl>60) {
//            System.out.println("Start to head back");
//
//        }



        if (oxygenLvl>90){
            System.out.println("Your tank is full");
        }else if (oxygenLvl>80){
            System.out.println("Still okay");
        }else if (oxygenLvl>70){
            System.out.println("dont go to far");
        } else if (oxygenLvl>60) {
            System.out.println("Start to head back");
        }else if (oxygenLvl>50){
            System.out.println("be careful no u at 50%");
        }else{
            System.out.println("See you in heaven");
        }


    }
}
