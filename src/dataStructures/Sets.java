package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args){
        //LinkedHash - is in order that they were entered - stack
        //HashSet - complete random order
        //TreeSet - re-arranges to natural order (alphabetical, numerical...etc)
        //1. Define the collection
        Set<String> animals = new TreeSet<>();

        //2. Adding elements
        animals.add("dog");
        animals.add("pig");
        animals.add("hog");
        animals.add("cat");
        animals.add("snake");

        //System.out.println(animals + " " + animals.size());

        animals.add("goose");
        animals.add("cat");
        animals.add("snake");

        System.out.println(animals + " " + animals.size());

        // Create and a new set that we use for comparison
        Set<String> farmAnimals = new HashSet<String>();
        farmAnimals.add("Chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("horse");
        farmAnimals.add("dog");

        //What is the Intersection between animals and farm animals
        //1. copy existing set into a new set
        Set<String> intersectionSet = new HashSet<String>(animals);
        System.out.println(intersectionSet);
        //2. Retain only the elements that are also in the other set
        intersectionSet.retainAll(farmAnimals);
        System.out.println("The intersection is: " + intersectionSet);

        //What is the Union
        Set<String> unionSet = new HashSet<String>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is: " + unionSet);

        //what is the difference
        Set<String> differenceSet = new HashSet<String>(animals);
        differenceSet.removeAll(farmAnimals);
        System.out.println("The difference is: " + differenceSet);
    }
}
