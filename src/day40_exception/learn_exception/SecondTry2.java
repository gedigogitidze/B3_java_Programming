package day40_exception.learn_exception;

public class SecondTry2 {
    public static void main(String[] args) {


        try{
          //  String s = null;
             String s = "loop";
              System.out.println(s.length());


            int [] a = {1,2,3,4,5};
            System.out.println(a[9]);


        }catch (NullPointerException e){
            System.out.println("Null pointer exception caught or Array index out of bounds exception caught");

        }
        System.out.println("Done");
    }
}
