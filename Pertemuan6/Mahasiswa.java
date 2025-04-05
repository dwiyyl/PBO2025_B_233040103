package Pertemuan6;

public class Mahasiswa {
	private String NRP;
	private String nama;
	
	// Konstruktor tanpa parameter
	public Mahasiswa() {
		this.NRP = "";
		this.nama = "";
	}
	
	// Konstruktor dengan parameter
	public Mahasiswa(String nRP, String nama) {
		super(); 
		NRP = nRP;
		this.nama = nama;
	}
	
	// Method untuk menampilkan data mahasiswa
	public String display() {
		return "NRP: "+ NRP+ ", Nama: "+ nama;
	}
	
	// Setter & Getter 
	public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
