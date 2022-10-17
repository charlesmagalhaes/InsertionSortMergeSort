import java.util.Random;

public class AplicacaoSort {

	public static void main(String[] args) {
		MergeInsertionSort ordenar = new MergeInsertionSort();
		
		int[] listaInsertion = {12, 8, 18, 4, 13, 18, 0, 12, 6, 2, 0, 11, 10, 0, 4, 17, 19, 16, 20, 13}; 
		
		Random gerador = new Random();

		ordenar.imprimirArray(listaInsertion, "Lista de entrada: ");
		
		
		long tempoInicial1 = System.currentTimeMillis();
	
		ordenar.insertionSort(listaInsertion);
		
		long tempoFinal1 = System.currentTimeMillis();
		
		ordenar.imprimirArray(listaInsertion, "Lista Ordenada por insertion Sort: ");
		
		System.out.printf("Tempo de processamento: %.7f ms%n", (tempoFinal1 - tempoInicial1) / 1000d);
		
		
		
		int[] lista2 = {12, 8, 18, 4, 13, 18, 0, 12, 6, 2, 0, 11, 10, 0, 4, 17, 19, 16, 20, 13}; 
		
		System.out.println("-----------------------------------------------------------");
		
		ordenar.imprimirArray(lista2, "Lista de entrada: ");
		
		
		tempoInicial1 = System.currentTimeMillis();
		ordenar.sort(lista2, 0, listaInsertion.length-1);
		tempoFinal1 = System.currentTimeMillis();
		ordenar.imprimirArray(lista2, "Lista Ordenada por Merge Sort: ");
		System.out.printf("Tempo de processamento: %.7f ms%n", (tempoFinal1 - tempoInicial1) / 1000d);
		
		
		
		System.out.println("-----------------------------------------------------------");
		
		
		int[] listaMerge = gerarArrayRandom(gerador, 20000);
		
		 ordenar.imprimirArray(listaMerge, "Lista de entrada: ");
			
			
			tempoInicial1 = System.currentTimeMillis();
		
			ordenar.insertionSort(listaMerge);
			
			tempoFinal1 = System.currentTimeMillis();
			
			ordenar.imprimirArray(listaMerge, "Lista Ordenada por insertion Sort: ");
			
			System.out.printf("Tempo de processamento: %.7f ms%n", (tempoFinal1 - tempoInicial1) / 1000d);
			
			
			System.out.println("-----------------------------------------------------------");
			
			
			/*
			 * int[] listaMerge2 = gerarArrayRandom(gerador, 20000);
			 * 
			 * ordenar.imprimirArray(listaMerge2, "Lista de entrada: ");
			 * 
			 * 
			 * tempoInicial1 = System.currentTimeMillis();
			 * 
			 * ordenar.sort(listaMerge2, 0, listaMerge2.length-1);
			 * 
			 * tempoFinal1 = System.currentTimeMillis();
			 * 
			 * ordenar.imprimirArray(listaMerge2, "Lista Ordenada por Merge Sort: ");
			 * 
			 * System.out.printf("Tempo de processamento: %.7f ms%n", (tempoFinal1 -
			 * tempoInicial1) / 1000d);
			 */
		
	}

	private static int[] gerarArrayRandom(Random gerador, int elementos) {
		int[] listaMerge = new int[elementos];
		
		 for (int i = 0; i < listaMerge.length; i++) {
	        	listaMerge[i] = gerador.nextInt(elementos);
	         }
		return listaMerge;
	}

}
