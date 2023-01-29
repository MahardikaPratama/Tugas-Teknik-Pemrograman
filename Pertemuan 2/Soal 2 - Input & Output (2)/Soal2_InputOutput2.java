import java.util.Scanner;

/**
*Program akan mengambil 3 baris input dengan ketentuan setiap barisnya
*adalah 1 kata dan 1 angka.
*Kemudian output pada program setiap barisnya memiliki ketentuan kolomm pertama harus berisi string sepanjang 15 karakter,
*dan kolom kedua berisi integer dengan ketentuan harus 3 digit, jika input yang diberikan kurang dari 3 digit,
*maka akan mengisi digit terdepan dengan angka 0.
*
*@author Mahardika Pratama
*@since 26-01-2023
*/

public class Soal2_InputOutput2 {

	public static void main(String[] args) {
		//Membuat scanner baru
		Scanner input = new Scanner (System.in);
		//Membuat array of string dengan panjang 3 elemen dengan nama variabel s.
		String s[] = new String[3];
		//Membuat array integer dengan panjang 3 elemen dengan nama variabel x.
		int x[] = new int[3];
		//Menggunakan scanner untuk menginput variabel s dan x disertai dengan looping sebanyak 3 kali.
		for (int i = 0; i<3; i++) {
			s[i] = input.next();
			x[i] = input.nextInt();
		}
		for (int i = 0; i<29; i++) {
			System.out.print("=");
		}
		System.out.println();
		/*Menampilkan variael s yang diformat menggunakan %-15s dan variabel x yang diformat dengan %03d
		 * %-15s artinya adalah mengisi string sepanjang 15 karakter dan menambahkan spasi jika string yang input kurang dari 15 karakter, 
		 * %-03d artinya adalah menampilkan bilangan sebanyak 3 digit dan jika input yang diberikan kurang dari 3 digit,
		 * maka akan mengisi digit terdepan dengan angka 0.
		 * 
		 */
		for (int i=0; i<3; i++) {
			System.out.printf("%-15s%03d\n",s[i],x[i]);
		}
		for (int i = 0; i<29; i++) {
			System.out.print("=");
		}
		System.out.println();
		//Menutup scanner
		input.close();
	}
}
