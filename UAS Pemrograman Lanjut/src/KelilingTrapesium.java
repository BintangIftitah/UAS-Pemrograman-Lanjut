import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KelilingTrapesium {
    private List<Trapesium> trapesiums;

    public KelilingTrapesium() {
        trapesiums = new ArrayList<>();
    }

    public void readProcessWrite(String inputFilePath, String outputFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {

            String line = br.readLine();

            // Membaca setiap baris dari file
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",\\s*");
                double base = Double.parseDouble(values[0]);
                double bBase = Double.parseDouble(values[1]);
                double height = Double.parseDouble(values[2]);

                trapesiums.add(new Trapesium(base, bBase, height));
            }

            Collections.sort(trapesiums, new Comparator<Trapesium>() {
                @Override
                public int compare(Trapesium t1, Trapesium t2) {
                    double keliling1 = t1.hitungKeliling();
                    double keliling2 = t2.hitungKeliling();
                    return Double.compare(keliling1, keliling2);
                }
            });

            for (Trapesium trapesium : trapesiums) {
                double perimeter = trapesium.hitungKeliling();
                bw.write(String.format("%.2f\n", perimeter));
            }

            System.out.println(outputFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\H P 240 G7\\IdeaProjects\\UAS Pemrograman Lanjut\\trapezoid.csv";                     // Ubah sesuai dengan path file input Anda
        String outputFileName = "Keliling Trapesium.txt";      // Nama file output yang diinginkan

        KelilingTrapesium kelilingTrapesium = new KelilingTrapesium();
        kelilingTrapesium.readProcessWrite(inputFilePath, outputFileName);
    }
}
