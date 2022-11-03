/*  15. a) Write an application that illustrates method overriding in the same package and different packages.
        b) Also demonstrate accessibility rules in inside and outside packages.
*/
package Module2.P_15;
import AnotherPackage.*;

class A{
    void show(){
        System.out.println("Inside Class A in the same package.");
    }
}

class B extends A{
    // Overidding method show of class A.
    void show(){
        System.out.println("Inside Class B in the same package.");
    }
}

public class P15MethodOverridingUsingPackage{
    public static void main(String args[]){

        A obj1 = new B(); // Polymorphism
        obj1.show();

        C obj2 = new C();
        obj2.show();

        C obj3 = new D();
        obj3.show();
    }
}
