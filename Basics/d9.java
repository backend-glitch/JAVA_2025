import java.util.*;
import java.util.Timer;

void main(){


    //dates and time

    LocalDate date = LocalDate.now();
System.out.println(date);

  LocalTime time  = LocalTime.now();
  System.out.println(time);
    

  //datetimeformatter
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
  String newdatetime = time.format(formatter);


  System.out.println(newdatetime);


  Dog dog1 = new Dog();

  Dog dog2 = new Dog(){  // anonymous class.
  @Override
  void speak(){
    System.out.println("nice.");
   }
  };

  dog1.speak();
  dog2.speak();

  
  Timer timer  = new Timer();
  TimerTask task = new TimerTask(){

    int count = 3;

   @Override
   public void run(){
    System.out.println("hello");
     count--;
    if(count <=0){
    System.out.println("done");
    timer.cancel();
    }

   }
  };

  timer.schedule(task,0, 3000);


}

public static class Dog{

void speak(){

  System.out.println("bark bark");
}
}