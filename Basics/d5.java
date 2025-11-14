import java.util.*;

void main() {

    //inheritance

    Car car = new Car();
    car.go();

    Bicycle bike = new Bicycle();
    bike.stop();

    System.out.println(car.windows);
    System.out.println(bike.wheels);

    Dog dog = new Dog();
    dog.speak();

    Hero hero = new Hero("batman", 45, 5);
    System.out.println(hero.name);


    //abstraction

    Cor cor = new Cor();
//Vehicles vehicle = new Vehicles();
    cor.go();

    //encapsulation
    Food food = new Food("red", "2", 12);
    System.out.println(food.getcolor());


    // interface
    Rabbit rabbit = new Rabbit();
    rabbit.flee();

    Fish fish = new Fish();
    fish.hunt();
    fish.flee();

    //polymorphism
    // Cars cars = new Cars();
    //  Bikes bikes = new Bikes();
    //   Trains trains = new Trains();

    // automobile[] racers = {cars,bikes,trains};
    // for(automobile x : racers){
    //    x.go();
//  }

    //handling exception.
    Scanner scan = new Scanner(System.in);

    try{

        int num1 =  5;
        System.out.println("enter: ");
        int num2  = scan.nextInt();


        int z = num1/num2;

    }catch(ArithmeticException e){
        System.out.println("wrong math!"+"error cause:"+ e);
    }
    catch(Exception e){
        System.out.println("wrong math done here!!"+e);
    }
    finally{
        System.out.print("success");
       scan.close();
    }


    // super() -> always present in constructor. // super(n)
    // this -> calls the constructor of same class

}

static class Vehicle {

    double speed;

    void go(){
        System.out.println("this vehicle is moving");
    }

    void stop(){
        System.out.println("this vehicle is stopped");
    }
}

static class Car extends Vehicle{
int wheels = 4;
int windows = 4;

}

static class Bicycle extends Vehicle{
 int wheels = 2;
 int pedals = 2;
}

// method overiding
public static class Animal{

    void speak(){
        System.out.println("any animal");
    }
}

public static class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("dog bark");
    }
}


// SUPER keywords
public static class Person{

    String name;
    int age;

Person(String name, int age){
    this.name = name;
    this.age = age;
}

public String toString(){
    return this.name + "/n" + this.age + "/n";
}
}

public static class Hero extends Person{

    int power;

    Hero( String name ,int age, int power){
        super(name, age);
        this.power = power;

    }
}

// abstraction

public static abstract class Vehicles{

    abstract void go();// abstract classes does not have body ,you need to type them in child class



}

public static class Cor extends Vehicles{

    void go(){
        System.out.println("go go go!");
    }
}

//encapsulation
public static class Food{
    private String color;
    private String size;
    private int life;

    Food(String color, String size , int life){
        //this.color = color;
        this.setcolor(color);
        this.size = size;
        this.life = life;

    }

    public String getcolor(){
        return color;
    }
    public void setcolor(String color){
       this.color = color;
    }
}

// object copy
public void copy(Car x){
   //  this.setcolor(color);
}

// interface => similar to abstract   // interface is a type of inheritance where we can implement from multiple classes
public static interface  Prey{

    void flee();
}

public static interface Predator{
    void hunt();
}

public class  Rabbit implements Prey{

    @Override
    public void flee() {
        System.out.println("rabbit");
    }
}

public class Fish implements Prey,Predator{

    @Override
    public void hunt(){
        System.out.println("attacker fish");
    }

    public void flee(){
        System.out.println("running fish");
    }
}


//polymorphism
public static class automobile{

    //@Override
 //void go();

}

public static class Cars extends automobile {

    public void go() {
        System.out.println("go racers.");
    }
}
    public static class Bikes extends automobile {

    }

    public static class Trains extends automobile {

    }

    // dynamic polymorphism ?!?.

