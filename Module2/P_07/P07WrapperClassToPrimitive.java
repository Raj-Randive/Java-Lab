// 7. Write programs in Java to use Wrapper class of each primitive data types.

// 7. Write programs in Java to use Wrapper class of each primitive data types.

// The wrapper classes in Java are used to convert primitive types (int, char, float, etc) into corresponding objects.
package Module2.P_07;

public class P07WrapperClassToPrimitive {
    public static void main(String args[]){

        // Object of Wrapper Class is created
        Integer objA = Integer.valueOf(3);
        Double objB = Double.valueOf(543432);
        Float objC = Float.valueOf(4.56f);


        // converting into primitive types
        int a = objA.intValue();
        System.out.println("\nThe Object is converted into the primitive type.");
        System.out.println(" > This is an object --> " + objA);
        System.out.println(" > This is int --> " + a);

        double b = objB.doubleValue();
        System.out.println("\nThe Object is converted into the primitive type.");
        System.out.println(" > This is an object --> " + objB);
        System.out.println(" > This is double --> " + b);

        float c = objC.floatValue();
        System.out.println("\nThe Object is converted into the primitive type.");
        System.out.println(" > This is an object --> " + objC);
        System.out.println(" > This is float --> " + c);

    }
}
