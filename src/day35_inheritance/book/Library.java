package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {

        Book obj1 = new Book();
        // obj1. - has access to 5 members of the class

        AudioBook ab1 = new AudioBook();
        //ab1. - has access to 7 instance variables  5 from parent +2 from itself and 1 instance method from itself
        ab1.duration = 100;
        ab1. narrator = "Morgan Freeman";
        ab1.listen();
        ab1.title = "Java is Fun";

        Ebook eb1 = new Ebook();
        //eb1. - has access to 7 instance variables  5 from parent +2 from itself and 1 instance method from itself

       // eb1.duration = 100 ; NOT reachable

        eb1.size = 10;
        eb1.pages = 600;
        eb1.title = "Soft Skills";
        eb1.read();

        //eb1.listen(); NOT reachable


       Author a1 =  new Author("Jojo Moyes",40);

        Book b1 = new Book();
        //b1.ha access to 6 instance variables
        b1.author = new Author("Gabriel Garcia", 90);
        System.out.println(b1.author);


        AudioBook audio1 = new AudioBook();
        audio1.author = new Author("Thomas Jefferson",80);

        System.out.println(audio1.author.getName());


    }
}
