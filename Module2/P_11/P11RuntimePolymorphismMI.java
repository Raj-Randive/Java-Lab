
package Module2.P_11;

class Car{
    String typeVehicle;
    Car(){
        typeVehicle = "Car";
        System.out.println("\nIn Car Constructor.");
    }
    void printData(){
        System.out.println("The Vehicle type is: " + typeVehicle);
    }
}

class Maruti extends Car {
    String brandName;
    int speedLimit;

    Maruti(){
        brandName = "Maruti";
        speedLimit = 200;
        System.out.println("Inside the Maruti Constructor.");
    }

    void printData(){
        System.out.println("\nInside the Maruti Class printData() using runtime Polymorphism.");
        System.out.println("Brand Name is: " + brandName);
    }
}

class Maruti800 extends Maruti {
    String carName;
    int speedLimit; // --> Overriding the speedLimit

    Maruti800(){
        speedLimit = 140;
        carName = "Maruti800";
        System.out.println("Inside the Maruti800 Constructor.");
    }

    void printData(){
        System.out.println("\nInside the Maruti800 Class printData() using runtime Polymorphism.");
        System.out.println("Vehicle type is: " + typeVehicle);
        System.out.println("Brand Name is: " + brandName);
        System.out.println("Speed Limit of \"" + carName + "\" is: " + speedLimit);
    }
}

public class P11RuntimePolymorphismMI {
    public static void main(String args[]) {

        // Runtime Polymorphism...!!
        Car obj1 = new Maruti();
        obj1.printData();
        System.out.println("\n********************************************************");
        Car obj2 = new Maruti800();
        obj2.printData();

    }
}
