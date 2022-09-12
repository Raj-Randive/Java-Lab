// Call By Value --> With Swap Function Example...!!

public class P11CallByValue {

    static void swapValue(int x, int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.print("\nIn the function, Values after swaping is: " + x + ", " + y);

    }
    
    static float areaOfCircle(int radius){
        float area = (float)(3.14*radius*radius);
        return area; 

    }

    public static void main(String args[]){

        int a = 5, b = 8, r = 3;
        
        System.out.print("\nThe Values before swaping is: " + a + ", " + b);
        swapValue(a, b);
        System.out.print("\nThe Values after swaping is: " + a + ", " + b);

        System.out.print("\nThe area of Circle is: " + areaOfCircle(r));

    } 
}