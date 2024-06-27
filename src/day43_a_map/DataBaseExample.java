package day43_a_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {
        /*
        Database Table: People

        FIRST_NAME, |LAST_NAME |BATCH NO
        Andrew      |   Lana   |     #3
       Jeyhun       |  Mamadov |     #3
       Laura        | Berkwoltz|     #3
        Anna        |   Nicole |     #3

         */


        Map<String,String>student1 = new HashMap<>();
        student1.put("FIRST_NAME","Andrew");
        student1.put("LAST_NAME","Andrew");
        student1.put("BATCH NO","3");
        System.out.println(student1);

        Map<String,String>student2 =  makeMap("Jeyhin","Mammadov","3");
        Map<String,String>student3 = makeMap("LAURA","berkwoltz","3");

        List <Map<String,String>> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        listOfStudents.add(makeMap("Janes","bond","2"));
        listOfStudents.add(makeMap("Tom","Jerry","2"));
        listOfStudents.add(makeMap("Vinnie","Pooh","1"));
        listOfStudents.add(makeMap("Micky","Mouse","1"));

        // Can you get me the Last name of second student // first name
        System.out.println( listOfStudents.get(1)  ); // map at index of 1 this will give out
        System.out.println(listOfStudents.get(1).get("LAST_NAME")  ); // then getting a value assigned to " LAST_NAME "
        System.out.println(listOfStudents.get(1).get("FIRST_NAME")  ); // then getting a value assigned to " FIRST_NAME "

        System.out.println();
        System.out.println("=============++===========");
        // can you get the information of each student

        for (Map<String,String> each:listOfStudents){
            System.out.println(each);
        }
        System.out.println();
        System.out.println("================-----");
        //how can i get first name
        for (Map<String,String> each: listOfStudents){
            System.out.println(each.get("FIRST_NAME"));
        }
        System.out.println();
        System.out.println("+++++++000000000++++++");
        //get me all the students whos batch number is more than 1
        for (Map<String,String> each:listOfStudents){
            if (Integer.parseInt(each.get("BATCH NO"))>1){ // i stored the value as "3" and "2" and "1" so String and now i need to update value into Integet to do > <
                System.out.println(each);

            }

        }
        System.out.println();
        System.out.println("++++++--------+++++++++++");
        // GET information of the Last Student
        System.out.println(listOfStudents.get(listOfStudents.size()-1));
        System.out.println();
        //get me the last name of last name
        System.out.println(listOfStudents.get(listOfStudents.size()-1).get("LAST_NAME"));





    }

    //make a reusable method that accepts info about student and adds it into a map and returns it
    public  static Map <String,String >makeMap( String str1,String str2,String str3){

        Map<String,String> map = new HashMap<>();
        map.put("FIRST_NAME",str1);
        map.put("LAST_NAME",str2);
        map.put("BATCH NO",str3);


        return map;
    }
}
