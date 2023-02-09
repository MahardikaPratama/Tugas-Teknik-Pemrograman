package PraktikumTekproWeek4;

public class Restaurant {
	private Menu menu[];
	private static byte id=0;
	
	/**
	 * @constructor
	 */
	public Restaurant() {
		menu = new Menu[10];
	}
	
	/**
	 * @method untuk menampilkan menu makanan
	 */
	public void tampilMenuMakanan() {
		System.out.println("================================");
		System.out.println("Menu Makanan");
		System.out.println("================================");
		for (int i=0; i<=id; i++) {
			if (!isOutOfStock(i)) {
				System.out.println(menu[i].getNama_makanan() +"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
			}
		}
		System.out.println("================================");
	}
	
	/**
	 * @method untuk menambah menu makanan, harga, serta jumlah stoknya
	 * @param nama_makanan
	 * @param harga_makanan
	 * @param stok
	 */
	
	public void tambahMenuMakanan(String nama_makanan, double harga_makanan, int stok) {
		menu[id] = new Menu(nama_makanan, harga_makanan, stok); //Membuat objek menupada indeks id dari class Menu
	}
	
	/**
	 * @method untuk fitur pemesanan dan mengurangi setiap stok yang ada
	 * @param nama_pesanan
	 * @param jumlah
	 */
	public void pesanMakanan(String nama_pesanan, int jumlah) {
		String cek_pesanan = "Tidak ada";
		int i=0;
		for (i=0; i<=id; i++) {
			if (nama_pesanan.equalsIgnoreCase(menu[i].getNama_makanan())) {
				cek_pesanan = "ada";
				if (menu[i].getStok() - jumlah < 0) {
					System.out.println("Stok makanan tidak tersedia untuk jumlah yang dipesan !");
				}else {
					menu[i].setStok(jumlah); 
				}
				
			}
		}
		if (cek_pesanan.equals("Tidak ada")) {
			System.out.println("Makanan yang dipesan tidak tersedia di menu!");
		}
		
	}
	
	/**
	 * 
	 * @param id
	 * @return true or false
	 */
	private boolean isOutOfStock(int id) {
		if (menu[id].getStok() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * @method untuk menambah id
	 */
	public static void nextId() {
		id++;
	}
}
