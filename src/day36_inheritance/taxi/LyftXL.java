package day36_inheritance.taxi;

public class LyftXL extends Lyft {
//    String driver;  not needed anymore i got it from parent class
    public LyftXL(String driver) {
        super(driver);

    }
    @Override
    public double calculateRate(int miles){

       // return(miles * 1.28)*1.1;  // i have first part of this in parent class so view below
        return super.calculateRate(miles)*1.1;
    }
    //super.calculateRate(miles) - > calls the method in the Lyft class, parent
    //then we multiply it with 1.1
}
