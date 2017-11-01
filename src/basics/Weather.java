package basics;

public class Weather {

    public static void main(String[] args) {
/*
        int temperature = 85;
        String sunCondition = "sunny";

        if(temperature > 80 && sunCondition == "sunny"){

            System.out.println("it's pleasant. wear shorts and t-shirt");

        }
        else if (temperature > 40){

            System.out.println("wear something that meets the standard");
        }*/

        int x = fib(6);
        System.out.println(x);
        //System.out.println(fib(10));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return (fib(n - 1) + fib(n - 2));
    }
}

