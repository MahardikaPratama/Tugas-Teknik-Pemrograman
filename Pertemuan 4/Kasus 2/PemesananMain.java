package PraktikumTekproWeek4;

import java.util.Scanner;
public class PemesananMain {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		penjualan mp = new penjualan();
		mp.tambahMenuMakanan("Nabati", 2_000, 30);
		penjualan.nextId();
		mp.tambahMenuMakanan("Coklat", 1_000, 50);
		penjualan.nextId();
		mp.tambahMenuMakanan("Beng-Beng", 3_000, 20);
		penjualan.nextId();
		mp.tambahMenuMakanan("Sosis", 1_000, 50);
		penjualan.nextId();
		mp.tambahMenuMakanan("Oreo", 4_000, 20);
		penjualan.nextId();
		mp.tambahMenuMakanan("Pop-Ice", 5_000, 35);
		penjualan.nextId();
		mp.tambahMenuMakanan("Nutrisari", 4_000, 30);
		penjualan.nextId();
		mp.tambahMenuMakanan("Pop-Mie", 3_000, 25);
		penjualan.nextId();
		mp.tambahMenuMakanan("Roti", 2_000, 40);
		penjualan.nextId();
		mp.tambahMenuMakanan("Permen", 5_00, 100);
		
		Scanner input = new Scanner(System.in);
		char lagi;
		char konfirmasi = 'y';
		String nama_pesanan;
		int jumlah;
		
		while (konfirmasi == 'y') {
			mp.tampilMenuMakanan();
			lagi = 'y';
			while(lagi == 'y') {
				System.out.println("Makanan yang dipesan : ");
				nama_pesanan = input.next();
				System.out.println("Jumlah yang dipesan : ");
				jumlah = input.nextInt();
				mp.pesanMakanan(nama_pesanan, jumlah);
				System.out.println("pesan lagi?(tekan y) Jika tidak lanjut proses pembayaran");
				lagi = input.next().charAt(0);
			}
			mp.countTotalHarga();
			mp.pembayaran();
			System.out.println("Ingin kembai ke toko gak ?(tekan y)");
			konfirmasi = input.next().charAt(0);
		}
		input.close();
	}

}
