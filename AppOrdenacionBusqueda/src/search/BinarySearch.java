package search;

import modelo.Libro;

public class BinarySearch {

	public int bSearch(Libro[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m].getClave());

			// Check if x is present at mid
			if (res == 0) {
				return m;
			}
			// If x greater, ignore left half
			if (res > 0) {
				l = m + 1;
			}
			// If x is smaller, ignore right half
			else {
				r = m - 1;
			}
		}

		return -1;
	}

}
