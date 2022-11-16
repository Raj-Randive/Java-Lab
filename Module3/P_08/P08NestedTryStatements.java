//Q-8]. Write a program to show the use of nested try statements that emphasizes the sequence of checking for catch handler statements.
package Module3.P_08;

public class P08NestedTryStatements {
    public static void main(String args[]){

        try{
            int arr[] = {56, 78, 34, 90};
            System.out.println(arr[0]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);

            try{
                int x = arr[2] / 0;
            }catch(ArithmeticException e2){
                System.out.println("Division by zero is not possible - Exception.");
            }

        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("ArrayIndexOutOfBoundsException. Element at such index does not exists");
        }

    }
}