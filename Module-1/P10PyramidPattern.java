import java.util.*;

public class P10PyramidPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        // ****************** Taking String*************
        System.out.print("Enter Your String : ");
        String mystr = scan.nextLine();
    
        // ****************** Printing Pattern **********
        for (int i = 1; i <= mystr.length(); i++) {
            
            for (int spaces = 1; spaces <= (mystr.length() - i)  ; spaces++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(mystr.charAt(j) + " ");
            }

            System.out.print("\n");
        }
        scan.close();
    }
}
