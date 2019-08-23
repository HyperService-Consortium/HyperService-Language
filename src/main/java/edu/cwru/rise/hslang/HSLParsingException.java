package edu.cwru.rise.hslang;

/**
 * handle the exceptions the occur in the HSL
 */
public class HSLParsingException extends Exception {

    public HSLParsingException(){
        super();
    }

    public HSLParsingException(String message){
        super(message);
    }

    public HSLParsingException(String message, Throwable cause){
        super(message,cause);
    }

    public HSLParsingException(Throwable cause) {
        super(cause);
    }


}
