import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Scanner sc = new Scanner(System.in);
        //print first n prime numbers
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] primes = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                primes[count] = i;
                count++;
            }
            i++;
        }
        sc.close();
        for (int j = 0; j < n; j++) {
            System.out.print(primes[j] + " ");
        }
        System.out.println();
    }
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }   
}