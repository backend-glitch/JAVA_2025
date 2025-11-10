// public class Main
// public static void main(String//[] args)

//terminal cmd
 // cd src
 // javac Main.java
 // java Main

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

       void main(){

//print statement
        System.out.print("hello java");
        System.out.println(" ");
        System.out.print("i love ");

        //variables
        int x = 123;
        System.out.println("my number is:"+x);

        float y = 12.5f;
        System.out.println(y);

        boolean z = true;
        System.out.println(z);

        String word = "arjun";
        System.out.println(word);

        // swap variables
        String x1 = "first";
        System.out.println("x:" + x);

        String x2 = "second";
        System.out.println("y"+ y);

        String temp;
        temp = x1;
        x1 = x2;
        x2 = temp;

        System.out.println(x1 + x2);

// input
Scanner scanner = new Scanner(System.in);
System.out.println("what is your name:?");
String name = scanner.nextLine();

System.out.println("hello" +" "+ name);

System.out.println("your age");
int age = scanner.nextInt();
// add this to avoid input glitch
scanner.nextLine();
System.out.println("your age is:" + age);

System.out.println("your college_name:");
String college = scanner.nextLine();
System.out.println("your college : " + college);


// expressions
  int friends = 10;
  friends += 1;
  System.out.println("friends : " + friends);

  int ans1 = friends / 2;
  double ans2 = (double) friends / 2;

  System.out.println(ans1 + " " + ans2);


  //GUI options

   String name1 = JOptionPane.showInputDialog("enter the name");
   JOptionPane.showMessageDialog(null , "hello " + name1);

   int age1 = Integer.parseInt(JOptionPane.showInputDialog("your age : "));
   JOptionPane.showMessageDialog(null , "your age is : " + age1);

   //Math
          double q  = 2.9;
          double w = -4.8;
          double s = Math.min(q,w);
           System.out.println(s);

           double m = Math.round(w);
           double n = Math.ceil(x); // always round up
           double o = Math.floor(x); // always round down
            double root = Math.sqrt((x*x) +(y*y));

   scanner.close(); // good practice to close the scanner at end.

           // random values
           Random random = new Random();

           int ran = random.nextInt(7); // to limit the range 
           System.out.println(x);

            

            // mutable string
            StringBuffer sb = new StringBuffer("arjun");
            sb.append("verma");
            System.out.println(sb);
            
            sb.deleteCharAt(0);

       }
