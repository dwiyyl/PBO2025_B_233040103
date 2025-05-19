package Pertemuan9;

public class tgs_MainKasirPelanggan {
	public static void main(String[] args) {
		tgs_Kasir kasir1 = new tgs_Kasir ("Lily", "K123", "Pagi");
		tgs_Pelanggan pelanggan1 = new tgs_Pelanggan ("Adit", "P011", 120);
		
		System.out.println("=== Data Kasir ===");
		kasir1.tampilInfo();
		
		System.out.println("\n=== Data Pelanggan ===");
		pelanggan1.tampilInfo();
	}
}