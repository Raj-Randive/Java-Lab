public class P02PrimeNumbers {
    public static void main(String args[]){

        int tag = 0, n = 53;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        }
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0) {
                System.out.println(n + " is not a prime number");
                tag = 1;
            }
            else{
                break;
            }
        }
        if (tag == 0) {
            System.out.println(n + " is A prime number");
        }
    }
}
