package Pertemuan11;

//Kelas abstrak sebagai dasar bentuk 2D/3D yang memiliki jari-jari
public abstract class L1_Bentuk {
	protected double PHI = 3.14; // Konstanta PHI (π)
	protected int jari2; // Atribut jari-jari

	// Konstruktor dengan parameter jari-jari
	public L1_Bentuk(int jari2) {
		super();// Memanggil konstruktor superclass
        this.jari2 = jari2; // Inisialisasi atribut
	}
	
	// Method abstrak untuk menghitung luas
	// artinya setiap kelas turunan wajib menyediakan cara perhitungan luasnya sendiri
	public abstract double luas();
	
	// Setter & Getter untuk jari-jari supaya bisa diakses dan diubah dari luar kelas dengan aman
	public int getJari2() {
		return jari2;
	}
	public void setJari2(int jari2) {
		this.jari2 = jari2;
	}
}