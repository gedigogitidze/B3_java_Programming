package day35_inheritance.recap;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Medium",6);

        //p1.size = "Hello"; since it is encapsulated i can not reach this way

        System.out.println(p1);


        Pizza p2 = new Pizza("Medium",6);
        System.out.println(p2);
    }
}
