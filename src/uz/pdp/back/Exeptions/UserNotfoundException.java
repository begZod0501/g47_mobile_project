package uz.pdp.back.Exeptions;

public class UserNotfoundException extends Exception{
    public UserNotfoundException(String message){
        super(message);
    }
    private UserNotfoundException(){

    }
}
