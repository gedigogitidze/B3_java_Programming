package day21_arrays;

public class EvenOrOdd {
    public static void main(String[] args) {

        int[] nums = {4, 1, 3, 12, 5, 20, 13};
        int evenCount = 0;
        int oddCount = 0;
        String oddNums = "";
        String evenNums = "";
        for (int each:nums){
            if (each % 2 ==0){
                evenCount++;
                evenNums+=each+" ";
            }else {
                oddCount++;
                oddNums+=each+ " ";
            }
        }
        evenNums = evenNums.trim();
        oddNums = oddNums.trim();
        System.out.println("Even: "+evenCount);
        System.out.println("Even nums: "+evenNums);
        System.out.println("Odd: "+oddCount);
        System.out.println("Odd Nums: "+oddNums);
    }
}
