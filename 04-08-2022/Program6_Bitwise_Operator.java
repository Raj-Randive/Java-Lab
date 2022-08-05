import java.util.*;

public class Program6_Bitwise_Operator {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter the First Number : " );
        num1 = scan.nextInt();
        System.out.print("Enter the Second Number : " );
        num2 = scan.nextInt();

        System.out.println("The Bitwise AND is : " + (num1 & num2));
        System.out.println("The Bitwise OR is : " + (num1 | num2));
        System.out.println("The Bitwise NEGATION ~ num1 is : " + (~num1));
        System.out.println("The Bitwise Left Shift num1 << 1 is : " + (num1 << 1));
        System.out.println("The Bitwise Left Shift num1 >> 1 is : " + (num1 >> 1));
        System.out.println("The Bitwise XOR is : " + (num1 ^ num2));

        scan.close();
    }
}
