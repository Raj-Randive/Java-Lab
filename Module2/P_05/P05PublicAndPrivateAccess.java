//5. Write a program to show the difference between public and private access specifiers. The program should also show that primitive data types are passed by value and objects are passed by reference and to learn use of final keyword

package Module2.P_05;
import AMPackage1.ClassInsidePackage;
import AMPackage1.DefaultSum;
import AMPackage2.DefaultSub;

public class P05PublicAndPrivateAccess {
    public static void main(String []args){

        ClassInsidePackage obj1 = new ClassInsidePackage();

        DefaultSum obj2 = new DefaultSum(5, 7);
        double x = obj2.calculateSum();
        System.out.println("The Addition of " + obj2.a + " and " + obj2.b + "  is: " + x);

        DefaultSub obj3 = new DefaultSub(8, 3);
        double y = obj3.calculateSub();
        System.out.println("The Subtraction of " + obj3.a + " and " + obj3.b + "  is: " + y);


    }
}
