/*
 *  IllegalFileTypeException.java
 * 
 *  Date created:       January 22, 2021
 *  Date last edited:   January 22, 2021
 * 
 * Authors:
 *      Logan Drescher  
 */


/**
 * Special argument exception based on Files and their differences.
 * Should be thrown if the type of File object passed via argument is not acceptable for the calling function. 
 */
public class IllegalFileTypeException extends IllegalArgumentException {
    public IllegalFileTypeException(){
        super();
    }

    public IllegalFileTypeException(String s){
        super(s);
    }

}
