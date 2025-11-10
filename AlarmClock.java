import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
//import java.util.Toolkit;
// alarm clock program
import java.awt.Toolkit;

/**
 * 
 * 
 * 
 **/
void main(){

    // clock
    Scanner scanner  = new Scanner(System.in);
    DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalTime alarmTime = null;// converts your alarmtime to hh:mm:ss .

    while(alarmTime == null){
    try{
        System.out.println("enter the alarm time :");
        String inputTime = scanner.nextLine();

        alarmTime = LocalTime.parse(inputTime, formatter);
        System.out.println("Alarm set for:" + alarmTime);

    }catch(DateTimeParseException e){

        System.out.println("invalid format : !!!");

    }
}

AlarmClock alarmClock = new AlarmClock(alarmTime);
Thread alarmThread  = new Thread(alarmClock);

alarmThread.start();

      System.out.println("Alarm running... Press ENTER to stop when it starts beeping!");
        scanner.nextLine();  // waits for Enter key
        alarmClock.stopAlarm();  // signal to stop the beep
        
    
scanner.close();
}


public class AlarmClock implements Runnable{ // to run threads

    private final LocalTime alarmTime;
    private volatile boolean isStopped = false; // volatile used with threads

 

    AlarmClock(LocalTime alarmTime){
     this.alarmTime = alarmTime;
    }

    @Override
    public void run(){ // always run

      //  LocalTime now = LocalTime.now();

        while(LocalTime.now().isBefore(alarmTime)){
            try{
            Thread.sleep(1000);
          //  System.out.println(LocalTime.now());

          int hours = LocalTime.now().getHour();
          int minutes = LocalTime.now().getMinute();
          int seconds = LocalTime.now().getSecond();

       //   System.out.println(hours +":"+minutes+":"+seconds);
       System.out.printf("\r%02d:%02d:%02d",hours, minutes,seconds); //  r : brings update in that line rather than new line.

            }
            catch(InterruptedException e){
                System.out.println("thread interrupted!!");
            }
        }
      //  System.exit(0);

           System.out.println("\nAlarm time reached!");
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Beep until user stops it
        while (!isStopped) {
            toolkit.beep();
            try {
                Thread.sleep(500); // half-second delay between beeps
            } catch (InterruptedException e) {
                break;
            }
        }

        System.out.println("Alarm stopped.");
    }

    public void stopAlarm() {
        isStopped = true;
    }
}