package ar.com.codoacodo.herencia;

public class DBUtil {
	
	
	Articulo [] obtenerResultado(String claveBusqueda){
		Articulo primero= new Articulo("http://sitio.com.ar/img/img1.jpg","titulo "+claveBusqueda,"autor1",4390);
		Articulo segundo= new Articulo("http://sitio.com.ar/img/img2.jpg","titulo "+claveBusqueda,"autor2",40500);
		Articulo tercero= new Articulo("http://sitio.com.ar/img/img3.jpg","titulo "+claveBusqueda,"autor3",2040);
		
		
		return new Articulo [] {primero,segundo, tercero};
	
	}

}
