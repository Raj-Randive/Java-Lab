import java.util.*;

public class P09CountCapitalLetters {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int cap_count = 0;

        System.out.print("Enter Your String : ");
        String mystr = scan.nextLine();
        
        System.out.println("\nYou have entered the string : " + mystr);
        
        for (int i = 0; i < mystr.length(); i++) {
            if (mystr.charAt(i) >= 'A' && mystr.charAt(i) <='Z') {
                System.out.println(mystr.charAt(i));
                cap_count+=1;
            }
        }
        
        System.out.println("\nThe Number of Capital Letters in String is : " + cap_count);
        
        scan.close();
    }

}
