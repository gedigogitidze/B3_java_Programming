package day34_c_Inharitance.person;

public class Building {
    public static void main(String[] args) {
        Person person1 = new Person();




        person1.name = "General Name";
        person1.age = 0;
        person1.talk();
        //person1.study(); // parent call cannot reach anything from chid
        //person1.isHappy = true; cant reach this

        Student s1 = new Student();

        s1.name = "Winnie"; // Child class can access to Parent class members
        s1.age = 18; //  Child class can access to Parent class members
        s1.talk();// Child class can access to Parent class members
        s1.study();// Child class can access to its own class members
        s1.isHappy = true;

        OnlineStudent o1 = new OnlineStudent();
        o1.name = "tom";
        o1.isHappy = true;
        o1.zoomLinkAddress = "rgerhe5he5h";


    }
}
