package basics;


import java.util.Scanner;

public class SingleArrayDemo {


    public static void main(String[] args){


        Scanner UserInput = new Scanner(System.in);

        System.out.println("enter:");
        String input = UserInput.nextLine();

        char[] charr = input.toCharArray();

        char c = input.charAt(0);

        System.out.println(c);

        for(int i = 0; i < charr.length; i++){

            System.out.println(charr[i]);
        }
    }
}
