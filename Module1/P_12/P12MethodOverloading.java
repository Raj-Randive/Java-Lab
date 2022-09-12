// 12. Write a Java Program to find area of Geometric figures using method Overloading.

class areaOfGeoFig{

    float a, b, h;

    void area(float a){
        this.a = a;
        float square = (float)(a*a);
        System.out.println("The area of Square is: " + square);
    }
    
    void area(float a, float b){
        this.a = a;
        this.b = b;
        float rectangle = (float)(a*b);
        System.out.println("The area of rectangle is: " + rectangle);
    }
    
    void area(float a, float b, float h){
        this.a = a;
        this.b = b;
        this.h = h;
        float trepezium = (float)(0.5 * h * (a+b));
        System.out.println("The area of trapezium is: " + trepezium);
    }

} 

public class P12MethodOverloading {
    public static void main(String args[]){

        areaOfGeoFig obj1 = new areaOfGeoFig();
        obj1.area(6.2f);
        obj1.area(6.2f, 9f);
        obj1.area(6.7f, 9, 3f);


    }
    
}
