package day05_variables;

public class EmployeeInfo {

    public static void main (String [] args){

    String firstName, lastName, jobTitle, companyName;
        char gender, suite;
        int age, pto;
        boolean isFullTime,isMarried;
        double salary;
    //As long as the variable share Same DT we can declare them like this in 1 line

//        String firstName;
//        String lastName;
//        String jobTitle;
//        String companyName;


        firstName="Feyruz";
        lastName= "Shahmuradov";
        companyName = "Loopcamp";
        jobTitle = "Teacher";
        age= 37;
        pto= 21;
        salary = 120_000.00;// 120,000.00 in stead of comma we can use underscore
        isFullTime= true;
        isMarried = false;
        suite = 'A';
        gender = 'M';


        String fullDetail = "Employment information for: "+firstName+ " "+lastName+ "\n\tGender: \t\t"+gender+ "\n\tJob Title: \t\t"+ jobTitle;


        System.out.println(fullDetail);


    }

}
