package Pertemuan11;

// Interface L2Kartu mendefinisikan kontrak method yang harus diimplementasikan kelas yang menggunakannya.
// Interface ini bertujuan untuk mengatur method otentikasi dan encode PIN.
public interface L2_Kartu {
	
	// Method untuk memverifikasi apakah PIN yang dimasukkan sesuai dengan PIN yang tersimpan
	public boolean otentikasi(String pin);
	
	// Method untuk mengubah PIN menjadi format terenkripsi atau encoded
	public String encode(String pin);
}
