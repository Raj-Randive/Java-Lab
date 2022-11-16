//Q-4]. Create multiple threads by extending thread class and assign same task to all the threads.
package Module3.Thread_Programs;

class myThread1 extends Thread{
    String task;
    myThread1(String task){
        this.task = task;
    }

    @Override
    public void run(){
        int i=0;
        while(i<5){
            System.out.println(task + " : " + (i+1));
            i++;

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class myThread2 extends Thread{
    String task;
    myThread2(String task){
        this.task = task;
    }

    @Override
    public void run(){
        int i=0;
        while(i<5){
            System.out.println(task + " : " + (i+1));
            i++;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}


public class P04MultipleThreadUsingClass {
    public static void main(String args[]){

        myThread1 t1 = new myThread1("Cut the ticket");
        myThread2 t2 = new myThread2("Show your seat number");
        t1.start();
        t2.start();

    }
}
