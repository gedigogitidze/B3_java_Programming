package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {


        // #1 all possible reference  / object - Lizard
        //Reference Itself
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Lizard";
        System.out.println(l1.name);


        //#2 - all possible reference / object - Reptile
        Reptile r1 = new Reptile();
        r1.eat();
        r1.name = "Reptile";
        System.out.println(r1.name);

        System.out.println("=================");

        // Reference Super/Parent
        Animal l2 = new Lizard();
        l2.eat();
        // reach the eat method from parent but run the version from Object side
        // if child does not have overridden version of eat() it will run one from parent
        Animal r2 = new Reptile();
        r2.eat();





    }
}
