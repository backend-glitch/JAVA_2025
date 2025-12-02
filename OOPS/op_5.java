package OOPS;

//Abstraction
abstract class Car{// abstract class 

    public abstract void drive(); // abstract method

    
    public void music(){
        System.out.println("la la la");
    }
}

class BMW extends Car{

    public void drive(){
        System.out.println("diving");
    }
}

// inner class
class A{

    int age;

    public void show(){

    }

    class B{ // inner class
        
        public void config(){
            System.out.println("configure..");
        }
    }
}


// interfaces

 interface Comp {

    public void code();
    
} 

class Laptop implements Comp{

    public void code(){
        System.out.println("!code,run!");
    }
}

class Desktop implements Comp{

    public void code(){
        System.out.println("!code,run,run!");
    }
}
class Dev{

    public void developing(Comp device){
          device.code();
    }
}

public class op_5 {

    public static void main(String[] args){
   // we cant make object of a abstract car , its reference can only be created.
   Car obj = new BMW();
   obj.drive();

 A box =  new A();
 box.show();

 A.B box1 = box.new B(); // only works for static class
 box1.config();


 // anonmyous inner class
 A animal = new A(){

    public void show(){
        System.out.println("roar!!");
    }
 };
 animal.show();
          
    }

    //interface => class which has all methods as public abstract
    Laptop lap = new Laptop();
    Desktop desk = new Desktop();
    Dev devop = new Dev();
  //  devop.developing(Comp computer);

  // 8:27
}
