package CSCI;

public class DigitCriteriaException extends Exception {

    private String password;
    public DigitCriteriaException(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "DigitCriteriaException:  Passwords must contain at least 1 digit." ;
    }

}
