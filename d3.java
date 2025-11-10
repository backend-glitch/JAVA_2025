import java.util.ArrayList;
import java.util.*;

void main() {

    // arrjaylist
    ArrayList <String> food = new ArrayList<String>();

    food.add("pizza");
    food.add("burger");
    food.add("hotdog");

    food.set(0, "sushi");
    food.remove(2);

    //to clear the array
    food.clear();

    for (String s : food) {
        System.out.println(s);
    }

    ArrayList<String> bakerylist = new ArrayList();
    bakerylist.add("pasta");
    bakerylist.add("noodles");
    bakerylist.add("donut");

    for(String word : bakerylist){
        System.out.println(word);
    }

    // System.out.println(bakerylist.get(0));

    ArrayList<String> drinklist = new ArrayList();
    drinklist.add("cola");
    drinklist.add("campa");
    drinklist.add("mirinda");

    System.out.println(drinklist);


    ArrayList<ArrayList<String>> grocerylist = new ArrayList<>();

    grocerylist.add(bakerylist);
    grocerylist.add(drinklist);

    System.out.println(grocerylist);

    //method

    String word = "arjun";
  hello(word);

  int ans = addition(3, 6);
  System.out.println(ans);


  // print f
    System.out.printf("hello  %s","arjun");
    System.out.printf("hello  %d",123);
    /*
    %d => decimal
    %s => string
    %c => char
    %b => boolean
    %f => double

    %.10f => only include first 10 characters after the decimal.

// final => to assign the final value to a variable ,cannot be reassigned.
*/


}

// method
void hello(String name){
        System.out.println(name);
}

int addition(int x, int y){
    int c = x + y;
    return c;
}

// method overloading
double addition(double a, double b,double c){

    double d = a+b+c;
    return d;

}

