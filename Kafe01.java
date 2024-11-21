import java.util.Scanner;
public class Kafe01 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");

    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo){
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon sebesar 50%.");
            hargaTotal *= 0.5; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon sebesar 30%.");
            hargaTotal *= 0.7;
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah termasuk member (true/false): ");
        boolean isMember = sc.nextBoolean();

        Menu(namaPelanggan, isMember);

        int totalKeseluruhan= 0;

        while (true) {
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6) / (0) jika selesai: ");
        int pilihanMenu = sc.nextInt();

        if (pilihanMenu == 0) {
            break; 
        }
        if (pilihanMenu < 1 || pilihanMenu > 6) {
            System.out.println("Pilihan menu tidak valid, silahkan coba lagi.");
            continue;
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        totalKeseluruhan += totalHarga;
        System.out.println("Total harga untuk menu saat ini: Rp" + totalHarga);
        } 

        System.out.println("\nTotal pesanan kesuluruhan Anda" + totalKeseluruhan);
        System.out.println("Terima kasih sudah memesan. Silahkan datang lagi");

        sc.close();
    }    
}
