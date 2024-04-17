package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {
       // System.out.println(5/0);
        System.out.println(true || 5/0 == 0);// short circuit or ---> ||
       // System.out.println(true | 5/0 == 0);//  error :     just OR---> |

// compailer doesnt run second part of code if we put && or ||  but it runs fully if & or |
        System.out.println(false && 5/0 ==0); //short circuit AND ----> &&
       // System.out.println(false & 5/0 ==0); //AND ----> &&

        System.out.println("------------------------");
        int a= 0;
        System.out.println(false && a++ ==5);
        System.out.println(a);
        System.out.println("-------------------------");
        System.out.println(true && a++ ==5);
        System.out.println(a);

        int b = 0;
        System.out.println(false & b++ ==5);
        System.out.println(b);
    }
}
