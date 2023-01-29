import java.util.Scanner;

/**
*Program akan mengambil input plat nomor 4 mobil. Jika setiap 4 mobil yang lewat digabung angkanya,
*kemudian hasil gabungannya di kurang 999999 dan dibagi 5, sisa hasil baginya adalah 0, maka outputnya adalah jalan. Jika bukan 0 maka berhenti.
*@author Mahardika Pratama
*@since 26-01-2023
*/

public class Soal5_BukaTutupJalan {

	public static void main(String[] args) {
		//Membuat scanner baru
		Scanner input = new Scanner (System.in);
		//Mengambil input plat nomer  4 mobil dengan scanner
		//nextLie() digunakan untuk mengambil input string disertai spasi
		String platNomer = input.nextLine();
		/*Menggabungkan plat nomor dengan mengahapus spasi yang memisahkan plat nomor mobil.
		  Menghapus spasi pada string dengan menggunakan method replace.
		  Method replace digunakan untuk mengganti karakter dari sebuah string dengan karakter baru.
		  Pada syntaks dibawah saya mengganti spasi dengan blank.*/
		platNomer = platNomer.replace(" ","");
		//Mengkonversi string yang berisi plat nomer ke typr data long.
		//Alasannya adalah karena type data long memiliki panjang digit 19 dan string plat nomer diatas berjumlah 16 digit.
		long gabungan = Long.parseLong(platNomer);
		//Manampilkan perintah pada 4 mobil sesuai perhitungan gabungan plat nomor dikurang 999999 di bagi 5
		if ((gabungan -999999) % 5 == 0) {
			System.out.println("berhenti");
		}
		else {
			System.out.println("jalan");
		}
		//Menutup scanner
		input.close();
	}

}
