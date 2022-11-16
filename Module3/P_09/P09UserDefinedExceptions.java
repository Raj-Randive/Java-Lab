//Q-9]. Write a program to create your own exception types to handle situation specific to your application (Hint: Define a subclass of Exception which itself is a subclass of Throwable).

package Module3.P_09;
import java.util.Scanner;

class MobileExcep extends Exception{
    MobileExcep(String str){
        super(str);
    }
}

public class P09UserDefinedExceptions {
//
//    static boolean lengthCheck(String s){
//        if (s.length() != 10){
//            return false;
//        }
//        else{
//            return true;
//        }
//    }

    static boolean characterCheck(String s){
        long phoneNumber;
        try{
            phoneNumber = Long.parseLong(s);  //Converts the string to the long (Means the integer)
            return false;

        }catch(NumberFormatException e){
            return true;
        }
    }

    public static void main(String args[]){

        Scanner myscan = new Scanner(System.in);

        System.out.println("Enter the Phone Number: ");
        String phoneNum = myscan.nextLine();

        try{
            if (phoneNum.length() != 10){
                throw new MobileExcep("The Phone Number should contain exactly 10 digits.");
            }
            if(characterCheck(phoneNum)){
                throw new MobileExcep("Enter only digits (Integer Numbers).");
            }

        }catch(MobileExcep e){
            System.out.println(e);
            System.out.println("\nPlease enter the phone number in correct format.");
        }

    }
}
