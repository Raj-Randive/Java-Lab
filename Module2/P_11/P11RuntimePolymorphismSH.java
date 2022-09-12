// 11. Write a program that implements simple example of Runtime Polymorphism with multilevel inheritance. (e.g., Animal or Shape)

// left-hand side --> Reference of parent Class.
// Right-hand side --> Which object to be created.
package Module2.P_11;

class DefaultSum {
    double a, b;
    DefaultSum(double a, double b){
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println("The addition of " + a + " and " + b + " is: " + (a+b) );
    }
}

class DefaultSub extends DefaultSum {

    DefaultSub(double a, double b){
        super(a, b); // --> We cannot initialised a parametrized constructor without Super.
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("The subtraction of " + a + " and" + b + " is: " + (a-b) );
    }
}

public class P11RuntimePolymorphismSH {

    public static void main(String []args){

        // Creating just the reference of the parent class and equating it to the subtraction class to define which display to run during the execution time --> Depicting the runtime polymorphism.
        DefaultSum obj1 = new DefaultSub(11, 3);
        obj1.display();

    }
}

