package day44_map_and_functions.map_recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {
        Map<String ,Double> map = new HashMap<>();
        map.put("Jeyhun",110_000.00);
        map.put("Gedi",120_000.00);
        map.put("Elina",105_000.00);
        map.put("OlexanderS",130_000.00);
        map.put("OlexanderM",100_000.00);
        map.put("Andrew",125_000.00);
        map.put("Laura",135_000.00);
        map.put("Ayaz",140_000.00);


        //FInd a Person name and the salary Who is making the highest Salary
        //And Lowest
        // Max SALARY: $$NAME - $$ SALARY
        // Min SALARY: $$NAME - $$ SALARY

        String nameForHighestSalary = "";
        double minSalary = Double.MAX_VALUE;

        String nameForLowestSalary = "";
        double maxSalary = 0.0;

        //   values  --->>    [130000.0, 120000.0, 135000.0, 125000.0, 100000.0, 105000.0, 110000.0, 140000.0]

        for (String eachName :map.keySet() ) {
            System.out.println("Each Name: "+eachName);
            System.out.println("Each related salary: "+map.get(eachName));
            System.out.println();

            double salaryForEachName = map.get(eachName); // !!!!!!!!!!!!!!!!!!

            if(salaryForEachName > maxSalary){
                maxSalary = salaryForEachName;
                nameForHighestSalary = eachName;

            }
            if (salaryForEachName < minSalary){
                minSalary = salaryForEachName;
                nameForLowestSalary = eachName;
            }

        }
        System.out.println("Max SALARY: "+nameForHighestSalary+ " -$"+maxSalary);
        System.out.println("Min SALARY: "+nameForLowestSalary+ " -$"+minSalary);

        //find how many people are in between salary 130k - 160k  //(both inclusive)
        //$number of people makes salary between 130K - 160K

        int counter = 0;
        for ( Double eachSalary :map.values() ) {
            if(eachSalary >=130_000.00 && eachSalary <=160_000.00){
                counter++;
            }

        }
        System.out.println(counter+ " of people makes salary between 130K - 160K");

        System.out.println("-----------------");
        //find who makes less than 130k salary
        //$name1, $name2,$name3..... makes salary less than 130k

//        String allNames = "" ;
        List <String>allNames = new ArrayList<>();
        for (String eachName :map.keySet()){
            if(map.get(eachName) < 130_000.00){
                allNames.add(eachName);
            }
        }
        System.out.println(allNames.toString().replace("[","").replace("]","")+" makes salary less than 130K");

        System.out.println("=========================++========================");
        //Increase the salary for everyone by 10k....... in the data structure (map)
        System.out.println("Before Increase: "+map.values());
        for (String eachName : map.keySet()){
            map.put(eachName,map.get(eachName)+10_000.00);
        }
        System.out.println("After Increase: "+map.values());
    }
}
