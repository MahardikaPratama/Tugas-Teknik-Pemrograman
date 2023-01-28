import java.util.Scanner;

/**
*Program akan mengambil sebuah input angka pertama , operator, dan angka kedua masing-masing dipisahkan spasi.
*Angka yang dimasukkan tidak boleh lebih dari 1000.
*Output pada program adalah hasil operasi dari kedua angka.
*
*@author Mahardika Pratama
*@since 24-01-2023
*/

public class Soal3_Berhitung {
	public static void main(String args[]) {
		//Membuat scanner baru
		Scanner Keyboard = new Scanner (System.in);
		
		/*Membuat varibel A dan B bertipe integer,dan variabel operator bertipe karakter.
		 * Kemudian menggunakan scanner untuk mengambil input yang dimasukkan kedalam variabel.
		 * nextInt() digunakan mengambil input integer dan next().charAt(0) digunakan untuk mengambil karakter pertama dari string.
		 */
		int A = Keyboard.nextInt();
		char operator = Keyboard.next().charAt(0);
		int B = Keyboard.nextInt();
	
		//Jika input A atau B lebih dari 1000 maka akan muncul output Inputan angka melebihi batas
		if (((A >= 1) && (A <= 1000)) && ((B>=1) && (B <= 1000))) {
		//Menampilkan hasil operasi dari A dan B sesuai kondisi operator.
			if (operator == '+') {
				System.out.println(A + B);
			}
			else if (operator == '-') {
				System.out.println(A - B);
			}
			else if (operator == '*') {
				System.out.println(A * B);
			}
			else if (operator == '/') {
				System.out.println(A / B);
			}
			else if (operator == '%'){
				System.out.println(A % B);
			}
			else {
				System.out.println("Operator tidak valid!");
			}
		}else {
			System.out.println("Inputan angka melebihi batas");
		}
		//Menutup scanner
		Keyboard.close();
	}
}
