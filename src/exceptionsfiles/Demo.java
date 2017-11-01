package exceptionsfiles;

public class Demo {


    public static void main(String[] args){
        int a = 5;
        int b = 0;
        doMath(a,b);

    }

    public static void doMath(int a, int b){
            answer(a,b);
    }
    public static double answer(int x, int y){
        //catch error here
        return x/y;
    }







}
