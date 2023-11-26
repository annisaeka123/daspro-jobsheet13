import java.util.Scanner;

/**
 * Kubus03
 */
public class Kubus03 {

    static int volumeKubus(int sisi) {
        int volume = sisi*sisi*sisi;
        return volume;
    }
    static int luasPermukaanKubus(int sisi){
        int luas = sisi*sisi*6;
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s, L, V;
        System.out.print("Masukkan sisi: ");
        s = sc.nextInt();

        V = volumeKubus(s);
        System.out.print("Volume kubus adalah " + V);
        L = luasPermukaanKubus(s);
        System.out.print("\nLuas permukaan kubus adalah " + L);

    }
}