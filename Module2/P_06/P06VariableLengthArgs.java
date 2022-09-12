// Q-6] Write a program to show the use of static functions and to pass variable length arguments in a function.
package Module2.P_06;

class staticArgs{
    static int a = 68;
    int b = 99;

    void simpleDisplay(){
        System.out.println("Inside a Simple Function!");
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }

    static void staticDisplay(){
        System.out.println("Inside a Static Function!");
        System.out.println("The value of a is: " + a);
    }

    static int sum = 0;
    void varLenArgs(int... a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
            sum += a[i];
        }
        System.out.println("\n\nThe sum is: "+ sum);
    }
}

public class P06VariableLengthArgs {
    
    public static void main(String []args){

        
        staticArgs obj1 = new staticArgs();
        obj1.simpleDisplay();
        System.out.println("");
        
        staticArgs.staticDisplay(); // Static methods should be called by class name. We can also call it by object but its not a good practice.!! 
        
        staticArgs obj2 = new staticArgs();
        System.out.println("");
        obj2.varLenArgs(10, 20, 30, 40, 50, 60, 70, 80, 90, 100 );
        
    }
    
}
