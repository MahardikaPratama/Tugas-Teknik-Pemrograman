package PraktikumTekproWeek4;

/**
 * @author Mahardika
 */
public class produk {
	private String nama_makanan;
	private double harga;
	private int qty;
	
	
	/**
	 * @constructor
	 * @param nama_makanan
	 * @param harga_makanan
	 * @param qty
	 */
	public produk (String nama_makanan, double harga_makanan, int stok){
		this.nama_makanan = nama_makanan;
		this.harga = harga_makanan;
		this.qty = stok;
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
	public double getharga() {
		return harga;
	}
	
	/**
	 * @getter
	 * @return qty;
	 */
	public int getqty() {
		return qty;
	}
	
	/**
	 * @setter
	 * @param jumlah
	 */
	public void setqty(int jumlah) {
		this.qty = this.qty - jumlah;
	}
}
