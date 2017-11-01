package oop;

public class LoanAccount implements IRate {


    @Override
    public void setRate() {
        System.out.println("rate");

    }

    @Override
    public void increaseRate() {
        System.out.println("increase");

    }

    public void setTerm(int terms){

        System.out.println("setting the term to: " + terms + "years");
    }

    public void setAmortSchedule(){
        System.out.println("Amortization Schedule");
    }
}
