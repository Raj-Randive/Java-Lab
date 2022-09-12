// Q-10] Java Program to demonstrate the real scenario (e.g., bank) of Java Method Overriding where three classes are overriding the method of a parent class. Creating a parent class.

// Simple Interest: A = P*R*T
// Compound Interest: A = P(1 + r/n)^nt
package Module2.P_10;

class Bank{
    double InterestRate;
    boolean lockersAvailable;
    int T;

    Bank(){
        InterestRate = 10.47;
        lockersAvailable = true;
    }

    double getRateOfInterest(){
        return InterestRate;
    }

    // --> Method overloading of method calculateInterest
    double calculateInterest(double PA, int T){
        this.T = T; 
        return (InterestRate*PA*T)/100;
    }
}

class SBI extends Bank{
    int noOfLockers;
    SBI(){
        InterestRate = 12.78;
        lockersAvailable = false;
    }
    
    // --> Method Overriding of method getRateOfInterest
    double getRateOfInterest(){
        return InterestRate;
    } 

    // --> Method overloading of method calculateInterest
    double calculateInterest(double PA, int T, int n){
        return PA * Math.pow((1 + InterestRate/n*100), n*T);
    }

}

class ICICI extends Bank{  
    int noOfLockers;
    ICICI(){
        InterestRate = 15.24;
        lockersAvailable = true;
    }
    
    // --> Method Overriding of method getRateOfInterest
    double getRateOfInterest(){
        return InterestRate;
    }  
}  
class AXIS extends Bank{  
    int noOfLockers;
    AXIS(){
        InterestRate = 12.15;
        lockersAvailable = false;
    }
    
    // --> Method Overriding of method getRateOfInterest
    double getRateOfInterest(){
        return InterestRate;
    }  
} 

public class P10BankInheritance {
    public static void main(String args[]){

        Bank b1 = new Bank();
        double x = b1.calculateInterest(5000, 3);
        System.out.println("\nThe Default Interest Rate is: " + b1.InterestRate);
        System.out.println(" > Lockers Available: " + b1.lockersAvailable);
        System.out.println(" > The SI after "+ b1.T + " years is: " + x);
        
        SBI s1 = new SBI();
        double m = s1.calculateInterest(7000, 2); // Simple Interest
        double n = s1.calculateInterest(5000, 3, 2); // Compound Interest
        System.out.println("\nThe SBI's Interest Rate is: " + s1.InterestRate);
        System.out.println(" > Lockers Available: " + s1.lockersAvailable);
        System.out.println(" > The SI after "+ s1.T + " years is: " + m);
        System.out.println(" > The CI after "+ s1.T + " years is: " + n );
        
        ICICI i1 = new ICICI();
        double r = i1.calculateInterest(8000, 5);
        System.out.println("\nThe ICICI's Interest Rate is: " + i1.InterestRate);
        System.out.println(" > Lockers Available: " + i1.lockersAvailable);
        System.out.println(" > The SI after "+ i1.T + " years is: " + r);
        
        AXIS a1 = new AXIS();
        double p = a1.calculateInterest(9000, 8);
        System.out.println("\nThe AXIS's Interest Rate is: " + a1.InterestRate);
        System.out.println(" > Lockers Available: " + a1.lockersAvailable);
        System.out.println(" > The SI after "+ a1.T + " years is: " + p);

    }
}