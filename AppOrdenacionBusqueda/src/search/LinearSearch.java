package search;

import modelo.Libro;

public class LinearSearch {
	public int linearSearch(Libro[] array, String key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].getClave().equalsIgnoreCase(key)) {
				return i;
			}
		}
		return -1;
	}
}
