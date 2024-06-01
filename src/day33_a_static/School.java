package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        LoopCampStudent student1 = new LoopCampStudent("Elina", 3);
        System.out.println(student1);

        LoopCampStudent student2 = new LoopCampStudent("Aygun", 2);
        System.out.println(student2);
        System.out.println();
        LoopCampStudent.printInfo();

        //can you get me names of teachers
        System.out.println();
        System.out.println("Teachers at Loopcamp: ");
        System.out.println(Arrays.toString(LoopCampStudent.teachers));
        System.out.println();
        int i = 0;
        for (String eachTeacher : LoopCampStudent.teachers) {
           // System.out.println(eachTeacher);
            System.out.println("Teacher "+ ++i+": "+eachTeacher);
        }
    }
}
