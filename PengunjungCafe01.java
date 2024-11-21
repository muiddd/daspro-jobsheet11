public class PengunjungCafe01 {
    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++){
            System.out.println("-" + namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
