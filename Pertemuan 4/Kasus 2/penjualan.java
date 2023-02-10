package PraktikumTekproWeek4;

import java.util.Scanner;
/**
 * 
 * @author Mahardika
 *
 */
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
		int k = 0;
		System.out.println("======================================");
		System.out.println("Daftar Menu Makanan");
		System.out.println("======================================");
		for (int i=0; i<=id; i++) {
			if (!isOutOfStock(i)) {
				System.out.println(k+1+"."+makanan[i].getNama_makanan() +"["+makanan[i].getqty()+"]"+"\t\t= Rp. "+makanan[i].getharga());
				k++;
			}
		}
		System.out.println("======================================");
	}
	/**
	 * @method untuk menampilkan menu utama
	 */
	public void tampilMenuUtama() {
		System.out.println("======================================");
		System.out.println("Selamat Datang di Dika's Restaurant");
		System.out.println("======================================");
		System.out.println("[1] Tambah Pesanan");
		System.out.println("[2] Lihat Pesanan");
		System.out.println("[3] Hapus Pesanan");
		System.out.println("[4] Lihat Menu Makanan");
		System.out.println("[5] Bayar Pesanan");
		System.out.println("[6] Keluar");
		System.out.println("Pilih Opsi :");
	}
	
	/**
	 * @method untuk menampilkan list pesanan
	 */
	public void tampilPesanan() {
		int x = 0;
		System.out.println("======================================");
		System.out.println("Pesanan Anda Saat Ini");
		System.out.println("======================================");
		System.out.println("No.\tNama Produk\tQuantity\tHarga\t\tTotal Harga");
		for (int i=0; i<j; i++) {
			for (int k=0; k<=id; k++) {
				if((this.nama_produk[i].equalsIgnoreCase(makanan[k].getNama_makanan())&&(this.quantity[i] != 0))) {
						System.out.println((x+1)+"\t"+this.nama_produk[i]+"\t\t"+quantity[i]+"\t\tRp. "+makanan[k].getharga()+"\tRp. "+total_harga[i]);
						x++;
				}
			}
		}
	}
	
	/**
	 * @method untuk menghapus pesanan
	 */
	public void hapusPesanan() {
		Scanner input = new Scanner(System.in);
		String nama_pesanan;
		int i, cek=0;
		System.out.println("Masukkan nama pesanan yang ingin dihapus : ");
		nama_pesanan = input.next();
		for (i=0; i<j; i++) {
			if (nama_pesanan.equals(this.nama_produk[i])) {
				System.out.println(this.nama_produk[i]+" berhasil dihapus dari pesanan");
				this.nama_produk[i] = "";
				this.quantity[i] = 0;
				this.total_harga[i] = 0;
				cek = 1;
				break;
			}
		}
		if(cek == 0) {
			System.out.println("Pesanan Tidak Ditemukan : ");
		}
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
	 */
	public void pesanMakanan() {
		Scanner input = new Scanner(System.in);
		String nama_pesanan; 
		int jumlah;
		char lagi = 'y';
		String cek_pesanan = "Tidak ada";
		int i;
		while(lagi == 'y') {
			this.tampilMenuMakanan();
			System.out.println("Makanan yang dipesan : ");
			nama_pesanan = input.next();
			System.out.println("Jumlah yang dipesan : ");
			jumlah = input.nextInt();
			
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
						this.countTotalHarga();
					}
					
				}
			}
			if (cek_pesanan.equals("Tidak ada")) {
				System.out.println("Makanan yang dipesan tidak tersedia di menu!");
			}
			System.out.println("Pesan makanan lain ? (y/t)");
			lagi = input.next().charAt(0);
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
		Scanner input = new Scanner(System.in);
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
