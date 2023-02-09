package PraktikumTekproWeek4;

import java.util.Scanner;
public class RestaurantMain {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Restaurant mp = new Restaurant();
		mp.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		mp.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		mp.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		mp.tambahMenuMakanan("Molen", 1_000, 20);
		
		mp.tampilMenuMakanan();
		Scanner input = new Scanner(System.in);
		char lagi = 'y';
		String nama_pesanan;
		int jumlah;
		
		while(lagi == 'y') {
			System.out.println("Makanan yang dipesan : ");
			nama_pesanan = input.next();
			System.out.println("Jumlah yang dipesan : ");
			jumlah = input.nextInt();
			mp.pesanMakanan(nama_pesanan, jumlah);
			mp.tampilMenuMakanan();
			System.out.println("pesan lagi? ");
			lagi = input.next().charAt(0);
		}
		input.close();
	}

}
