// Reading file using Byte-Stream.

package Module3.P_01;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class P01ReadFileUsingBS {
    public static void main(String args[]){

        try{
            File f1 = new File("E:\\Just Code\\Java Lab\\src\\Module3\\P_01\\file1.txt");
            FileInputStream frobj = new FileInputStream(f1);

            int i = 0;

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("File exception error.");

        }

    }
}
