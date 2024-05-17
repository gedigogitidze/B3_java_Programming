package day26_methods;

import my_utilities.ArrayUtil;

public class ArrayIndexOf {
    public static void main(String[] args) {

        int [] arr = {12,3,5,73,13,2,5}; //5
        //            0  1 2  3  4 5 6  indexes
        String str = "Hello";
        System.out.println(str.indexOf("H"));
        System.out.println(str.indexOf("k"));

        System.out.println(indexOf(arr, 5));

        String [] arr2 = {"java","selenium","api"};

        // lets  find index of api
        System.out.println(indexOf(arr2,"api"));
        System.out.println(indexOf(arr2,"selenium"));

        System.out.println(ArrayUtil.indexOf(arr2, "java"));

    }



    public static int indexOf (int [] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                return i;
            }
        }


        return -1;
    }

    public static int indexOf (String [] array, String word) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word) ){
                return i;
            }
        }


        return -1;
    }

}
