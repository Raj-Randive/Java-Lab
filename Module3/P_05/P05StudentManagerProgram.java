// Q-5]. Refine the student manager program to manipulate the student information from files by using the BufferedReader and BufferedWriter.
package Module3.P_05;
import java.io.*;

public class P05StudentManagerProgram {
    public static void main(String args[]) throws Exception{

        FileReader fr = new FileReader("E:\\Just Code\\Java Lab\\src\\Module3\\P_05\\file1.txt");
        FileWriter fw = new FileWriter("E:\\Just Code\\Java Lab\\src\\Module3\\P_05\\file2.txt");
        BufferedReader br1 = new BufferedReader(fr);

        // Manipulate the student information from files.
        String line1 = br1.readLine();
        while (line1 != null){
            line1 = line1.trim();
            line1 = br1.readLine();
            fw.write(line1 + "\n");
            fw.flush();
        }

    }
}
