package PraktikumTekproWeek4;


/**
 * @author Mahardika
 */
public class Menu {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	
	/**
	 * @constructor
	 * @param nama_makanan
	 * @param harga_makanan
	 * @param stok
	 */
	public Menu (String nama_makanan, double harga_makanan, int stok){
		this.nama_makanan = nama_makanan;
		this.harga_makanan = harga_makanan;
		this.stok = stok;
	}

	/**
	 * @getter
	 * @return nama_makanan;
	 */
	public String getNama_makanan() {
		return nama_makanan;
	}
	
	/**
	 * @getter
	 * @return harga_makanan;
	 */
	public double getHarga_makanan() {
		return harga_makanan;
	}
	
	/**
	 * @getter
	 * @return stok;
	 */
	public int getStok() {
		return stok;
	}
	
	/**
	 * @setter
	 * @param jumlah
	 */
	public void setStok(int jumlah) {
		this.stok = this.stok - jumlah;
	}

	
	
}
