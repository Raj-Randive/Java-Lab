package Module2.P_12;
import java.util.Scanner;

public class P12StringRotationChecking {
    public static void main(String []args){
        Scanner myscan = new Scanner(System.in);

        String s1, s2;
        int s1len, s2len;
        System.out.println("\nThis is the program to check if String 1 is a rotation of String 2. Also take care of Capitals.");

        System.out.print("\nEnter the String 1: ");
        s1 = myscan.nextLine();
        System.out.print("Enter the String 2: ");
        s2 = myscan.nextLine();
        myscan.close();

        s1len = s1.length();
        s2len = s2.length();
        int flag = 0;

        String temp = s1 + s1; // Concatenation of a string.

        // Use indexOf(s2) or contains(s2)
        if ( (s1len == s2len) && (temp.contains(s2)) ){
            System.out.println("Strings are rotations of each other.");
        }
        else{
            System.out.println("Strings are not in rotations of each other");
        }

    }
}
