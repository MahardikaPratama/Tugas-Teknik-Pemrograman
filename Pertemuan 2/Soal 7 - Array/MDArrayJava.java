
/**
*Program akan menampilkan array 3 dimensi.
*Array 3 dimensi sendiri merupakan gabungan dari array 2 dimensi.
*@author Mahardika Pratama
*@since 26-01-2023
*/

public class MDArrayJava {

	public static void main(String[] args) {
		//One Dimensional Arrays
		int[] fisrtArray = {2, 5, 3};
		int[] secondArray = {9, 5, 3};
		int[] thirdArray = {2, 4, 9};
		int[] fourthArray = {10, 11, 12};
		int[] fifthArray = {13, 14, 15};
		int[] sixthArray = {16, 17, 18};
		int[] seventhArray = {19, 20, 21};
		int[] eighthArray = {22, 23, 24};
		int[] ninthArray = {25, 26, 27};
		//Two Dimensional Arrays
		int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray};
		int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
		//Three Dimensional Array
		int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
		
		/*
		 *Untuk menampilkan array 3 dimensi maka harus menggunakan 3 looping sesuai indeks pada array 3 dimensi[indeks_array][baris][kolom].
		 *Looping pertama dilakukan sampai ukuran array 3 dimensinya. 
		 *Looping kedua dilakukan sampai ukuran array 2 dimensinya.
		 *Looping ketiga dilakukan sampai ukuran array 1 dimensinya.
		 */
		
		for (int i = 0; i < threeDimensionalArray.length; i++) {
			System.out.print("{");
			for (int j = 0; j < threeDimensionalArray[0].length; j++) {
				System.out.print("{");
				for (int k = 0; k < threeDimensionalArray[0][0].length; k++) {
					System.out.print(threeDimensionalArray[i][j][k] + " ");
				}
				System.out.print("} ");
			}
			System.out.println("}");
		}

	}

}
