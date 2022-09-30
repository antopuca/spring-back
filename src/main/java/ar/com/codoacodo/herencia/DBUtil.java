package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.clase6.Libro;
import ar.com.codoacodo.herencia.clase6.Musica;
import ar.com.codoacodo.herencia.clase6.Pelicula;

public class DBUtil {
	
	
	Articulo [] obtenerResultado(String claveBusqueda){
		//Articulo primero= new Articulo("http://sitio.com.ar/img/img1.jpg","titulo "+claveBusqueda,"autor1",4390);
		//Articulo segundo= new Articulo("http://sitio.com.ar/img/img2.jpg","titulo "+claveBusqueda,"autor2",40500);
		//Articulo tercero= new Articulo("http://sitio.com.ar/img/img3.jpg","titulo "+claveBusqueda,"autor3",2040);
		
		Libro l1 = new Libro("http://sitio.com.ar/img/imgL1.jpg","titulo " + claveBusqueda,"LibroL1", 4390, 320, 978950022);
		Musica m1 = new Musica("http://sitio.com.ar/img/imgM1.jpg","titulo " + claveBusqueda,"Musica1",40500, "SONY MUSIC", "Iron men 2");
		Pelicula p1 = new Pelicula("http://sitio.com.ar/img/imgP1.jpg","titulo "+ claveBusqueda,"Pelicula1",2040, "Historias", "DVD");
		
		Libro l2 = new Libro("http://sitio.com.ar/img/imgL2.jpg","titulo " + claveBusqueda,"LibroL2", 4390, 320, 97895002);
		Musica m2 = new Musica("http://sitio.com.ar/img/imgM2.jpg","titulo " + claveBusqueda,"Musica2",40500, "SONY MUSIC", "Iron men 2");
		Pelicula p2 = new Pelicula("http://sitio.com.ar/img/imgP2.jpg","titulo " + claveBusqueda,"Pelicula2",2040, "Historias", "DVD");
		
		return new Articulo [] {l1, m1, p1, l2, m2, p2};
	
	}

}
