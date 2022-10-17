import java.util.Random;

public class AplicacaoSort {

	public static void main(String[] args) {
		MergeInsertionSort ordenar = new MergeInsertionSort();
		
		int[] lista = {12, 8, 18, 4, 13, 18, 0, 12, 6, 2, 0, 11, 10, 0, 4, 17, 19, 16, 20, 13}; 
		
		Random gerador = new Random();

       
        /*for (int i = 0; i < 20; i++) {
           numArray[i] = gerador.nextInt(26);
           System.out.print(numArray[i]+", ");
         }
		*/
		ordenar.imprimirArray(lista, "Lista de entrada: ");
	
		ordenar.insertionSort(lista);
		
		ordenar.imprimirArray(lista, "Lista Ordenada por insertion Sort: ");
		
		int[] lista2 = {12, 8, 18, 4, 13, 18, 0, 12, 6, 2, 0, 11, 10, 0, 4, 17, 19, 16, 20, 13}; 
		
		System.out.println("-----------------------------------------------------------");
		
		ordenar.imprimirArray(lista2, "Lista de entrada: ");
		
		ordenar.sort(lista2, 0, lista.length-1);
		ordenar.imprimirArray(lista2, "Lista Ordenada por Merge Sort: ");

	}

}
