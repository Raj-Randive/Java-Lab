// Q-8] Write a program that implements two constructors in the class. We call the other constructor using ‘this’ pointer, from the default constructor of the class.
package Module2.P_08;

class callFromDefault{

    int a, b;

    callFromDefault(){
        this(5, 7);
        System.out.println("\nInside the Default Constructor!");
    }

    callFromDefault(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    void printData(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}

public class P08CallConsFromDefaultCons {
    public static void main(String []args){

        callFromDefault obj1 = new callFromDefault();
        // callFromDefault obj1 = new callFromDefault(5, 7);  --> This will not work as then it will not call the default constructor...! 
        obj1.printData();

    }    
}
