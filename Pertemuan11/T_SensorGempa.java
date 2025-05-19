package Pertemuan11;

public class T_SensorGempa extends T_AlatPemantau implements T_Pemantauan {
	public T_SensorGempa(String lokasi) {
		super(lokasi);
	}

	@Override
	public void tampilkanInfo() {
		System.out.println("Sensor Gempa di lokasi: " + getLokasi());
	}

	@Override
	public void aktifkan() {
		System.out.println("Sensor Gempa diaktifkan.");
	}

	@Override
	public void bacaData() {
		System.out.println("Data gempa: Tidak terdeteksi gempa.");
	}
}
