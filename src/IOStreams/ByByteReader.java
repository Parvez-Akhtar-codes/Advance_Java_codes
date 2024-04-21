package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByByteReader {
    public static void main(String[] args) throws IOException {


        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:\\javatuts\\source.txt");
            fos = new FileOutputStream("d:\\javatuts\\dest.txt");

            int content;

            while ((content = fis.read()) != -1) {
                fos.write((byte) content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fis.close();
            fos.close();
        }
    }
}