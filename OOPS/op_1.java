package OOPS;

// class
class Mobile{
// STATIC  , i want the  name to be same for all objects
    String brand;
    int price ;
    static String name;

    //static block
    static{
        name ="Phone";
    }

    // constructors
    Mobile(){

        brand ="";
        price =100;
      

    }

    public void  show(){
        System.out.println(brand + " : "+ price + " :");

    }

    //static function
    public static void show1(Mobile obj){
      System.out.println(obj.brand + " : "+ obj.price + " :");
    }
}

public class op_1 {
    
    public static void main(String[] args){
    // static

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1000;

    Mobile.name = "mobile"; // static : name ,its a part of a class


    Mobile obj2 = new Mobile();
    obj2.brand = "Apple15";
    obj2.price = 10000;
    }
}

// 5:20
