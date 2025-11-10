
    

import java.util.Scanner;

void main() {

    // if else statements
    System.out.println(" ");

    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    scanner.nextLine();
    if(age >=  45)
    {
        System.out.println("YOU ARE LISTED");

    }else if(age > 0 && age < 45){
        System.out.println("you arte a junior , not applicable");
    }else{
        System.out.println("entered number is invalid !!");
    }

    // TERNARY operator
    int num1 = scanner.nextInt();
   String result1 = num1 % 2 == 0 ? "even" : "odd";
   System.out.println(result1);


    // switch statement

    System.out.println("enter day name: ");
    String days = scanner.nextLine();

    switch(days){
        case "Sunday" : System.out.println("it is sunday.");
        break;

        case"Monday" : System.out.println("it is monday.");
        break;

        case "Friday" : System.out.println("it is friday.");
        break;

        default : System.out.println("invalid day");
    }

    //logical operates
    /*
    and : &&
    or : ||
     not : !
    */

    System.out.println("press q or Q to exit.");
    String choice = scanner.nextLine();

    if (choice.equals("q") || choice.equals("Q")){
        System.out.println("quitting the game");

    }else{
        System.out.println("in the game");
    }


// while ,do while,nested
    /*

    while(condition){
    statement;
    }

    .isBlank() => check whether the variable is empty or not.

    do{
    statement
    }while(statement);

     // for loop
     for (int i = 0; i < n ; i++){
          i += 1;
          }

   //   nested loop
   if(condition){

          if(condition){
          statement;
          }else{
          statement;
          }


          */

    //arrays
    String[] cars = {"honda", "hyundai", "kia"};

    cars[1] = "ford";
    System.out.println(cars[1]);

    String[] colors = new String[3];

    colors[0] = "red";
    colors[1] = "blue";
    colors[2] = "purple";

   for (int j = 0;j < colors.length;j++){
       System.out.println(colors[j]);
   }

   // 2d arrays
    int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
   for (int l =0;l < matrix.length;l++) {
        System.out.println();
       for (int k = 0; k < matrix.length; k++) {
           System.out.println(matrix[l][k]);
       }

   }
   // enhanced for-loop :

    // int[] matrix = {1,2,3,4};
    // for (int num : matrix){
    // statement;
    // }

    /*

    // string methods
    string.length();
    string.charAt();
    string.indexOf();
    string.isEmpty();
    string.toUpperCase();
    string.toLowerCase();


     */

    /*
    //primitive    // wrapper
     boolean         Boolean
     char            Character
     int             Integer
     double          Double
     */

    String str = "123";
    // Convert String → int
    int num = Integer.parseInt(str);

    // Convert int → String
    String str2 = Integer.toString(num);

    //wrapper for NULL.
    Integer h = null;

    //NOTE :  wrapper is used for advanced data structures like arrayList ,hashMaps, Stack etc.

    scanner.close();
}



