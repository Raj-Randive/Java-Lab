import java.util.*;
public class P10DiamondPattern{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of lines you want: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            
            for (int spaces = 1; spaces <= (n-i)  ; spaces++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        for (int i = 1; i <= n-1; i++) {
            
            for (int spaces = n; spaces > (n-i)  ; spaces--) {
                System.out.print(" ");
            }

            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }
        
        scan.close();
    }
}