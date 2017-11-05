package CSCI;

public class UpLetterCriteriaException extends Exception {

    String password;

    public UpLetterCriteriaException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UpLetterCriteriaException: Passwords must contain at least 1 uppercase character.";
    }
}
