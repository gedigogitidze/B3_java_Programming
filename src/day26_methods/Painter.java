package day26_methods;

public class Painter {
    public static void main(String[] args) {

        Picture.draw();

        Picture.draw("Yellow");
        Picture.draw("Yellow","Green");
        Picture.draw(4);
        Picture.draw(4,"pink");

       String abc =  Picture.draw("yellow", "pink","pink");
        System.out.println(abc);
    }

}
