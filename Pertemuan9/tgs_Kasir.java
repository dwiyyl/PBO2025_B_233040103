package Pertemuan9;

public class tgs_Kasir extends tgs_Pengguna {
	private String shift;
	
	public tgs_Kasir(String nama, String id, String shift) {
		super(nama, id); //memanggil konstruktor superkelas
		this.shift = shift;
	}

	public String getShift() {
		return shift;
	}
	
	public void setShift(String shift) {
		this.shift = shift;
	}

	public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Shift Kerja: " + shift);
    }
}