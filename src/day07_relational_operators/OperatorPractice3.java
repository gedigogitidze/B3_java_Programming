package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
        int t = 100;//101 100

//
        ++t;
        System.out.println(t--);
        //1st:101 use
        //2nd:100 update
        t++; // 101
        System.out.println(--t);
        //1st update first so its 100
        //2nd use 100 it stays
        System.out.println("t: " + t);


    }
}
