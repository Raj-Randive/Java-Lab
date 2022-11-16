//Q-3]. Create a single thread by implementing runnable interface:
//      a. Take thread object in main
//      b. Take thread object in class that is implementing runnable

package Module3.Thread_Programs;
class ThreadRunnable1 implements Runnable{

    Thread T;
    ThreadRunnable1(){
        T = new Thread("TR-1");
        System.out.println("Hello from constuctor.");
    }


    public void run(){
        int i=0;
        while (i<5){
            System.out.println("I am in thread 1.");
            i++;
        }
    }
}

public class P03SingleThreadByRunnable {
    public static void main(String args[]){

        System.out.println("Tn the main Thread...\n");

        // (A) Part
        ThreadRunnable1 t = new ThreadRunnable1();
        Thread T = new Thread(t);
        T.start();

        // (B) Part
        System.out.println("\nPrinting by creating the object in the runnable class.");
        t.T.start();
        System.out.println("Name is: " + t.T.getName());

    }
}
