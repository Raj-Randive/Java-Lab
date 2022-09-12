import java.util.*;
public class P07CountCapitalLetters {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int cap_count = 0;
        System.out.print("Enter Your String : ");
        String mystr = scan.nextLine();
        String mystr1 =  " " + mystr;
        
        System.out.println("\nYou have entered the string : " + mystr);
        
        for (int i = 0; i < mystr1.length(); i++) {
            if (mystr1.charAt(i) == 32) {

                if (mystr1.charAt(i+1) >= 'A' && mystr1.charAt(i+1) <='Z') {
                    // System.out.println(mystr.charAt(i));
                    cap_count+=1;
                }

            }
        }
        System.out.println("\nThe Number of Words starting with Capital Letters in String is : " + cap_count);
        scan.close();
    }
}
