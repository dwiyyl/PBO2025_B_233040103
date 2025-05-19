package Pertemuan11;

public class L1_LingkaranTabungMain {
	 public static void main(String[] args) {
		// Membuat objek lingkaran dengan jari-jari 10
		 
		// Menampilkan informasi lingkaran
	    L1_Lingkaran lingkaran = new L1_Lingkaran(10);
	    System.out.println("== Lingkaran ==");
	    System.out.println("jari2: " + lingkaran.getJari2());
	    System.out.println("luas:" + lingkaran.luas());

	    // Membuat objek tabung dengan jari-jari 10 dan tinggi 5
	    L1_Tabung tabung = new L1_Tabung(10, 5);
	    
	    // Menampilkan informasi tabung
	    System.out.println("== Tabung ==");
	    System.out.println("jari2: " + tabung.getJari2() + ", Tinggi:" + tabung.getTinggi());
	    System.out.println("luas:" + tabung.luas());
	    }
}
