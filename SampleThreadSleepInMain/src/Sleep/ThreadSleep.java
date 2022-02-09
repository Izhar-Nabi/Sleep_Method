package Sleep;

import java.io.OutputStream;

public class ThreadSleep {
    public static void main(String [] args){
        for (int i=0; i<5; i++){
            try
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (InterruptedException e)
           {
               // e.printStackTrace();
                System.out.println("Working Properly ");
            }
        }
    }
}
