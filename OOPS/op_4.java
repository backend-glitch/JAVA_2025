package OOPS;


class A{

    public void show(){
        System.out.println("in the A");
    }
}
class B extends A{

}
class C extends A{

}

// final => cannot be changed afterwards, final class cannot be inherited

class Calc{
 
    public final void show(){
        System.out.println("ARJUN");
    }
    public int add(int a,int b){
        int c = a + b;
        return c;
    }
}

// toString()
class Laptop{

    String model;
    int price;

    public String toString(){
        return model + ":" + price;
    }
}

public class op_4 {
    
    public static void main(String[] args){
//polymorphism => MANY FORMS
A obj  = new B();
obj.show();

// dynamic dispatch
obj = new B();
obj.show();

obj = new C();
obj.show();

System.out.println(obj.toString()); // return the hash code for that code

Laptop hp = new Laptop();
System.out.println(hp.toString());// now it return the price + model

// typecasting => to convert one data type to another
double d = 4.5;
int i = (int)d; // but here 0.5 will be lost;
System.out.println(i);

//UPCASTING 
A color =(A) new B();
color.show();

//AUTOBOXING
int num = 10;
Integer num1 = num; // storing a primitive value in a object 

int num2 = num1.intValue();

//auto-unboxing
int num3 = num1;

//to convert string to the number 
String word = "str";
int number = Integer.parseInt(word);
System.out.println(number);

//7:50

    }
}