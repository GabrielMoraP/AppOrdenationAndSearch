package sort;

import modelo.Libro;

public class QuickSort { 
    
  
	/* Esta función toma el último elemento como pivote, 
    coloca el elemento pivote en su posición 
    en la matriz ordenada, y coloca todos los elementos 
    menores (más pequeños que el pivote) a la izquierda del 
    pivote y todos los elementos mayores a la derecha 
    del pivote */
	int partition(Libro arr[], int low, int high) 
	{ 
		Libro pivot = arr[high];  
		int i = (low-1); // index del elemento mas grande
		for (int j=low; j<high; j++) 
		{ 
			// Si el elemento actual es menor que el pivote 
			if (arr[j].getTitulo().compareTo(pivot.getTitulo()) < 0) 
			{ 
				i++; 

				// intercambiar arr[i] y arr[j] 
				Libro temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// intercambiar arr[i+1] y arr[high] (o pivote) 
		Libro temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 

	int partitionIsbn(Libro arr[], int low, int high) 
	{ 
		Libro pivot = arr[high];  
		int i = (low-1); // index del elemento mas grande
		for (int j=low; j<high; j++) 
		{ 
			// Si el elemento actual es menor que el pivote 
			if (arr[j].getClave().compareTo(pivot.getClave()) < 0) 
			{ 
				i++; 

				// intercambiar arr[i] y arr[j] 
				Libro temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// intercambiar arr[i+1] y arr[high] (o pivote) 
		Libro temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 

	/* The main function that implements QuickSort() 
   arr[] --> Array to be sorted, 
   low  --> Starting index, 
   high  --> Ending index */
	public Libro[] sort(Libro arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is  
           now at right place */
			int pi = partition(arr, low, high); 

			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		}
		return arr; 
	} 
	
	public Libro[] sortIsbn(Libro arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is  
           now at right place */
			int pi = partitionIsbn(arr, low, high); 

			// Recursively sort elements before 
			// partition and after partition 
			sortIsbn(arr, low, pi-1); 
			sortIsbn(arr, pi+1, high); 
		}
		return arr; 
	} 
}