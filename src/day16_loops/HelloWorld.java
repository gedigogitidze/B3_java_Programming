package day16_loops;

public class HelloWorld {
    public static void main(String[] args) {
        // hey can you print this 5 times.
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("-------------");

        // can you print it 100 times

        int num =1;

        while (num <=100) { // 1 <=100 --> true
            System.out.println("Hello World!");
            num++; // num = num +1;
        }
        System.out.println("----------------");
        int num2 =100;
        while (num2 <=100) { // 1 <=100 --> true
            System.out.println("Hello World!");
            num2++; // num = num +1;
        }

        int z = 1;

        while(z<=50) {
            System.out.println("Line "+ z++);
        }
    }
}
