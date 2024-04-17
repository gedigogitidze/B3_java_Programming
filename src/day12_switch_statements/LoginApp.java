package day12_switch_statements;

import java.util.Scanner;

/*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
public class LoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 4444;
        int ssn = 2314;

        System.out.print("Please enter your pincode: ");
        int userPin = input.nextInt();
        System.out.print("Please enter last 4 digits of ur SSN: ");
        int userSSn = input.nextInt();

        if (userPin == pin && userSSn == ssn) {
            System.out.println("Authentication is Successful!");


        }else{
            System.out.println("Authentication is Failed!");

            if (pin!= userPin){ // incorrect pin correct ssn
                System.out.println("Incorrect pincode");
            }

            if(ssn != userSSn) {
                System.out.println("Incorrect SSN");
            }

        }


        }
    }
