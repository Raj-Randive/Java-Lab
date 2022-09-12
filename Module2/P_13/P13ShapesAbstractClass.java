// 13. Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, Circle. Define one method area() in the abstract class and override this area() in these three subclasses to calculate for specific object i.e. area() of Triangle subclass should calculate area of triangle etc. Same for Rectangle and Circle.
package Module2.P_13;

abstract class Shapes{
    double i;
    double area(){
        return i;
    }
}
//*********************************************************************
class Triangle extends Shapes{

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
class Rectangle extends Shapes{

    double l, b;
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    double area(){
        return l*b;
    }
}
class Circle extends Shapes{

    double r;
    Circle(double r) {
        this.r = r;
    }
    double area(){
        return Math.PI*r*r;
    }
}

//*********************************************************************
public class P13ShapesAbstractClass {
    public static void main(String args[]) {

//  Shapes s1 = new Shapes(); --> Abstract Classes Cannot be instantiated.
    Triangle t1 = new Triangle(5, 2.77);
    double x = t1.area();
    System.out.println("The area of Triangle is: " + x);

    Circle c1 = new Circle(5.2);
    double y = c1.area();
    System.out.println("The area of Rectangle is: " + y);

    Rectangle r1 = new Rectangle(5, 7.44);
    double z = r1.area();
    System.out.println("The area of Circle is: " + z);

    }
}
