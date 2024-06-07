package day35_inheritance.book;

public class AudioBook extends Book {
double duration; // 30 mins long audio
    String narrator; // who reads it


    public void listen()  {
        System.out.println("Listening to "+title+ " Narrated by "+narrator);
    }



}
