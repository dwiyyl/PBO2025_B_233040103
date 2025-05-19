package Pertemuan9;

public class InheritanceMain {
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("2330400", "Bintang", "Jakarta");
		System.out.println(mhs.getNrp()+
				" - "+ mhs.getNama()+
				" - "+ mhs.getAlamat());
	}
}
