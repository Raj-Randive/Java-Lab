import java.util.*;

public class Program8_Vowels_and_Consonants {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int vowel_count = 0, cons_count = 0;

        System.out.print("Enter Your String : ");
        String mystr = scan.nextLine();
        
        System.out.println("You have entered the string : " + mystr);

        // Changing the entire String to lower case
        mystr = mystr.toLowerCase();

        for (int i = 0; i < mystr.length(); i++) {
            if (mystr.charAt(i) == 'a' || mystr.charAt(i) == 'e' || mystr.charAt(i) == 'i' || mystr.charAt(i) == 'o' || mystr.charAt(i) == 'u' ) {
                vowel_count +=1;
            }
            else if(mystr.charAt(i) >= 'a' && mystr.charAt(i) <= 'z'){
                cons_count+=1;
            }

        }

        System.out.print("\n\nNumber of Vowels are : " + vowel_count);
        System.out.print("\nNumber of Consonants are : " + cons_count);
        
        scan.close();
    }

}
