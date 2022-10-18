 // 11. Write a program to handle ArrayIndexOutOfBounds exception for any program.
package Module3.P_11;
import java.util.Scanner;

public class P11ArrayOutOfBoundException {
    public static void main(String args[]){
        Scanner myscan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = myscan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i+1) + " element of the array: ");
            arr[i] = myscan.nextInt();
        }

        System.out.print("\nThe elements in the array are : ");

        try{
            for (int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nArray out of bound exception generated.");
        }





    }
}
