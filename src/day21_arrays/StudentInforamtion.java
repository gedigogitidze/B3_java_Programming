package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInforamtion {
    public static void main(String[] args) {

//        String [] student1 = {"AB001","Tom","Jerry","B#03"};
//        System.out.println(Arrays.toString(student1));
//        System.out.println("====================");
//
//        String [] student2 = new String[4];
//
//        student2[1]="Winnie";
//        student2[3]= "B#03";
//        student2[0]= "AB002";
//       // System.out.println(Arrays.toString(student2)); // default value for String is null
//        student2[2]="Pooh";
//        System.out.println(Arrays.toString(student2));
//
//        System.out.println("=============================");
//        String [] student3 = new String[4];
        Scanner key = new Scanner(System.in);
//        System.out.print("Enter your ID: ");
//        student3[0] = key.nextLine();
//        System.out.print("Enter your first name: ");
//        student3[1] = key.nextLine();
//        System.out.print("Enter your last name");
//        student3[2] = key.nextLine();
//        System.out.print("Enter your batch number");
//        student3[3] = key.nextLine();
//
//        System.out.println(Arrays.toString(student3));

        System.out.println("========================");
        String [] questions = {"Enter your ID: ","Enter your first name: ", "Enter your last name: ","Enter your batch number: "};
        String [] student4 = new String [4];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            student4[i] = key.nextLine();
        }
        System.out.println(Arrays.toString(student4));


    }
}
