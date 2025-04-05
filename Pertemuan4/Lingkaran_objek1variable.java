package Pertemuan4;

public class Lingkaran_objek1variable {
	 public static void main(String[] args) {
	        Lingkaran l1 = new Lingkaran(5);
	        Lingkaran l2 = l1; // l2 mereferensikan objek yang sama dengan l1
	        
	        System.out.println(l1.getJari2()); // 5
	        System.out.println(l2.getJari2()); // 5
	        
	        l2.setJari2(10); // Mengubah jari-jari dari objek yang direferensikan
	        
	        System.out.println(l1.getJari2()); // 10
	        System.out.println(l2.getJari2()); // 10
	    }
}