package CSCI;

public class LengthCriteriaException extends Exception{
    String password;

    public LengthCriteriaException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LengthCriteriaException: Passwords must be at least 10 characters long." ;
    }
}
