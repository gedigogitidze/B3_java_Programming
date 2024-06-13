package day37_a_abstraction.book;

public class Runner {
    public static void main(String[] args) {
     //   Create obj = new Create(); // can not create an object of interface baby :)

        Book obj2 = new Book();
        obj2.read();
        obj2.write();
        System.out.println(obj2.NAME);
    }
}
