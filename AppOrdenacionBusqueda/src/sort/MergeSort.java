package sort;

import modelo.Libro;

public class MergeSort {
	public Libro[] mergeSort(Libro[] array) { 
		if (array.length > 1) { 
			//split the array in half 
			Libro[] left = leftHalf(array); 
			Libro[] right = rightHalf(array); 
			//recursively sort the halves 
			mergeSort(left); 
			mergeSort(right); 
			//merge the sorted halves 
			merge(array, left, right); 
		} 
		return array;
	}
	
	public static Libro[] leftHalf(Libro[] array) { 
		int size1 = array.length / 2; 
		Libro[] left = new Libro[size1]; 
		for (int i = 0; i < size1; i++) { 
			left[i] = array[i]; 
		} 
		return left; 
	}
	
	public static Libro[] rightHalf(Libro[] array) { 
		int size1 = array.length / 2; 
		int size2 = array.length - size1; 
		Libro[] right = new Libro[size2]; 
		for (int i = 0; i < size2; i++) { 
			right[i] = array[i + size1]; 
		} 
		return right; 
	}
	
	public static void merge(Libro[] result, Libro[] left, Libro[] right) 
	{ 
		int i1 = 0; // index into left array 
		int i2 = 0; // index into right array 
		
		for (int i = 0; i < result.length; i++) { 
			if (i2 >= right.length || (i1 < left.length && left[i1].getTitulo().compareTo(right[i2].getTitulo())<=0)) 
			{ 
				result[i] = left[i1]; // take from left 
				i1++; 
			} else { 
				result[i] = right[i2]; // take from right 
				i2++; 
			} 
		} 
	}
}