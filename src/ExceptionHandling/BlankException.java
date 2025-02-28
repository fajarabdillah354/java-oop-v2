package ExceptionHandling;

public class BlankException extends RuntimeException{// kita boleh extends ke RuntimeException atau ke Thowable
    public BlankException(String message){
        super(message);
    }


}
