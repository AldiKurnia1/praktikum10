package implementasi.phone;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
    }

    public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown(){
         if (this.status == 0) {
            System.out.println("Ponsel mati. Tidak dapat menurunkan volume");
        } else {
            this.volume--;
            if (this.volume <= MIN_VOLUME) {
                this.volume = MIN_VOLUME;
            }
        }
    }


    public int getVolume(){
        return this.volume;
    }
 private int pulsa;

    // Constructor dan method lainnya

    public void topUpPulsa(int amount) {
        if (this.status == 0) {
            System.out.println("Ponsel mati. Tidak dapat melakukan top up pulsa");
        } else {
            this.pulsa += amount;
            System.out.println("Top up pulsa berhasil. Sisa pulsa: " + this.pulsa);
        }
    }

    public int getSisaPulsa() {
        return this.pulsa;
    }

    private List<Contact> contacts = new ArrayList<>();

    public void tambahkanKontak(String nama, String nomor) {
        if (this.status == 0) {
            System.out.println("Ponsel mati. Tidak dapat menambahkan kontak");
        } else {
            Contact contact = new Contact(nama, nomor);
            contacts.add(contact);
            System.out.println("Kontak berhasil ditambahkan");
        }
    }

    public void lihatSemuaKontak() {
        if (contacts.isEmpty()) {
            System.out.println("Tidak ada kontak");
        } else {
            System.out.println("Daftar kontak:");
            for (Contact contact : contacts) {
                System.out.println(contact.getNama() + " - " + contact.getNomor());
            }
        }
    }

    public void cariKontak(String nama) {
        if (contacts.isEmpty()) {
            System.out.println("Tidak ada kontak");
        } else {
            boolean found = false;
            for (Contact contact : contacts) {
                if (contact.getNama().equalsIgnoreCase(nama)) {
                    System.out.println("Nama: " + contact.getNama() + ", Nomor: " + contact.getNomor());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Kontak dengan nama " + nama + " tidak ditemukan");
            }
        }
    }


}
}