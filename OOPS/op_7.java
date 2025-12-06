package OOPS;

@FunctionalInterface
interface A {

    void show();
    
}

interface B {

    void show();
    
}
public class op_7 {
    
    public static void main(String[] args){
     
        // annotations => @override => good practice ,if we use same method for parent and child classes.

        //@deprecated => not gonna be valid in future anymore, used for class

        // lAMBDA EXPRESSION
        A obj = () ->
        {
            System.out.println("in the show");
        };

        B obj2 = (int i, int j) ->
        {
            return i+j;
        };

        obj.show();

    int result = obj2.add(5,4);
   System.out.println(result);

   // 9:26

   
   // exception handling
   

   
   
    }

}
