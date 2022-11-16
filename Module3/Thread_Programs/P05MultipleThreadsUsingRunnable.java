// Q-5. Create multiple threads by implementing runnable and assign different task to each thread (prime number, whether given number is Armstrong or not).
package Module3.Thread_Programs;
import java.util.Scanner;
import java.util.TreeMap;

class myTR1 implements Runnable{
    int x;
    myTR1(int x){
        this.x = x;
    }

    public void run(){
        int flag=0;
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x%i == 0){
                flag ++;
            }
        }
        if (flag == 0){
            System.out.println("________________________________________________\nThe number " + x + " you entered is a Prime Number. \n________________________________________________");
        }
        else{
            System.out.println("________________________________________________\nThe number " + x + " you entered is Not a Prime Number. \n________________________________________________");
        }
    }
}
class myTR2 implements Runnable{
    int x;
    myTR2(int x){
        this.x = x;
    }

    static void isArmstrong(int n){
        int temp, numOfDigits=0, digitEncountered=0, sum=0;

        //Loop to count number of digits
        temp = n;
        while(temp>0){
            temp = temp/10;
            numOfDigits++;
        }

        //Loop for evaluating each digit
        temp = n;
        while(temp>0){
            digitEncountered = temp%10;
            sum += Math.pow(digitEncountered, numOfDigits);
            temp = temp/10;
        }

        if (sum == n){
            System.out.println("________________________________________________\nThe number " + n + " you entered is an Armstrong Number. \n________________________________________________");
        }
        else {
            System.out.println("________________________________________________\nThe number " + n + " you entered is an Armstrong Number. \n________________________________________________");
        }
    }

    @Override
    public void run(){
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        isArmstrong(x);
    }
}

public class P05MultipleThreadsUsingRunnable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number to check if it is a prime or not and armstrong number or not: ");
        int x = sc.nextInt();

//        myTR1 t = new myTR1(x);
//        Thread T = new myTR1(t);
        Thread T = new Thread(new myTR1(x));
        T.start();

        Thread T2 = new Thread(new myTR2(x));
        T2.start();

    }
}
