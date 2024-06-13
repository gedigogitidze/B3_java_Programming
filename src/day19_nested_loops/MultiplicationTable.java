package day19_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
           // System.out.println(1+" x "+i+" = "+ (1*i));
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+" x "+j+" = "+ (j*i));
            }
            System.out.println();
        }

    }
}
