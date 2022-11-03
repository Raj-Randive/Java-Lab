/* Q-1]. Read a content from file: calculate number of sentences, words and characters from the file.
        > a. Byte Stream
        > b. Character Stream
        > c. Buffer Reader/ Buffer Writer
        > d. Serializable interface.  --> Used to read/write objects.
*/
package Module3.P_01;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P01ReadFileUsingCS {
    public static void main(String args[]){

        File f = new File("E:\\Just Code\\Java Lab\\src\\Module3\\P_01\\file1.txt");

        try{
            FileReader Fobj1 = new FileReader(f);
            int i;
            int sen =  0, word = 0, ch = 0;
            int flag = 0;
            while( (i = Fobj1.read()) != -1) {   // End of file is indicated by -1

                if((char)i == '.'){
                    sen +=1;
                    flag= 0;
                }
                else if(i > 47 && i < 58 || i > 64 && i < 91 || i > 96 && i < 126){
                    ch +=1;
                    flag++;
                }
                else{
                    flag = 0;
                }
                if (flag == 1){
                    word+=1;
                }
            }
            if (ch == 0){
                word =0;
            }
            System.out.println("Number of Words in the file are: " + word);
            System.out.println("Number of Sentences in the file are: "  +sen);
            System.out.println("Number of Characters in the file are: " + ch);
        }
        catch(IOException e){
            e.printStackTrace();
        }



    }
}
