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
		int opsi=0;
		do {
			mp.tampilMenuUtama();
			opsi = input.nextInt();
			switch (opsi) {
				case 1 : 
					mp.pesanMakanan();
					break;
				case 2 : 
					mp.tampilPesanan();
					break;
				case 3 : 
					mp.hapusPesanan();
					break;
				case 4 :
					mp.tampilMenuMakanan();
					break;
				case 5 :
					mp.pembayaran();
					break;
				case 6 :
					System.out.println("Keluar Program");
					return;
				default : 
					System.out.println("Input tidak valid");
					break;
			}
	
		}while(opsi != 6);
		input.close();
	}

}
