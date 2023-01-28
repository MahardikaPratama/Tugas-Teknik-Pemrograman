import java.math.BigInteger;
import java.util.Scanner;

/**
*Program akan mengambil input typedata BigInteger kemudian melakukan operasi aritmatika pada input tersebut.
*@author Mahardika Pratama
*@since 26-01-2023
*/


public class Soal6_BigNumber {

	public static void main(String[] args) {
		//Membuat scanner
		Scanner input = new Scanner (System.in);
		
		//Membuat objek BigInteger dengan constructornya diisi string yang merepresentasikan integer.
		//String pada syntaks dibawah didapat dari input menggunakan scanner
		BigInteger a = new BigInteger(input.next());
		BigInteger b = new BigInteger(input.next());
		//Menampilkan operasi penjumlahan dengan method add dan perkalian dengan method multiply yang terdapat pada objek BigInteger
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		//Menutup scanner
		input.close();
	}

}
