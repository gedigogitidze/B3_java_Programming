package day06_b_unary_operators;

public class IncrementExamples {

    public static void main(String[] args) {

        int x = 0;
        System.out.println(x);

        x=x+1; //took the value of x, which is 0 and then added 1 on it------> x=0+1;---->x=1;
        System.out.println(x); //1

        x++;     // POST INCREMENT - increases it by only 1.
        System.out.println(x); //2

        ++x; //PRE INCREMENT - increases it by only 1
        System.out.println(x); //3

        System.out.println(++x); //4 -----> because it is PRE INCREMENT, it will increase it first and than use it
                                // x=x+4

        System.out.println(x++); // 4 it is POST INCREMENT, it will be used first and then increment
                                // x is now 5
                                // so post means changing value by 1 after  it has used old value ( so it stays 4 and on next print it becomes 5)
                                // and pre means adding value by 1 and then using it so (it first becomes 5)
        System.out.println(x);//5




    }
}
