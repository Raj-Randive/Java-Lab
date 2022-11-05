// Q-3. Remove duplicate lines from a File.
// Using bufferd Reader method.

package Module3.P_03;
import java.io.*;

public class P03RemoveDuplicateLines {
    public static void main(String args[]){

        try{
            FileReader f1 = new FileReader("E:\\Just Code\\Java Lab\\src\\Module3\\P_03\\file1.txt");
            FileReader f2 = new FileReader("E:\\Just Code\\Java Lab\\src\\Module3\\P_03\\file2.txt");
            BufferedReader b1 = new BufferedReader(f1);
            PrintWriter p = new PrintWriter("E:\\Just Code\\Java Lab\\src\\Module3\\P_03\\file2.txt");

            String line1 = b1.readLine();

            while( line1 != null ){
                boolean flag = false;

                BufferedReader b2 = new BufferedReader(f2);
                String line2 = b2.readLine();

                while (line2 != null){
                    if (line1.equals(line2)){
                        flag = true;
                        break;
                    }
                    line2 = b2.readLine();
                }

                if (flag == false){
                    p.println(line1);
                    p.flush();
                }

                line1 = b1.readLine();

            }

        }
        catch (IOException e){
            System.out.println("Errror occured!");
        }

    }
}
