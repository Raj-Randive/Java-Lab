import java.util.*;

public class P13MatrixMultiplication {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int r1, r2, c1, c2;
        // int arr[n];  --> Can't do this in java. SO CREATE IT USING "NEW" Keyword.
        
        System.out.print("Enter the number of rows of Matrix 1: ");
        r1 = scan.nextInt();
        System.out.print("Enter the number of columns you want: ");
        c1 = scan.nextInt();
        
        System.out.print("Enter the number of rows of Matrix 2: ");
        r2 = scan.nextInt();
        System.out.print("Enter the number of columns you want: ");
        c2 = scan.nextInt();
        
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];
        int arr3[][] = new int[r1][c2];

        
        // ********************************* Matrix 1 ********************************************
        System.out.print("\nEnter the elements of Matrix 1: \n");
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("Enter the element (" + (i+1) + ", " + (j+1) + ") : ");
                arr1[i][j] = scan.nextInt(); 
            }
        }
        
        System.out.println("\nFirst Matrix is: ");
        for (int i = 0; i <r1; i++) 
        {
            for (int j = 0; j <c1; j++) 
            {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        
        
        // ********************************* Matrix 2 ********************************************
        System.out.print("Enter the elements of Matrix 2: \n");
        
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("Enter the element (" + (i+1) + ", " + (j+1) + ") : ");
                arr2[i][j] = scan.nextInt(); 
            }
        }
        
        System.out.println("\nSecond Matrix is:");
        for (int i = 0; i <r2; i++) 
        {
            for (int j = 0; j <c2; j++) 
            {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.print("\n");
        }
        
        
        // ***************************** Multiplying Matrix 1 and Matrix 2 *********************************
        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {
                arr3[i][j] = 0;

                for(int k = 0; k < arr3.length; k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];

                }
            
            }
        }

        System.out.println("\nThe Result of Matrix Multiplication is: \n");    
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.print("\n");
        }


    scan.close();
    
    }
}
