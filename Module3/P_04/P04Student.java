// Q-4. Create a class called Student. Write a student manager program to manipulate the student information from files by using FileInputStream and FileOutputStream

package Module3.P_04;
import java.io.*;
import java.util.Scanner;

class Student{
    Scanner sc = new Scanner(System.in);

    void writeData(){
        P04Student.lines();
        System.out.println("Writing Data in the File.");

        try{
            FileOutputStream fout = new FileOutputStream("E:\\Just Code\\Java Lab\\src\\Module3\\P_04\\Data1.txt");

            System.out.println("Enter the data your want to write in the file: ");
            String s1 = "Name: John Wick, \nStream: ICT, \nSem: 3rd sem\n";

            byte b[] = s1.getBytes();

            fout.write(b);
            fout.close();

            System.out.println("Successfully written data into the file.");
            P04Student.lines();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void readData(){
        P04Student.lines();
        System.out.println("Reading Data from the File.\n");

        try{
            FileInputStream fin = new FileInputStream("E:\\Just Code\\Java Lab\\src\\Module3\\P_04\\Data1.txt");
            int i;

            while( (i=fin.read()) != -1){
               System.out.print((char)i);
            }
            fin.close();

            System.out.println("\nSuccessfully Read data from the file.");
            P04Student.lines();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}

public class P04Student {
    static void lines(){
        for (int i=0; i<40; i++){
            System.out.print("_");
        }
        System.out.print("\n");
    }
    public static void main(String args[]){

        Student s1  = new Student();
        s1.writeData();
        s1.readData();

    }
}
