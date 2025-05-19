package Pertemuan11;

public class T_MainBMKG {
	public static void main(String[] args) {
		T_AlatPemantau suhu = new T_SensorSuhu("Bandung");
        T_AlatPemantau gempa = new T_SensorGempa("Yogyakarta");

        System.out.println("=== PEMANTAUAN SUHU ===");
        suhu.tampilkanInfo();
        ((T_Pemantauan) suhu).aktifkan();
        ((T_Pemantauan) suhu).bacaData();

        System.out.println("\n=== PEMANTAUAN GEMPA ===");
        gempa.tampilkanInfo();
        ((T_Pemantauan) gempa).aktifkan();
        ((T_Pemantauan) gempa).bacaData();
    }
}
