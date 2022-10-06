// 7. Write programs in Java to use Wrapper class of each primitive data types.
// The wrapper classes in Java are used to convert primitive types (int, char, float, etc) into corresponding objects.
package Module2.P_07;

public class P07PrimitiveToWrapperClass {
    public static void main(String args[]){

        // creating primitive Data types
        int a = 5;
        double b = 5.654343;
        float c = 7.4f;
        long d = 244466575;
        short e = 32323;
        char f = 'r';
        boolean g = true;
        byte h = 127;

        // converts into wrapper objects
        // Means we can use the primitive data types as an Object.
        Integer objA = Integer.valueOf(a);
        System.out.println("\nAn object of Integer is created.");
        System.out.println(" > This is an object --> " + objA);
        System.out.println(" > This is int --> " + a);

        Double objB = Double.valueOf(b);
        System.out.println("\nAn object of Double is created.");
        System.out.println(" > This is an object --> " + objB);
        System.out.println(" > This is double --> " + b);

        Float objC = Float.valueOf(c);
        System.out.println("\nAn object of Float is created.");
        System.out.println(" > This is an object --> " + objC);
        System.out.println(" > This is float --> " + a);

        Long objD = Long.valueOf(d);
        System.out.println("\nAn object of Long is created.");
        System.out.println(" > This is an object --> " + objD);
        System.out.println(" > This is long --> " + d);

        Short objE = Short.valueOf(e);
        System.out.println("\nAn object of Short is created.");
        System.out.println(" > This is an object --> " + objE);
        System.out.println(" > This is short --> " + e);

        Character objF = Character.valueOf(f);
        System.out.println("\nAn object of Character is created.");
        System.out.println(" > This is an object --> " + objF);
        System.out.println(" > This is char --> " + f);

        Boolean objG = Boolean.valueOf(g);
        System.out.println("\nAn object of Boolean is created.");
        System.out.println(" > This is an object --> " + objG);
        System.out.println(" > This is boolean --> " + g);

        Byte objH = Byte.valueOf(h);
        System.out.println("\nAn object of Byte is created.");
        System.out.println(" > This is an object --> " + objH);
        System.out.println(" > This is byte --> " + h);

    }
}