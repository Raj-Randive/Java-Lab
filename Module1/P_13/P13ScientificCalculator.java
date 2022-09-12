// 13. Write a program in Java to create a simple scientific calculator using Math Class

import java.util.Scanner;
import java.lang.Math;

public class P13ScientificCalculator {
    public static void main(String args[]){

        Scanner myscan = new Scanner(System.in);

        String operator;
        float operand1=0, operand2=0;

        System.out.print("Enter the Operations (+ , - , / , x , ^ , $):  ");
        operator = myscan.nextLine();

        char c = operator.charAt(0);

        if (c == '$') {
            System.out.print("\nEnter the operand (sqrt): ");
			operand1 = myscan.nextFloat();
		}
		else if( c == '+' || c == '-' || c == '/' || c == 'x' || c == '^'){
            System.out.print("\nEnter the operands: ");
			System.out.print("\nFirst operand: ");
			operand1 = myscan.nextFloat();
			System.out.print("Second operand: ");
			operand2 = myscan.nextFloat();
		}
        else{
            System.out.println("Enter the correct operator.");
        }
        myscan.close();


        switch(c){
            case '+':
                System.out.print("\nThe Addition " + operand1 + " + " + operand2 + " is: "+ (operand1 + operand2) );
                break;
            case '-':
                System.out.print("\nThe Subtraction " + operand1 + " - " + operand2 + " is: "+ (operand1 - operand2) );
                break;
            case 'x':
                System.out.print("\nThe Multiplication " + operand1 + " x " + operand2 + " is: "+ (operand1 * operand2) );
                break;
            case '/':
                System.out.print("\nThe Division of is: " + operand1 + " / " + operand2 + " is: "+ (operand1 / operand2) );
                break;
            case '^':
                System.out.print("\nThe Exponential value of "+ operand1 + " ^ " + operand2 +" is: " + ( Math.pow(operand1, operand2) ) );
                break;
            case '$':
                System.out.print("\nThe Square root of "+ operand1 + " is: " + ( Math.sqrt(operand1)));
                break;

            default:
                break;

        }

    }
    
}

