//Q-2]. Create single thread by extending class thread.
package Module3.Thread_Programs;

class myThread extends Thread{

    public void run(){
        System.out.println("\nIn the thread-1.");
        int i=0;
        while(i<10){
            System.out.print((i+1) + " ");
            i++;
        }
    }

}

public class P02SingleThreadUsingClass {
    public static void main(String args[]){

        myThread t1 = new myThread();
        t1.start();

        System.out.println("In the main thread...");

    }
}
