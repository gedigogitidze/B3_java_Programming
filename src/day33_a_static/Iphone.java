package day33_a_static;

public class Iphone {

    //INSTACE VARIABLE
    String model;
    double price;


    static String company;
    static String os;
    static String day;
    static boolean appleDay;

    //Custom constructor
    public Iphone(String model,double price){
        this.model = model;
        this.price = price;
    }
    // STATIC BLOCK - STATIC INITIALIZATION - IT WILL RUN FIRST
    static {
        System.out.println("STATIC BLOCK RUN:");
        company = "Apple";
        os = "IOS";
        //model = "IP"; // static can accept only static
        day = "Wednesday";
        if(day.equals("Friday")){
            appleDay = true;
        }


    }

    //INSTANCE METHOD
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
                // "Company" + company ; // INSTANCE CAN ACCPET both - static and instance
    }
}
