package day30_b_custom_classes;

import my_utilities.StringUtil;

public class UsingApp {
    public static void main(String[] args) {
        //System.out.println(name);// AGAIN NOT VALID

        // How to create OBJECT of CLASS

        App app1 = new App();
        // app1, has its own version/copies of name,version and isFree

        App app2 = new App();
        //app2 has its own version/copies of name,version and isFree

        app1.name = "loopcamp";
        app1.version = 2.0;
        app1.isFree = false;

        System.out.println(app1.version);

        //App.run(); // Since .run() method is INSTANCE METHOF we cannot call by class name

        app1.run();

        //App.update(); I cant do this
        app1.update();


        app2.name = "game";
        app2.version = 1.4;
        app2.isFree = true;

        System.out.println("========");
        app2.run();
        app2.update();

        System.out.println("=======");
        System.out.println(app1.version);
        System.out.println(app2.version);
        System.out.println("=======");
        app1.update();

        System.out.println(app1.version);
        System.out.println(app2.version);

        System.out.println("=========");
        new App().run();// i created a new Objet with no referance

        new App().name = "racecar";
        System.out.println(new App().name); // This one is compleately new object

        //StringUtil.reverse("Hello");


    }

}
