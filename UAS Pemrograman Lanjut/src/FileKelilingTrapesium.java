import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileKelilingTrapesium {
    private String fileName;

    public FileKelilingTrapesium(String fileName) {
        this.fileName = fileName;
    }

    public void readAndDisplay() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "Keliling Trapesium.txt";

        FileKelilingTrapesium fileKelilingTrapesium = new FileKelilingTrapesium(fileName);
        fileKelilingTrapesium.readAndDisplay();
    }
}
