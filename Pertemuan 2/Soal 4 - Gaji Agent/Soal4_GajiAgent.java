import java.util.Scanner;

/**
*Program akan mengambil input total penjualan dari Agent. 
*1. Jika total penjualan diatas 80, maka gajinya akan ditambahkan sebanyak 35% dari total penjualan item.
*2. Jika total penjualan minimal 40, maka gajinya akan ditambahkan sebanyak 25% dari total penjualan item.
*3. Jika total penjualan kurang dari 15, maka gajinya akan dikurang sebanyak 15% untuk setiap penjualan item kurang dari 15.
*4. JIka total penjualan 15 sampai 39, maka gajinya akan ditambahkan sebanyak 15% dari total penjualan item.
*@author Mahardika Pratama
*@since 26-01-2023
*/

public class Soal4_GajiAgent {

	public static void main(String[] args) {
		//Membuat scanner
		Scanner input = new Scanner (System.in);
		
		int gajiPokok = 500000;
		int hargaItem = 50000;
		
		//Menggunakan scanner untuk mengambil input total penjualan
		int totalPenjualan = input.nextInt();
		
		//Perhitungan gajiPokok sesuai banyaknya total penjualan
		if(totalPenjualan > 80) {
			gajiPokok += hargaItem * totalPenjualan * 35 / 100;
		}
		else if(totalPenjualan >= 40) {
			gajiPokok += hargaItem * totalPenjualan * 25 / 100;
		}
		else if(totalPenjualan < 15) {
			gajiPokok -= ((15-totalPenjualan)*hargaItem) * 15 / 100;
		}
		else {
			gajiPokok += hargaItem * totalPenjualan * 10 / 100;
		}
		//Menampilkan gajikPokok akhir
		System.out.println(gajiPokok);
		//Menutup scanner
		input.close();
	}

}
