/**
*Urutan dari output adalah 6, 2, 11, 4, 11, 3.
*6 berasal dari main dalam class KelasDua, sedangkan 2, 11, 4, dan 3 berasal dari class KelasSatu.
*Static Initialization Block adalah kode yang akan dieksekusi ketika class pertama kali dimuat, 
*lalu diikuti oleh Non Static Initialization Block adalah kode yang akan dieksekusi setiap kali sebuah objek baru dibuat dari kelas,
*dan terakhir construktor adalah kode yang akan dieksekusi setiap kali sebuah objek baru dibuat dari kelas, setelah Non-Static Initialization Block.
*Static initialization block hanya akan dieksekusi tepat sekali ketika class dimuat. 
*Pembuatan object dari class yang sama tidak akan memanggil kembali static initialization block.
*Sedangkan Non statik initialization block akan tetap dieksekusi pada setiap pembuatan object baru.
*Sehingga urutan dari output diatas dapat di lihat dari :
*6 : pertama kali dieksekusi di main
*2 : merupakan Static Initialization Block
*11: merupakan Non Static Initialization Block
*4 : merupakan constructor (disesuaikan dengan adanya argumen atau tidak adanya argumen)
*11: merupakan Non Static Initialization Block
*3 : merupakan constructor (disesuaikan dengan adanya argumen atau tidak adanya argumen)
*@since 05-02-2023
*@author Mahardika Pratama
*/
public class KelasDua {
	{
		System.out.println(5); //Non Static Initialization Block
							// Tidak terpanggil karena, tidak ada pembuatan objek baru dari class KelasDua
	}
	//Main Program
	public static void main(String[] args)
	{
		System.out.println(6); //Pertama di cetak
		KelasSatu satu = new KelasSatu(); /*Membuat objek baru bernama "satu" dari class KelasSatu 
											tanpa paramater yang akan diteruskan ke constuctor pada class KelasSatu*/
		KelasSatu dua = new KelasSatu(10);/*Membuat objek baru bernama "satu" dari class KelasSatu 
											dengan paramater "10" yang akan diteruskan ke constuctor pada class KelasSatu*/
	}
}
