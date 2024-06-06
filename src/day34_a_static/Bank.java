package day34_a_static;

public class Bank {


    public static void main(String[] args) {

        System.out.println(DebitCard.accountType);

        DebitCard db1 = new DebitCard(1234567890123456L,"Micky Mouse",100_000.00);
        System.out.println(db1);

    }
}
