package Pertemuan11;

// Kelas utama untuk menjalankan program dan menguji kelas L2KartuElektronik
public class L2_InterfaceMain {
	public static void main(String[] args) {
		 // Membuat objek kartu elektronik dengan kode bank "IF111" dan PIN "123"
		L2_KartuElektronik kartu = new L2_KartuElektronik("IF111", "123");
		
		// Melakukan otentikasi dengan memasukkan PIN "123"
        // Jika PIN cocok, akan mencetak "Otentikasi:true"
		System.out.println("Otentikasi:"+ kartu.otentikasi("123"));
		//System.out.println("PIN terenkripsi:"+ kartu.encode("123"));	
	}
}