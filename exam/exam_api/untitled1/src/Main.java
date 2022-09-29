import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream writerFile = null; //line1
        try {
            writerFile = new FileOutputStream("link.txt"); //line 2
            writerFile.write(10010); //line 3
        } catch (IOException io) { //line 4
            System.out.println("IO Error."); //line 5
        } finally {//line 6
            writerFile.close(); //line 7
        }
    }
}