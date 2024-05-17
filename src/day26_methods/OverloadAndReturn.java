package day26_methods;

public class OverloadAndReturn {

    public static void method () {
        System.out.println("empty method");

    }
// i tried to overload method by just changing the return type
    // THIS IS NOT ACCEPTABLE - Return type has no effect on METHOD OVERLOADING
//    public static int method () {
//        System.out.println("empty method");
//        return 0;
//    }
//


public static int method (int a) {
    System.out.println("empty method");
    return 0;

}
/*
METHOD OVERLOADING
    1.Method Name has to be the same
    2.PARAMETERS
        a.HAS TO BE DIFFERENT NUMBER OF PARAMETERS if all the parameters data are same
                    method(String str);
                    method(String str, str2);
        b.has to be different DATA types if the number of parameters are same
                    method(String str);
                    method(int str);
        c.has to be different order if the number of parameters are same
                    method(String str, int num);
                    method(int num, String str);
 */

}
