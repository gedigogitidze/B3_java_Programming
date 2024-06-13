package day33_b_encapsulation.access_modifiers;

public class AccessModifiers {
    public int a; // Instance Variable - public access modifier
    int b;         //  Instance variable - default access modifier
    private int c; // Instance variable - private access modifier



    public static int x ;// STATIC Variable - public access modifier
    static int y ; //       STATIC  variable - default access modifier
    private static int z;// STATIC variable - private access modifier

    // In the SAME CLASS - SAME PACKAGE(Automatically in same package)
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        // Since it is in the same class and package we can access -  public, private and default
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);


        // Since it is in the same class and package we can access -  public, private and default
        System.out.println(AccessModifiers.x);
        System.out.println(AccessModifiers.y);
        System.out.println(AccessModifiers.z);
    }
}
