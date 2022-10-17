package Module3.P_10;
import java.util.Scanner;

class NotSufficientFund extends Exception{
    NotSufficientFund(String str){
        super(str);
    }
}

class BankAccount{

    static double value;
    void deposit(double a){
        value = a;
    }

    void withdraw(double amt){
        value = (value-amt);

        try{
            if (value < 0) {
                value = (value + amt);
                throw new NotSufficientFund("Throwing Not Sufficient Fund Exception!");
            }
            else {
                System.out.println("Amount remaining after withdraw is: " + value + "\n");
            }

        }catch (NotSufficientFund e){
//            System.out.println(e);
            System.out.println("Not Sufficient Fund.");
        }
    }
}

public class P10BankApplicationException {

    public static void main(String args[]){

        Scanner myscan = new Scanner(System.in);
        BankAccount obj1 = new BankAccount();

        System.out.println("The Options for transactions are: ");
        System.out.println("  > 1. Deposit Money");
        System.out.println("  > 2. Withdraw Money");
        System.out.println("  > 3. Exit\n");
        int x;
        System.out.print("  > Enter 1/2/3 :  ");
        x = myscan.nextInt();

        while (x != 3){

            switch (x) {
                case 1 -> {
                    System.out.print("\nEnter the amount to deposit: ");
                    double dAmount = myscan.nextDouble();
                    obj1.deposit(dAmount);
                }

                case 2 -> {
                    try{

                        System.out.print("\nEnter the amount to withdraw: ");
                        double wAmount = myscan.nextDouble();
                        obj1.withdraw(wAmount);

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                default -> {
                    System.out.println("Enter valid options.");
                }
            }

            System.out.print("  > Enter 1/2/3 :  ");
            x = myscan.nextInt();

        }




    }
}
