package Pertemuan9;

public class tgs_Pengguna {
	protected String nama;
	protected String id;
	
	public tgs_Pengguna(String nama, String id) {
		this.nama = nama;
		this.id = id;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getId() {
		return id;
	}
	
	public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
    }
}
