package Pertemuan11;

//Kelas turunan dari L1Bentuk untuk bentuk Lingkaran
public class L1_Lingkaran extends L1_Bentuk {
	
	// Konstruktor menerima nilai jari-jari
	public L1_Lingkaran(int jari2) {
		super(jari2); // Memanggil konstruktor parent class
	}
	
	/*
	 * L:PHI * r * r
	 */
	
	// Implementasi method luas untuk lingkaran: PHI * r * r
	public double luas() {
		return PHI*jari2*jari2;
	}
}