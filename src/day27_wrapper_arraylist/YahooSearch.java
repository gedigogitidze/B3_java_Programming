package day27_wrapper_arraylist;

public class YahooSearch {
    public static void main(String[] args) {
        // about 7,000,000 search results
        String result = "About 7,000,000 search results";
        String [] arr = result.split(" "); // {"About", "7,000,000", "search", "results"};

        String resultStr = arr[1].replaceAll(",","");//7,000,000
        //resultStr = resultStr.replaceAll(",",""); you can do this or above its all same baby
       long resultNum =  Long.parseLong(resultStr);

        // your task: after seatching make sure the number is bigger than or equal 0

        if(resultNum>=0){
            System.out.println("TEST CASE PASSED - POSITIVE TEST CASE");
        }else {
            System.out.println("TEST CASE PASSED - POSITIVE TEST CASE");
        }



        System.out.println("After searching for \"Apartmenst\""+" I see "+resultNum+" results");
        System.out.println("Next Year, After searching for \"Apartmenst\""+" I will most likely see "+(resultNum + 1_000_000)+" results");


        //Todo: about 16,820,000,000 results (0,54 seconds)
        // make sure the time is between 0-2 seconds

    }
}
