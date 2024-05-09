package day22_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {2, 23, 56, 2, 45, -2, 505};
        int [] notSorted = nums; // here i did mot create a mew array object . i just point to what the nums is
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        System.out.println();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        //Max and Min
        System.out.println("Min: "+nums[0]);
        System.out.println("Max: "+nums[nums.length-1]);

        // here we made a new arrays and took the value from nums and assigned to mnum3 arrays
        int [] num3 = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            num3[i] = nums[i];

        }
    }
}
