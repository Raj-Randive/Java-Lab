import java.util.*;
public class P10DiamondPatternV2{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String mystr = scan.nextLine();

        //Upper Part
        for (int i = 1; i <= mystr.length(); i++) {
            
            for (int spaces = 1; spaces <= (mystr.length()-i)  ; spaces++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(mystr.charAt(j) + " ");
            }

            System.out.print("\n");
        }

        // Bottom Part
        for (int i = 1; i <= (mystr.length()-1); i++) {
            
            for (int spaces = mystr.length(); spaces > (mystr.length()-i)  ; spaces--) {
                System.out.print(" ");
            }

            // See the length of a String, it will be from "0 to some index". SO STARTED WITH MYSTR.LENGTH()
            for (int j = 0; j < mystr.length()-i; j++) {  
                System.out.print(mystr.charAt(j) + " ");
            }

            System.out.print("\n");
        }

        scan.close();
    }

}