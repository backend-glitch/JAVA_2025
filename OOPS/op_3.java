package OOPS;

// sout => java.lang.system <= package 
// super and this
class A{

    public A(){
System.out.println("in A.");
    }
     public A(int n){
System.out.println("in A.");
    }

    void show(){
        System.out.println("in a show");
    }
}

class B extends A{

   
    // SUPER => means calling the constructor of parent class , it is bydefault in child
  // every class one bydefault superclass which is "object" class
//this => this methods executes the constructor of current class
   
    public B(){
         super(5);
 System.out.println("in B.");
    }
     void show(){ // same name as parent class show function ,but this show is first priority
        System.out.println("in the show of B");// method overriding
    }
}



public class op_3 {
    
    B obj = new B();
  
    new A().show(); // ANONYMOUS CLASS
}


/*
public
private 
protected
*/

// 7:05

