package implementasi.phone;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();
        cp.volumeUp(); // Menaikkan volume saat ponsel menyala
        cp.volumeUp(); // Menaikkan volume lagi
        System.out.println("Volume: " + cp.getVolume());

        cp.topUpPulsa(50000); // Melakukan top up pulsa
        System.out.println("Sisa Pulsa: " + cp.getSisaPulsa());

        cp.tambahkanKontak("John", "1234567890"); // Menambahkan kontak
        cp.tambahkanKontak("Jane", "9876543210");

        cp.lihatSemuaKontak(); // Melihat semua isi kontak

        cp.cariKontak("John"); // Mencari kontak berdasarkan nama
        cp.cariKontak("Alice"); // Kontak tidak ditemukan

        cp.powerOff();
        cp.volumeUp(); // Tidak dapat menaikkan volume karena ponsel mati

    }
}