
public class KelasSatu { //Non static initialization
	{
		System.out.println(11); //ketiga dan Kelima dicetak
	}
	
	static //Statik Initiakization Block
	{
		System.out.println(2); //Kedua di cetak
	}
	
	public KelasSatu(int i) //Constructor
	{
		System.out.println(3); //Keenam dicetak
	}
	public KelasSatu() //Constructor 
	{
		System.out.println(4); //Keempat dicetak
	}
}
