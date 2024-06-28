package day44_map_and_functions.enum_intro;

public class UsingBrowser {
    public static void main(String[] args) {


        Browser browser = Browser.CHROME;


        switch (browser) {
            case EDGE:
            case CHROME:
                System.out.println("OPENING chrome browser");
                break;
            case SAFARI:
                System.out.println("Opening safari");
                break;
            case FIREFOX:
                System.out.println("Opening FireFox");
                break;
            default:
                System.out.println("NOT VALID browser");
        }
    }
}