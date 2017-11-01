package oop;

public class BankAccountApp {

    public static void main(String[] args){
        //creating a new bank account >> think instantiate an object


        BankAccount acc1 = new BankAccount();


        // this is the old way, we gon do new way with encapsulation
        // Encapsulation: public api methods
        //acc1.name = "roger";
        acc1.setName("Roger new");
        System.out.println(acc1.getName());
        acc1.setSsn("242983402");
        System.out.println("ssn: " +acc1.getSsn());
        acc1.accountNumber = "014534534";
        acc1.balance = 1000;
        acc1.setRate();
        acc1.increaseRate();
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2000);


        //polymorphism through overriding
        System.out.println(acc1.toString());

        //polymorphism through overloading
        BankAccount acc2 = new BankAccount("Checking account");
        acc2.accountNumber = "014534534";

        BankAccount acc3 = new BankAccount("Saving account", 5000);

        /*//System.out.println(acc1.routingNumber);
        //System.out.println(acc2.routingNumber);
        //System.out.println(acc3.routingNumber);
        /acc3.checkBalance();

        //Demo for inheritance
        System.out.println("___________________________");
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.name = "juan";
        cd1.accountType = "CD account";
        System.out.println(cd1.toString());*/
    }
}
