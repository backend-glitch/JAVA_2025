import java.util.*;

void main(){

    // generics -> a class ,interface with multiple data types
   // Product<String, Integer> box = new Product<>("apple", 90);
   //Product<String, double> box2 = new Product<>("apple", 80.5);
    
   // System.out.println(box.getItem()+ " "+ box.getprice());
    

    HashMap<String, Integer> map = new HashMap<>();

    map.put("apple", 90);
    map.put("banana", 60);

    System.out.println(map);
    System.out.println(map.get("banana"));
    map.put("pine",30);
    System.out.println(map);

    for(String key : map.keySet()){

        System.out.println(key +" :$" + map.get(key));
    }
  
      Day day1 = Day.SUNDAY;

      System.out.println(day1.getDayNUmber());
 

      //INPUT
      Scanner scanner  = new Scanner(System.in);
      System.out.print("enter the day of a week: ");
      String response =  scanner.nextLine().toUpperCase();

      
      try{

        Day day = Day.valueOf(response);


      switch(day){
        case MONDAY,
             WEDNESDAY,
             THURSDAY,
             FRIDAY -> System.out.println("it is a weekday");
         case SATURDAY,SUNDAY -> System.out.println("it is a weekday.");
        default -> System.out.println("wrong input.");
      }
    } 
    catch(IllegalArgumentException e){
          System.out.println("enter valid input..");
    }

    scanner.close();


    // threading => multiple tasks simultaneously, helps improve performance with time consuming operations
    
    

}

public class Box<T , U>{

    T item;
    U price;

void Product(T item, U price){
this.item = item;
this.price = price;
}

    public void setItem(T item , U price){
      this.item = item;
      this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getprice(){
        return this.price;
    }
}

public enum Day{

    SUNDAY(1),MONDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;

    }

    public int getDayNUmber(){
        return this.dayNumber;
    }

}



