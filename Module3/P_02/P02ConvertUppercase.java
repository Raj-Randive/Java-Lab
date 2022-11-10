// Q-2. Read from a file convert it to uppercase and save it into another file.
// Character by character scanning

package Module3.P_02;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P02ConvertUppercase {
    public static void main(String args[]){

        try{
            FileReader fr = new FileReader("E:\\Just Code\\Java Lab\\src\\Module3\\P_02\\f1.txt");
            int i;
            String str = "";

            System.out.println("Before writing to another File.");
            while( (i = fr.read()) != -1){
                str += (char)i;
            }
            String str1 = str.toUpperCase();
            System.out.println(str);


            FileWriter fw = new FileWriter("E:\\Just Code\\Java Lab\\src\\Module3\\P_02\\f2.txt");
            System.out.println("\nAfter writing to another File.");
            fw.write(str1);
            System.out.println(str1);

            fr.close();
            fw.close();

        }
        catch (IOException e){
            System.out.println("File not found");
        }

    }
}
