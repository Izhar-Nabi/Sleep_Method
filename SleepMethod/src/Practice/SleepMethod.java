package Practice;

import java.util.concurrent.ExecutionException;

public class SleepMethod implements Runnable{
    @Override
    public void run() {
        System.out.println("Sleep Method Will Use Below integers");
        for (int i=1; i<=5; i++)
        {
            try
            {
                Thread.sleep(1000); // it means at every loop program will sleep for 1 second...
                System.out.println(i);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String [] args) {
        SleepMethod thread1= new SleepMethod();
        Thread ThreadHere= new Thread(thread1);
        ThreadHere.start();
    }
}
