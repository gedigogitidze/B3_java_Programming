package day33_a_static;

import java.util.Arrays;

public class LoopCampStudent {
    String name ;
    int groupNumber;

    static int bachNumber;
    static String [] teachers;
    static String schoolName;

    static { // static block runs only one time baby
        bachNumber = 3;
        teachers = new String[]{"Nadir","Feyruz","James","Diana"};
        schoolName = "Loopcamp";
printInfo();

    }

    public static void printInfo(){
        System.out.println("School Name: "+schoolName);
        System.out.println("Batch Number: "+bachNumber);
        System.out.println("Teachers: "+ Arrays.toString(teachers));
        //System.out.println("Name: "+name); // can not use INSTANCE VARIABLE in STATIC


    }

    public LoopCampStudent(String name, int groupNumber){
        this.name = name;
        this.groupNumber = groupNumber;

    }

    @Override
    public String toString() {
        return "LoopCampStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
