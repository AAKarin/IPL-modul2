package MultipleCatchBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepTest {
    public static void main(String[] args) {
        String fileName = "test.txt"; // Example file name
        FileInputStream file = null;
        int x;

        try {
            file = new FileInputStream(fileName);
            x = file.read();
            System.out.println("Read byte: " + x);
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            System.exit(-1);
        } catch (IOException i) {
            i.printStackTrace();
            System.exit(-1);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
