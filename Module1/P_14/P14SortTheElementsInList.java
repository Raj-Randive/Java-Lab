// 14. Write a program in Java to sort the elements of list so that they are in ascending order (Take dynamic array).

public class P14SortTheElementsInList {

    public static void main(String args[]){

        // Initialize an array
        int arr[] = new int[] {6, 9, 3, 8, 2, 7};
        int temp = 0;
        

        // Printing Array before Sorting...!!
        System.out.println("\nThe array before sorting is: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // SORTING ARRAY
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        // Printing Array after Sorting...!!
        System.out.println("\nThe array before sorting is: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }





    }
    
}
