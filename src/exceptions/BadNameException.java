package exceptions;

public class BadNameException extends Exception {
    public String toString(){

        return "you can't have an empty name, silly!";
    }
}
