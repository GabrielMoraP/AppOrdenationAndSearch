package sort;

import modelo.Libro;

public class SelectionSort {
	public Libro[] selectionSort(Libro[] array) { 

		for (int i = 0; i < array.length - 1; i++)  
		{ 
			int minIndex = i; 
			for (int j = i + 1; j < array.length; j++) { 
				if (array[j].getTitulo().compareTo(array[minIndex].getTitulo()) < 0) { 
					minIndex = j; 
				} 
			} 
			Libro temp = array[minIndex]; 
			array[minIndex] = array[i]; 
			array[i] = temp; 
		} 
		return array;
	}
}
