package basics;

public class SalaryCalculator {


    public static void main(String[] args){
        //let's create a variable to define our career

        //declare a variable
        String career;

        //defined a variable
        career = "Software Developer";
        System.out.println("My career: "+ career);

        //Declare & Define
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        Double rate = 42.50;
        career = "web Developer";

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My salary as "+ career + " at the rate of $"+ rate + " per hour is $"+ salary + " per year.");



    }
}
