package day41_collection.recap;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Api");
        list.add("Ci/Cd");
    try {


        System.out.println(list.get(1)); // user will give index

//        String s = null;
  //      s.toLowerCase();

    }catch (IndexOutOfBoundsException e){
        System.out.println(e.getMessage());
        // e.printStackTrace();
        System.out.println("Index Out Of Bounds Exception");
    }catch (NullPointerException e ){
        System.out.println("No Object Found");
        e.printStackTrace();
        System.out.println(e.getMessage());
    }

        System.out.println(list);



        System.out.println("Done");

        try {
            Thread.sleep(2);
        }catch (InterruptedException | IllegalArgumentException e ){
            System.out.println("Handling exceptions/ number is wrong");

        }finally {
            System.out.println("This will always run ");
        }

        System.out.println("FINAL");
    }
}
