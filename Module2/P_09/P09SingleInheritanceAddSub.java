//9. Write a program in Java to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance.
package Module2.P_09;

class DefaultSum {
    double a, b;
    DefaultSum(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double calculateSum(){
        return (a + b);
    }
}

class DefaultSub extends DefaultSum {

    public DefaultSub(double a, double b){
        super(a, b); // --> We cannot initialised a parametrized constructor without Super.
        this.a = a;
        this.b = b;
    }
    public double calculateSub(){
        return (a-b);
    }
}

public class P09SingleInheritanceAddSub {
    public static void main(String []args){

        DefaultSum obj1 = new DefaultSum(5, 11);
        double x = obj1.calculateSum();
        System.out.println("The Addition of " + obj1.a + " and " + obj1.b + "  is: " + x);

        DefaultSub obj2 = new DefaultSub(7, 3);
        double y = obj2.calculateSub();
        System.out.println("The Subtraction of " + obj2.a + " and " + obj2.b + "  is: " + y);

    }
}
