import java.util.Scanner;

/**
 * Nilai03
 */
public class Nilai03 {

    static Scanner scanner = new Scanner(System.in);
    static int jumlahMahasiswa;
    static int jumlahMinggu;
    static String[] namaMahasiswa;
    static int[][] nilaiMahasiswa;

    public static void inputData() {
        System.out.println("Masukkan jumlah mahasiswa:");
        jumlahMahasiswa = scanner.nextInt();

        System.out.println("Masukkan jumlah minggu:");
        jumlahMinggu = scanner.nextInt();

        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nama mahasiswa ke-" + (i + 1) + ":");
            scanner.nextLine(); 
            namaMahasiswa[i] = scanner.nextLine();
            System.out.println("Masukkan nilai mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanNilaiMahasiswa() {
        System.out.println("\nData Nilai Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int cariNilaiTertinggi(int[][] nilaiMahasiswa) {
        int nilaiTertinggi = 0, minggu = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    minggu = (j+1);
                }
            }
        }
        System.out.println("\nNilai tertinggi terdapat pada minggu ke-"+minggu);
        return minggu;
    }

    public static void tampilkanMahasiswaNilaiTertinggi(int[][] nilaiMahasiswa, String[] namaMahasiswa) {
        System.out.println("\nMahasiswa dengan Nilai Tertinggi:");
         int nilaiTrtngg = 0, nilai=0;
            String mahasiswa = "";
        for (int j = 0; j < 7; j++) {
           
            for (int i = 0; i < 5; i++) {
                if (nilaiMahasiswa[i][j] >  nilaiTrtngg) {
                    nilaiTrtngg = nilaiMahasiswa[i][j];
                    mahasiswa = namaMahasiswa[i];
                }
            }
        }
        System.out.println("Mahasiswa: " + mahasiswa + ", Nilai: " + nilaiTrtngg);
    }

    public static void main(String[] args) {
        inputData();
        tampilkanNilaiMahasiswa();
        cariNilaiTertinggi(nilaiMahasiswa);
        tampilkanMahasiswaNilaiTertinggi(nilaiMahasiswa, namaMahasiswa);
    }
}
