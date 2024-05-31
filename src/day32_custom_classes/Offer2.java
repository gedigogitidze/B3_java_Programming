package day32_custom_classes;

public class Offer2 {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;


    public Offer2(String company,String location){
        this.company = company;
        this.location = location;


    }

    public Offer2(String company,String location,double salary){
        //this.company = company;
       // this.location = location;
        this(company, location);
        this.salary = salary;

    }

    public Offer2(String location, String company, double salary, boolean isFullTime, int numOfPTO) {
//        this.location = location;
//        this.company = company;
//        this.salary = salary;
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }

    @Override
    public String toString() {

        String info = company+ " is located in "+location;

        info+= "\n"+ (salary > 0? salary : "");

        info+= "\n"+ ((isFullTime)? "Full Time": "");
        info+= "\n" + (numOfPTO>0 ? numOfPTO: "");

//        return "Offer{" +
//                "location='" + location + '\'' +
//                ", company='" + company + '\'' +
//                ", salary=" + salary +
//                ", isFullTime=" + isFullTime +
//                ", numOfPTO=" + numOfPTO +
//                '}';
        return info;
    }
}
