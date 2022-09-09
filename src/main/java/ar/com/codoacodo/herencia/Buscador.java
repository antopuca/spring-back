package ar.com.codoacodo.herencia;

public class Buscador {
	private String ClaveBusqueda;
	private Articulo [] resultados;
	private int cantidadResultados;
	
	
	Buscador(){}



public Buscador(String claveDelUsuario) {
		// TODO Auto-generated constructor stub	
	this.setClaveBusqueda(claveDelUsuario);
	this.setResultados( new Articulo[]{});
	}



public void buscar(){
	DBUtil db = new DBUtil();
	this.setResultados(db.obtenerResultado(this.ClaveBusqueda));
	
}
public void mostrarResultados() {
	System.out.println("Hemos encontrado " + this.cantidadResultados() + " Resultados para " + this.getClaveBusqueda());
	for(Articulo aux: this.resultados) {
		System.out.println("Titulo: " + aux.getTitulo());
		System.out.println("Autor: " + aux.getAutor());
		System.out.println("img: " + aux.getAutor());
		System.out.println("precio: " + aux.getPrecio());
		System.out.println("---------------------------------" );
	}	
	
	}
public int cantidadResultados() {
	return this.resultados.length;
	
	
}



public String getClaveBusqueda() {
	return ClaveBusqueda;
}



public void setClaveBusqueda(String claveBusqueda) {
	ClaveBusqueda = claveBusqueda;
}



public Articulo[] getResultados() {
	return resultados;
}



public void setResultados(Articulo[] resultados) {
	this.resultados = resultados;
}





}