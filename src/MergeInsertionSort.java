import java.util.concurrent.TimeUnit;

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
		/*try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		*/
	}
	
	 public void imprimirArray(int[] lista, String titulo)
	    {
		 System.out.print(titulo);
	        for (int i = 0; i < lista.length; ++i)
	            System.out.print(lista[i] + " ");
	  
	        System.out.println();
	    }
	 
	 
	 
	 public void merge(int[] lista, int l, int m, int r)
	    {
	        
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	      
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	 
	       
	        for (int i = 0; i < n1; ++i)
	            L[i] = lista[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = lista[m + 1 + j];
	 
	      
	        int i = 0, j = 0;
	 
	      
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	            	lista[k] = L[i];
	                i++;
	            }
	            else {
	            	lista[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	      
	        while (i < n1) {
	        	lista[k] = L[i];
	            i++;
	            k++;
	        }
	 
	       
	        while (j < n2) {
	        	lista[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	 
	   
	   public void sort(int[] lista, int l, int r)
	    {
	        if (l < r) {
	           
	            int m = l + (r - l) / 2;
	 
	            sort(lista, l, m);
	            sort(lista, m + 1, r);
	 
	           merge(lista, l, m, r);
	        }
			
	    }
	  

}
