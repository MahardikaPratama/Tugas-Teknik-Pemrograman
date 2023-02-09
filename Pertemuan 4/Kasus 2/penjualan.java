package PraktikumTekproWeek4;

import java.util.Scanner;

public class penjualan {
	private String nama_produk[];
	private int quantity[];
	private double total_harga[];
	private produk makanan[];
	private static byte id=0;
	private byte j=0; //variabel untuk counter pesanan
	/**
	 * @constructor
	 */
	public penjualan() {
		makanan = new produk[100];
		nama_produk = new String[100];
		quantity = new int[100];
		total_harga = new double[100];
	}
	
	/**
	 * @method untuk menampilkan menu makanan
	 */
	public void tampilMenuMakanan() {
		System.out.println("======================================");
		System.out.println("Daftar Menu Makanan");
		System.out.println("======================================");
		for (int i=0; i<=id; i++) {
			if (!isOutOfStock(i)) {
				System.out.println(i+1+"."+makanan[i].getNama_makanan() +"["+makanan[i].getqty()+"]"+"\t\t= Rp. "+makanan[i].getharga());
			}
		}
		System.out.println("======================================");
	}
	
	/**
	 * @method untuk menambah menu makanan, harga, serta jumlah stoknya
	 * @param nama_makanan
	 * @param harga_makanan
	 * @param stok
	 */
	
	public void tambahMenuMakanan(String nama_makanan, double harga_makanan, int stok) {
		makanan[id] = new produk(nama_makanan, harga_makanan, stok); //Membuat objek menupada indeks id dari class Menu
	}
	
	/**
	 * @method untuk fitur pemesanan dan mengurangi setiap stok yang ada
	 * @param nama_pesanan
	 * @param jumlah
	 */
	public void pesanMakanan(String nama_pesanan, int jumlah) {
		String cek_pesanan = "Tidak ada";
		int i;
		for (i=0; i<=id; i++) {
			if (nama_pesanan.equalsIgnoreCase(makanan[i].getNama_makanan())) {
				cek_pesanan = "ada";
				if (makanan[i].getqty() - jumlah < 0) {
					System.out.println("Stok makanan tidak tersedia untuk jumlah yang dipesan !");
				}else {
					makanan[i].setqty(jumlah);
					this.nama_produk[j] = nama_pesanan;
					this.quantity[j] = jumlah;
					j++;
				}
				
			}
		}
		if (cek_pesanan.equals("Tidak ada")) {
			System.out.println("Makanan yang dipesan tidak tersedia di menu!");
		}
		
	}
	
	/**
	 * @method untuk menghitung total harga pesanan
	 */
	public void countTotalHarga() {
		int i, k;
		for (i=0; i<j; i++) {
			for (k=0; k<=id; k++) {
				if(this.nama_produk[i].equalsIgnoreCase(makanan[k].getNama_makanan())) {
					this.total_harga[i] = this.quantity[i] * makanan[k].getharga();
					continue;
				}
			}
		}
	}
	
	/**
	 * @method untuk melakukan proses pembayaran
	 */
	public void pembayaran() {
		double total_bayar=0;
		double uang, kembalian;
		System.out.println("========================================================================");
		System.out.println("Jumlah yang harus dibayar");
		System.out.println("========================================================================");
		System.out.println("No.\tNama Produk\tQuantity\tHarga\t\tTotal Harga");
		for (int i=0; i<j; i++) {
			for (int k=0; k<=id; k++) {
				if(this.nama_produk[i].equalsIgnoreCase(makanan[k].getNama_makanan())) {
						total_bayar = total_bayar + this.total_harga[i];
						System.out.println((i+1)+"\t"+this.nama_produk[i]+"\t\t"+quantity[i]+"\t\tRp. "+makanan[k].getharga()+"\tRp. "+total_harga[i]);
		
				}
			}
		}
		System.out.println("=========================================================================");
		System.out.println("Total Pembayaran : Rp. "+total_bayar);
		System.out.println("=========================================================================\n");
		if(j>0) {
			System.out.println("Masukkan jumlah uang anda");
			Scanner input = new Scanner(System.in);
			uang = input.nextDouble();
			kembalian = uang - total_bayar;
			if (kembalian>=0) {
				System.out.println("=====================================================");
				System.out.println("Bayar (cash)  : Rp. "+uang);
				System.out.println("Kembalian     : Rp. "+kembalian);
				System.out.println("=====================================================\n");
			}
			else {
				System.out.println("Pembayaran gagal dikarenakan uang anda tidak mencukupi !");
			}
		}
		
		
	}
	/**
	 * 
	 * @param id
	 * @return true or false
	 */
	private boolean isOutOfStock(int id) {
		if (makanan[id].getqty() == 0) {
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
