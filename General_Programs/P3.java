package General_Programs;


class P {
    int a = 30;
    void display(){
        System.out.println("in P");
    }
}
class Q extends P {
    int a = 50;
    void display(){
        System.out.println("in Q");
    }
}

public class P3 extends Q {
    public static void main(String[] args) {
        Q q = new Q();
        System.out.println(" Value of a: " + q.a);
        q.display();

        P p = new Q(); // Creating reference variable of "P" and using or pointing to Q to print method of "Q".
        System.out.println("Value of a: " + p.a);
        p.display();
        // Here method jo override ho rahi hai which is "display" --> vo ab nahi hogi as ab method print hogi of Q and as we are creating the reference variable of P therefore all the variables/attributes will be of P Class and methods will be of Q.

    }
}
