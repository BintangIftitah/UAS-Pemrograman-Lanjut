public class Main {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\H P 240 G7\\IdeaProjects\\UAS Pemrograman Lanjut\\trapezoid.csv";                     // Ubah sesuai dengan path file input Anda
        String outputFileName = "Keliling Trapesium.txt";

        KelilingTrapesium kelilingTrapesium = new KelilingTrapesium();
        kelilingTrapesium.readProcessWrite(inputFilePath, outputFileName);
    }
}
