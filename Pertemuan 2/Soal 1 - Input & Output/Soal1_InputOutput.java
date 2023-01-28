import java.util.Scanner;

/**
*Program akan mengambiln input sebuah string dan kemudian memecahnya
*menjadi token dengan delimiternya adalah spasi ( ), tanda seru(!), koma(,), 
*tanda tanya(?),titik(.), garis bawah(_), kutip satu('), dan simbol at(@). 
*Output pada program adalah baris pertama berisi jumlah token dan setiap baris berikutnya berisi tokrn
*@author Mahardika Pratama
*@since 24-01-2023
*/


public class Soal1_InputOutput {
	public static void main(String args[]) {
		//Membuat scanner baru
		Scanner input = new Scanner (System.in);
		
		//Menggunakan scanner untuk menginput dan menyimpannya di variabel s
		String s = input.nextLine();
		//Menutup scanner
		input.close();
		
		/*
		 * Memecah string dengan menggunakan method split. Method ini akan membagi 
		 * string yang ditentukan dengan eksprei regular yang diberikan.
		 * Pada syntaks dibawah saya membuat variabel array of string dengan nama variabel token 
		 * yang digunnakan untuk menampung nilai hasil split dari variabel s.
		*/
		String[] token = s.split("[!,?._'@ ]");
		
		//Menampilkan jumlah token 
		System.out.println(token.length);
		//Menampilkan setiap token pada baris baru
		for(String str:token) {
			System.out.println(str);
		}
		
	}
}

