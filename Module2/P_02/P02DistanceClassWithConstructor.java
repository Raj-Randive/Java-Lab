package Module2.P_02;
import java.util.Scanner;

class distance{
    float feet, inches;

    distance(float feet, float inches){
        System.out.println("In the constructor of class \"Distance\"");
        this.feet = feet;
        this.inches = inches;
    }

    void printData(){
        System.out.println("The distance in feet is : " + feet + "ft");
        System.out.println("The distance in Inches is : " + inches);
    }

    distance(distance clone){
        System.out.println("\nIn the Clone constructor.");
        feet = clone.feet;
        inches = clone.inches;
    }
}

public class P02DistanceClassWithConstructor {
    public static void main(String []args){

        Scanner myscan = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        float x = myscan.nextFloat();
        System.out.print("Enter the distance in inches: ");
        float y = myscan.nextFloat();
        myscan.close();

        // Given feet and inches using a constructor
        distance obj1 = new distance(x, y);
        obj1.printData();
        distance obj2 = new distance(obj1);
        obj2.printData();

    }
}
