package sort;

import modelo.Libro;

public class MetodoBurbuja {
	public Libro[] metodoBurbuja(Libro[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < (array.length-1); i++) {
				if (array[i].getTitulo().compareTo(array[i+1].getTitulo())>0) {
					Libro temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		return array;
	}

}
