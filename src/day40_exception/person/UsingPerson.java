package day40_exception.person;

public class UsingPerson {
    public static void main(String[] args) {
       Person obj = new Person();
       try {
           obj.setName("John");
       }catch (Exception e ){
           System.out.println(e.getMessage());

       }
        System.out.println(obj.getName());

       //obj.setName("");
        //System.out.println(obj.getName());
        System.out.println("hello");

        try{
            obj.setAge(110);
        }catch (RuntimeException e){
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Bye");
    }
}
