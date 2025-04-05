package Pertemuan4;

public class Lingkaran_objeknull {
	public static void main(String[] args) {
        // Membuat objek Lingkaran
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        // Menampilkan jari-jari lingkaran
        System.out.println("Jari-jari l1: " + l1.getJari2()); // 5
        System.out.println("Jari-jari l2: " + l2.getJari2()); // 5
        System.out.println("Jari-jari l3: " + l3.getJari2()); // 7

        // Menghapus referensi l2
        l2 = null;
        System.out.println("\nSetelah l2 di-null-kan:");
        System.out.println("Jari-jari l1: " + l1.getJari2()); // 5
        if (l2 != null) {
            System.out.println("Jari-jari l2: " + l2.getJari2()); 
        } else {
            System.out.println("l2 sudah null, tidak bisa diakses!");
        }
        System.out.println("Jari-jari l3: " + l3.getJari2()); // 7

        // Menghapus semua referensi objek
        l1 = null;
        l2 = null;
        l3 = null;
        System.out.println("\nSetelah semua objek di-null-kan:");
        
        // Mencegah NullPointerException
        if (l1 != null) {
            System.out.println("Jari-jari l1: " + l1.getJari2());
        } else {
            System.out.println("l1 sudah null, tidak bisa diakses!");
        }
        
        if (l2 != null) {
            System.out.println("Jari-jari l2: " + l2.getJari2());
        } else {
            System.out.println("l2 sudah null, tidak bisa diakses!");
        }
        
        if (l3 != null) {
            System.out.println("Jari-jari l3: " + l3.getJari2());
        } else {
            System.out.println("l3 sudah null, tidak bisa diakses!");
        }
    }
}
