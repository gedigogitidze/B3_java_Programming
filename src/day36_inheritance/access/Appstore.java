package day36_inheritance.access;

public class Appstore {
    public static void main(String[] args) {
        Instagram obj1 = new Instagram(4.5);
        System.out.println(obj1.name);
        System.out.println(obj1.version);
        obj1.download();
        obj1.postPicture();

        Youtube obj2 = new Youtube(12.3);
        System.out.println(obj2.name);
        System.out.println(obj2.version);
        obj2.download();
        //obj2.postPicture();
        obj2.watchVideo();
        System.out.println("=======================");

    }
}
