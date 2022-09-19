package Module2.P_01;
import java.util.Scanner;

class distance{
    float feet, inches;

    void getData(float feet, float inches){
        this.feet = feet;
        this.inches = inches;
    }

    void printData(){
        System.out.println("The distance in feet is : " + feet + "ft");
        System.out.println("The distance in Inches is : " + inches);
    }
}

public class P01Distance {
    public static void main(String[] args){

        Scanner myscan = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        float x = myscan.nextFloat();
        System.out.print("Enter the distance in inches: ");
        float y = myscan.nextFloat();
        myscan.close();

        // Given feet and inches using a constructor
        distance obj1 = new distance();
        obj1.getData(x, y);
        obj1.printData();

    }
}