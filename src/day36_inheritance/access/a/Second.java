package day36_inheritance.access.a;
//same package - different class
// different class, same package

public class Second {
    public static void main(String[] args) {
        First obj = new First();  // since one has public access modifier, can access from anywhere

       System.out.println(obj.one);//since one has public access modifier, can access from anywhere in this project

       System.out.println(obj.two);// since one has protected access modifier, can access from same package

        System.out.println(obj.three);//since one has default access modifier, can access from same package

        // System.out.println(obj.four); // since one has private access modifier, can access from only same class

        /*
        Second obj2 = new Second ();
        // since there is no relation beetween the class which has members one, two , three, four... we can not access
        // Since Second class has no members called one two three four we can not access them
        obj2.one
        obj2.two
        obj2.three
        obj2.four
         */

    }
}
