package pertemuan5;

public class MatakuliahMain {

	public static void main(String[] args) {
	// Create objek matakuliah
	Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
	Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
	Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);
	
	
	// Tampilkan daftar matakuliah
	System.out.println("--- DAFTAR MATAKULIAH ---");
	System.out.println(mk1.display());
	System.out.println(mk2.display());
	System.out.println(mk3.display());
	
	// Bagaimana hitung IPK?
	// Rumus: (index nilai*sks) + (index*sks) +...+ (index nilai*sks)/total_sks
	
	// Hitung total nilai dan total sks
	double totalNilai = mk1.hitungNilaiTotal() + 
						mk2.hitungNilaiTotal() + 
						mk3.hitungNilaiTotal();
    int totalSks = mk1.getSks() + 
    			   mk2.getSks() + 
    			   mk3.getSks();

    // Hitung IPK
    double ipk = totalNilai / totalSks;
    
    // Tampilkan IPK
	System.out.println("--- Nilai IPK ---");
	System.out.printf("IPK: %.2f%n", ipk); // Format IPK dengan 2 angka di belakang koma
	}

}