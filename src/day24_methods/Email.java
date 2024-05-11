package day24_methods;

public class Email {
    public static void main(String[] args) {


    buildEmail("Micky Mouse","gmail.com");
    buildEmail("TOM JERRY", "yahoo.com");
    }


    // Create a method that is called buildEmail and that accepts two String Parameters
    // take the full name and then take First Character of first name and full last name concatenet with domain
    // "Micky Mouse","gmail" =====> MMouse@Gmail.com
    public static void buildEmail (String fullName,String domain) {// non - parameterized method

        String email = fullName.toLowerCase().charAt(0)+""
                +fullName.toLowerCase().substring(fullName.indexOf(" ")+1)//m+ mouse
                +"@"
                + domain.toLowerCase(); // m + mouse +
        System.out.println(email);
    }
}
