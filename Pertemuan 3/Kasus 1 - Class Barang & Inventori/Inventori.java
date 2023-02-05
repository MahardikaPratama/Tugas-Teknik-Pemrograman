public class Inventori {
	Barang[] barangs;
	
	//Method bernama "initBarang" yang digunakan untuk mendefinisikan pembuatan objek-objek barang
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10);
		barangs[1] = new Barang("002", "Celana", 20);
	}
	
	//Method bernama "showBarang" yang digunskan untuk menampilkan objek barang yang telah dibuat 
	void showBarang() {
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	//Method bernama "pengadaan" yang digunakan untuk menambah stok barang
	void pengadaan() {
		initBarang();
//		barangs[0].stok += 20;
//		barangs[0].stok -= 30; //Bisa juga dikurangi dong?
//		barangs[0].stok *= 30; //dikali juga bisa dong??
		
		barangs[0].addStok(20); //Pemanggilan method addStok dengan argumen 20 untuk melakukan penambahan stok melalui method di kelas Barang.
		showBarang();
	}
		//Main program
		public static void main(String[] args) {
			Inventori beli = new Inventori();
			beli.pengadaan();
		}
}
