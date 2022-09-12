// Q-4] Write a program in Java to develop overloaded constructor. Also develop the copy constructor to create a new object with the state of the existing object.
package Module2.P_04;

class overload{
    int a, b;

    overload(){
        System.out.println("In the Default Constructor");
    }

    overload(int a){
        System.out.println("One arg Constructor Called");
        this.a = a;
    }

    overload(int a, int b){
        System.out.println("Two arg Constructor Called");
        this.a = a;
        this.b = b;
    }

    overload(overload obj){
        System.out.println("\n\nCopy Constructor Called!");
        a = obj.a;
        b = obj.b;
    }

    void printOverload(){
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }
}

class P04OverloadedAndCopyConstructor{
    public static void main(String []args){

        overload obj1 = new overload();
        obj1.printOverload();

        overload obj2 = new overload(5);
        obj2.printOverload();
        
        overload obj3 = new overload(5, 9);
        obj3.printOverload();

        // COPY CONSTRUCTOR
        overload obj5 =new overload(obj3);
        obj5.printOverload();



    }
}
