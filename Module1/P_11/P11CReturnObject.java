// RETURN OBJECT --->> Call By Reference --> With Swap Function Example...!!
package Module1.P_11;
class Test{
    int x, y;

    Test(){
        System.out.println("\nDefault Constructor.");
    }

    void swapFunction(Test obj1){
        int temp;
        temp = obj1.x;
        obj1.x = obj1.y;
        obj1.y = temp;
    }
    
    // We have written "Test" as "Type" i.e Type is of object
    Test printObj(){

        Test obj1 = new Test();
        obj1.x = 9; 
        obj1.y = 30;

        return obj1;
    }

}

public class P11CReturnObject {

    public static void main(String args[]){

        Test obj = new Test();
        obj.x = 5;
        obj.y = 10;
        System.out.println("\nBefore Swapping: " + obj.x + ", " + obj.y);

        obj.swapFunction(obj);
        System.out.println("After Swapping: " + obj.x + ", " + obj.y);
        
        Test obj2 = obj.printObj(); // Storing the object of printObj function so that we can print it as shown below...!!
        System.out.println("The object has: " + obj2.x + ", " + obj2.y + "\n");

    }
    
}

