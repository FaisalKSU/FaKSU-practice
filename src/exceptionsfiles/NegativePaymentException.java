package exceptionsfiles;

public class NegativePaymentException extends Exception{
    //Define class variable
    private double payment;

    //1. Constructor that takes the value that would throw the exception
    //2. Assign value of local variable to class variable
    public NegativePaymentException(double payment){
        //System.out.println("Error: negative payment");

        this.payment = payment;
    }

    // override the toString() method to include the specific exception message

    @Override
    public String toString() {
        return "Error: negative payment" + payment;
    }
}
