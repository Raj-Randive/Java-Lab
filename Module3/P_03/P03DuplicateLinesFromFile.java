// Q-3]. Remove duplicate lines from a File.
// Using Buffered Reader...

package Module3.P_03;
import java.io.*;

public class P03DuplicateLinesFromFile {
    public static void main(String args[]) throws IOException {

        FileWriter fw1 = new FileWriter("E:\\Just Code\\Java Lab\\src\\Module3\\P_03\\file2.txt");
        FileReader f1 = new FileReader("E:\\Just Code\\Java Lab\\src\\Module3\\P_03\\file1.txt");
        FileReader f2 = new FileReader("E:\\Just Code\\Java Lab\\src\\Module3\\P_03\\file2.txt");
        BufferedReader br1 = new BufferedReader(f1);

        String line1 = br1.readLine();

        while( line1 != null ){

            boolean flag = false;
            BufferedReader br2 = new BufferedReader(f2);
            String line2 = br2.readLine();

            while (line2 != null){
                if (line1.equals(line2)){
                    flag = true;
                }
                line2 = br2.readLine();
            }

            if (flag == false){
                fw1.write(line1 + "\n");
                fw1.flush();
            }

            line1 = br1.readLine();
        }

        System.out.println("\nRemoved Duplicate lines successfully.");
    }
}
