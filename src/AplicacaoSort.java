import java.util.Random;

public class AplicacaoSort {

	public static void main(String[] args) {
		MergeInsertionSort ordenar = new MergeInsertionSort();
		
		int[] lista;
		int[] numArray = {12, 8, 18, 4, 13, 18, 0, 12, 6, 2, 0, 11, 10, 0, 4, 17, 19, 16, 20, 13}; 
		
		Random gerador = new Random();

       
        /*for (int i = 0; i < 20; i++) {
           numArray[i] = gerador.nextInt(26);
           System.out.print(numArray[i]+", ");
         }
		*/
	
		ordenar.insertionSort(numArray);
		
		ordenar.imprimirArray(numArray);
		

	}

}
