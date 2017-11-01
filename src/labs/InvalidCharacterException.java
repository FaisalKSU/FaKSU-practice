package labs;

public class InvalidCharacterException extends Exception {

     String ch;
    public InvalidCharacterException(String ch){
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "InvalidCharacterException" + ch;
    }
}
