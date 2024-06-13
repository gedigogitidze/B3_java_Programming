package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifiers;

public class AccessOutsidePackage {

    //In the Different Class - Different Package
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        // Since it is in the same class and package we can access -  public, private and default
        System.out.println(obj.a);
       // System.out.println(obj.b);
       // System.out.println(obj.c);


        // Since it is in the same class and package we can access -  public, private and default
        System.out.println(AccessModifiers.x);
      //  System.out.println(AccessModifiers.y);
       // System.out.println(AccessModifiers.z);


        /**
         * NOTE:
         * c and z variables are "private" access modifiers
         * That is why they are only accessible in the same class
         * In here, since we are in different package we can not access them
         *
         * b and y variables are "default" access modifiers
         * That is why thy are ONLY accessible in the SAME PACKAGE
         * In here, since we are in different package we can not access them
         */

    }
}
