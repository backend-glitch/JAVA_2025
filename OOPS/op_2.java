package OOPS;


// inheritance
class Human{

 private int age;
private String name = "Rohan";

// constructors
Human(int age,String name){
 this.age = age;
 this.name = name;
}
public int getAge(){
    return age;
    
}

public String getName(){
    return name;
}

public void setAge(int age1){
    age = age1;
}

// using this
public void setAge1(int age){
    this.age = age;
}

public void setName1(String name){
    this.name = name;
}
}

public class op_2 {
    
    public static void main(String[] args){
 
    // inheritace
    Human obj = new Human(12,"Rohan");
   // obj.age = 11;
  //  obj.name = "Rohan";

   //System.out.println(obj.name);

   obj.getAge();
   obj.getName();
   obj.setAge(12);




    }
}
