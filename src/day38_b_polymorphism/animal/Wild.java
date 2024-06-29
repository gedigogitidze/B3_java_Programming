package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {


        // #1 all possible reference  / object - Lizard
        //Reference Itself
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Lizard";
        l1.numOfLegs = 10;
        l1.skinColor = "Camo";
        System.out.println(l1.name);
        System.out.println(l1.numOfLegs);
        System.out.println(l1.skinColor);
        System.out.println();

// Reference side DETERMINES the accessibility
//        // reach the eat method from parent but run the version from Object side
//        // if child does not have overridden version of eat() it will run one from parent


        //Reference - Parent
        Reptile l2 = new Lizard();
        l2.eat();
        l2.name = "lizzard2";
        l2.numOfLegs = 12;
        //l2.skinColor = "Camo2"; // Reptile reference does not have access to skinColor variable
        System.out.println(l2.name);
        System.out.println(l2.numOfLegs);
        //System.out.println(l2.skinColor); // Reptile reference does not have access to skinColor variable
        System.out.println();


        //Reference - Grand/Super Parent
        Animal l3 = new Lizard();

        l3.eat();
        l3.name = "lizzard2";
        // l3.numOfLegs = 14;// Animal reference does not have access to numOfLegs var
        // l2.skinColor = "Camo2"; // Reptile reference does not have access to skinColor variable
        System.out.println(l3.name);
        // System.out.println(l3.numOfLegs);// Animal reference does not have access to numOfLegs var
        // System.out.println(l2.skinColor); // Reptile reference does not have access to skinColor variable
        System.out.println();

        /**
         * We Created 3 object of Lizard
         * 1 - Reference ITSELF - Lizard
         * 2 - Reference was Parent class - Reptile
         * 3 - Reference was GRAN Parent class - Animal
         */

        // #2 - - all possible reference / object - Reptile
        // Reference itself - Reptile
        // Reference Parent - Animal
      //   Animal r1 = new Reptile ();
       //  r1.numOfLegs = 20;












//
//        //#2 - all possible reference / object - Reptile
//        Reptile r1 = new Reptile();
//        r1.eat();
//        r1.name = "Reptile";
//        System.out.println(r1.name);
////
//        System.out.println("=================");
//
//        // Reference Super/Parent
//        Animal l2 = new Lizard();
//        l2.eat();
        // Referense side DETERMINS the accessibility
//        // reach the eat method from parent but run the version from Object side
//        // if child does not have overridden version of eat() it will run one from parent
//        Animal r2 = new Reptile();
//        r2.eat();





    }
}
