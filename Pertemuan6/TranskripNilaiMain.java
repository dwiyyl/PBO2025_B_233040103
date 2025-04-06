package Pertemuan6;

public class TranskripNilaiMain {
	public static void main(String[] args) {
        // Create objek Matakuliah dengan dosen pengampu
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, "Fajar Darmawan, S.T., M.Kom");
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3, "Dr. Ir. Leony Lidya, M.T.");
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "A", 3, "Siroj Nur Ulum, S.T., M.T.");

        // Create objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("4");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // Create Objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Create Objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.hitungIPK(); // Hitung IPK sebelum ditampilkan
        transkrip.display();
    }
}
