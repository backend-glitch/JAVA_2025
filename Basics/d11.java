

    void main() {
    //OOPS

    //classes
    Car mycar = new Car();

    System.out.println(mycar.model);
    System.out.println(mycar.color);

    mycar.drive();


    //constructors
    Human human = new Human("arjun", 20);
    System.out.println(human.name);
    System.out.println(human.age);

    Human human2 = new Human("aman", 18);
    System.out.println(human2.name);
    System.out.println(human2.age);
    human2.eat();


    Pizza pizza = new Pizza("x", "y", "z", "a");
  System.out.println(pizza.cheese);

 // Food[] refrigerator = new Food[2];
  Food food1 = new Food("pizza");
  Food food2 = new Food("burger");

  Food[] refrigerator = {food1,food2};

//refrigerator[0]  = food1;
  //  refrigerator[1]  = food2;

    System.out.println(refrigerator[0].name);


    //object passing
    Garage garage = new Garage();

    Cars car  = new Cars("honda");
    Cars car2 = new Cars("tesla");

    garage.park(car);
    garage.park(car2);

    // static keywords
    Friend friend1 = new Friend("ayush");
    Friend friend2 = new Friend("divys");

    System.out.println(Friend.number);
    Friend.numberof();
}

public static class Car{
    String make = "ford";
    String model = "sonet";
    int year = 2025;
    String color = "red";
    double price = 50.000;

    void drive(){

        System.out.println("you drice a car");
    }
}

// constructors
static class Human{  // class

    String name;
    int age;

    Human(String name, int age){ // constructors

        this.name = name;
        this.age = age;

    }
    void eat(){
        System.out.println(this.name+ " is eating!");
    }
}

static class Pizza{

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }
}

static class Food{

    String name;

    Food(String name){
        this.name = name;
    }
}

// object passing
static class Cars{

    String name;
    Cars(String name){
        this.name = name;
    }
}

static class Garage{

    void park(Cars cars){
        System.out.println("the car" + cars.name + "is parked.");
    }
}

// static keyword
static class Friend{

    String name;
    static int number;

    Friend(String name){
        this.name = name;
        number++;
    }

    static void numberof(){
        System.out.println("you have " + number + " friends");
    }


}

 class Nice{
 int age;

   Nice(int age){
  this.age = age;
  }

    void show2(Nice obj ){
    System.out.println(obj.age);
    }
}
