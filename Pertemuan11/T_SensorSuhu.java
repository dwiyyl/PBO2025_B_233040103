package Pertemuan11;

public class T_SensorSuhu extends T_AlatPemantau implements T_Pemantauan {
	public T_SensorSuhu(String lokasi) {
		super(lokasi);
	}
	
	public void tampilkanInfo() {
		System.out.println("Sensor Suhu di lokasi: " + getLokasi());
	}
	
	public void aktifkan() {
		System.out.println("Sensor Suhu diaktifkan.");
	}
	
	public void bacaData() {
        System.out.println("Data suhu: 25°C");
    }
}