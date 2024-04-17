package day07_relational_operators;
/*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

 */
public class GiftCard {
    public static void main(String[] args) {


        double giftCardBalance = 200;
        double item1Price = 100;
        double item2Price = 70;
        System.out.println("In my gift card i have $"+ giftCardBalance+"balance. ");
        System.out.println("Buys item 1 for $"+item1Price+" with gift card.");

//        giftCardBalance = giftCardBalance- item1Price; this is same as next line
        giftCardBalance-=item1Price; // this is same as above just using "SHORTHAND" Operator

        System.out.println("After purchasing item 1, my gift card balance is $"+giftCardBalance);
//        giftCardBalance = giftCardBalance-item2Price------------->this is also same as below
        giftCardBalance-=item2Price; // this is same as above but again with "SHORTHAND" Operator
        System.out.println("After purchasing item 2, my gift card balance is $"+giftCardBalance);

    }
}