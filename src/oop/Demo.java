package oop;

class Person{

    String name;
    String email;
    String phone;

    void walk(){

        System.out.println(name + " is walking");
    }
    void eat(){

        System.out.println(name + " is eating");
    }
    void sleep(){

        System.out.println(name + " is sleeping");
    }

}





public class Demo {


    public static void main(String[] args){
        //instantiating an object
        Person person1 = new Person();

        //define some properties
        person1.name ="joe";
        person1.email = "joe@gmail.com";
        person1.phone = "897988798";
        //Abstraction
        person1.walk();
        person1.eat();
        person1.sleep();



    }
}
