//Q-1] Check the details of current thread (id, name, priority, setName etc.)
package Module3.Thread_Programs;

public class P01CheckDetailsOfThread extends Thread{
    public static void main(String args[]){

        P01CheckDetailsOfThread t1 = new P01CheckDetailsOfThread();
        System.out.println("Main thread is Running...");
        // Checking the details of current thread.
        System.out.println("\nThe name of current thread is: " + t1.getName());
        System.out.println("The id of current thread is: " + t1.getId());
        System.out.println("The priority of current thread is: " + t1.getPriority());
        t1.setName("'New-thread-name'");
        System.out.println("Setting a name of current thread as: " + t1.getName());

    }
}
