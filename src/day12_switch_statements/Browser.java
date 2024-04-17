package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your browser: ");
        String browserType = input.next();

        switch (browserType){
            case "Chrome":
                System.out.println("Opening Google in "+browserType+ " Browser");
                break;
            case "Fairfox":
                System.out.println("Opening Google in "+browserType+ " Browser");
                break;
            case"Safari": // browserType == Safari || browserType == safari
            case "safari":
                System.out.println("Opening Google in "+browserType+ " Browser");
                break;
            default:
                System.out.println("We do not have "+ browserType + " browser type or it is invalid one.");
        }
    }
}
