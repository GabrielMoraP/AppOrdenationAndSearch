package modelo;

public class Libro implements Comparable<Libro> {

	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private String edicion;
	private String idioma;

	public Libro() {

	}

	public Libro(Libro libro) {
		isbn = libro.getClave();
		titulo = libro.getTitulo();
		autor = libro.getAutor();
		editorial = libro.getEditorial();
		edicion = libro.getEdicion();
		idioma = libro.getIdioma();
	}

	public String getClave() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String toString() {
		return isbn + "\t" + titulo + "\t" + autor + "\t" + editorial + "\t" + edicion + "\t" + idioma;
	}

	public String getDatos() {
		return "ISBN: " + isbn + ", Titulo: " + titulo + ", Autor: " + autor + ", Editorial: " + editorial
				+ ", Edicion: " + edicion + ", Idimona: " + idioma;
	}

	@Override
	public int compareTo(Libro libro) {
		return titulo.toUpperCase().compareTo(libro.titulo.toUpperCase());
	}

	@Override
	public boolean equals(Object obj) {
		Libro libro = (Libro) obj;
		return isbn.equals(libro.getClave());
	}

}
