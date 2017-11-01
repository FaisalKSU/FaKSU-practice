package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {


    //take a payment from a user
    public static void main(String[] args){
        double payment = 0;
        boolean positivePayment;
        //1. ask the user for input
        //System.out.println("enter the payment amount: ");



        do {
            //1. ask the user for input
            System.out.println("enter the payment amount: ");
            //2. get the amount and test the value
            Scanner in = new Scanner(System.in);
            //3. handle exception appropriately
            try {
                payment = in.nextDouble();

                if (payment < 0) {
                    //throw error
                    throw new NegativePaymentException(payment);

                }
                else {
                    positivePayment = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println(e.toString());
                System.out.println("please try again...");
                positivePayment = false;


            }
        }while(!positivePayment);





        //4. print confirmation

        System.out.println("Thank you for your payment");

    }
}
