package day04_variables;

public class FloatingNumbers {
    //in java you cannot store fractions. ------> 3/4
    public static void main (String [] args) {

        System.out.println(3/4);//0.75

        //how we store decimal numbers: 4.5 or 5.99
        double price = 3.99;  //this is the one that is used for DECIMAL numbers almost always

        float average = 0.19F;
        System.out.println(price);   // here the DT is;  double
        System.out.println(average); // here the DT is;  float f/F
        System.out.println(4.5); // here by default DT is; double

    }

}
