package sort;

import modelo.Libro;

public class ShellSort {

    public Libro[] sort(Libro[] array) {
        int n = array.length;

        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                Libro temp = array[i];
                int j;
                for (j = i; j >= gap && (array[j - gap].getTitulo().compareTo(temp.getTitulo()) > 0); j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
            }
        }
		return array;
    }

}