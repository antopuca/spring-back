package ar.com.codoacodo.herencia;

public class Articulo {
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	
	public Articulo(String img, String titulo, String autor, float precio) {
	    this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		if(img != null )
		this.img = img;
		else System.out.println("MARCA DE AGUA");
	}

	public String getTitulo() {
		//if(this.titulo !=null)
			//this.titulo.toUpperCase();
		//return this.titulo;
		return this.titulo!= null? this.titulo.toUpperCase():this.titulo;// operador ternario
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	
	
	
	
}
