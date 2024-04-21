package IOStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByCharacterReader {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        FileReader reader = null;
        try {
            reader = new FileReader("d:\\javatuts\\source.txt");
            writer = new FileWriter("d:\\javatuts\\dest2.txt");
            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
            writer.close();
        }
    }

}
