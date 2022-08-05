import java.util.Scanner;

public class Program5_Calulate_cgpa{
	
	public static void main(String args[]){
		Scanner myScan = new Scanner(System.in);
		
		String grade1, grade2;
		int a, b, c1, c2, gradeP1, gradeP2;
		
		System.out.print("Enter the marks of Maths: ");
		a = myScan.nextInt();
		System.out.print("Enter the Credits of Maths: ");
		c1 = myScan.nextInt();

		System.out.print("Enter the marks of DSA: ");
		b = myScan.nextInt();
		System.out.print("Enter the Credits of DSA: ");
		c2 = myScan.nextInt();
		
		
		if(a>=80 && a<=100){
			grade1 = "O";
		}
		else if(a>=70 && a<=79){
			grade1 = "A+";
		}
		else if(a>=60 && a<=69){
			grade1 = "A";
		}
		else if(a>=55 && a<=59){
			grade1 = "B+";
		}
		else if(a>=50 && a<=54){
			grade1 = "B";
		}
		else if(a>=45 && a<=49){
			grade1 = "C";
		}
		else if(a>=40 && a<=44){
			grade1 = "P";
		}
		else{
			grade1 = "F";
		}

		if(b>=80 && b<=100){
			grade2 = "O";
		}
		else if(b>=70 && b<=79){
			grade2 = "A+";
		}
		else if(b>=60 && b<=69){
			grade2 = "A";
		}
		else if(b>=55 && b<=59){
			grade2 = "B+";
		}
		else if(b>=50 && b<=54){
			grade2 = "B";
		}
		else if(b>=45 && b<=49){
			grade2 = "C";
		}
		else if(b>=40 && b<=44){
			grade2 = "P";
		}
		else{
			grade2 = "F";
		}
		

		switch (grade1) {
			case "O":
				gradeP1 = 10;
				break;

			case "A+":
				gradeP1 = 9;
				break;
			
			case "A":
				gradeP1 = 8;								
				break;

			case "B+":
				gradeP1 = 7;								
				break;

			case "B":
				gradeP1 = 6;								
				break;

			case "C":
				gradeP1 = 5;								
				break;
			
			case "P":
				gradeP1 = 4;								
				break;

			case "F":
				gradeP1 = 0;								
				break;

			default:
				gradeP1=0;						
				break;
		}

		switch (grade2) {
			case "O":
				gradeP2 = 10;
				break;

			case "A+":
				gradeP2 = 9;
				break;
			
			case "A":
				gradeP2 = 8;								
				break;

			case "B+":
				gradeP2 = 7;								
				break;

			case "B":
				gradeP2 = 6;								
				break;

			case "C":
				gradeP2 = 5;								
				break;
			
			case "P":
				gradeP2 = 4;								
				break;

			case "F":
				gradeP2 = 0;								
				break;

			default:
				gradeP2=0;						
				break;
		}

		float SPI = ( (float)(gradeP1*c1 + gradeP2*c2)  /  (float)(c1+c2) );
		System.out.println("The SPI is: " + SPI);

	myScan.close();	
	}

}