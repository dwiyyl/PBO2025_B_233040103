package Pertemuan11;

//Kelas turunan dari L1Bentuk untuk bentuk Tabung
public class L1_Tabung extends L1_Bentuk {
	private int tinggi; // Atribut tambahan untuk tinggi tabung
	
	 // Konstruktor default
	public L1_Tabung() {
		super(0); // Inisialisasi jari2 dengan 0
	}
	
	// Konstruktor dengan jari2 dan tinggi
	public L1_Tabung(int jari2, int tinggi) {
		super(jari2);
		this.tinggi = tinggi;
	}
	
	/*
	 * L: 2 * PHI * r * (r+t)
	 */
	
	 // Implementasi method luas untuk tabung: 2*PHI*r(r + t)
	public double luas() {
		return 2*PHI*jari2*(jari2+tinggi);
	}
	
	// Setter & Getter untuk tinggi
	public int getTinggi() {
		return tinggi;
	}
	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
}