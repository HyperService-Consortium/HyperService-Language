package edu.cwru.rise.hslang;

/**
 * Created by {Jian Shi} on 2019/3/28.
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
