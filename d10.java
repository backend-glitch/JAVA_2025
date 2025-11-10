import java.util.*;

void main()
{

    Scanner scanner = new Scanner(System.in);

    myrunnable running = new myrunnable();
    Thread thread = new Thread(running);
    //thread.setDaemon(true); // it makes the thread end when the main thread is over.
    thread.start();// to start the thread

    System.out.println("you have 5 sec to enter your name.");
    System.out.println("enter your name:");
    String name = scanner.nextLine();
    System.out.println("hello" + name);

    scanner.close();

  

    // multithreading : enables a multiple threads to run concurrently.
   Thread thread1 = new Thread(new multi());
   Thread thread2 = new Thread(new multi());

   thread1.start();
   thread2.start();
   

}



public class myrunnable implements Runnable{

    @Override
    public void run(){
        for (int i =1; i<= 5; i++){

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
               System.out.println("Thread  is interrupted!");

            }

            if(i == 5){
                System.out.println("    Time's up!");
            //System.exit(0); // end the program if time up.
            }
        }
    }
}


public class multi implements Runnable{

    @Override
    public void run(){ // always run ?
        for(int i = 1;i<= 5; i++){

            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+ " "+ i);
            }catch(InterruptedException e){
                System.out.println("some error cmae!!");
            }
        }
    }

}

