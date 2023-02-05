/**
*Cara agar variable “stok” dibungkus/ dilindungi sehingga tidak bisa dilakukanm
*operasi aritmatika selain hanya tambah saja adalah dengan melakukan enkapsulasi.
*Enkapsulasi memungkinkan membungkus data dan method yang berhubungan menjadi satu objek,
*sehingga memastikan bahwa data tersebut tidak dapat diakses atau diubah secara tidak sengaja dari luar objek. 
*Dalam bahasa Java, enkapsulasi diterapkan dengan menggunakan access modifier seperti "private" dan "protected".
*Pada soal kasus satu ini, stok hanya boleh ditambah dan tidak boleh dilakukan operasi aritmatika lainnya.
*Untuk mengatasi hal tersebut, saya menambahkan satu method bernama addStok dengan argumen stk yang digunakan
*untuk melakukan penambahan stok barang saja, sesuai dengan argumen yang dikirimkan.
*@since 05-02-2023
*@author Mahardika Pratama
*/
public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok; //Variabel stok dibuat private sebagai enkapsulasi
	
	
	public Barang(String kode, String nama, int stk) { //Constructor
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}


	public int getStok() { //Getter
		return stok;
	}


	public void setStok(int stok) { //Setter
		this.stok = stok;
	}
	
	public void addStok(int stk) { //Penambahan method addStok agar hanya bisa melakukan penambahan
		stok += stk;
	}
}
