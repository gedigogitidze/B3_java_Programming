package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main (String [] args){
//examples of TAB
     System.out.println("This is a sentence");
     System.out.println(" This is a sentence");
     System.out.println("  This is a sentence");
     System.out.println("   This is a sentence");
     System.out.println("    This is a sentence");

     System.out.println("\tThis is a sentence"); //1 tab is equal to 4 spaces

     //Lets put two TABS
        System.out.println("\t\tThis is a sentence");

        System.out.println();

        //Examples of NEW LINE
        System.out.println("1) go to store");
        System.out.println("2) grab a bread");
        System.out.println("3) pay cashier");
        System.out.println();
        System.out.println("1)go to store 2) grab a bread 3) pay cashier");

        System.out.println();
        System.out.println("1)go to store \n2) grab a bread \n3) pay cashier");

        System.out.println("\nWeeek Days \n\tMonday \n\tTuesday \n\tWednesday \n\tThursday \n\tFriday \n\tSaturday \n\tSunday");


    }
}
