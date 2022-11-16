//Q-12]. Write a Java Program that demonstrates thread class and few methods.
package Module3.P_12;

class myThread1 extends Thread{

    @Override
    public void run(){
        int i=0;
        while(i<2000){
            System.out.println("Thread 1 is Running brace yourself.");
            i++;
        }
    }
}
class myThread2 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while(i < 2000){
            System.out.println("\nThread 2 is Running.");
            System.out.println("Here we go again!");
            i++;
        }
    }
}

class myThread3 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while(i < 2000){
            System.out.println("\nThread 3 is Running with full speed.");
            System.out.println("__________________________________");
            i++;
        }
    }
}

public class P12ThreadsUsingClass {
    public static void main(String args[]){

        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        myThread3 t3 = new myThread3();

        t1.start();  // Start by default calls the run method of the Thread class.
        t2.start();
        t3.start();


    }
}
