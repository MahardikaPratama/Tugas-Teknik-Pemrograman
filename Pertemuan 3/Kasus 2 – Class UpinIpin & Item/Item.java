/**
*Pada class Item terdapat dua buah constructor.
*Pertama, constructor private Item() yang menetapkan nama item sebagai "ipin". 
*Kedua, constructor public Item(String name)yang akan mencoba mencetak nama item.
*Pada kasus ini, terdapat permasalahan pada constructor public Item(String name)yang akan mencoba mencetak nama item.
*Yaitu karena name adalah variabel instance dalam class Item dan tidak memiliki nilai awal.
*Sehingga constructor private Item() harus dipanggil sebelum mencetak nilai dari variabel name.
*Karena constructor private Item() dideklarasikan sebagai private, maka hanya bisa diakses dalam class Item sendiri. 
*Oleh karena itu, pada constructor public Item(String name) harus memanggilnya dengan menggunakan perintah this().
*@since 05-02-2023
*@author Mahardika Pratama
*/
public class Item {
	private String name;
	
	//Private method yang menetapkan nama item sebagai "ipin".
	private Item() {
		name = "ipin";
	}	
	
	public Item(String name) {
		this(); //Memanggil private method Item untuk mencetak nama item yang ditetapkan sebagai "ipin".
		System.out.println(this.name); //Mencetak nama item
	}
}
