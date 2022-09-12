package ar.com.codoacodo.herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String claveDelUsuario="iron men";
		//Articulo art=new Articulo( Articulo("http://sitio.com.ar/img/img1","titulo",claveBusqueda,"autor1",4390))
		Buscador miBuscador=new Buscador(claveDelUsuario);
		//miBuscador.ClaveBusqueda=claveDelUsuario;
		miBuscador.buscar();
		miBuscador.cantidadResultados();
		//Articulo [] resultados = new Articulo [] {};
		miBuscador.mostrarResultados();
		
		

	}

}
