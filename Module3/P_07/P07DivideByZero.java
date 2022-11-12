package Module3.P_07;
import java.util.Scanner;

public class P07DivideByZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        try{
            System.out.println("The division (a/b) is: " + (a/b));
        }catch(ArithmeticException exp){
//            System.out.println(exp.getMessage());
            System.out.println("\n_____________________________\nDivide by Zero Exception.\n_____________________________");
        }

    }
}
