package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Libro;

public class IOAcceso<T extends Comparable<T>> {

	public static Libro[] readFromFile(String ruta) throws FileNotFoundException {
		List<Libro> libros = new ArrayList<>();
		File archivo = new File(ruta);
		try {
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(archivo);
			while (entrada.hasNext()) {
				String datosLibro = entrada.nextLine();
				String[] subcadenas = datosLibro.split("\t");
				Libro libro = new Libro();
				libro.setIsbn(subcadenas[0]);
				libro.setTitulo(subcadenas[1]);
				libro.setAutor(subcadenas[2]);
				libro.setEditorial(subcadenas[3]);
				libro.setEdicion(subcadenas[4]);
				libro.setIdioma(subcadenas[5]);
				libros.add(libro);
			}
			Libro[] books = new Libro[libros.size()];
			for (int i = 0; i < libros.size(); i++) {
				books[i] = libros.get(i);
			}
			return books;
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("El archivo indicado no fue encontrado");
		}
	}

	public static void writeToFile(Libro[] libro) throws FileNotFoundException {
		PrintWriter salida = null;
		try {
			salida = new PrintWriter("recursos/Libros.txt"); // se crea el fichero
			for (Libro libros : libro) {
				System.out.println("\ntoString: " + libros.toString());
				salida.println(libros.toString());
			}
			salida.flush();
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("El archivo indicado no fue encontrado");
		} finally {
			salida.close();
		}
	}

}
