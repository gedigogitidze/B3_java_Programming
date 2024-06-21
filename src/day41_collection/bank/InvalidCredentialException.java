package day41_collection.bank;

//Any class which is child class of Exception is checked/ compile Exception [Except RunTimeException]
//Any class which is child class of RunTimeException is unchecked/runtime Exception

public class InvalidCredentialException extends Exception{

    public InvalidCredentialException (String message){
        super(message);
    }
}
