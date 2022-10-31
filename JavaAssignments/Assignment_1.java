package JavaAssignments;
import java.util.Scanner;

class bank{
    String cusName;
    double cusNumber, accBalance;
    static int numOfAcc = 0;
    static double networth = 50000;
    static double loanSanctioned = 0;
    static double loanAmount=0;
    int numOfInstallments=0;

    bank(double cusNumber, String cusName, double accBalance){
        this.cusNumber = cusNumber;
        this.cusName = cusName;
        this.accBalance = accBalance;
        numOfAcc += 1;
        networth += accBalance;
    }

    void addMoney(double accBalance){
        this.accBalance += accBalance;
        networth = accBalance + networth;
    }

    void reqLoan(double amt){

        loanAmount += amt;
        if ( (loanAmount < 2*accBalance) && (loanAmount < networth) ){
            loanSanctioned += 1;
            networth = networth - loanAmount;
            System.out.print("\n****************************************************\n Congrats!. Your loan is approved.\n****************************************************\n");
        }
        else{
            System.out.print("\n****************************************************\n Sorry your loan can't be approved.\n****************************************************\n");
            loanAmount = loanAmount-amt;
        }
    }

    void repaySanctionedLoan(double amount){
        networth = networth + amount;
        if (amount > loanAmount){
            accBalance = ( accBalance + (amount-loanAmount) ) ;
            loanAmount = 0;
        }else{
            loanAmount = loanAmount - amount;
        }
        numOfInstallments += 1;
        System.out.print("\n****************************************************\n " + amount + " paid to your sanctioned loan. \n****************************************************\n");
    }

    void inspection(){
        System.out.println("\n****************************************************\nNetworth of bank is: " + networth);
        System.out.println("Number of accounts in this branch: " + numOfAcc);
        System.out.println("Total number of loans sanctioned till date: " + loanSanctioned);
        System.out.println("Total loan amount sanctioned till date: " + loanAmount);
        System.out.println("\n****************************************************");
    }

    void showAccDetails(){
        System.out.println("\n****************************************************\nCustomer Number: " + cusNumber);
        System.out.println("Name: " + cusName);
        System.out.println("Balance: " + accBalance);
        System.out.println("Total number of loans taken: " + loanSanctioned);
        System.out.println("Total loan amount taken: " + loanAmount);
        System.out.println("Number of installments made to repay your loan: " + numOfInstallments);
        System.out.println("\n****************************************************");
    }

}

public class Assignment_1 {
    public static void main(String args[]){

        Scanner myscan = new Scanner(System.in);

        String name;
        double accBal;
        System.out.println("\nWelcome to our Bank. The available options are: ");
        System.out.print("\n  > 1. Create an Account.\n  > 2. Exit");
        System.out.print("\n\n  > Enter your choice: ");
        int x = myscan.nextInt();

        while ( x != 2 ){
            if (x == 1) {
                System.out.print("\nCreating your new account...");
                System.out.print("\nEnter the customer number: ");
                double cusNum = myscan.nextDouble();
                System.out.print("Enter Your name: ");
                name = myscan.next();
                System.out.print("Enter amount to be credited in your account: ");
                accBal = myscan.nextDouble();

                bank b1 = new bank(cusNum, name, accBal);

                System.out.print("\n  > 1. Add money to your existing account.\n  > 2. Show details about your account.\n  > 3. Request for a loan.\n  > 4. Repay your loan.\n  > 5. Inspection.\n  > 6. Exit.");
                System.out.print("\n\n  > Enter your choice: ");
                int y = myscan.nextInt();

                while(y != 6){
                    switch (y) {
                        case 1 -> {
                            System.out.print("\n -> Enter amount to be added: ");
                            double a1 = myscan.nextDouble();
                            b1.addMoney(a1);
                        }
                        case 2 -> {
                            b1.showAccDetails();
                        }
                        case 3 -> {
                            System.out.print("\n -> Enter the Loan Amount: ");
                            double z = myscan.nextDouble();
                            b1.reqLoan(z);
                        }
                        case 4 -> {
                            System.out.print("\n -> Enter the repay loan amount: ");
                            double w = myscan.nextDouble();
                            b1.repaySanctionedLoan(w);
                        }
                        case 5 -> {
                            b1.inspection();
                        }
                        default -> {
                            System.out.println("Please enter a correct choice.");
                        }
                    }

                    System.out.print("\n  > 1. Add money to your existing account.\n  > 2. Show details about your account.\n  > 3. Request for a loan.\n  > 4. Repay your loan.\n  > 5. Inspection.\n  > 6. Exit.");
                    System.out.print("\n\n  > Enter your choice: ");
                    y = myscan.nextInt();
                }

            }
            else {
                System.out.println("Please enter a correct choice.");
            }

            System.out.print("\n  > 1. Create an Account.\n  > 2. Exit");
            System.out.print("\n\n  > Enter your choice: ");
            x = myscan.nextInt();

        }
    }
}
