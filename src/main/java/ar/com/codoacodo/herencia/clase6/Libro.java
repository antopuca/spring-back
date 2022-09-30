package ar.com.codoacodo.herencia.clase6;
import ar.com.codoacodo.herencia.Articulo;

public class Libro extends Articulo{
	private int nroDePaginas;
	private String isbn;
	
public Libro(String img, String titulo, String autor, float precio) {
	super(autor, autor, autor, precio);	
}

public Libro(String img, String titulo, String autor, float precio, int nroPaginas, int isbn) {
	super(autor, autor, autor, precio);
	this.setNroDePaginas(nroDePaginas);
	this.setIsbn(autor);
	
}

public int getNroDePaginas() {
	return nroDePaginas;
}

public void setNroDePaginas(int nroDePaginas) {
	this.nroDePaginas = nroDePaginas;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

@Override
public String toString() {
	return super.toString() + " Libro [nroDePaginas=" + nroDePaginas + ", isbn=" + isbn + "]";
}


}