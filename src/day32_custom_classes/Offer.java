package day32_custom_classes;
/*
    create a class called Offer

    - data:

        location, company, salary, is full time, number of PTO
*/
/*
    - constructor

        - create a constructor that creates an Offer object with the company and location

        - create a constructor that creates an Offer object with the company, location, and salary

        - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

*/

/*
    - method:

        toString()
            print all the employees information

 */

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;


    public Offer(String company,String location){
    this.company = company;
    this.location = location;


    }

    public Offer(String company,String location,double salary){
        this.company = company;
        this.location = location;
        this.salary = salary;

    }

    public Offer(String location, String company, double salary, boolean isFullTime, int numOfPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
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
