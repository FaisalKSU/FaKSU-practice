package oop;

public class BankAccount implements IRate {

    //define variable
    String accountNumber;

    //static  >> belong to the class not the object instance
    //final >> constant (often static final)
    private static final String routingNumber = "01534534";

    //Instance variable

    private String name;
    private String ssn;
    String accountType;
    double balance = 0;

    //constructor definitions: unique methods
    // they are used to define/setup/initialize properties of an object
    //constructors are implicitly called upon instantiation
    //the same name as the class itself
    //no return type at all
    BankAccount(){

        System.out.println("new account is created");
    }
    //Overloading: call same method name with different arguments
    BankAccount(String accountType){
        System.out.println("new account:" + accountType);
    }
    BankAccount(String accountType, double initDeposit){
        //initDeposit, accountType, msg are all local variable
        System.out.println("new account: " +  accountType);
        System.out.println("initial deposit of: " + initDeposit);
        String msg = null;
        if(initDeposit < 1000){
            msg = "error: over the minimum deposit";
        }
        else{
            msg = "Thank for your initial deposit: " + initDeposit;
        }
        System.out.println(msg);
        balance = balance + initDeposit;
    }

    //getters / setters
    //allow the user to define the name
    public void setName(String name){

        this.name = "Mr: " +name;
    }
    public String getName(){
        return this.name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //interface methods
    public void setRate(){
        System.out.println("setting rate: ");
    }
    public void increaseRate(){
        System.out.println("increasing rate");
    }

    // define methods
    // public >> accessible to the project
    public void deposit(double amount){
        balance = balance + amount;
        showActivity("Deposit");

    }

    //default accessible to the package, same as protected
    void withdraw(double amount){
        balance = balance - amount;
        showActivity("Withdraw");
    }
    // private is only available within the class
    //private: can only be called from within the class
    private void showActivity(String activity){
        System.out.println("Your recent transaction: "+ activity);
        System.out.println("Your new balance is: " + balance);
    }


    void checkBalance(){

        System.out.println("balance is " + balance);
    }

    void getStatus(){


    }
    @Override
    public String toString(){
        return "[ Name:" + name + " , Account: " + accountNumber + ",Routing: " + routingNumber + " Balance: " + balance + "]";
    }
}
