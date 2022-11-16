//Q-13]. Write a program to demonstrate thread example by implementing runnable interface.
package Module3.P_13;

class myThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("I am a simple thread 1.");
            i++;
        }
    }
}
class myThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<15){
            System.out.println("I am not a simple thread 2.");
            i++;
        }
    }
}

public class P13ThreadsUsingRunnable {
    public static void main(String args[]){

        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
