package day40_exception.learn_exception;

public class FourthExample {
    public static void main(String[] args) throws InterruptedException {
try {


    System.out.println("Start");
    Thread.sleep(200);// IllegalArgumentException
    System.out.println("End");
}catch (InterruptedException e){
    e.printStackTrace();
    //System.out.println(e.getMessage());

}
    }
}
