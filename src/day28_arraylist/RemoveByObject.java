package day28_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(400);
        nums.add(500);
        nums.add(1);
        nums.add(600);
        nums.add(700);
        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);

        Integer element = 1;

         nums.remove(element);
        System.out.println(nums);

      //  nums.remove(500);IndexOutOfBoundsException
        nums.remove((Integer) 500); // casting same as line 30
        System.out.println(nums);

        nums.remove(Integer.valueOf("600")); // converts it into object and thats why it removes object and not index
        System.out.println(nums);
    }
}
