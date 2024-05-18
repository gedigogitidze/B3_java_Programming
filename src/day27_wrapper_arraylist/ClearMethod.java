package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());//true
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        System.out.println(nums);// all elements [100, 200, 300, 400, 500]
        System.out.println(nums.size()); // size is 5
        System.out.println(nums.isEmpty()); // false

        System.out.println("+===============+");
        System.out.println("Now i clear");
        nums.clear();
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());

    }
}
