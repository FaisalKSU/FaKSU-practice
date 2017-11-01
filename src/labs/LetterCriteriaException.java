package labs;

public class LetterCriteriaException extends Exception{

    String password;

    public LetterCriteriaException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LetterCriteriaException: " + password;
    }
}
