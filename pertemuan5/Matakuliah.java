package pertemuan5;

public class Matakuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	/* Konstruktor */
	public Matakuliah(String kode, String nama, String index, int sks) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
	}
	
	// Fungsi nilaiIndex
	public double nilai() {
	// Berdasarkan index matakuliah
	// A=4, AB=3.5, B=3, BC=2.5, C=2, D=1, E=0
		switch (index) {
        case "A": return 4.0;
        case "AB": return 3.5;
        case "B": return 3.0;
        case "BC": return 2.5;
        case "C": return 2.0;
        case "D": return 1.0;
        case "E": return 0.0;
        default: return 0.0; // Jika index tidak valid
      }
	}
	
	// Getter untuk SKS
	public int getSks() {
		return sks;
	}
	
	// Fungsi untuk menghitung nilai total
	public double hitungNilaiTotal() {
		return nilai() * sks;
	}
	
	// Fungsi untuk menampilkan informasi mata kuliah
	public String display() {
		return kode + " - "+ nama + " - "+ index + " - "+ sks;
	}

	public int getNilai() {
		// TODO Auto-generated method stub
		return 0;
	}
}