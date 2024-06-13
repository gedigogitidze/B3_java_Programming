package day34_b_encapsulation;

public class UseSquare {
    public static void main(String[] args) {

        Square obj = new Square(5);

        //obj.side = 5 // since side variable is private i can not access directly
        System.out.println(  obj.getSide() ); // 4
        obj.setSide(11);
        System.out.println(obj.getSide());
        System.out.println(obj);
    }
}
