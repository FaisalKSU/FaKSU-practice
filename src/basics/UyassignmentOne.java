package basics;

public class UyassignmentOne {


     /*public void main(String[] args){

        int x = sum(6);
        System.out.println(x);

    }

    public int sum(int n){
        return (n + 1);

    }*/

    /*public static void main(String[] args){

        int x;
        x = factorial(3);
        System.out.println(x);
    }
    public static int factorial(int n){

        if(n == 0 || n ==1){
            return 1;
        }

        else{
            return n * factorial(n -1);
        }
    }*/

    public static void main(String[] args){

        int[] arr = {2,4,8,1,3,6,9};
        System.out.println(minimum(arr));
        System.out.println(average(arr));
        System.out.println(maximum(arr));

    }

    private static int minimum(int[] array){

        int temp;
        temp = array[0];
        for(int i = 1; i < array.length; i++){

            if(array[i] < temp){

                temp = array[i];
            }
        }

        return temp;
    }

    private static int maximum(int[] array){

        int temp;
        temp = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] > temp){
                temp = array[i];
            }
        }

        return temp;

    }

    private static double average(int[] array){
        int sum = 0;
        int counter = 0;
        for (int anArray : array) {
            sum = sum + anArray;
            counter++;
        }
        return (double) (sum/counter);
    }
}
