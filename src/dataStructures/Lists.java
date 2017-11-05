package dataStructures;
import java.util.*;
public class Lists {


    public static void main(String[] args){
        //1. create a collection

        ArrayList<String> cities = new ArrayList<String>();

        //2. add so elements
        cities.add("Cleveland");
        cities.add("Toronto");
        cities.add("Chicago");
        cities.add("Miami");


        //3. iterate the collection
        for(String city : cities){
            System.out.println(city);
        }

        //4. Get the size
        int size = cities.size();
        System.out.println("There are " + size + " cities");

        //5. Retrieve specific element

        System.out.println(cities.get(0));

        //6. remove
        cities.remove(0);
        size = cities.size();
        System.out.println("Now, there are " + size + " cities");
        for(String city : cities){
            System.out.println(city);
        }


    }
}
