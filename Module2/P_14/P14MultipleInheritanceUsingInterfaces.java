// 14. Write a program in Java to demonstrate multiple inheritance.
package Module2.P_14;

interface Add{
    double operateAdd(double a, double b);
}
interface Subtract{
    double operateSubtract(double a, double b);
}
interface Multiply{
    double operateMultiply(double a, double b);
}

class operation implements Add, Subtract, Multiply{

    public double operateAdd(double a, double b){
        System.out.println("Addition is: " + (a+b));
        return (a+b);
    }

    public double operateSubtract(double a, double b){
        System.out.println("Subtraction is: " + (a-b));
        return (a-b);
    }
    public double operateMultiply(double a, double b) {
        System.out.println("Multiplication is: " + (a*b));
        return (a * b);
    }

}

public class P14MultipleInheritanceUsingInterfaces {
    public static void main(String []args){

        operation obj1 = new operation();
        obj1.operateAdd(7, 9);
        obj1.operateSubtract(11, 3);
        obj1.operateMultiply(5, 7);

    }
}
