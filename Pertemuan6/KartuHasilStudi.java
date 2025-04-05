package Pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
	private String semester;
	private double ips;
	List<Matakuliah> daftarMatakuliah;
	
	// Konstruktor
	public KartuHasilStudi(String semester) {
		this.semester = semester;
		this.daftarMatakuliah = new ArrayList<>();
	}
	
	// Menambahkan matakuliah ke dalam daftar
	public void addMatakuliah(Matakuliah matakuliah) {
		daftarMatakuliah.add(matakuliah);
	}
	
	// Method untuk menampilkan semua matakuliah dalam KHS
	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("Semester: ").append(semester).append("\n");
		for (Matakuliah mk : daftarMatakuliah) {
			sb.append(mk.display());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	// Menghitung IPS berdasarkan daftar matakuliah
	public void hitungIPS() {
		double totalSkor = 0;
        int totalSks = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalSkor += mk.nilai() * mk.getSks();
            totalSks += mk.getSks();
        }
        // yg asalnya getNilai jadi nilai

        if (totalSks != 0) {
            this.ips = totalSkor / totalSks;
        } else {
            this.ips = 0.0;
        }
	}
	
	// Setter & Getter
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public double getIps() {
		return ips;
	}
	
	public void setIps(double ips) {
		this.ips = ips;
	}
	
	public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }

    public int getTotalSks() {
        int totalSks = 0;
        for (Matakuliah mk : daftarMatakuliah) {
            totalSks += mk.getSks();
        }
        return totalSks; // mengembalikan total sks setelah seluruh perhitungan selesai
    }
}
