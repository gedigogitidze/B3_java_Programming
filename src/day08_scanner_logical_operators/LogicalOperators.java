package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
    int n =20;
        System.out.println(n>5); // true
        System.out.println(n < 10); // false


        System.out.println(n > 5 && n <10);

        //                  true and n<10
        //                  true and false
        //                      false outcome
        // with && operator both sides must be true for the outcome to be true

        System.out.println("________________________________________");
        System.out.println(4>3 ||false);
        //                 true|| false
        //                      true
        //with  || operator both sides must be  false in order for outcome to be false

        System.out.println(3>4 || false);
        //                  false false
        //                      false
        System.out.println();
        System.out.println(true);
        System.out.println(!true);// not true ---->false
        System.out.println(!false);// not false --> true

        System.out.println(4!=4);// not equal  (!(4!=4)) thiss will be true
        // four is not equal to four ---> true

    }
}
