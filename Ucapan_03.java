import java.util.Scanner;

/**
 * Ucapan_03
 */
public class Ucapan_03 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("-----------------------------------------------" + "\nThank you " +nama+ "\nMay the force be with you.");
    }
}