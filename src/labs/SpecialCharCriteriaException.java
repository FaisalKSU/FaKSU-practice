package labs;

public class SpecialCharCriteriaException extends Exception {
    String password;

    public SpecialCharCriteriaException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SpecialCharCriteriaException: " + password;
    }
}
