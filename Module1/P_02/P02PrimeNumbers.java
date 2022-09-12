// 2. Write a program in Java to generate first n prime numbers.

import java.util.Scanner;
public class P02PrimeNumbers {
    public static void main(String args[]){
        Scanner myscan = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = myscan.nextInt();
        myscan.close();

        int i, flag, k, j=1;

        for (i = 2; j <= n ; i++) {

            flag = 0;
            for (k = 2; k <= Math.sqrt(i); k++) {
                if (i%k == 0) {
                    flag = 1;
                }
            }

            if (flag == 0) {
                System.out.print(i + " ");
                j++;
            }

        }

    }
}
