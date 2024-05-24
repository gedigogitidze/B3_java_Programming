package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {

        ArrayList<String> allJobs = new ArrayList<>();
        //addAll();
        allJobs.addAll(Arrays.asList("Sdet","Developer","PO","CEO","DevOps","QA","PO","QE","BA","Dr"));
        System.out.println("Original: "+allJobs);


        //removeAll(); // this removes all the matches baby
        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll( Arrays.asList("PO","QA","QE","BA" ) );
        System.out.println("After 1st remove: "+jobs1);


        //retainAll(); this says keeep all what you put but delete everything else ...remove all except the given one
        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll( Arrays.asList("Sdet","Developer","DevOps") );
        System.out.println("After retain: "+allJobs);


        //containsAll(); this returns boolean
        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("DevOps", "Dr")));
        System.out.println(jobs3.containsAll(Arrays.asList("Police", "Dr"))); // does this contain all of it ..no ..so false


    }
}
