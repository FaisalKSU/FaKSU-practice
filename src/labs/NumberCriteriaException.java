package labs;

public class NumberCriteriaException extends Exception{

    private String password;
    public NumberCriteriaException(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "NumberCriteriaException: " + password;
    }
}
