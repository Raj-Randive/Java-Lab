// 12. Write a program to compute if one string is a rotation of another. For example, pit is rotation of tip as pit has same character as tip.

package Module2.P_12;
import java.util.Scanner;

public class P12StringReverseChecking {
    public static void main(String []args){
        Scanner myscan = new Scanner(System.in);
        int n;

        System.out.println("\nThis is the program to check if String 1 is a rotation of String 2. Also take care of Capitals.");

        System.out.print("\nEnter the String 1: ");
        String str1 = myscan.nextLine();
        System.out.print("Enter the String 2: ");
        String str2 = myscan.nextLine();


        int str1len = str1.length();
        int str2len = str2.length();
        int flag = 0;

        if (str1len == str2len){
            for (int i = 0; i < str1len; i++ ){
                if (str2.charAt(str2len-1-i) == str1.charAt(i)  ) {
                    flag ++;
                }
            }
        }
        else {
            System.out.println("The lengths of both Strings are not same.");
        }

        if(flag == str1.length()){
            System.out.println("Yes the String 1 is the rotation of String 2.");
        }
        else{
            System.out.println("No the String 1 is the not the rotation of String 2.");
        }


    }
}
