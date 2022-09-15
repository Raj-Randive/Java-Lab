// 11. Write a program that implements simple example of Runtime Polymorphism with multilevel inheritance. (e.g., Animal or Shape)
package Module2.P_11;

class Shapes{
    double i;
    double area(){
        return i;
    }
}

//*********************************************************************
class Triangle extends Shapes {
    double b, h;
    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    double area(){
        return 0.5*b*h;
    }
}

//*********************************************************************
class Rectangle extends Shapes {
    double l, b;
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    double area(){
        return l*b;
    }
}

//*********************************************************************
class Circle extends Shapes {
    double r;
    Circle(double r) {
        this.r = r;
    }
    double area(){
        return Math.PI*r*r;
    }
}

//*********************************************************************
public class P11RuntimePolymorphismHI {
    public static void main(String args[]){

        // Here area Method is overridden. So.,
        Shapes obj1 = new Circle(3);
        double x = obj1.area();
        // System.out.println(obj1 instanceof Circle);  --> Returns true
        System.out.println("\nPrinting the Area of Circle using Runtime Polymorphism.");
        System.out.println("The area of Circle is: " + x);


    }
}
