package Pertemuan11;

// Kelas L2KartuElektronik mengimplementasikan interface L2Kartu,
// sehingga wajib menyediakan implementasi untuk semua method di interface.
public class L2_KartuElektronik implements L2_Kartu {
    private String kodeBank;  // Menyimpan kode bank pemilik kartu elektronik
    private String pin;	      // Menyimpan PIN asli kartu

    // Konstruktor untuk menginisialisasi objek dengan kode bank dan PIN
    public L2_KartuElektronik(String kodeBank, String pin) {
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    // Implementasi metode otentikasi dari interface L2Kartu
    // Mengecek apakah PIN yang diberikan (pinInput) sama dengan PIN yang tersimpan
    @Override
    public boolean otentikasi(String pinInput) {
    	// Mengembalikan true jika PIN cocok, false jika tidak
        return pin.equals(pinInput);
    }

    // Implementasi metode encode dari interface L2Kartu
    // Pada contoh ini, metode encode hanya membalik urutan karakter PIN sebagai bentuk sederhana enkripsi
    @Override
    public String encode(String pin) {
        // Contoh enkripsi sederhana: membalik string PIN
        return new StringBuilder(pin).reverse().toString();
    }
}