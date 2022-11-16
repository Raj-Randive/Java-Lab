//Q-14]. Write a program to demonstrate priorities among multiple threads.
package Module3.P_14;

class myThread1 extends Thread{
    public void run(){
        System.out.println("Inside Thread-1. Hello from here");
    }
}
class myThread2 extends Thread{
    public void run(){
        System.out.println("Inside Thread-2. Hi from here.");
    }
}
class myThread3 extends Thread{
    public void run(){
        System.out.println("Inside Thread-3. Bye from here.");
    }
}

public class P14PrioritiesAmongMultipleThread{

    static void lines(){
        for (int i=0; i<40; i++){
            System.out.print("_");
        }
        System.out.print("\n");
    }

    public static void main(String args[]){

        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        myThread3 t3 = new myThread3();

        lines();
        System.out.println("Before Setting Priorities");
        System.out.println("The priority of Thread-1 is: " + t1.getPriority());
        System.out.println("The priority of Thread-2 is: " + t2.getPriority());
        System.out.println("The priority of Thread-3 is: " + t3.getPriority());

        t1.setPriority(6);
        t2.setPriority(4);
        t3.setPriority(8);
        lines();
        System.out.println("After Setting Priorities");
        System.out.println("The priority of Thread-1 is: " + t1.getPriority());
        System.out.println("The priority of Thread-2 is: " + t2.getPriority());
        System.out.println("The priority of Thread-3 is: " + t3.getPriority());

        // main thread
        lines();
        System.out.println("\nCurrently Executing Thread: " + Thread.currentThread().getName());
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());

        lines();
        t3.start();
        t1.start();
        t2.start();

    }
}
