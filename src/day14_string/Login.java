package day14_string;

import java.util.Scanner;

/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */
public class Login {
    public static void main(String[] args) {

        String expectedPassword = "loopcamp!";
        String expectedUserName = "JAVA";

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter username: ");
        String usernameFromUser = key.next().toLowerCase(); // even if its JAVA it will be java
        //username = username.toLowerCase();

        System.out.print("Please enter your password: ");
        String passwordFromUser = key.next();

        if(passwordFromUser.length() > 8
                && expectedPassword.equals(passwordFromUser)
                && expectedUserName.equalsIgnoreCase(usernameFromUser)){ // java vs JAVA --->  java vs JaVA doesnt matter (Ignore)
            System.out.println("Logged in");

        }




    }
}
