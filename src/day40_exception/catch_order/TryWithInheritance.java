package day40_exception.catch_order;

public class TryWithInheritance {
    public static void main(String[] args) {
        try {
            int [] arr = {1,2,3,4,5};


        }catch (IndexOutOfBoundsException e ){

        }catch (RuntimeException e){

        }catch (Exception e){

        }
        //
        /**
        *Parent exception class cannot be bedore child exception class
         * Because the Parent Exception will catch whatever Child would catch as well
         * So,Child Exception class will never be reached
         */
        /*
        All possible references of IndexOutOfBoundsException class

        IndexOutOfBoundsException e = new IndexOutOfBoundsException();

        Exception e = new IndexOutOfBoundsException();
         */

    }
}
