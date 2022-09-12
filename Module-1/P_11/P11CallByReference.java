// Call By Reference --> With Swap Function Example...!!

class Test{
    int x, y;

    Test(){ System.out.println("\nDefault Constructor.");}

    void swapFunction(Test obj){
        int temp;
        temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;
    }
}

public class P11CallByReference {

    public static void main(String args[]){

        Test t = new Test();
        t.x = 5;
        t.y = 10;
        System.out.println("\nBefore Swapping: " + t.x + ", " + t.y);
        t.swapFunction(t);
        System.out.println("After Swapping: " + t.x + ", " + t.y);

    }
    
}
