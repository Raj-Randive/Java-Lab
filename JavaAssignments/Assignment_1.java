package JavaAssignments;
import java.util.Scanner;

class bank{
    double networth = 50000;
    static int numOfAcc = 0;
    double cusNumber;
    String cusName;
    double accBalance;
    double loanSanctioned;
    bank(){

    }

}

public class Assignment_1 {
    public static void main(String args[]){

        Scanner myscan = new Scanner(System.in);

        System.out.print("\nPress 'Y' to create a new account in our bank or press 'N' to exit");
        String s = myscan.nextLine();

        while ( !s.equals("N") ){

            switch (s){
                case "Y" -> {
                    System.out.print("\nCreating your new account...");
                    System.out.print("\nEnter Your name: ");
                    String s1 = myscan.nextLine();
                    System.out.print("\nEnter amount to be credited in your account: ");
                    double a1 = myscan.nextInt();
                    break;

                    }

            }

            System.out.print("\nPress 'Y' to create another account or 'N' to exit. ");
            s = myscan.nextLine();

        }



    }


}
