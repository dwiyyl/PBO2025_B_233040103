package Pertemuan9;

public class tgs_Pelanggan extends tgs_Pengguna{
	private int poin;
	
	public tgs_Pelanggan (String nama, String id, int poin) {
		super(nama, id);
		this.poin = poin;
	}
	
	public int getPoin() {
		return poin;
	}
	
	public void setPoin(int poin) {
		this.poin = poin;
	}
	
	public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Poin: " + poin);
    }
}