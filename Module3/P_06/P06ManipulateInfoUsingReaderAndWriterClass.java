// Q-6]. Write a program to manipulate the information from files by using the Reader and Writer class. Assume suitable data.
package Module3.P_06;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class P06ManipulateInfoUsingReaderAndWriterClass {
    public static void main(String args[]){

        try{
            Reader r = new FileReader("E:\\Just Code\\Java Lab\\src\\Module3\\P_06\\f1.txt");
            Writer w = new FileWriter("E:\\Just Code\\Java Lab\\src\\Module3\\P_06\\f2.txt");

            int data = r.read();
            while ( data != -1){
                w.write(data);
                w.flush();
                data = r.read();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Successfully written in other file.");

    }
}
