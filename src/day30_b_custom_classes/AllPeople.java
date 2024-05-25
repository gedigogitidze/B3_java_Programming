package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPeople {

    public static void main(String[] args) {

//        These are not valid to reach INSTANCE VARIABLES
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(height);
//        System.out.printl(isMarried);


        // SAMPLE OF OBJECT WE LEARNED
        Scanner input = new Scanner(System.in);
        String str = new String("Hello");
        ArrayList <String> list = new ArrayList<>();



        // Object Referemce = Actual object
        Person person1 = new Person();
        Person person2 = new Person();

        // to Access the INSTANCE VARIABLES, I need to create an object and use the object reference with DOT operator
        System.out.println("Person 1 info");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println("=============");
        System.out.println("Person 2 info");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);


        // Now How to assign values
        // Lets have / assign some values to person1

        person1.name = "Tom";
        person1.age = 40;
        person1.height = 5.7;
        person1.isMarried = true;


        // Now How to assign values
        // Lets have / assign some values to person2

        person2.name = "Micky";
        person2.age = 35;
        person2.height = 5.11;
        person2.isMarried = false;


        System.out.println();
        System.out.println("After giving person1 and person2 values");
        System.out.println();


        System.out.println("Person 1 info");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);// Now How to assign values
        // Lets have / assign some values to person2

        person2.name = "Micky";
        person2.age = 35;
        person2.height = 5.11;
        person2.isMarried = false;
        System.out.println(person1.isMarried);
        System.out.println("=============");
        System.out.println("Person 2 info");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);



    }
}
