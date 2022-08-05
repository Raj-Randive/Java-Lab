import java.util.*;

public class Program7_Maximum_using_nested_if {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.print("Enter First Number: ");
        n1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        n2 = scan.nextInt();
        System.out.print("Enter Third Number: ");
        n3 = scan.nextInt();
        
        if (n1 > n2) {

            if(n1 > n3){
                System.out.print("The Maximum Number out of these three is : " + n1);
            }
            else{
                System.out.print("The Maximum Number out of these three is : " + n3);
            }
        }
        else{
            if (n2>n3) {
                System.out.print("The Maximum Number out of these three is : " + n2);
            }
            else{
                System.out.print("The Maximum Number out of these three is : " + n3);
                
            }
        }
        
        
        // Using CONDITIONAL OPERATOR...!!
        System.out.print("\n\n Using Conditional Operator");

        if (n1>n2) {
            System.out.print("\n\nThe Maximum Number out of these three is : " + ((n1>n3) ? n1 : n3) );
        }
        else{
            System.out.print("\n\nThe Maximum Number out of these three is : " + ( (n2>n3) ? n2 : n3) );
        }
        


        scan.close();
    }


}
