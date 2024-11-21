import java.util.Scanner;
public class Kubus01 {
    static int hitungVolume(int sisi) {
        int vol = sisi*sisi*sisi;
        return vol;
    }

    static int hitungLuasPermukaan(int sisi) {
        int L = 6 * (sisi * sisi);
        return L;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        int sisi = sc.nextInt();

        int vol = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " + vol);

        int L = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah " + L);

        sc.close();
    }
}
