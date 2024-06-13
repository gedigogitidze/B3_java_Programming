package day36_inheritance.static_hide;

public class Soccer extends Sports {

  //  @Override  - - > Static methods do not get Overridden
    public static void cheer() {
        System.out.println("Cheering from parent class");


    }

    /*
    it looks like we are overriding but we are not because method is static method, we are hiding the cheer method from parent class
     */
}
