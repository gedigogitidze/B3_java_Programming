package day08_scanner_logical_operators;

public class OrPractice {
    public static void main(String[] args) {

        int apples = 5;
        int oranges = 10;
        System.out.println(apples >1 || oranges <5);//since this is || and first part is true: i dont need to check 2nd
        //   side....why?---->because only false || false can output false.
        //                   true  || false
        //                          true


        System.out.println(apples>10 || oranges ==10);
        //                  false     || true
                                //true


        System.out.println(apples>10 && oranges ==10);//since this is && and first part is false: i dont need to check 2nd
                                                     //   side....why?---->because only true && true can output true.
        //                  false   && true
                                //false
    }
}
