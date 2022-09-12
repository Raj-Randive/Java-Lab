package Module2.P_09;

class Car{
    String typeVehicle;
    Car(){
        typeVehicle = "Car";
        System.out.println("In Car Constructor.");
    }
    void printData(){
        System.out.println("The car type is: " + typeVehicle);
    }
}

class Maruti extends Car{
    String brandName;
    int speedLimit;

    Maruti(){
        brandName = "Maruti";
        speedLimit = 200;
        System.out.println("Inside the Maruti Constructor.");
    }

    void printData(){
        System.out.println("Brand Name is: " + brandName);
    }
}

class Maruti800 extends Maruti{
    String carName;
    int speedLimit; // --> Overriding the speedLimit

    Maruti800(){
        speedLimit = 140;
        carName = "Maruti800";
        System.out.println("Inside the Maruti800 Constructor.");
    }

    void printData(){

        System.out.println("\nCar type is: " + typeVehicle);
        System.out.println("Brand Name is: " + brandName);
        System.out.println("Speed Limit of \"" + carName + "\" is: " + speedLimit);
    }
}

public class P09MultiLevelInheritanceCars {
    public static void main(String args[]) {

        Maruti800 obj1 = new Maruti800();
        obj1.printData();

    }
}
