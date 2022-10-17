
public class MergeInsertionSort {
	
	
	public void insertionSort(int[] lista) {
		int key;
		int i;
		for(int j=1; j< lista.length;j++) {
			key = lista[j];
			i = j -1;
			
			while (i >= 0  && lista[i] > key) {
				lista[i+1] = lista[i];
				i = i -1;
			}
			lista[i+1] = key;
		}
		
	}
	
	 public void imprimirArray(int[] lista)
	    {
		 System.out.print("Lista organizada: ");
	        for (int i = 0; i < lista.length; ++i)
	            System.out.print(lista[i] + " ");
	  
	        System.out.println();
	    }
	  

}
