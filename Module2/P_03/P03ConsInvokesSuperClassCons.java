//Q-3] Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.
package Module2.P_03;

class Employee{
    String name;
    int empId;
    float empSalary;

    // Default Constructor
    Employee(){
        System.out.println("\nIn the Default constructor of Super class.");
    }
    // Parametrised Constructor
    Employee(String name, int empId, float empSalary){
        System.out.println("\nIn the Parametrised constructor of Super class.");
        this.name = name;
        this.empId = empId;
        this.empSalary =empSalary;
    }
}

class Professor extends Employee{
    
    int noOfSub;
    Professor(String name, int empId, float empSalary, int noOfSub ){
        super(name, empId, empSalary);
        System.out.println("\nIn the Parametrised constructor of professor class.");
        this.noOfSub = noOfSub;
    }
}

class Peon extends Employee{
    
    int noOfFloor;
    Peon(String name, int empId, float empSalary, int noOfFloor ){
        super(name, empId, empSalary);
        System.out.println("\nIn the Parametrised constructor of peon class.");
        this.noOfFloor = noOfFloor;
    }
}

public class P03ConsInvokesSuperClassCons {
    public static void main(String []args){

        Employee e1 = new Employee("Dustin", 1001, 10000);
        System.out.println("Name: " + e1.name );
        System.out.println("Employee Id: " + e1.empId);
        System.out.println("Employee Salary: " + e1.empSalary);

        Professor p1 = new Professor("Mike", 1002, 20000, 6);
        System.out.println("Name: " + p1.name );
        System.out.println("Employee Salary: " + p1.empSalary);
        System.out.println("Employee Id: " + p1.empId);
        System.out.println("Number of Subjects Specialised: " + p1.noOfSub);

        Peon pe1 = new Peon("Jade", 1003, 5000, 2);
        System.out.println("Name: " + pe1.name );
        System.out.println("Employee Salary: " + pe1.empSalary);
        System.out.println("Employee Id: " + pe1.empId);
        System.out.println("Number of Subjects Specialised: " + pe1.noOfFloor);




    }
}
