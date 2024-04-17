package day10_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
   /*
     int score = 75 ;

        if (score >= 75) {
            System.out.println("Passing  the exam!");

        }


        if (score < 75) {
            System.out.println("Failing the exam!");
        }



    */
        int score = 70;

        if (score >= 75){
            System.out.println("Passing  the exam!");

        }else {
            System.out.println("Failing the exam!");

        }

        // if score is > 90 -- > print excellent else print keep working


        if (score >90){  //score; 70
            System.out.println("Excellent");
        }else {
            System.out.println("Keep working");
        }



        int year = 2029;
        boolean isLockdown = year == 2020 || year == 2021;      // || this is or .....&& this is and
        if (isLockdown) {
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        }else {
            System.out.println("Go outside");
            System.out.println("Meet with friends");
        }








    }

}
